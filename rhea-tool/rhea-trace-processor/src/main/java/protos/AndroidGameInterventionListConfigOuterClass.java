// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/perfetto/config/android/android_game_intervention_list_config.proto

package perfetto.protos;

public final class AndroidGameInterventionListConfigOuterClass {
  private AndroidGameInterventionListConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AndroidGameInterventionListConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:perfetto.protos.AndroidGameInterventionListConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * If not empty, emit info about only the following list of package names
     * (exact match, no regex). Otherwise, emit info about all packages.
     * </pre>
     *
     * <code>repeated string package_name_filter = 1;</code>
     * @return A list containing the packageNameFilter.
     */
    java.util.List<java.lang.String>
        getPackageNameFilterList();
    /**
     * <pre>
     * If not empty, emit info about only the following list of package names
     * (exact match, no regex). Otherwise, emit info about all packages.
     * </pre>
     *
     * <code>repeated string package_name_filter = 1;</code>
     * @return The count of packageNameFilter.
     */
    int getPackageNameFilterCount();
    /**
     * <pre>
     * If not empty, emit info about only the following list of package names
     * (exact match, no regex). Otherwise, emit info about all packages.
     * </pre>
     *
     * <code>repeated string package_name_filter = 1;</code>
     * @param index The index of the element to return.
     * @return The packageNameFilter at the given index.
     */
    java.lang.String getPackageNameFilter(int index);
    /**
     * <pre>
     * If not empty, emit info about only the following list of package names
     * (exact match, no regex). Otherwise, emit info about all packages.
     * </pre>
     *
     * <code>repeated string package_name_filter = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the packageNameFilter at the given index.
     */
    com.google.protobuf.ByteString
        getPackageNameFilterBytes(int index);
  }
  /**
   * <pre>
   * Data source that lists game modes and game interventions of games
   * on an Android device.
   * </pre>
   *
   * Protobuf type {@code perfetto.protos.AndroidGameInterventionListConfig}
   */
  public static final class AndroidGameInterventionListConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:perfetto.protos.AndroidGameInterventionListConfig)
      AndroidGameInterventionListConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AndroidGameInterventionListConfig.newBuilder() to construct.
    private AndroidGameInterventionListConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AndroidGameInterventionListConfig() {
      packageNameFilter_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AndroidGameInterventionListConfig();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return perfetto.protos.AndroidGameInterventionListConfigOuterClass.internal_static_perfetto_protos_AndroidGameInterventionListConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return perfetto.protos.AndroidGameInterventionListConfigOuterClass.internal_static_perfetto_protos_AndroidGameInterventionListConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig.class, perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig.Builder.class);
    }

    public static final int PACKAGE_NAME_FILTER_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringList packageNameFilter_;
    /**
     * <pre>
     * If not empty, emit info about only the following list of package names
     * (exact match, no regex). Otherwise, emit info about all packages.
     * </pre>
     *
     * <code>repeated string package_name_filter = 1;</code>
     * @return A list containing the packageNameFilter.
     */
    public com.google.protobuf.ProtocolStringList
        getPackageNameFilterList() {
      return packageNameFilter_;
    }
    /**
     * <pre>
     * If not empty, emit info about only the following list of package names
     * (exact match, no regex). Otherwise, emit info about all packages.
     * </pre>
     *
     * <code>repeated string package_name_filter = 1;</code>
     * @return The count of packageNameFilter.
     */
    public int getPackageNameFilterCount() {
      return packageNameFilter_.size();
    }
    /**
     * <pre>
     * If not empty, emit info about only the following list of package names
     * (exact match, no regex). Otherwise, emit info about all packages.
     * </pre>
     *
     * <code>repeated string package_name_filter = 1;</code>
     * @param index The index of the element to return.
     * @return The packageNameFilter at the given index.
     */
    public java.lang.String getPackageNameFilter(int index) {
      return packageNameFilter_.get(index);
    }
    /**
     * <pre>
     * If not empty, emit info about only the following list of package names
     * (exact match, no regex). Otherwise, emit info about all packages.
     * </pre>
     *
     * <code>repeated string package_name_filter = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the packageNameFilter at the given index.
     */
    public com.google.protobuf.ByteString
        getPackageNameFilterBytes(int index) {
      return packageNameFilter_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < packageNameFilter_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, packageNameFilter_.getRaw(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < packageNameFilter_.size(); i++) {
          dataSize += computeStringSizeNoTag(packageNameFilter_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getPackageNameFilterList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig)) {
        return super.equals(obj);
      }
      perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig other = (perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig) obj;

      if (!getPackageNameFilterList()
          .equals(other.getPackageNameFilterList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getPackageNameFilterCount() > 0) {
        hash = (37 * hash) + PACKAGE_NAME_FILTER_FIELD_NUMBER;
        hash = (53 * hash) + getPackageNameFilterList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Data source that lists game modes and game interventions of games
     * on an Android device.
     * </pre>
     *
     * Protobuf type {@code perfetto.protos.AndroidGameInterventionListConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:perfetto.protos.AndroidGameInterventionListConfig)
        perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return perfetto.protos.AndroidGameInterventionListConfigOuterClass.internal_static_perfetto_protos_AndroidGameInterventionListConfig_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return perfetto.protos.AndroidGameInterventionListConfigOuterClass.internal_static_perfetto_protos_AndroidGameInterventionListConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig.class, perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig.Builder.class);
      }

      // Construct using perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        packageNameFilter_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return perfetto.protos.AndroidGameInterventionListConfigOuterClass.internal_static_perfetto_protos_AndroidGameInterventionListConfig_descriptor;
      }

      @java.lang.Override
      public perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig getDefaultInstanceForType() {
        return perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig.getDefaultInstance();
      }

      @java.lang.Override
      public perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig build() {
        perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig buildPartial() {
        perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig result = new perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          packageNameFilter_ = packageNameFilter_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.packageNameFilter_ = packageNameFilter_;
      }

      private void buildPartial0(perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig result) {
        int from_bitField0_ = bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig) {
          return mergeFrom((perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig other) {
        if (other == perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig.getDefaultInstance()) return this;
        if (!other.packageNameFilter_.isEmpty()) {
          if (packageNameFilter_.isEmpty()) {
            packageNameFilter_ = other.packageNameFilter_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePackageNameFilterIsMutable();
            packageNameFilter_.addAll(other.packageNameFilter_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                com.google.protobuf.ByteString bs = input.readBytes();
                ensurePackageNameFilterIsMutable();
                packageNameFilter_.add(bs);
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.LazyStringList packageNameFilter_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensurePackageNameFilterIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          packageNameFilter_ = new com.google.protobuf.LazyStringArrayList(packageNameFilter_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <pre>
       * If not empty, emit info about only the following list of package names
       * (exact match, no regex). Otherwise, emit info about all packages.
       * </pre>
       *
       * <code>repeated string package_name_filter = 1;</code>
       * @return A list containing the packageNameFilter.
       */
      public com.google.protobuf.ProtocolStringList
          getPackageNameFilterList() {
        return packageNameFilter_.getUnmodifiableView();
      }
      /**
       * <pre>
       * If not empty, emit info about only the following list of package names
       * (exact match, no regex). Otherwise, emit info about all packages.
       * </pre>
       *
       * <code>repeated string package_name_filter = 1;</code>
       * @return The count of packageNameFilter.
       */
      public int getPackageNameFilterCount() {
        return packageNameFilter_.size();
      }
      /**
       * <pre>
       * If not empty, emit info about only the following list of package names
       * (exact match, no regex). Otherwise, emit info about all packages.
       * </pre>
       *
       * <code>repeated string package_name_filter = 1;</code>
       * @param index The index of the element to return.
       * @return The packageNameFilter at the given index.
       */
      public java.lang.String getPackageNameFilter(int index) {
        return packageNameFilter_.get(index);
      }
      /**
       * <pre>
       * If not empty, emit info about only the following list of package names
       * (exact match, no regex). Otherwise, emit info about all packages.
       * </pre>
       *
       * <code>repeated string package_name_filter = 1;</code>
       * @param index The index of the value to return.
       * @return The bytes of the packageNameFilter at the given index.
       */
      public com.google.protobuf.ByteString
          getPackageNameFilterBytes(int index) {
        return packageNameFilter_.getByteString(index);
      }
      /**
       * <pre>
       * If not empty, emit info about only the following list of package names
       * (exact match, no regex). Otherwise, emit info about all packages.
       * </pre>
       *
       * <code>repeated string package_name_filter = 1;</code>
       * @param index The index to set the value at.
       * @param value The packageNameFilter to set.
       * @return This builder for chaining.
       */
      public Builder setPackageNameFilter(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensurePackageNameFilterIsMutable();
        packageNameFilter_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If not empty, emit info about only the following list of package names
       * (exact match, no regex). Otherwise, emit info about all packages.
       * </pre>
       *
       * <code>repeated string package_name_filter = 1;</code>
       * @param value The packageNameFilter to add.
       * @return This builder for chaining.
       */
      public Builder addPackageNameFilter(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensurePackageNameFilterIsMutable();
        packageNameFilter_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If not empty, emit info about only the following list of package names
       * (exact match, no regex). Otherwise, emit info about all packages.
       * </pre>
       *
       * <code>repeated string package_name_filter = 1;</code>
       * @param values The packageNameFilter to add.
       * @return This builder for chaining.
       */
      public Builder addAllPackageNameFilter(
          java.lang.Iterable<java.lang.String> values) {
        ensurePackageNameFilterIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, packageNameFilter_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If not empty, emit info about only the following list of package names
       * (exact match, no regex). Otherwise, emit info about all packages.
       * </pre>
       *
       * <code>repeated string package_name_filter = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPackageNameFilter() {
        packageNameFilter_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If not empty, emit info about only the following list of package names
       * (exact match, no regex). Otherwise, emit info about all packages.
       * </pre>
       *
       * <code>repeated string package_name_filter = 1;</code>
       * @param value The bytes of the packageNameFilter to add.
       * @return This builder for chaining.
       */
      public Builder addPackageNameFilterBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        ensurePackageNameFilterIsMutable();
        packageNameFilter_.add(value);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:perfetto.protos.AndroidGameInterventionListConfig)
    }

    // @@protoc_insertion_point(class_scope:perfetto.protos.AndroidGameInterventionListConfig)
    private static final perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig();
    }

    public static perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<AndroidGameInterventionListConfig>
        PARSER = new com.google.protobuf.AbstractParser<AndroidGameInterventionListConfig>() {
      @java.lang.Override
      public AndroidGameInterventionListConfig parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<AndroidGameInterventionListConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AndroidGameInterventionListConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public perfetto.protos.AndroidGameInterventionListConfigOuterClass.AndroidGameInterventionListConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_perfetto_protos_AndroidGameInterventionListConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_perfetto_protos_AndroidGameInterventionListConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJprotos/perfetto/config/android/android" +
      "_game_intervention_list_config.proto\022\017pe" +
      "rfetto.protos\"@\n!AndroidGameIntervention" +
      "ListConfig\022\033\n\023package_name_filter\030\001 \003(\t"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_perfetto_protos_AndroidGameInterventionListConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_perfetto_protos_AndroidGameInterventionListConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_perfetto_protos_AndroidGameInterventionListConfig_descriptor,
        new java.lang.String[] { "PackageNameFilter", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}