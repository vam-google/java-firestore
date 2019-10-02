// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1/firestore_admin.proto

package com.google.firestore.admin.v1;

public final class FirestoreAdminProto {
  private FirestoreAdminProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_CreateIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_CreateIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_ListIndexesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_ListIndexesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_ListIndexesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_ListIndexesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_GetIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_GetIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_DeleteIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_DeleteIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_UpdateFieldRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_UpdateFieldRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_GetFieldRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_GetFieldRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_ListFieldsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_ListFieldsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_ListFieldsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_ListFieldsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_ExportDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_ExportDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_ImportDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_ImportDocumentsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/firestore/admin/v1/firestore_ad"
          + "min.proto\022\031google.firestore.admin.v1\032\034go"
          + "ogle/api/annotations.proto\032%google/fires"
          + "tore/admin/v1/field.proto\032%google/firest"
          + "ore/admin/v1/index.proto\032#google/longrun"
          + "ning/operations.proto\032\033google/protobuf/e"
          + "mpty.proto\032 google/protobuf/field_mask.p"
          + "roto\032\027google/api/client.proto\"U\n\022CreateI"
          + "ndexRequest\022\016\n\006parent\030\001 \001(\t\022/\n\005index\030\002 \001"
          + "(\0132 .google.firestore.admin.v1.Index\"[\n\022"
          + "ListIndexesRequest\022\016\n\006parent\030\001 \001(\t\022\016\n\006fi"
          + "lter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_to"
          + "ken\030\004 \001(\t\"a\n\023ListIndexesResponse\0221\n\007inde"
          + "xes\030\001 \003(\0132 .google.firestore.admin.v1.In"
          + "dex\022\027\n\017next_page_token\030\002 \001(\t\"\037\n\017GetIndex"
          + "Request\022\014\n\004name\030\001 \001(\t\"\"\n\022DeleteIndexRequ"
          + "est\022\014\n\004name\030\001 \001(\t\"v\n\022UpdateFieldRequest\022"
          + "/\n\005field\030\001 \001(\0132 .google.firestore.admin."
          + "v1.Field\022/\n\013update_mask\030\002 \001(\0132\032.google.p"
          + "rotobuf.FieldMask\"\037\n\017GetFieldRequest\022\014\n\004"
          + "name\030\001 \001(\t\"Z\n\021ListFieldsRequest\022\016\n\006paren"
          + "t\030\001 \001(\t\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001"
          + "(\005\022\022\n\npage_token\030\004 \001(\t\"_\n\022ListFieldsResp"
          + "onse\0220\n\006fields\030\001 \003(\0132 .google.firestore."
          + "admin.v1.Field\022\027\n\017next_page_token\030\002 \001(\t\""
          + "Y\n\026ExportDocumentsRequest\022\014\n\004name\030\001 \001(\t\022"
          + "\026\n\016collection_ids\030\002 \003(\t\022\031\n\021output_uri_pr"
          + "efix\030\003 \001(\t\"X\n\026ImportDocumentsRequest\022\014\n\004"
          + "name\030\001 \001(\t\022\026\n\016collection_ids\030\002 \003(\t\022\030\n\020in"
          + "put_uri_prefix\030\003 \001(\t2\375\014\n\016FirestoreAdmin\022"
          + "\252\001\n\013CreateIndex\022-.google.firestore.admin"
          + ".v1.CreateIndexRequest\032\035.google.longrunn"
          + "ing.Operation\"M\202\323\344\223\002G\">/v1/{parent=proje"
          + "cts/*/databases/*/collectionGroups/*}/in"
          + "dexes:\005index\022\264\001\n\013ListIndexes\022-.google.fi"
          + "restore.admin.v1.ListIndexesRequest\032..go"
          + "ogle.firestore.admin.v1.ListIndexesRespo"
          + "nse\"F\202\323\344\223\002@\022>/v1/{parent=projects/*/data"
          + "bases/*/collectionGroups/*}/indexes\022\240\001\n\010"
          + "GetIndex\022*.google.firestore.admin.v1.Get"
          + "IndexRequest\032 .google.firestore.admin.v1"
          + ".Index\"F\202\323\344\223\002@\022>/v1/{name=projects/*/dat"
          + "abases/*/collectionGroups/*/indexes/*}\022\234"
          + "\001\n\013DeleteIndex\022-.google.firestore.admin."
          + "v1.DeleteIndexRequest\032\026.google.protobuf."
          + "Empty\"F\202\323\344\223\002@*>/v1/{name=projects/*/data"
          + "bases/*/collectionGroups/*/indexes/*}\022\237\001"
          + "\n\010GetField\022*.google.firestore.admin.v1.G"
          + "etFieldRequest\032 .google.firestore.admin."
          + "v1.Field\"E\202\323\344\223\002?\022=/v1/{name=projects/*/d"
          + "atabases/*/collectionGroups/*/fields/*}\022"
          + "\257\001\n\013UpdateField\022-.google.firestore.admin"
          + ".v1.UpdateFieldRequest\032\035.google.longrunn"
          + "ing.Operation\"R\202\323\344\223\002L2C/v1/{field.name=p"
          + "rojects/*/databases/*/collectionGroups/*"
          + "/fields/*}:\005field\022\260\001\n\nListFields\022,.googl"
          + "e.firestore.admin.v1.ListFieldsRequest\032-"
          + ".google.firestore.admin.v1.ListFieldsRes"
          + "ponse\"E\202\323\344\223\002?\022=/v1/{parent=projects/*/da"
          + "tabases/*/collectionGroups/*}/fields\022\241\001\n"
          + "\017ExportDocuments\0221.google.firestore.admi"
          + "n.v1.ExportDocumentsRequest\032\035.google.lon"
          + "grunning.Operation\"<\202\323\344\223\0026\"1/v1/{name=pr"
          + "ojects/*/databases/*}:exportDocuments:\001*"
          + "\022\241\001\n\017ImportDocuments\0221.google.firestore."
          + "admin.v1.ImportDocumentsRequest\032\035.google"
          + ".longrunning.Operation\"<\202\323\344\223\0026\"1/v1/{nam"
          + "e=projects/*/databases/*}:importDocument"
          + "s:\001*\032v\312A\030firestore.googleapis.com\322AXhttp"
          + "s://www.googleapis.com/auth/cloud-platfo"
          + "rm,https://www.googleapis.com/auth/datas"
          + "toreB\301\001\n\035com.google.firestore.admin.v1B\023"
          + "FirestoreAdminProtoP\001Z>google.golang.org"
          + "/genproto/googleapis/firestore/admin/v1;"
          + "admin\242\002\004GCFS\252\002\037Google.Cloud.Firestore.Ad"
          + "min.V1\312\002\037Google\\Cloud\\Firestore\\Admin\\V1"
          + "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.firestore.admin.v1.FieldProto.getDescriptor(),
          com.google.firestore.admin.v1.IndexProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        },
        assigner);
    internal_static_google_firestore_admin_v1_CreateIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_admin_v1_CreateIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_CreateIndexRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Index",
            });
    internal_static_google_firestore_admin_v1_ListIndexesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_admin_v1_ListIndexesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_ListIndexesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_firestore_admin_v1_ListIndexesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_firestore_admin_v1_ListIndexesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_ListIndexesResponse_descriptor,
            new java.lang.String[] {
              "Indexes", "NextPageToken",
            });
    internal_static_google_firestore_admin_v1_GetIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_firestore_admin_v1_GetIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_GetIndexRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_firestore_admin_v1_DeleteIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_firestore_admin_v1_DeleteIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_DeleteIndexRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_firestore_admin_v1_UpdateFieldRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_firestore_admin_v1_UpdateFieldRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_UpdateFieldRequest_descriptor,
            new java.lang.String[] {
              "Field", "UpdateMask",
            });
    internal_static_google_firestore_admin_v1_GetFieldRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_firestore_admin_v1_GetFieldRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_GetFieldRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_firestore_admin_v1_ListFieldsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_firestore_admin_v1_ListFieldsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_ListFieldsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_firestore_admin_v1_ListFieldsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_firestore_admin_v1_ListFieldsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_ListFieldsResponse_descriptor,
            new java.lang.String[] {
              "Fields", "NextPageToken",
            });
    internal_static_google_firestore_admin_v1_ExportDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_firestore_admin_v1_ExportDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_ExportDocumentsRequest_descriptor,
            new java.lang.String[] {
              "Name", "CollectionIds", "OutputUriPrefix",
            });
    internal_static_google_firestore_admin_v1_ImportDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_firestore_admin_v1_ImportDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_ImportDocumentsRequest_descriptor,
            new java.lang.String[] {
              "Name", "CollectionIds", "InputUriPrefix",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.firestore.admin.v1.FieldProto.getDescriptor();
    com.google.firestore.admin.v1.IndexProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
