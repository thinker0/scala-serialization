/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.komanov.serialization.domain.thrift;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-06-15")
public class EntryPointRemovedPb implements org.apache.thrift.TBase<EntryPointRemovedPb, EntryPointRemovedPb._Fields>, java.io.Serializable, Cloneable, Comparable<EntryPointRemovedPb> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EntryPointRemovedPb");

  private static final org.apache.thrift.protocol.TField LOOKUP_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("lookupKey", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EntryPointRemovedPbStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EntryPointRemovedPbTupleSchemeFactory());
  }

  public String lookupKey; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOOKUP_KEY((short)1, "lookupKey");

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
        case 1: // LOOKUP_KEY
          return LOOKUP_KEY;
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
  private static final _Fields optionals[] = {_Fields.LOOKUP_KEY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOOKUP_KEY, new org.apache.thrift.meta_data.FieldMetaData("lookupKey", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EntryPointRemovedPb.class, metaDataMap);
  }

  public EntryPointRemovedPb() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EntryPointRemovedPb(EntryPointRemovedPb other) {
    if (other.isSetLookupKey()) {
      this.lookupKey = other.lookupKey;
    }
  }

  public EntryPointRemovedPb deepCopy() {
    return new EntryPointRemovedPb(this);
  }

  @Override
  public void clear() {
    this.lookupKey = null;
  }

  public String getLookupKey() {
    return this.lookupKey;
  }

  public EntryPointRemovedPb setLookupKey(String lookupKey) {
    this.lookupKey = lookupKey;
    return this;
  }

  public void unsetLookupKey() {
    this.lookupKey = null;
  }

  /** Returns true if field lookupKey is set (has been assigned a value) and false otherwise */
  public boolean isSetLookupKey() {
    return this.lookupKey != null;
  }

  public void setLookupKeyIsSet(boolean value) {
    if (!value) {
      this.lookupKey = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOOKUP_KEY:
      if (value == null) {
        unsetLookupKey();
      } else {
        setLookupKey((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOOKUP_KEY:
      return getLookupKey();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOOKUP_KEY:
      return isSetLookupKey();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EntryPointRemovedPb)
      return this.equals((EntryPointRemovedPb)that);
    return false;
  }

  public boolean equals(EntryPointRemovedPb that) {
    if (that == null)
      return false;

    boolean this_present_lookupKey = true && this.isSetLookupKey();
    boolean that_present_lookupKey = true && that.isSetLookupKey();
    if (this_present_lookupKey || that_present_lookupKey) {
      if (!(this_present_lookupKey && that_present_lookupKey))
        return false;
      if (!this.lookupKey.equals(that.lookupKey))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_lookupKey = true && (isSetLookupKey());
    list.add(present_lookupKey);
    if (present_lookupKey)
      list.add(lookupKey);

    return list.hashCode();
  }

  @Override
  public int compareTo(EntryPointRemovedPb other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLookupKey()).compareTo(other.isSetLookupKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLookupKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lookupKey, other.lookupKey);
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
    StringBuilder sb = new StringBuilder("EntryPointRemovedPb(");
    boolean first = true;

    if (isSetLookupKey()) {
      sb.append("lookupKey:");
      if (this.lookupKey == null) {
        sb.append("null");
      } else {
        sb.append(this.lookupKey);
      }
      first = false;
    }
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

  private static class EntryPointRemovedPbStandardSchemeFactory implements SchemeFactory {
    public EntryPointRemovedPbStandardScheme getScheme() {
      return new EntryPointRemovedPbStandardScheme();
    }
  }

  private static class EntryPointRemovedPbStandardScheme extends StandardScheme<EntryPointRemovedPb> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EntryPointRemovedPb struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOOKUP_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.lookupKey = iprot.readString();
              struct.setLookupKeyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EntryPointRemovedPb struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.lookupKey != null) {
        if (struct.isSetLookupKey()) {
          oprot.writeFieldBegin(LOOKUP_KEY_FIELD_DESC);
          oprot.writeString(struct.lookupKey);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EntryPointRemovedPbTupleSchemeFactory implements SchemeFactory {
    public EntryPointRemovedPbTupleScheme getScheme() {
      return new EntryPointRemovedPbTupleScheme();
    }
  }

  private static class EntryPointRemovedPbTupleScheme extends TupleScheme<EntryPointRemovedPb> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EntryPointRemovedPb struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLookupKey()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLookupKey()) {
        oprot.writeString(struct.lookupKey);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EntryPointRemovedPb struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.lookupKey = iprot.readString();
        struct.setLookupKeyIsSet(true);
      }
    }
  }

}

