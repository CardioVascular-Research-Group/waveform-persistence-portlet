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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DocumentRecord}.
 * </p>
 *
 * @author    bbenite1
 * @see       DocumentRecord
 * @generated
 */
public class DocumentRecordWrapper implements DocumentRecord,
	ModelWrapper<DocumentRecord> {
	public DocumentRecordWrapper(DocumentRecord documentRecord) {
		_documentRecord = documentRecord;
	}

	public Class<?> getModelClass() {
		return DocumentRecord.class;
	}

	public String getModelClassName() {
		return DocumentRecord.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("RecordID", getRecordID());
		attributes.put("RecordName", getRecordName());
		attributes.put("UserID", getUserID());
		attributes.put("SubjectID", getSubjectID());
		attributes.put("OriginalFormat", getOriginalFormat());
		attributes.put("SamplingRate", getSamplingRate());
		attributes.put("FileTreePath", getFileTreePath());
		attributes.put("LeadCount", getLeadCount());
		attributes.put("NumberOfPoints", getNumberOfPoints());
		attributes.put("DateOfUpload", getDateOfUpload());
		attributes.put("Age", getAge());
		attributes.put("Gender", getGender());
		attributes.put("DateOfRecording", getDateOfRecording());
		attributes.put("AduGain", getAduGain());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		String RecordID = (String)attributes.get("RecordID");

		if (RecordID != null) {
			setRecordID(RecordID);
		}

		String RecordName = (String)attributes.get("RecordName");

		if (RecordName != null) {
			setRecordName(RecordName);
		}

		String UserID = (String)attributes.get("UserID");

		if (UserID != null) {
			setUserID(UserID);
		}

		String SubjectID = (String)attributes.get("SubjectID");

		if (SubjectID != null) {
			setSubjectID(SubjectID);
		}

		String OriginalFormat = (String)attributes.get("OriginalFormat");

		if (OriginalFormat != null) {
			setOriginalFormat(OriginalFormat);
		}

		Double SamplingRate = (Double)attributes.get("SamplingRate");

		if (SamplingRate != null) {
			setSamplingRate(SamplingRate);
		}

		String FileTreePath = (String)attributes.get("FileTreePath");

		if (FileTreePath != null) {
			setFileTreePath(FileTreePath);
		}

		Integer LeadCount = (Integer)attributes.get("LeadCount");

		if (LeadCount != null) {
			setLeadCount(LeadCount);
		}

		Integer NumberOfPoints = (Integer)attributes.get("NumberOfPoints");

		if (NumberOfPoints != null) {
			setNumberOfPoints(NumberOfPoints);
		}

		Date DateOfUpload = (Date)attributes.get("DateOfUpload");

		if (DateOfUpload != null) {
			setDateOfUpload(DateOfUpload);
		}

		Integer Age = (Integer)attributes.get("Age");

		if (Age != null) {
			setAge(Age);
		}

		String Gender = (String)attributes.get("Gender");

		if (Gender != null) {
			setGender(Gender);
		}

		Date DateOfRecording = (Date)attributes.get("DateOfRecording");

		if (DateOfRecording != null) {
			setDateOfRecording(DateOfRecording);
		}

		Double AduGain = (Double)attributes.get("AduGain");

		if (AduGain != null) {
			setAduGain(AduGain);
		}
	}

	/**
	* Returns the primary key of this document record.
	*
	* @return the primary key of this document record
	*/
	public java.lang.String getPrimaryKey() {
		return _documentRecord.getPrimaryKey();
	}

	/**
	* Sets the primary key of this document record.
	*
	* @param primaryKey the primary key of this document record
	*/
	public void setPrimaryKey(java.lang.String primaryKey) {
		_documentRecord.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the record i d of this document record.
	*
	* @return the record i d of this document record
	*/
	public java.lang.String getRecordID() {
		return _documentRecord.getRecordID();
	}

	/**
	* Sets the record i d of this document record.
	*
	* @param RecordID the record i d of this document record
	*/
	public void setRecordID(java.lang.String RecordID) {
		_documentRecord.setRecordID(RecordID);
	}

	/**
	* Returns the record name of this document record.
	*
	* @return the record name of this document record
	*/
	public java.lang.String getRecordName() {
		return _documentRecord.getRecordName();
	}

	/**
	* Sets the record name of this document record.
	*
	* @param RecordName the record name of this document record
	*/
	public void setRecordName(java.lang.String RecordName) {
		_documentRecord.setRecordName(RecordName);
	}

	/**
	* Returns the user i d of this document record.
	*
	* @return the user i d of this document record
	*/
	public java.lang.String getUserID() {
		return _documentRecord.getUserID();
	}

	/**
	* Sets the user i d of this document record.
	*
	* @param UserID the user i d of this document record
	*/
	public void setUserID(java.lang.String UserID) {
		_documentRecord.setUserID(UserID);
	}

	/**
	* Returns the subject i d of this document record.
	*
	* @return the subject i d of this document record
	*/
	public java.lang.String getSubjectID() {
		return _documentRecord.getSubjectID();
	}

	/**
	* Sets the subject i d of this document record.
	*
	* @param SubjectID the subject i d of this document record
	*/
	public void setSubjectID(java.lang.String SubjectID) {
		_documentRecord.setSubjectID(SubjectID);
	}

	/**
	* Returns the original format of this document record.
	*
	* @return the original format of this document record
	*/
	public java.lang.String getOriginalFormat() {
		return _documentRecord.getOriginalFormat();
	}

	/**
	* Sets the original format of this document record.
	*
	* @param OriginalFormat the original format of this document record
	*/
	public void setOriginalFormat(java.lang.String OriginalFormat) {
		_documentRecord.setOriginalFormat(OriginalFormat);
	}

	/**
	* Returns the sampling rate of this document record.
	*
	* @return the sampling rate of this document record
	*/
	public double getSamplingRate() {
		return _documentRecord.getSamplingRate();
	}

	/**
	* Sets the sampling rate of this document record.
	*
	* @param SamplingRate the sampling rate of this document record
	*/
	public void setSamplingRate(double SamplingRate) {
		_documentRecord.setSamplingRate(SamplingRate);
	}

	/**
	* Returns the file tree path of this document record.
	*
	* @return the file tree path of this document record
	*/
	public java.lang.String getFileTreePath() {
		return _documentRecord.getFileTreePath();
	}

	/**
	* Sets the file tree path of this document record.
	*
	* @param FileTreePath the file tree path of this document record
	*/
	public void setFileTreePath(java.lang.String FileTreePath) {
		_documentRecord.setFileTreePath(FileTreePath);
	}

	/**
	* Returns the lead count of this document record.
	*
	* @return the lead count of this document record
	*/
	public int getLeadCount() {
		return _documentRecord.getLeadCount();
	}

	/**
	* Sets the lead count of this document record.
	*
	* @param LeadCount the lead count of this document record
	*/
	public void setLeadCount(int LeadCount) {
		_documentRecord.setLeadCount(LeadCount);
	}

	/**
	* Returns the number of points of this document record.
	*
	* @return the number of points of this document record
	*/
	public int getNumberOfPoints() {
		return _documentRecord.getNumberOfPoints();
	}

	/**
	* Sets the number of points of this document record.
	*
	* @param NumberOfPoints the number of points of this document record
	*/
	public void setNumberOfPoints(int NumberOfPoints) {
		_documentRecord.setNumberOfPoints(NumberOfPoints);
	}

	/**
	* Returns the date of upload of this document record.
	*
	* @return the date of upload of this document record
	*/
	public java.util.Date getDateOfUpload() {
		return _documentRecord.getDateOfUpload();
	}

	/**
	* Sets the date of upload of this document record.
	*
	* @param DateOfUpload the date of upload of this document record
	*/
	public void setDateOfUpload(java.util.Date DateOfUpload) {
		_documentRecord.setDateOfUpload(DateOfUpload);
	}

	/**
	* Returns the age of this document record.
	*
	* @return the age of this document record
	*/
	public int getAge() {
		return _documentRecord.getAge();
	}

	/**
	* Sets the age of this document record.
	*
	* @param Age the age of this document record
	*/
	public void setAge(int Age) {
		_documentRecord.setAge(Age);
	}

	/**
	* Returns the gender of this document record.
	*
	* @return the gender of this document record
	*/
	public java.lang.String getGender() {
		return _documentRecord.getGender();
	}

	/**
	* Sets the gender of this document record.
	*
	* @param Gender the gender of this document record
	*/
	public void setGender(java.lang.String Gender) {
		_documentRecord.setGender(Gender);
	}

	/**
	* Returns the date of recording of this document record.
	*
	* @return the date of recording of this document record
	*/
	public java.util.Date getDateOfRecording() {
		return _documentRecord.getDateOfRecording();
	}

	/**
	* Sets the date of recording of this document record.
	*
	* @param DateOfRecording the date of recording of this document record
	*/
	public void setDateOfRecording(java.util.Date DateOfRecording) {
		_documentRecord.setDateOfRecording(DateOfRecording);
	}

	/**
	* Returns the adu gain of this document record.
	*
	* @return the adu gain of this document record
	*/
	public double getAduGain() {
		return _documentRecord.getAduGain();
	}

	/**
	* Sets the adu gain of this document record.
	*
	* @param AduGain the adu gain of this document record
	*/
	public void setAduGain(double AduGain) {
		_documentRecord.setAduGain(AduGain);
	}

	public boolean isNew() {
		return _documentRecord.isNew();
	}

	public void setNew(boolean n) {
		_documentRecord.setNew(n);
	}

	public boolean isCachedModel() {
		return _documentRecord.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_documentRecord.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _documentRecord.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _documentRecord.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_documentRecord.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _documentRecord.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_documentRecord.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DocumentRecordWrapper((DocumentRecord)_documentRecord.clone());
	}

	public int compareTo(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord) {
		return _documentRecord.compareTo(documentRecord);
	}

	@Override
	public int hashCode() {
		return _documentRecord.hashCode();
	}

	public com.liferay.portal.model.CacheModel<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> toCacheModel() {
		return _documentRecord.toCacheModel();
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord toEscapedModel() {
		return new DocumentRecordWrapper(_documentRecord.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _documentRecord.toString();
	}

	public java.lang.String toXmlString() {
		return _documentRecord.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_documentRecord.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DocumentRecord getWrappedDocumentRecord() {
		return _documentRecord;
	}

	public DocumentRecord getWrappedModel() {
		return _documentRecord;
	}

	public void resetOriginalValues() {
		_documentRecord.resetOriginalValues();
	}

	private DocumentRecord _documentRecord;
}