package com.thirft.service.comment;

/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cooperation implements org.apache.thrift.TBase<Cooperation, Cooperation._Fields>, java.io.Serializable, Cloneable, Comparable<Cooperation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Cooperation");

  private static final org.apache.thrift.protocol.TField PROFILE_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("profile_url", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ORIGINAL_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("original_url", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("source", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ICON_FIELD_DESC = new org.apache.thrift.protocol.TField("icon", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CooperationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CooperationTupleSchemeFactory());
  }

  public String profile_url; // required
  public String original_url; // required
  public String source; // required
  public String icon; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROFILE_URL((short)1, "profile_url"),
    ORIGINAL_URL((short)2, "original_url"),
    SOURCE((short)3, "source"),
    ICON((short)4, "icon");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PROFILE_URL
          return PROFILE_URL;
        case 2: // ORIGINAL_URL
          return ORIGINAL_URL;
        case 3: // SOURCE
          return SOURCE;
        case 4: // ICON
          return ICON;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROFILE_URL, new org.apache.thrift.meta_data.FieldMetaData("profile_url", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ORIGINAL_URL, new org.apache.thrift.meta_data.FieldMetaData("original_url", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SOURCE, new org.apache.thrift.meta_data.FieldMetaData("source", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ICON, new org.apache.thrift.meta_data.FieldMetaData("icon", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Cooperation.class, metaDataMap);
  }

  public Cooperation() {
  }

  public Cooperation(
    String profile_url,
    String original_url,
    String source,
    String icon)
  {
    this();
    this.profile_url = profile_url;
    this.original_url = original_url;
    this.source = source;
    this.icon = icon;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Cooperation(Cooperation other) {
    if (other.isSetProfile_url()) {
      this.profile_url = other.profile_url;
    }
    if (other.isSetOriginal_url()) {
      this.original_url = other.original_url;
    }
    if (other.isSetSource()) {
      this.source = other.source;
    }
    if (other.isSetIcon()) {
      this.icon = other.icon;
    }
  }

  public Cooperation deepCopy() {
    return new Cooperation(this);
  }

  @Override
  public void clear() {
    this.profile_url = null;
    this.original_url = null;
    this.source = null;
    this.icon = null;
  }

  public String getProfile_url() {
    return this.profile_url;
  }

  public Cooperation setProfile_url(String profile_url) {
    this.profile_url = profile_url;
    return this;
  }

  public void unsetProfile_url() {
    this.profile_url = null;
  }

  /** Returns true if field profile_url is set (has been assigned a value) and false otherwise */
  public boolean isSetProfile_url() {
    return this.profile_url != null;
  }

  public void setProfile_urlIsSet(boolean value) {
    if (!value) {
      this.profile_url = null;
    }
  }

  public String getOriginal_url() {
    return this.original_url;
  }

  public Cooperation setOriginal_url(String original_url) {
    this.original_url = original_url;
    return this;
  }

  public void unsetOriginal_url() {
    this.original_url = null;
  }

  /** Returns true if field original_url is set (has been assigned a value) and false otherwise */
  public boolean isSetOriginal_url() {
    return this.original_url != null;
  }

  public void setOriginal_urlIsSet(boolean value) {
    if (!value) {
      this.original_url = null;
    }
  }

  public String getSource() {
    return this.source;
  }

  public Cooperation setSource(String source) {
    this.source = source;
    return this;
  }

  public void unsetSource() {
    this.source = null;
  }

  /** Returns true if field source is set (has been assigned a value) and false otherwise */
  public boolean isSetSource() {
    return this.source != null;
  }

  public void setSourceIsSet(boolean value) {
    if (!value) {
      this.source = null;
    }
  }

  public String getIcon() {
    return this.icon;
  }

  public Cooperation setIcon(String icon) {
    this.icon = icon;
    return this;
  }

  public void unsetIcon() {
    this.icon = null;
  }

  /** Returns true if field icon is set (has been assigned a value) and false otherwise */
  public boolean isSetIcon() {
    return this.icon != null;
  }

  public void setIconIsSet(boolean value) {
    if (!value) {
      this.icon = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROFILE_URL:
      if (value == null) {
        unsetProfile_url();
      } else {
        setProfile_url((String)value);
      }
      break;

    case ORIGINAL_URL:
      if (value == null) {
        unsetOriginal_url();
      } else {
        setOriginal_url((String)value);
      }
      break;

    case SOURCE:
      if (value == null) {
        unsetSource();
      } else {
        setSource((String)value);
      }
      break;

    case ICON:
      if (value == null) {
        unsetIcon();
      } else {
        setIcon((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROFILE_URL:
      return getProfile_url();

    case ORIGINAL_URL:
      return getOriginal_url();

    case SOURCE:
      return getSource();

    case ICON:
      return getIcon();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROFILE_URL:
      return isSetProfile_url();
    case ORIGINAL_URL:
      return isSetOriginal_url();
    case SOURCE:
      return isSetSource();
    case ICON:
      return isSetIcon();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Cooperation)
      return this.equals((Cooperation)that);
    return false;
  }

  public boolean equals(Cooperation that) {
    if (that == null)
      return false;

    boolean this_present_profile_url = true && this.isSetProfile_url();
    boolean that_present_profile_url = true && that.isSetProfile_url();
    if (this_present_profile_url || that_present_profile_url) {
      if (!(this_present_profile_url && that_present_profile_url))
        return false;
      if (!this.profile_url.equals(that.profile_url))
        return false;
    }

    boolean this_present_original_url = true && this.isSetOriginal_url();
    boolean that_present_original_url = true && that.isSetOriginal_url();
    if (this_present_original_url || that_present_original_url) {
      if (!(this_present_original_url && that_present_original_url))
        return false;
      if (!this.original_url.equals(that.original_url))
        return false;
    }

    boolean this_present_source = true && this.isSetSource();
    boolean that_present_source = true && that.isSetSource();
    if (this_present_source || that_present_source) {
      if (!(this_present_source && that_present_source))
        return false;
      if (!this.source.equals(that.source))
        return false;
    }

    boolean this_present_icon = true && this.isSetIcon();
    boolean that_present_icon = true && that.isSetIcon();
    if (this_present_icon || that_present_icon) {
      if (!(this_present_icon && that_present_icon))
        return false;
      if (!this.icon.equals(that.icon))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Cooperation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProfile_url()).compareTo(other.isSetProfile_url());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProfile_url()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.profile_url, other.profile_url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOriginal_url()).compareTo(other.isSetOriginal_url());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOriginal_url()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.original_url, other.original_url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSource()).compareTo(other.isSetSource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.source, other.source);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIcon()).compareTo(other.isSetIcon());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIcon()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.icon, other.icon);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Cooperation(");
    boolean first = true;

    sb.append("profile_url:");
    if (this.profile_url == null) {
      sb.append("null");
    } else {
      sb.append(this.profile_url);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("original_url:");
    if (this.original_url == null) {
      sb.append("null");
    } else {
      sb.append(this.original_url);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("source:");
    if (this.source == null) {
      sb.append("null");
    } else {
      sb.append(this.source);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("icon:");
    if (this.icon == null) {
      sb.append("null");
    } else {
      sb.append(this.icon);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CooperationStandardSchemeFactory implements SchemeFactory {
    public CooperationStandardScheme getScheme() {
      return new CooperationStandardScheme();
    }
  }

  private static class CooperationStandardScheme extends StandardScheme<Cooperation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Cooperation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROFILE_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.profile_url = iprot.readString();
              struct.setProfile_urlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ORIGINAL_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.original_url = iprot.readString();
              struct.setOriginal_urlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.source = iprot.readString();
              struct.setSourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ICON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.icon = iprot.readString();
              struct.setIconIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Cooperation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.profile_url != null) {
        oprot.writeFieldBegin(PROFILE_URL_FIELD_DESC);
        oprot.writeString(struct.profile_url);
        oprot.writeFieldEnd();
      }
      if (struct.original_url != null) {
        oprot.writeFieldBegin(ORIGINAL_URL_FIELD_DESC);
        oprot.writeString(struct.original_url);
        oprot.writeFieldEnd();
      }
      if (struct.source != null) {
        oprot.writeFieldBegin(SOURCE_FIELD_DESC);
        oprot.writeString(struct.source);
        oprot.writeFieldEnd();
      }
      if (struct.icon != null) {
        oprot.writeFieldBegin(ICON_FIELD_DESC);
        oprot.writeString(struct.icon);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CooperationTupleSchemeFactory implements SchemeFactory {
    public CooperationTupleScheme getScheme() {
      return new CooperationTupleScheme();
    }
  }

  private static class CooperationTupleScheme extends TupleScheme<Cooperation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Cooperation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetProfile_url()) {
        optionals.set(0);
      }
      if (struct.isSetOriginal_url()) {
        optionals.set(1);
      }
      if (struct.isSetSource()) {
        optionals.set(2);
      }
      if (struct.isSetIcon()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetProfile_url()) {
        oprot.writeString(struct.profile_url);
      }
      if (struct.isSetOriginal_url()) {
        oprot.writeString(struct.original_url);
      }
      if (struct.isSetSource()) {
        oprot.writeString(struct.source);
      }
      if (struct.isSetIcon()) {
        oprot.writeString(struct.icon);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Cooperation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.profile_url = iprot.readString();
        struct.setProfile_urlIsSet(true);
      }
      if (incoming.get(1)) {
        struct.original_url = iprot.readString();
        struct.setOriginal_urlIsSet(true);
      }
      if (incoming.get(2)) {
        struct.source = iprot.readString();
        struct.setSourceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.icon = iprot.readString();
        struct.setIconIsSet(true);
      }
    }
  }

}
