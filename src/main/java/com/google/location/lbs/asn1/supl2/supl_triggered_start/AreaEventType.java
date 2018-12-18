package com.google.location.lbs.asn1.supl2.supl_triggered_start;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Enumerated;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public  class AreaEventType extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    enteringArea(0),
    insideArea(1),
    outsideArea(2),
    leavingArea(3),
    ;

    Value(int i) {
      value = i;
    }

    private int value;
    public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return false;
    }
  }

  @Override
  protected Value getDefaultValue() {
    return null
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_enteringArea() {
    setValue(Value.enteringArea);
  }
  
  public void setTo_insideArea() {
    setValue(Value.insideArea);
  }
  
  public void setTo_outsideArea() {
    setValue(Value.outsideArea);
  }
  
  public void setTo_leavingArea() {
    setValue(Value.leavingArea);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    ;

    ExtensionValue(int i) {
      value = i;
    }

    private int value;
    @Override public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return true;
    }
  }

  @SuppressWarnings("unchecked")
  public ExtensionValue extEnumValue() {
    return (ExtensionValue) getValue();
  }

  

  

  private static final Asn1Tag TAG_AreaEventType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public AreaEventType() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_AreaEventType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_AreaEventType != null) {
      return ImmutableList.of(TAG_AreaEventType);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return true;
  }

  @Override protected Asn1Enumerated.Value lookupValue(int ordinal) {
    return Value.values()[ordinal];
  }

  @Override protected Asn1Enumerated.Value lookupExtensionValue(int ordinal) {
    return ExtensionValue.values()[ordinal];
  }

  @Override protected int getValueCount() {
    return Value.values().length;
  }

  /**
   * Creates a new AreaEventType from encoded stream.
   */
  public static AreaEventType fromPerUnaligned(byte[] encodedBytes) {
    AreaEventType result = new AreaEventType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new AreaEventType from encoded stream.
   */
  public static AreaEventType fromPerAligned(byte[] encodedBytes) {
    AreaEventType result = new AreaEventType();
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

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "AreaEventType = " + getValue() + ";\n";
  }
}