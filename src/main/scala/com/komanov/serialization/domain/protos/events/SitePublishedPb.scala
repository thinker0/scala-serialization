// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.komanov.serialization.domain.protos.events



@SerialVersionUID(0L)
final case class SitePublishedPb(
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[SitePublishedPb] with com.trueaccord.lenses.Updatable[SitePublishedPb] {
    @transient
    lazy val serializedSize: Int = {
      var __size = 0
      __size
    }
    def writeTo(output: com.google.protobuf.CodedOutputStream): Unit = {
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): com.komanov.serialization.domain.protos.events.SitePublishedPb = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case tag => __input.skipField(tag)
        }
      }
      com.komanov.serialization.domain.protos.events.SitePublishedPb(
      )
    }
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = throw new MatchError(__field)
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.komanov.serialization.domain.protos.events.SitePublishedPb
}

object SitePublishedPb extends com.trueaccord.scalapb.GeneratedMessageCompanion[SitePublishedPb] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[SitePublishedPb] = this
  def fromFieldsMap(__fieldsMap: Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.komanov.serialization.domain.protos.events.SitePublishedPb = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.komanov.serialization.domain.protos.events.SitePublishedPb(
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = SrcMainProtoEventsProto.descriptor.getMessageTypes.get(4)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.komanov.serialization.domain.protos.events.SitePublishedPb(
  )
  implicit class SitePublishedPbLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, SitePublishedPb]) extends com.trueaccord.lenses.ObjectLens[UpperPB, SitePublishedPb](_l) {
  }
}
