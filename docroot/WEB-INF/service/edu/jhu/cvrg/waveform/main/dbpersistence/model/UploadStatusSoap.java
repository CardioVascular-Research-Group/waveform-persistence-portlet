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
 * This class is used by SOAP remote services, specifically {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.http.UploadStatusServiceSoap}.
 *
 * @author    bbenite1
 * @see       edu.jhu.cvrg.waveform.main.dbpersistence.service.http.UploadStatusServiceSoap
 * @generated
 */
public class UploadStatusSoap implements Serializable {
	public static UploadStatusSoap toSoapModel(UploadStatus model) {
		UploadStatusSoap soapModel = new UploadStatusSoap();

		soapModel.setStatusLogNumber(model.getStatusLogNumber());
		soapModel.setFileTransfer(model.getFileTransfer());
		soapModel.setFileConversion(model.getFileConversion());
		soapModel.setRecordCreation(model.getRecordCreation());
		soapModel.setAnnotationCreation(model.getAnnotationCreation());
		soapModel.setRecordID(model.getRecordID());

		return soapModel;
	}

	public static UploadStatusSoap[] toSoapModels(UploadStatus[] models) {
		UploadStatusSoap[] soapModels = new UploadStatusSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UploadStatusSoap[][] toSoapModels(UploadStatus[][] models) {
		UploadStatusSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UploadStatusSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UploadStatusSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UploadStatusSoap[] toSoapModels(List<UploadStatus> models) {
		List<UploadStatusSoap> soapModels = new ArrayList<UploadStatusSoap>(models.size());

		for (UploadStatus model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UploadStatusSoap[soapModels.size()]);
	}

	public UploadStatusSoap() {
	}

	public String getPrimaryKey() {
		return _StatusLogNumber;
	}

	public void setPrimaryKey(String pk) {
		setStatusLogNumber(pk);
	}

	public String getStatusLogNumber() {
		return _StatusLogNumber;
	}

	public void setStatusLogNumber(String StatusLogNumber) {
		_StatusLogNumber = StatusLogNumber;
	}

	public String getFileTransfer() {
		return _FileTransfer;
	}

	public void setFileTransfer(String FileTransfer) {
		_FileTransfer = FileTransfer;
	}

	public String getFileConversion() {
		return _FileConversion;
	}

	public void setFileConversion(String FileConversion) {
		_FileConversion = FileConversion;
	}

	public String getRecordCreation() {
		return _RecordCreation;
	}

	public void setRecordCreation(String RecordCreation) {
		_RecordCreation = RecordCreation;
	}

	public String getAnnotationCreation() {
		return _AnnotationCreation;
	}

	public void setAnnotationCreation(String AnnotationCreation) {
		_AnnotationCreation = AnnotationCreation;
	}

	public String getRecordID() {
		return _RecordID;
	}

	public void setRecordID(String RecordID) {
		_RecordID = RecordID;
	}

	private String _StatusLogNumber;
	private String _FileTransfer;
	private String _FileConversion;
	private String _RecordCreation;
	private String _AnnotationCreation;
	private String _RecordID;
}