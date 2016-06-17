/**
 * Generated by Scrooge
 *   version: 4.7.0
 *   rev: d9d56174937f524a1981b38ebd6280eef7eeda4a
 *   built at: 20160427-121531
 */
package com.komanov.serialization.domain.thriftscala

import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob, ThriftException, ThriftStruct, ThriftStructCodec3, ThriftStructFieldInfo,
  ThriftStructMetaData, ThriftUtil}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport}
import java.nio.ByteBuffer
import java.util.Arrays
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object PageComponentPb extends ThriftStructCodec3[PageComponentPb] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("PageComponentPb")
  val IdField = new TField("id", TType.STRING, 1)
  val IdFieldManifest = implicitly[Manifest[ByteBuffer]]
  val ComponentTypeField = new TField("componentType", TType.ENUM, 2)
  val ComponentTypeFieldI32 = new TField("componentType", TType.I32, 2)
  val ComponentTypeFieldManifest = implicitly[Manifest[com.komanov.serialization.domain.thriftscala.PageComponentTypePb]]
  val DataField = new TField("data", TType.STRUCT, 3)
  val DataFieldManifest = implicitly[Manifest[com.komanov.serialization.domain.thriftscala.PageComponentDataPb]]
  val PositionField = new TField("position", TType.STRUCT, 4)
  val PositionFieldManifest = implicitly[Manifest[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb]]
  val DateCreatedField = new TField("dateCreated", TType.I64, 5)
  val DateCreatedFieldManifest = implicitly[Manifest[Long]]
  val DateUpdatedField = new TField("dateUpdated", TType.I64, 6)
  val DateUpdatedFieldManifest = implicitly[Manifest[Long]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      IdField,
      true,
      false,
      IdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      ComponentTypeField,
      true,
      false,
      ComponentTypeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      DataField,
      true,
      false,
      DataFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      PositionField,
      true,
      false,
      PositionFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      DateCreatedField,
      true,
      false,
      DateCreatedFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      DateUpdatedField,
      true,
      false,
      DateUpdatedFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: PageComponentPb): Unit = {
  }

  def withoutPassthroughFields(original: PageComponentPb): PageComponentPb =
    new Immutable(
      id =
        {
          val field = original.id
          field.map { field =>
            field
          }
        },
      componentType =
        {
          val field = original.componentType
          field.map { field =>
            field
          }
        },
      data =
        {
          val field = original.data
          field.map { field =>
            com.komanov.serialization.domain.thriftscala.PageComponentDataPb.withoutPassthroughFields(field)
          }
        },
      position =
        {
          val field = original.position
          field.map { field =>
            com.komanov.serialization.domain.thriftscala.PageComponentPositionPb.withoutPassthroughFields(field)
          }
        },
      dateCreated =
        {
          val field = original.dateCreated
          field.map { field =>
            field
          }
        },
      dateUpdated =
        {
          val field = original.dateUpdated
          field.map { field =>
            field
          }
        }
    )

  override def encode(_item: PageComponentPb, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): PageComponentPb = {

    var id: Option[ByteBuffer] = None
    var componentType: Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = None
    var data: Option[com.komanov.serialization.domain.thriftscala.PageComponentDataPb] = None
    var position: Option[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb] = None
    var dateCreatedOffset: Int = -1
    var dateUpdatedOffset: Int = -1

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
    
                id = Some(readIdValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'id' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.I32 | TType.ENUM =>
    
                componentType = Some(readComponentTypeValue(_iprot))
              case _actualType =>
                val _expectedType = TType.ENUM
                throw new TProtocolException(
                  "Received wrong type for field 'componentType' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                data = Some(readDataValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'data' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                position = Some(readPositionValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'position' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.I64 =>
                dateCreatedOffset = _iprot.offsetSkipI64
    
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'dateCreated' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 6 =>
            _field.`type` match {
              case TType.I64 =>
                dateUpdatedOffset = _iprot.offsetSkipI64
    
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'dateUpdated' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      id,
      componentType,
      data,
      position,
      dateCreatedOffset,
      dateUpdatedOffset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): PageComponentPb =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): PageComponentPb = {
    var id: _root_.scala.Option[ByteBuffer] = _root_.scala.None
    var componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = _root_.scala.None
    var data: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentDataPb] = _root_.scala.None
    var position: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb] = _root_.scala.None
    var dateCreated: _root_.scala.Option[Long] = _root_.scala.None
    var dateUpdated: _root_.scala.Option[Long] = _root_.scala.None
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                id = _root_.scala.Some(readIdValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'id' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.I32 | TType.ENUM =>
                componentType = _root_.scala.Some(readComponentTypeValue(_iprot))
              case _actualType =>
                val _expectedType = TType.ENUM
                throw new TProtocolException(
                  "Received wrong type for field 'componentType' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRUCT =>
                data = _root_.scala.Some(readDataValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'data' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.STRUCT =>
                position = _root_.scala.Some(readPositionValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'position' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.I64 =>
                dateCreated = _root_.scala.Some(readDateCreatedValue(_iprot))
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'dateCreated' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 6 =>
            _field.`type` match {
              case TType.I64 =>
                dateUpdated = _root_.scala.Some(readDateUpdatedValue(_iprot))
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'dateUpdated' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      id,
      componentType,
      data,
      position,
      dateCreated,
      dateUpdated,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    id: _root_.scala.Option[ByteBuffer] = _root_.scala.None,
    componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = _root_.scala.None,
    data: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentDataPb] = _root_.scala.None,
    position: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb] = _root_.scala.None,
    dateCreated: _root_.scala.Option[Long] = _root_.scala.None,
    dateUpdated: _root_.scala.Option[Long] = _root_.scala.None
  ): PageComponentPb =
    new Immutable(
      id,
      componentType,
      data,
      position,
      dateCreated,
      dateUpdated
    )

  def unapply(_item: PageComponentPb): _root_.scala.Option[scala.Product6[Option[ByteBuffer], Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb], Option[com.komanov.serialization.domain.thriftscala.PageComponentDataPb], Option[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb], Option[Long], Option[Long]]] = _root_.scala.Some(_item)


  @inline private def readIdValue(_iprot: TProtocol): ByteBuffer = {
    _iprot.readBinary()
  }

  @inline private def writeIdField(id_item: ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(IdField)
    writeIdValue(id_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeIdValue(id_item: ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeBinary(id_item)
  }

  @inline private def readComponentTypeValue(_iprot: TProtocol): com.komanov.serialization.domain.thriftscala.PageComponentTypePb = {
    com.komanov.serialization.domain.thriftscala.PageComponentTypePb.getOrUnknown(_iprot.readI32())
  }

  @inline private def writeComponentTypeField(componentType_item: com.komanov.serialization.domain.thriftscala.PageComponentTypePb, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ComponentTypeFieldI32)
    writeComponentTypeValue(componentType_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeComponentTypeValue(componentType_item: com.komanov.serialization.domain.thriftscala.PageComponentTypePb, _oprot: TProtocol): Unit = {
    _oprot.writeI32(componentType_item.value)
  }

  @inline private def readDataValue(_iprot: TProtocol): com.komanov.serialization.domain.thriftscala.PageComponentDataPb = {
    com.komanov.serialization.domain.thriftscala.PageComponentDataPb.decode(_iprot)
  }

  @inline private def writeDataField(data_item: com.komanov.serialization.domain.thriftscala.PageComponentDataPb, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(DataField)
    writeDataValue(data_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeDataValue(data_item: com.komanov.serialization.domain.thriftscala.PageComponentDataPb, _oprot: TProtocol): Unit = {
    data_item.write(_oprot)
  }

  @inline private def readPositionValue(_iprot: TProtocol): com.komanov.serialization.domain.thriftscala.PageComponentPositionPb = {
    com.komanov.serialization.domain.thriftscala.PageComponentPositionPb.decode(_iprot)
  }

  @inline private def writePositionField(position_item: com.komanov.serialization.domain.thriftscala.PageComponentPositionPb, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(PositionField)
    writePositionValue(position_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writePositionValue(position_item: com.komanov.serialization.domain.thriftscala.PageComponentPositionPb, _oprot: TProtocol): Unit = {
    position_item.write(_oprot)
  }

  @inline private def readDateCreatedValue(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  @inline private def writeDateCreatedField(dateCreated_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(DateCreatedField)
    writeDateCreatedValue(dateCreated_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeDateCreatedValue(dateCreated_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeI64(dateCreated_item)
  }

  @inline private def readDateUpdatedValue(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  @inline private def writeDateUpdatedField(dateUpdated_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(DateUpdatedField)
    writeDateUpdatedValue(dateUpdated_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeDateUpdatedValue(dateUpdated_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeI64(dateUpdated_item)
  }


  object Immutable extends ThriftStructCodec3[PageComponentPb] {
    override def encode(_item: PageComponentPb, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): PageComponentPb = PageComponentPb.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[PageComponentPb] = PageComponentPb.metaData
  }

  /**
   * The default read-only implementation of PageComponentPb.  You typically should not need to
   * directly reference this class; instead, use the PageComponentPb.apply method to construct
   * new instances.
   */
  class Immutable(
      val id: _root_.scala.Option[ByteBuffer],
      val componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb],
      val data: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentDataPb],
      val position: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb],
      val dateCreated: _root_.scala.Option[Long],
      val dateUpdated: _root_.scala.Option[Long],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends PageComponentPb {
    def this(
      id: _root_.scala.Option[ByteBuffer] = _root_.scala.None,
      componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = _root_.scala.None,
      data: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentDataPb] = _root_.scala.None,
      position: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb] = _root_.scala.None,
      dateCreated: _root_.scala.Option[Long] = _root_.scala.None,
      dateUpdated: _root_.scala.Option[Long] = _root_.scala.None
    ) = this(
      id,
      componentType,
      data,
      position,
      dateCreated,
      dateUpdated,
      Map.empty
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      val id: _root_.scala.Option[ByteBuffer],
      val componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb],
      val data: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentDataPb],
      val position: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb],
      dateCreatedOffset: Int,
      dateUpdatedOffset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends PageComponentPb {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val dateCreated: _root_.scala.Option[Long] =
      if (dateCreatedOffset == -1)
        None
      else {
        Some(_proto.decodeI64(_buf, dateCreatedOffset))
      }
    lazy val dateUpdated: _root_.scala.Option[Long] =
      if (dateUpdatedOffset == -1)
        None
      else {
        Some(_proto.decodeI64(_buf, dateUpdatedOffset))
      }

    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the PageComponentPb trait with additional state or
   * behavior and implement the read-only methods from PageComponentPb using an underlying
   * instance.
   */
  trait Proxy extends PageComponentPb {
    protected def _underlying_PageComponentPb: PageComponentPb
    override def id: _root_.scala.Option[ByteBuffer] = _underlying_PageComponentPb.id
    override def componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = _underlying_PageComponentPb.componentType
    override def data: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentDataPb] = _underlying_PageComponentPb.data
    override def position: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb] = _underlying_PageComponentPb.position
    override def dateCreated: _root_.scala.Option[Long] = _underlying_PageComponentPb.dateCreated
    override def dateUpdated: _root_.scala.Option[Long] = _underlying_PageComponentPb.dateUpdated
    override def _passthroughFields = _underlying_PageComponentPb._passthroughFields
  }
}

trait PageComponentPb
  extends ThriftStruct
  with scala.Product6[Option[ByteBuffer], Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb], Option[com.komanov.serialization.domain.thriftscala.PageComponentDataPb], Option[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb], Option[Long], Option[Long]]
  with java.io.Serializable
{
  import PageComponentPb._

  def id: _root_.scala.Option[ByteBuffer]
  def componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb]
  def data: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentDataPb]
  def position: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb]
  def dateCreated: _root_.scala.Option[Long]
  def dateUpdated: _root_.scala.Option[Long]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = id
  def _2 = componentType
  def _3 = data
  def _4 = position
  def _5 = dateCreated
  def _6 = dateUpdated


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (id.isDefined) {
                writeIdValue(id.get, _oprot)
                _root_.scala.Some(PageComponentPb.IdField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (componentType.isDefined) {
                writeComponentTypeValue(componentType.get, _oprot)
                _root_.scala.Some(PageComponentPb.ComponentTypeField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (data.isDefined) {
                writeDataValue(data.get, _oprot)
                _root_.scala.Some(PageComponentPb.DataField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (position.isDefined) {
                writePositionValue(position.get, _oprot)
                _root_.scala.Some(PageComponentPb.PositionField)
              } else {
                _root_.scala.None
              }
            case 5 =>
              if (dateCreated.isDefined) {
                writeDateCreatedValue(dateCreated.get, _oprot)
                _root_.scala.Some(PageComponentPb.DateCreatedField)
              } else {
                _root_.scala.None
              }
            case 6 =>
              if (dateUpdated.isDefined) {
                writeDateUpdatedValue(dateUpdated.get, _oprot)
                _root_.scala.Some(PageComponentPb.DateUpdatedField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            val _data = Arrays.copyOfRange(_buff.getArray, 0, _buff.length)
            _root_.scala.Some(TFieldBlob(_field, _data))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): PageComponentPb = {
    var id: _root_.scala.Option[ByteBuffer] = this.id
    var componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = this.componentType
    var data: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentDataPb] = this.data
    var position: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb] = this.position
    var dateCreated: _root_.scala.Option[Long] = this.dateCreated
    var dateUpdated: _root_.scala.Option[Long] = this.dateUpdated
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        id = _root_.scala.Some(readIdValue(_blob.read))
      case 2 =>
        componentType = _root_.scala.Some(readComponentTypeValue(_blob.read))
      case 3 =>
        data = _root_.scala.Some(readDataValue(_blob.read))
      case 4 =>
        position = _root_.scala.Some(readPositionValue(_blob.read))
      case 5 =>
        dateCreated = _root_.scala.Some(readDateCreatedValue(_blob.read))
      case 6 =>
        dateUpdated = _root_.scala.Some(readDateUpdatedValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      id,
      componentType,
      data,
      position,
      dateCreated,
      dateUpdated,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): PageComponentPb = {
    var id: _root_.scala.Option[ByteBuffer] = this.id
    var componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = this.componentType
    var data: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentDataPb] = this.data
    var position: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb] = this.position
    var dateCreated: _root_.scala.Option[Long] = this.dateCreated
    var dateUpdated: _root_.scala.Option[Long] = this.dateUpdated

    _fieldId match {
      case 1 =>
        id = _root_.scala.None
      case 2 =>
        componentType = _root_.scala.None
      case 3 =>
        data = _root_.scala.None
      case 4 =>
        position = _root_.scala.None
      case 5 =>
        dateCreated = _root_.scala.None
      case 6 =>
        dateUpdated = _root_.scala.None
      case _ =>
    }
    new Immutable(
      id,
      componentType,
      data,
      position,
      dateCreated,
      dateUpdated,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetId: PageComponentPb = unsetField(1)

  def unsetComponentType: PageComponentPb = unsetField(2)

  def unsetData: PageComponentPb = unsetField(3)

  def unsetPosition: PageComponentPb = unsetField(4)

  def unsetDateCreated: PageComponentPb = unsetField(5)

  def unsetDateUpdated: PageComponentPb = unsetField(6)


  override def write(_oprot: TProtocol): Unit = {
    PageComponentPb.validate(this)
    _oprot.writeStructBegin(Struct)
    if (id.isDefined) writeIdField(id.get, _oprot)
    if (componentType.isDefined) writeComponentTypeField(componentType.get, _oprot)
    if (data.isDefined) writeDataField(data.get, _oprot)
    if (position.isDefined) writePositionField(position.get, _oprot)
    if (dateCreated.isDefined) writeDateCreatedField(dateCreated.get, _oprot)
    if (dateUpdated.isDefined) writeDateUpdatedField(dateUpdated.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    id: _root_.scala.Option[ByteBuffer] = this.id,
    componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = this.componentType,
    data: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentDataPb] = this.data,
    position: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentPositionPb] = this.position,
    dateCreated: _root_.scala.Option[Long] = this.dateCreated,
    dateUpdated: _root_.scala.Option[Long] = this.dateUpdated,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): PageComponentPb =
    new Immutable(
      id,
      componentType,
      data,
      position,
      dateCreated,
      dateUpdated,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[PageComponentPb]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[PageComponentPb]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 6

  override def productElement(n: Int): Any = n match {
    case 0 => this.id
    case 1 => this.componentType
    case 2 => this.data
    case 3 => this.position
    case 4 => this.dateCreated
    case 5 => this.dateUpdated
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "PageComponentPb"
}