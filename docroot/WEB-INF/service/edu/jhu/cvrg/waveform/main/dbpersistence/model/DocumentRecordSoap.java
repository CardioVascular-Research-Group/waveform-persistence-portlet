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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.http.DocumentRecordServiceSoap}.
 *
 * @author    bbenite1
 * @see       edu.jhu.cvrg.waveform.main.dbpersistence.service.http.DocumentRecordServiceSoap
 * @generated
 */
public class DocumentRecordSoap implements Serializable {
	public static DocumentRecordSoap toSoapModel(DocumentRecord model) {
		DocumentRecordSoap soapModel = new DocumentRecordSoap();

		soapModel.setRecordID(model.getRecordID());
		soapModel.setRecordName(model.getRecordName());
		soapModel.setUserID(model.getUserID());
		soapModel.setSubjectID(model.getSubjectID());
		soapModel.setOriginalFormat(model.getOriginalFormat());
		soapModel.setSamplingRate(model.getSamplingRate());
		soapModel.setFileTreePath(model.getFileTreePath());
		soapModel.setLeadCount(model.getLeadCount());
		soapModel.setNumberOfPoints(model.getNumberOfPoints());
		soapModel.setDateOfUpload(model.getDateOfUpload());
		soapModel.setAge(model.getAge());
		soapModel.setGender(model.getGender());
		soapModel.setDateOfRecording(model.getDateOfRecording());
		soapModel.setAduGain(model.getAduGain());

		return soapModel;
	}

	public static DocumentRecordSoap[] toSoapModels(DocumentRecord[] models) {
		DocumentRecordSoap[] soapModels = new DocumentRecordSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DocumentRecordSoap[][] toSoapModels(DocumentRecord[][] models) {
		DocumentRecordSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DocumentRecordSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DocumentRecordSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DocumentRecordSoap[] toSoapModels(List<DocumentRecord> models) {
		List<DocumentRecordSoap> soapModels = new ArrayList<DocumentRecordSoap>(models.size());

		for (DocumentRecord model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DocumentRecordSoap[soapModels.size()]);
	}

	public DocumentRecordSoap() {
	}

	public String getPrimaryKey() {
		return _RecordID;
	}

	public void setPrimaryKey(String pk) {
		setRecordID(pk);
	}

	public String getRecordID() {
		return _RecordID;
	}

	public void setRecordID(String RecordID) {
		_RecordID = RecordID;
	}

	public String getRecordName() {
		return _RecordName;
	}

	public void setRecordName(String RecordName) {
		_RecordName = RecordName;
	}

	public String getUserID() {
		return _UserID;
	}

	public void setUserID(String UserID) {
		_UserID = UserID;
	}

	public String getSubjectID() {
		return _SubjectID;
	}

	public void setSubjectID(String SubjectID) {
		_SubjectID = SubjectID;
	}

	public String getOriginalFormat() {
		return _OriginalFormat;
	}

	public void setOriginalFormat(String OriginalFormat) {
		_OriginalFormat = OriginalFormat;
	}

	public double getSamplingRate() {
		return _SamplingRate;
	}

	public void setSamplingRate(double SamplingRate) {
		_SamplingRate = SamplingRate;
	}

	public String getFileTreePath() {
		return _FileTreePath;
	}

	public void setFileTreePath(String FileTreePath) {
		_FileTreePath = FileTreePath;
	}

	public int getLeadCount() {
		return _LeadCount;
	}

	public void setLeadCount(int LeadCount) {
		_LeadCount = LeadCount;
	}

	public int getNumberOfPoints() {
		return _NumberOfPoints;
	}

	public void setNumberOfPoints(int NumberOfPoints) {
		_NumberOfPoints = NumberOfPoints;
	}

	public Date getDateOfUpload() {
		return _DateOfUpload;
	}

	public void setDateOfUpload(Date DateOfUpload) {
		_DateOfUpload = DateOfUpload;
	}

	public int getAge() {
		return _Age;
	}

	public void setAge(int Age) {
		_Age = Age;
	}

	public String getGender() {
		return _Gender;
	}

	public void setGender(String Gender) {
		_Gender = Gender;
	}

	public Date getDateOfRecording() {
		return _DateOfRecording;
	}

	public void setDateOfRecording(Date DateOfRecording) {
		_DateOfRecording = DateOfRecording;
	}

	public double getAduGain() {
		return _AduGain;
	}

	public void setAduGain(double AduGain) {
		_AduGain = AduGain;
	}

	private String _RecordID;
	private String _RecordName;
	private String _UserID;
	private String _SubjectID;
	private String _OriginalFormat;
	private double _SamplingRate;
	private String _FileTreePath;
	private int _LeadCount;
	private int _NumberOfPoints;
	private Date _DateOfUpload;
	private int _Age;
	private String _Gender;
	private Date _DateOfRecording;
	private double _AduGain;
}