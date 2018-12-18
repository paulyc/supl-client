package com.google.location.lbs.asn1.supl2.rrlp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1OctetString;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public  class GPSAssistanceData extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_GPSAssistanceData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GPSAssistanceData() {
    super();
    setMinSize(1);
setMaxSize(40);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GPSAssistanceData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GPSAssistanceData != null) {
      return ImmutableList.of(TAG_GPSAssistanceData);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GPSAssistanceData from encoded stream.
   */
  public static GPSAssistanceData fromPerUnaligned(byte[] encodedBytes) {
    GPSAssistanceData result = new GPSAssistanceData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GPSAssistanceData from encoded stream.
   */
  public static GPSAssistanceData fromPerAligned(byte[] encodedBytes) {
    GPSAssistanceData result = new GPSAssistanceData();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
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

  @Override protected String getTypeName() {
    return "GPSAssistanceData";
  }
}