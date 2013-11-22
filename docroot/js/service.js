Liferay.Service.register("Liferay.Service.Database", "edu.jhu.cvrg.waveform.main.dbpersistence.service", "waveform-persistence-portlet");

Liferay.Service.registerClass(
	Liferay.Service.Database, "AnnotationInfo",
	{
		addAnnotationInfo: true,
		deleteAnnotationInfo: true,
		getAnnotationsByRecord: true,
		getAnnotation: true,
		getAnnotationsByType: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.Database, "Coordinate",
	{
		addCoordinate: true,
		deleteCoordinate: true,
		getCoordinate: true,
		updateCoordinate: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.Database, "DocumentRecord",
	{
		addDocumentRecord: true,
		deleteDocumentRecord: true,
		getByFileFormat: true,
		getBySubjectID: true,
		getByScreenName: true,
		getRecord: true,
		updateDocumentRecord: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.Database, "FilesInfo",
	{
		addFilesInfo: true,
		deleteFilesInfo: true,
		getFile: true,
		getFiles: true
	}
);