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

package com.google.location.suplclient.asn1.supl2.rrlp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
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
public  class ReferenceWGS84 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ReferenceWGS84
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ReferenceWGS84() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ReferenceWGS84;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ReferenceWGS84 != null) {
      return ImmutableList.of(TAG_ReferenceWGS84);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ReferenceWGS84 from encoded stream.
   */
  public static ReferenceWGS84 fromPerUnaligned(byte[] encodedBytes) {
    ReferenceWGS84 result = new ReferenceWGS84();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ReferenceWGS84 from encoded stream.
   */
  public static ReferenceWGS84 fromPerAligned(byte[] encodedBytes) {
    ReferenceWGS84 result = new ReferenceWGS84();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return false;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private RelDistance relativeNorth_;
  public RelDistance getRelativeNorth() {
    return relativeNorth_;
  }
  /**
   * @throws ClassCastException if value is not a RelDistance
   */
  public void setRelativeNorth(Asn1Object value) {
    this.relativeNorth_ = (RelDistance) value;
  }
  public RelDistance setRelativeNorthToNewInstance() {
    relativeNorth_ = new RelDistance();
    return relativeNorth_;
  }
  
  private RelDistance relativeEast_;
  public RelDistance getRelativeEast() {
    return relativeEast_;
  }
  /**
   * @throws ClassCastException if value is not a RelDistance
   */
  public void setRelativeEast(Asn1Object value) {
    this.relativeEast_ = (RelDistance) value;
  }
  public RelDistance setRelativeEastToNewInstance() {
    relativeEast_ = new RelDistance();
    return relativeEast_;
  }
  
  private RelativeAlt relativeAlt_;
  public RelativeAlt getRelativeAlt() {
    return relativeAlt_;
  }
  /**
   * @throws ClassCastException if value is not a RelativeAlt
   */
  public void setRelativeAlt(Asn1Object value) {
    this.relativeAlt_ = (RelativeAlt) value;
  }
  public RelativeAlt setRelativeAltToNewInstance() {
    relativeAlt_ = new RelativeAlt();
    return relativeAlt_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getRelativeNorth() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRelativeNorth();
          }

          @Override public void setToNewInstance() {
            setRelativeNorthToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RelDistance.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "relativeNorth : "
                    + getRelativeNorth().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getRelativeEast() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getRelativeEast();
          }

          @Override public void setToNewInstance() {
            setRelativeEastToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RelDistance.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "relativeEast : "
                    + getRelativeEast().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getRelativeAlt() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getRelativeAlt();
          }

          @Override public void setToNewInstance() {
            setRelativeAltToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? RelativeAlt.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "relativeAlt : "
                    + getRelativeAlt().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
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
    builder.append("ReferenceWGS84 = {\n");
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
