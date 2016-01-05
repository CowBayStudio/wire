// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: edge_cases.proto at 23:1
package com.squareup.wire.protos.edgecases;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class OneField extends Message<OneField, OneField.Builder> {
  public static final ProtoAdapter<OneField> ADAPTER = new ProtoAdapter_OneField();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_OPT_INT32 = 0;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer opt_int32;

  public OneField(Integer opt_int32) {
    this(opt_int32, ByteString.EMPTY);
  }

  public OneField(Integer opt_int32, ByteString unknownFields) {
    super(unknownFields);
    this.opt_int32 = opt_int32;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.opt_int32 = opt_int32;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OneField)) return false;
    OneField o = (OneField) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(opt_int32, o.opt_int32);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (opt_int32 != null ? opt_int32.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (opt_int32 != null) builder.append(", opt_int32=").append(opt_int32);
    return builder.replace(0, 2, "OneField{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<OneField, Builder> {
    public Integer opt_int32;

    public Builder() {
    }

    public Builder opt_int32(Integer opt_int32) {
      this.opt_int32 = opt_int32;
      return this;
    }

    @Override
    public OneField build() {
      return new OneField(opt_int32, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_OneField extends ProtoAdapter<OneField> {
    ProtoAdapter_OneField() {
      super(FieldEncoding.LENGTH_DELIMITED, OneField.class);
    }

    @Override
    public int encodedSize(OneField value) {
      return (value.opt_int32 != null ? ProtoAdapter.INT32.encodedSizeWithTag(1, value.opt_int32) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, OneField value) throws IOException {
      if (value.opt_int32 != null) ProtoAdapter.INT32.encodeWithTag(writer, 1, value.opt_int32);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public OneField decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.opt_int32(ProtoAdapter.INT32.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public OneField redact(OneField value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
