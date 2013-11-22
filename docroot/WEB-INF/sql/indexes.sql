create index IX_713223E4 on Database_AnnotationInfo (AnnotationType, RecordID);
create index IX_1057FBC7 on Database_AnnotationInfo (RecordID);
create index IX_1895B2F3 on Database_AnnotationInfo (RecordID, Name, AnnotationType, Lead);

create index IX_DDEDC112 on Database_DocumentRecord (OriginalFormat);
create index IX_EF605216 on Database_DocumentRecord (RecordID);
create index IX_7F10660A on Database_DocumentRecord (RecordName, UserID, SubjectID, FileTreePath);
create index IX_8B762701 on Database_DocumentRecord (SubjectID);
create index IX_BBD1D290 on Database_DocumentRecord (UserID);

create index IX_1F4C0330 on Database_FilesInfo (FileListID);