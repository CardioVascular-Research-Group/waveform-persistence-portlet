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
 * This class is used by SOAP remote services, specifically {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.http.AnnotationInfoServiceSoap}.
 *
 * @author    bbenite1
 * @see       edu.jhu.cvrg.waveform.main.dbpersistence.service.http.AnnotationInfoServiceSoap
 * @generated
 */
public class AnnotationInfoSoap implements Serializable {
	public static AnnotationInfoSoap toSoapModel(AnnotationInfo model) {
		AnnotationInfoSoap soapModel = new AnnotationInfoSoap();

		soapModel.setAnnotationID(model.getAnnotationID());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setAnnotationType(model.getAnnotationType());
		soapModel.setName(model.getName());
		soapModel.setBioportalReference(model.getBioportalReference());
		soapModel.setLead(model.getLead());
		soapModel.setStartingCoordinateID(model.getStartingCoordinateID());
		soapModel.setEndingCoordinateID(model.getEndingCoordinateID());
		soapModel.setUnitOfMeasurement(model.getUnitOfMeasurement());
		soapModel.setDescription(model.getDescription());
		soapModel.setValue(model.getValue());
		soapModel.setDocumentRecordID(model.getDocumentRecordID());
		soapModel.setTimestamp(model.getTimestamp());

		return soapModel;
	}

	public static AnnotationInfoSoap[] toSoapModels(AnnotationInfo[] models) {
		AnnotationInfoSoap[] soapModels = new AnnotationInfoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AnnotationInfoSoap[][] toSoapModels(AnnotationInfo[][] models) {
		AnnotationInfoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AnnotationInfoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AnnotationInfoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AnnotationInfoSoap[] toSoapModels(List<AnnotationInfo> models) {
		List<AnnotationInfoSoap> soapModels = new ArrayList<AnnotationInfoSoap>(models.size());

		for (AnnotationInfo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AnnotationInfoSoap[soapModels.size()]);
	}

	public AnnotationInfoSoap() {
	}

	public long getPrimaryKey() {
		return _AnnotationID;
	}

	public void setPrimaryKey(long pk) {
		setAnnotationID(pk);
	}

	public long getAnnotationID() {
		return _AnnotationID;
	}

	public void setAnnotationID(long AnnotationID) {
		_AnnotationID = AnnotationID;
	}

	public String getCreatedBy() {
		return _CreatedBy;
	}

	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;
	}

	public String getAnnotationType() {
		return _AnnotationType;
	}

	public void setAnnotationType(String AnnotationType) {
		_AnnotationType = AnnotationType;
	}

	public String getName() {
		return _Name;
	}

	public void setName(String Name) {
		_Name = Name;
	}

	public String getBioportalReference() {
		return _BioportalReference;
	}

	public void setBioportalReference(String BioportalReference) {
		_BioportalReference = BioportalReference;
	}

	public String getLead() {
		return _Lead;
	}

	public void setLead(String Lead) {
		_Lead = Lead;
	}

	public long getStartingCoordinateID() {
		return _StartingCoordinateID;
	}

	public void setStartingCoordinateID(long StartingCoordinateID) {
		_StartingCoordinateID = StartingCoordinateID;
	}

	public long getEndingCoordinateID() {
		return _EndingCoordinateID;
	}

	public void setEndingCoordinateID(long EndingCoordinateID) {
		_EndingCoordinateID = EndingCoordinateID;
	}

	public String getUnitOfMeasurement() {
		return _UnitOfMeasurement;
	}

	public void setUnitOfMeasurement(String UnitOfMeasurement) {
		_UnitOfMeasurement = UnitOfMeasurement;
	}

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
	}

	public String getValue() {
		return _Value;
	}

	public void setValue(String Value) {
		_Value = Value;
	}

	public long getDocumentRecordID() {
		return _DocumentRecordID;
	}

	public void setDocumentRecordID(long DocumentRecordID) {
		_DocumentRecordID = DocumentRecordID;
	}

	public Date getTimestamp() {
		return _Timestamp;
	}

	public void setTimestamp(Date Timestamp) {
		_Timestamp = Timestamp;
	}

	private long _AnnotationID;
	private String _CreatedBy;
	private String _AnnotationType;
	private String _Name;
	private String _BioportalReference;
	private String _Lead;
	private long _StartingCoordinateID;
	private long _EndingCoordinateID;
	private String _UnitOfMeasurement;
	private String _Description;
	private String _Value;
	private long _DocumentRecordID;
	private Date _Timestamp;
}