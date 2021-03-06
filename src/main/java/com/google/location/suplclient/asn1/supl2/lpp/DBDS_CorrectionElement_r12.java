// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.location.suplclient.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class DBDS_CorrectionElement_r12 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_DBDS_CorrectionElement_r12
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public DBDS_CorrectionElement_r12() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_DBDS_CorrectionElement_r12;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_DBDS_CorrectionElement_r12 != null) {
      return ImmutableList.of(TAG_DBDS_CorrectionElement_r12);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new DBDS_CorrectionElement_r12 from encoded stream.
   */
  public static DBDS_CorrectionElement_r12 fromPerUnaligned(byte[] encodedBytes) {
    DBDS_CorrectionElement_r12 result = new DBDS_CorrectionElement_r12();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new DBDS_CorrectionElement_r12 from encoded stream.
   */
  public static DBDS_CorrectionElement_r12 fromPerAligned(byte[] encodedBytes) {
    DBDS_CorrectionElement_r12 result = new DBDS_CorrectionElement_r12();
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

  
  private SV_ID svID_;
  public SV_ID getSvID() {
    return svID_;
  }
  /**
   * @throws ClassCastException if value is not a SV_ID
   */
  public void setSvID(Asn1Object value) {
    this.svID_ = (SV_ID) value;
  }
  public SV_ID setSvIDToNewInstance() {
    svID_ = new SV_ID();
    return svID_;
  }
  
  private DBDS_CorrectionElement_r12.bds_UDREI_r12Type bds_UDREI_r12_;
  public DBDS_CorrectionElement_r12.bds_UDREI_r12Type getBds_UDREI_r12() {
    return bds_UDREI_r12_;
  }
  /**
   * @throws ClassCastException if value is not a DBDS_CorrectionElement_r12.bds_UDREI_r12Type
   */
  public void setBds_UDREI_r12(Asn1Object value) {
    this.bds_UDREI_r12_ = (DBDS_CorrectionElement_r12.bds_UDREI_r12Type) value;
  }
  public DBDS_CorrectionElement_r12.bds_UDREI_r12Type setBds_UDREI_r12ToNewInstance() {
    bds_UDREI_r12_ = new DBDS_CorrectionElement_r12.bds_UDREI_r12Type();
    return bds_UDREI_r12_;
  }
  
  private DBDS_CorrectionElement_r12.bds_RURAI_r12Type bds_RURAI_r12_;
  public DBDS_CorrectionElement_r12.bds_RURAI_r12Type getBds_RURAI_r12() {
    return bds_RURAI_r12_;
  }
  /**
   * @throws ClassCastException if value is not a DBDS_CorrectionElement_r12.bds_RURAI_r12Type
   */
  public void setBds_RURAI_r12(Asn1Object value) {
    this.bds_RURAI_r12_ = (DBDS_CorrectionElement_r12.bds_RURAI_r12Type) value;
  }
  public DBDS_CorrectionElement_r12.bds_RURAI_r12Type setBds_RURAI_r12ToNewInstance() {
    bds_RURAI_r12_ = new DBDS_CorrectionElement_r12.bds_RURAI_r12Type();
    return bds_RURAI_r12_;
  }
  
  private DBDS_CorrectionElement_r12.bds_ECC_DeltaT_r12Type bds_ECC_DeltaT_r12_;
  public DBDS_CorrectionElement_r12.bds_ECC_DeltaT_r12Type getBds_ECC_DeltaT_r12() {
    return bds_ECC_DeltaT_r12_;
  }
  /**
   * @throws ClassCastException if value is not a DBDS_CorrectionElement_r12.bds_ECC_DeltaT_r12Type
   */
  public void setBds_ECC_DeltaT_r12(Asn1Object value) {
    this.bds_ECC_DeltaT_r12_ = (DBDS_CorrectionElement_r12.bds_ECC_DeltaT_r12Type) value;
  }
  public DBDS_CorrectionElement_r12.bds_ECC_DeltaT_r12Type setBds_ECC_DeltaT_r12ToNewInstance() {
    bds_ECC_DeltaT_r12_ = new DBDS_CorrectionElement_r12.bds_ECC_DeltaT_r12Type();
    return bds_ECC_DeltaT_r12_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getSvID() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getSvID();
          }

          @Override public void setToNewInstance() {
            setSvIDToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SV_ID.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "svID : "
                    + getSvID().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getBds_UDREI_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBds_UDREI_r12();
          }

          @Override public void setToNewInstance() {
            setBds_UDREI_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DBDS_CorrectionElement_r12.bds_UDREI_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bds_UDREI_r12 : "
                    + getBds_UDREI_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getBds_RURAI_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBds_RURAI_r12();
          }

          @Override public void setToNewInstance() {
            setBds_RURAI_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DBDS_CorrectionElement_r12.bds_RURAI_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bds_RURAI_r12 : "
                    + getBds_RURAI_r12().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getBds_ECC_DeltaT_r12() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBds_ECC_DeltaT_r12();
          }

          @Override public void setToNewInstance() {
            setBds_ECC_DeltaT_r12ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? DBDS_CorrectionElement_r12.bds_ECC_DeltaT_r12Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "bds_ECC_DeltaT_r12 : "
                    + getBds_ECC_DeltaT_r12().toIndentedString(indent);
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
 * 
 */
public static class bds_UDREI_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bds_UDREI_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bds_UDREI_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bds_UDREI_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bds_UDREI_r12Type != null) {
      return ImmutableList.of(TAG_bds_UDREI_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bds_UDREI_r12Type from encoded stream.
   */
  public static bds_UDREI_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bds_UDREI_r12Type result = new bds_UDREI_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bds_UDREI_r12Type from encoded stream.
   */
  public static bds_UDREI_r12Type fromPerAligned(byte[] encodedBytes) {
    bds_UDREI_r12Type result = new bds_UDREI_r12Type();
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
    return "bds_UDREI_r12Type = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class bds_RURAI_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bds_RURAI_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bds_RURAI_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("15"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bds_RURAI_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bds_RURAI_r12Type != null) {
      return ImmutableList.of(TAG_bds_RURAI_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bds_RURAI_r12Type from encoded stream.
   */
  public static bds_RURAI_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bds_RURAI_r12Type result = new bds_RURAI_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bds_RURAI_r12Type from encoded stream.
   */
  public static bds_RURAI_r12Type fromPerAligned(byte[] encodedBytes) {
    bds_RURAI_r12Type result = new bds_RURAI_r12Type();
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
    return "bds_RURAI_r12Type = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class bds_ECC_DeltaT_r12Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bds_ECC_DeltaT_r12Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bds_ECC_DeltaT_r12Type() {
    super();
    setValueRange(new java.math.BigInteger("-4096"), new java.math.BigInteger("4095"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bds_ECC_DeltaT_r12Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bds_ECC_DeltaT_r12Type != null) {
      return ImmutableList.of(TAG_bds_ECC_DeltaT_r12Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bds_ECC_DeltaT_r12Type from encoded stream.
   */
  public static bds_ECC_DeltaT_r12Type fromPerUnaligned(byte[] encodedBytes) {
    bds_ECC_DeltaT_r12Type result = new bds_ECC_DeltaT_r12Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bds_ECC_DeltaT_r12Type from encoded stream.
   */
  public static bds_ECC_DeltaT_r12Type fromPerAligned(byte[] encodedBytes) {
    bds_ECC_DeltaT_r12Type result = new bds_ECC_DeltaT_r12Type();
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
    return "bds_ECC_DeltaT_r12Type = " + getInteger() + ";\n";
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
    builder.append("DBDS_CorrectionElement_r12 = {\n");
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
