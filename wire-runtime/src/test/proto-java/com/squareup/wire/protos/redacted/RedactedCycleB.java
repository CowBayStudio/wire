// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: redacted_test.proto at 44:1
package com.squareup.wire.protos.redacted;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class RedactedCycleB extends Message<RedactedCycleB, RedactedCycleB.Builder> {
  public static final ProtoAdapter<RedactedCycleB> ADAPTER = new ProtoAdapter_RedactedCycleB();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.protos.redacted.RedactedCycleA#ADAPTER"
  )
  public final RedactedCycleA a;

  public RedactedCycleB(RedactedCycleA a) {
    this(a, ByteString.EMPTY);
  }

  public RedactedCycleB(RedactedCycleA a, ByteString unknownFields) {
    super(unknownFields);
    this.a = a;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.a = a;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RedactedCycleB)) return false;
    RedactedCycleB o = (RedactedCycleB) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(a, o.a);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (a != null ? a.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (a != null) builder.append(", a=").append(a);
    return builder.replace(0, 2, "RedactedCycleB{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<RedactedCycleB, Builder> {
    public RedactedCycleA a;

    public Builder() {
    }

    public Builder a(RedactedCycleA a) {
      this.a = a;
      return this;
    }

    @Override
    public RedactedCycleB build() {
      return new RedactedCycleB(a, buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_RedactedCycleB extends ProtoAdapter<RedactedCycleB> {
    ProtoAdapter_RedactedCycleB() {
      super(FieldEncoding.LENGTH_DELIMITED, RedactedCycleB.class);
    }

    @Override
    public int encodedSize(RedactedCycleB value) {
      return (value.a != null ? RedactedCycleA.ADAPTER.encodedSizeWithTag(1, value.a) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, RedactedCycleB value) throws IOException {
      if (value.a != null) RedactedCycleA.ADAPTER.encodeWithTag(writer, 1, value.a);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public RedactedCycleB decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.a(RedactedCycleA.ADAPTER.decode(reader)); break;
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
    public RedactedCycleB redact(RedactedCycleB value) {
      Builder builder = value.newBuilder();
      if (builder.a != null) builder.a = RedactedCycleA.ADAPTER.redact(builder.a);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
