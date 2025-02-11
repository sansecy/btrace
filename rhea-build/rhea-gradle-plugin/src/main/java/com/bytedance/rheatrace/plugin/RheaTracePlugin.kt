/*
 * Copyright (C) 2021 ByteDance Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bytedance.rheatrace.plugin

import com.android.build.gradle.AppExtension
import com.android.build.gradle.BaseExtension
import com.bytedance.rheatrace.common.utils.RheaLog
import com.bytedance.rheatrace.plugin.extension.RheaBuildExtension
import com.bytedance.rheatrace.plugin.extension.TraceCompilation
import com.bytedance.rheatrace.plugin.extension.TraceRuntime
import com.bytedance.rheatrace.plugin.internal.CopyMappingTask
import com.bytedance.rheatrace.plugin.internal.compat.RheaTraceCompat
import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.gradle.internal.classloader.VisitableURLClassLoader
import java.io.File

class RheaTracePlugin : Plugin<Project> {
    private val TAG = "RheaTracePlugin"

    override fun apply(project: Project) {
        RheaLog.i(TAG, "Rhea Plugin 2.0")
        val rheaTrace = project.extensions.create("rheaTrace", RheaBuildExtension::class.java)

        rheaTrace.runtime = (rheaTrace as ExtensionAware).extensions.create(
            "runtime", TraceRuntime::class.java
        )
        rheaTrace.compilation = (rheaTrace as ExtensionAware).extensions.create(
            "compilation", TraceCompilation::class.java
        )
        if (!project.plugins.hasPlugin("com.android.application")) {
            throw GradleException("Rhea Plugin: Android Application plugin required.")
        }
        val appExtension = project.extensions.getByName("android") as AppExtension
        RheaTraceCompat().inject(
            appExtension,
            project,
            rheaTrace
        )
        CopyMappingTask.registerTaskSaveMappingToAssets(project, rheaTrace)
        project.afterEvaluate {
            val sdkDirectory = appExtension.sdkDirectory
            val compileSdkVersion =
                appExtension.compileSdkVersion
                    ?: throw IllegalStateException("compileSdkVersion获取失败")
            val androidJarPath = "platforms/${compileSdkVersion}/android.jar"
            val androidJar = File(sdkDirectory, androidJarPath)
            appendFileToClassLoader(androidJar)
        }
    }

    private fun appendFileToClassLoader(file: File) {
        if (javaClass.classLoader is VisitableURLClassLoader) {
            val classLoader =
                javaClass.classLoader as VisitableURLClassLoader
            println("appendToClassLoader $file")
            classLoader.addURL(file.toURL())
        }
    }
}