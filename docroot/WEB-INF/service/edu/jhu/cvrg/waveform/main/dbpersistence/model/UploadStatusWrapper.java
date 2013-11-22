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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UploadStatus}.
 * </p>
 *
 * @author    bbenite1
 * @see       UploadStatus
 * @generated
 */
public class UploadStatusWrapper implements UploadStatus,
	ModelWrapper<UploadStatus> {
	public UploadStatusWrapper(UploadStatus uploadStatus) {
		_uploadStatus = uploadStatus;
	}

	public Class<?> getModelClass() {
		return UploadStatus.class;
	}

	public String getModelClassName() {
		return UploadStatus.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("StatusLogNumber", getStatusLogNumber());
		attributes.put("FileTransfer", getFileTransfer());
		attributes.put("FileConversion", getFileConversion());
		attributes.put("RecordCreation", getRecordCreation());
		attributes.put("AnnotationCreation", getAnnotationCreation());
		attributes.put("RecordID", getRecordID());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		String StatusLogNumber = (String)attributes.get("StatusLogNumber");

		if (StatusLogNumber != null) {
			setStatusLogNumber(StatusLogNumber);
		}

		String FileTransfer = (String)attributes.get("FileTransfer");

		if (FileTransfer != null) {
			setFileTransfer(FileTransfer);
		}

		String FileConversion = (String)attributes.get("FileConversion");

		if (FileConversion != null) {
			setFileConversion(FileConversion);
		}

		String RecordCreation = (String)attributes.get("RecordCreation");

		if (RecordCreation != null) {
			setRecordCreation(RecordCreation);
		}

		String AnnotationCreation = (String)attributes.get("AnnotationCreation");

		if (AnnotationCreation != null) {
			setAnnotationCreation(AnnotationCreation);
		}

		String RecordID = (String)attributes.get("RecordID");

		if (RecordID != null) {
			setRecordID(RecordID);
		}
	}

	/**
	* Returns the primary key of this upload status.
	*
	* @return the primary key of this upload status
	*/
	public java.lang.String getPrimaryKey() {
		return _uploadStatus.getPrimaryKey();
	}

	/**
	* Sets the primary key of this upload status.
	*
	* @param primaryKey the primary key of this upload status
	*/
	public void setPrimaryKey(java.lang.String primaryKey) {
		_uploadStatus.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the status log number of this upload status.
	*
	* @return the status log number of this upload status
	*/
	public java.lang.String getStatusLogNumber() {
		return _uploadStatus.getStatusLogNumber();
	}

	/**
	* Sets the status log number of this upload status.
	*
	* @param StatusLogNumber the status log number of this upload status
	*/
	public void setStatusLogNumber(java.lang.String StatusLogNumber) {
		_uploadStatus.setStatusLogNumber(StatusLogNumber);
	}

	/**
	* Returns the file transfer of this upload status.
	*
	* @return the file transfer of this upload status
	*/
	public java.lang.String getFileTransfer() {
		return _uploadStatus.getFileTransfer();
	}

	/**
	* Sets the file transfer of this upload status.
	*
	* @param FileTransfer the file transfer of this upload status
	*/
	public void setFileTransfer(java.lang.String FileTransfer) {
		_uploadStatus.setFileTransfer(FileTransfer);
	}

	/**
	* Returns the file conversion of this upload status.
	*
	* @return the file conversion of this upload status
	*/
	public java.lang.String getFileConversion() {
		return _uploadStatus.getFileConversion();
	}

	/**
	* Sets the file conversion of this upload status.
	*
	* @param FileConversion the file conversion of this upload status
	*/
	public void setFileConversion(java.lang.String FileConversion) {
		_uploadStatus.setFileConversion(FileConversion);
	}

	/**
	* Returns the record creation of this upload status.
	*
	* @return the record creation of this upload status
	*/
	public java.lang.String getRecordCreation() {
		return _uploadStatus.getRecordCreation();
	}

	/**
	* Sets the record creation of this upload status.
	*
	* @param RecordCreation the record creation of this upload status
	*/
	public void setRecordCreation(java.lang.String RecordCreation) {
		_uploadStatus.setRecordCreation(RecordCreation);
	}

	/**
	* Returns the annotation creation of this upload status.
	*
	* @return the annotation creation of this upload status
	*/
	public java.lang.String getAnnotationCreation() {
		return _uploadStatus.getAnnotationCreation();
	}

	/**
	* Sets the annotation creation of this upload status.
	*
	* @param AnnotationCreation the annotation creation of this upload status
	*/
	public void setAnnotationCreation(java.lang.String AnnotationCreation) {
		_uploadStatus.setAnnotationCreation(AnnotationCreation);
	}

	/**
	* Returns the record i d of this upload status.
	*
	* @return the record i d of this upload status
	*/
	public java.lang.String getRecordID() {
		return _uploadStatus.getRecordID();
	}

	/**
	* Sets the record i d of this upload status.
	*
	* @param RecordID the record i d of this upload status
	*/
	public void setRecordID(java.lang.String RecordID) {
		_uploadStatus.setRecordID(RecordID);
	}

	public boolean isNew() {
		return _uploadStatus.isNew();
	}

	public void setNew(boolean n) {
		_uploadStatus.setNew(n);
	}

	public boolean isCachedModel() {
		return _uploadStatus.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_uploadStatus.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _uploadStatus.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _uploadStatus.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_uploadStatus.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _uploadStatus.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_uploadStatus.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UploadStatusWrapper((UploadStatus)_uploadStatus.clone());
	}

	public int compareTo(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus) {
		return _uploadStatus.compareTo(uploadStatus);
	}

	@Override
	public int hashCode() {
		return _uploadStatus.hashCode();
	}

	public com.liferay.portal.model.CacheModel<edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus> toCacheModel() {
		return _uploadStatus.toCacheModel();
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus toEscapedModel() {
		return new UploadStatusWrapper(_uploadStatus.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _uploadStatus.toString();
	}

	public java.lang.String toXmlString() {
		return _uploadStatus.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_uploadStatus.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public UploadStatus getWrappedUploadStatus() {
		return _uploadStatus;
	}

	public UploadStatus getWrappedModel() {
		return _uploadStatus;
	}

	public void resetOriginalValues() {
		_uploadStatus.resetOriginalValues();
	}

	private UploadStatus _uploadStatus;
}