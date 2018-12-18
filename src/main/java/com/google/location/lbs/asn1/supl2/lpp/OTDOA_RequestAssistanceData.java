package com.google.location.lbs.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Integer;
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1Object;
import com.google.location.lbs.asn1.base.Asn1Sequence;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.location.lbs.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* @author Torbjorn Gannholm (tobe@google.com)
*/
public  class OTDOA_RequestAssistanceData extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_OTDOA_RequestAssistanceData
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public OTDOA_RequestAssistanceData() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_OTDOA_RequestAssistanceData;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_OTDOA_RequestAssistanceData != null) {
      return ImmutableList.of(TAG_OTDOA_RequestAssistanceData);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new OTDOA_RequestAssistanceData from encoded stream.
   */
  public static OTDOA_RequestAssistanceData fromPerUnaligned(byte[] encodedBytes) {
    OTDOA_RequestAssistanceData result = new OTDOA_RequestAssistanceData();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new OTDOA_RequestAssistanceData from encoded stream.
   */
  public static OTDOA_RequestAssistanceData fromPerAligned(byte[] encodedBytes) {
    OTDOA_RequestAssistanceData result = new OTDOA_RequestAssistanceData();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return true;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private OTDOA_RequestAssistanceData.physCellIdType physCellId_;
  public OTDOA_RequestAssistanceData.physCellIdType getPhysCellId() {
    return physCellId_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_RequestAssistanceData.physCellIdType
   */
  public void setPhysCellId(Asn1Object value) {
    this.physCellId_ = (OTDOA_RequestAssistanceData.physCellIdType) value;
  }
  public OTDOA_RequestAssistanceData.physCellIdType setPhysCellIdToNewInstance() {
    physCellId_ = new OTDOA_RequestAssistanceData.physCellIdType();
    return physCellId_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPhysCellId() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPhysCellId();
          }

          @Override public void setToNewInstance() {
            setPhysCellIdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_RequestAssistanceData.physCellIdType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "physCellId : "
                    + getPhysCellId().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public static class physCellIdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_physCellIdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public physCellIdType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("503"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_physCellIdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_physCellIdType != null) {
      return ImmutableList.of(TAG_physCellIdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new physCellIdType from encoded stream.
   */
  public static physCellIdType fromPerUnaligned(byte[] encodedBytes) {
    physCellIdType result = new physCellIdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new physCellIdType from encoded stream.
   */
  public static physCellIdType fromPerAligned(byte[] encodedBytes) {
    physCellIdType result = new physCellIdType();
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
    return "physCellIdType = " + getInteger() + ";\n";
  }
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
    builder.append("OTDOA_RequestAssistanceData = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}