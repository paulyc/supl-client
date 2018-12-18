package com.google.location.lbs.asn1.supl2.ver2_ulp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1SequenceOf;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public  class MeasResultListEUTRA
    extends Asn1SequenceOf<MeasResultEUTRA> {
  //

  private static final Asn1Tag TAG_MeasResultListEUTRA
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public MeasResultListEUTRA() {
    super();
    setMinSize(1);
setMaxSize(8);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_MeasResultListEUTRA;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_MeasResultListEUTRA != null) {
      return ImmutableList.of(TAG_MeasResultListEUTRA);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new MeasResultListEUTRA from encoded stream.
   */
  public static MeasResultListEUTRA fromPerUnaligned(byte[] encodedBytes) {
    MeasResultListEUTRA result = new MeasResultListEUTRA();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new MeasResultListEUTRA from encoded stream.
   */
  public static MeasResultListEUTRA fromPerAligned(byte[] encodedBytes) {
    MeasResultListEUTRA result = new MeasResultListEUTRA();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public MeasResultEUTRA createAndAddValue() {
    MeasResultEUTRA value = new MeasResultEUTRA();
    add(value);
    return value;
  }

  

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    StringBuilder builder = new StringBuilder();
    builder.append("MeasResultListEUTRA = [\n");
    final String internalIndent = indent + "  ";
    for (MeasResultEUTRA value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}