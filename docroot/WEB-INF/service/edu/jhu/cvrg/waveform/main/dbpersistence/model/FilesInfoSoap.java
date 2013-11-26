/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package edu.jhu.cvrg.waveform.main.dbpersistence.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.http.FilesInfoServiceSoap}.
 *
 * @author    bbenite1
 * @see       edu.jhu.cvrg.waveform.main.dbpersistence.service.http.FilesInfoServiceSoap
 * @generated
 */
public class FilesInfoSoap implements Serializable {
	public static FilesInfoSoap toSoapModel(FilesInfo model) {
		FilesInfoSoap soapModel = new FilesInfoSoap();

		soapModel.setFileID(model.getFileID());
		soapModel.setDocumentRecordID(model.getDocumentRecordID());

		return soapModel;
	}

	public static FilesInfoSoap[] toSoapModels(FilesInfo[] models) {
		FilesInfoSoap[] soapModels = new FilesInfoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FilesInfoSoap[][] toSoapModels(FilesInfo[][] models) {
		FilesInfoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FilesInfoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FilesInfoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FilesInfoSoap[] toSoapModels(List<FilesInfo> models) {
		List<FilesInfoSoap> soapModels = new ArrayList<FilesInfoSoap>(models.size());

		for (FilesInfo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FilesInfoSoap[soapModels.size()]);
	}

	public FilesInfoSoap() {
	}

	public long getPrimaryKey() {
		return _FileID;
	}

	public void setPrimaryKey(long pk) {
		setFileID(pk);
	}

	public long getFileID() {
		return _FileID;
	}

	public void setFileID(long FileID) {
		_FileID = FileID;
	}

	public long getDocumentRecordID() {
		return _DocumentRecordID;
	}

	public void setDocumentRecordID(long DocumentRecordID) {
		_DocumentRecordID = DocumentRecordID;
	}

	private long _FileID;
	private long _DocumentRecordID;
}