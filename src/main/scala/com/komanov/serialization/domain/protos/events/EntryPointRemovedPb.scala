// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.komanov.serialization.domain.protos.events



@SerialVersionUID(0L)
final case class EntryPointRemovedPb(
    lookupKey: String = ""
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[EntryPointRemovedPb] with com.trueaccord.lenses.Updatable[EntryPointRemovedPb] {
    @transient
    lazy val serializedSize: Int = {
      var __size = 0
      if (lookupKey != "") { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, lookupKey) }
      __size
    }
    def writeTo(output: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = lookupKey
        if (__v != "") {
          output.writeString(1, __v)
        }
      };
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): com.komanov.serialization.domain.protos.events.EntryPointRemovedPb = {
      var __lookupKey = this.lookupKey
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __lookupKey = __input.readString()
          case tag => __input.skipField(tag)
        }
      }
      com.komanov.serialization.domain.protos.events.EntryPointRemovedPb(
          lookupKey = __lookupKey
      )
    }
    def withLookupKey(__v: String): EntryPointRemovedPb = copy(lookupKey = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = lookupKey
          if (__t != "") __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.komanov.serialization.domain.protos.events.EntryPointRemovedPb
}

object EntryPointRemovedPb extends com.trueaccord.scalapb.GeneratedMessageCompanion[EntryPointRemovedPb] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[EntryPointRemovedPb] = this
  def fromFieldsMap(__fieldsMap: Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.komanov.serialization.domain.protos.events.EntryPointRemovedPb = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.komanov.serialization.domain.protos.events.EntryPointRemovedPb(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = SrcMainProtoEventsProto.descriptor.getMessageTypes.get(27)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.komanov.serialization.domain.protos.events.EntryPointRemovedPb(
  )
  implicit class EntryPointRemovedPbLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, EntryPointRemovedPb]) extends com.trueaccord.lenses.ObjectLens[UpperPB, EntryPointRemovedPb](_l) {
    def lookupKey: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.lookupKey)((c_, f_) => c_.copy(lookupKey = f_))
  }
  final val LOOKUPKEY_FIELD_NUMBER = 1
}
