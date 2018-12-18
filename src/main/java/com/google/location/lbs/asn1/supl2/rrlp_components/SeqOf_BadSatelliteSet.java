package com.google.location.lbs.asn1.supl2.rrlp_components;

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
public  class SeqOf_BadSatelliteSet
    extends Asn1SequenceOf<SatelliteID> {
  //

  private static final Asn1Tag TAG_SeqOf_BadSatelliteSet
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SeqOf_BadSatelliteSet() {
    super();
    setMinSize(1);
setMaxSize(16);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SeqOf_BadSatelliteSet;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SeqOf_BadSatelliteSet != null) {
      return ImmutableList.of(TAG_SeqOf_BadSatelliteSet);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SeqOf_BadSatelliteSet from encoded stream.
   */
  public static SeqOf_BadSatelliteSet fromPerUnaligned(byte[] encodedBytes) {
    SeqOf_BadSatelliteSet result = new SeqOf_BadSatelliteSet();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SeqOf_BadSatelliteSet from encoded stream.
   */
  public static SeqOf_BadSatelliteSet fromPerAligned(byte[] encodedBytes) {
    SeqOf_BadSatelliteSet result = new SeqOf_BadSatelliteSet();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public SatelliteID createAndAddValue() {
    SatelliteID value = new SatelliteID();
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
    builder.append("SeqOf_BadSatelliteSet = [\n");
    final String internalIndent = indent + "  ";
    for (SatelliteID value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}