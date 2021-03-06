create table Database_AnnotationInfo (
	AnnotationID LONG not null primary key,
	CreatedBy VARCHAR(75) null,
	AnnotationType VARCHAR(75) null,
	Name VARCHAR(75) null,
	BioportalReference VARCHAR(75) null,
	Lead VARCHAR(75) null,
	StartingCoordinateID LONG,
	EndingCoordinateID LONG,
	UnitOfMeasurement VARCHAR(75) null,
	Description VARCHAR(75) null,
	Value VARCHAR(75) null,
	DocumentRecordID LONG,
	Timestamp DATE null
);

create table Database_Coordinate (
	CoordinateID LONG not null primary key,
	xCoordinate DOUBLE,
	yCoordinate DOUBLE
);

create table Database_DocumentRecord (
	DocumentRecordID LONG not null primary key,
	RecordName VARCHAR(75) null,
	UserID LONG,
	SubjectID VARCHAR(75) null,
	OriginalFormat VARCHAR(75) null,
	SamplingRate DOUBLE,
	FileTreePath VARCHAR(75) null,
	LeadCount INTEGER,
	NumberOfPoints INTEGER,
	DateOfUpload DATE null,
	Age INTEGER,
	Gender VARCHAR(75) null,
	DateOfRecording DATE null,
	AduGain DOUBLE
);

create table Database_FilesInfo (
	FileID LONG not null primary key,
	DocumentRecordID LONG
);

create table Database_UploadStatus (
	StatusLogNumber LONG not null primary key,
	FileTransfer VARCHAR(75) null,
	FileConversion VARCHAR(75) null,
	RecordCreation VARCHAR(75) null,
	AnnotationCreation VARCHAR(75) null,
	DocumentRecordID LONG
);