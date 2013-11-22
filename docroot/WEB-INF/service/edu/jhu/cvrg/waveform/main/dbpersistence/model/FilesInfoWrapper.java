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
 * This class is a wrapper for {@link FilesInfo}.
 * </p>
 *
 * @author    bbenite1
 * @see       FilesInfo
 * @generated
 */
public class FilesInfoWrapper implements FilesInfo, ModelWrapper<FilesInfo> {
	public FilesInfoWrapper(FilesInfo filesInfo) {
		_filesInfo = filesInfo;
	}

	public Class<?> getModelClass() {
		return FilesInfo.class;
	}

	public String getModelClassName() {
		return FilesInfo.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("DocumentID", getDocumentID());
		attributes.put("RecordID", getRecordID());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		String DocumentID = (String)attributes.get("DocumentID");

		if (DocumentID != null) {
			setDocumentID(DocumentID);
		}

		String RecordID = (String)attributes.get("RecordID");

		if (RecordID != null) {
			setRecordID(RecordID);
		}
	}

	/**
	* Returns the primary key of this files info.
	*
	* @return the primary key of this files info
	*/
	public java.lang.String getPrimaryKey() {
		return _filesInfo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this files info.
	*
	* @param primaryKey the primary key of this files info
	*/
	public void setPrimaryKey(java.lang.String primaryKey) {
		_filesInfo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the document i d of this files info.
	*
	* @return the document i d of this files info
	*/
	public java.lang.String getDocumentID() {
		return _filesInfo.getDocumentID();
	}

	/**
	* Sets the document i d of this files info.
	*
	* @param DocumentID the document i d of this files info
	*/
	public void setDocumentID(java.lang.String DocumentID) {
		_filesInfo.setDocumentID(DocumentID);
	}

	/**
	* Returns the record i d of this files info.
	*
	* @return the record i d of this files info
	*/
	public java.lang.String getRecordID() {
		return _filesInfo.getRecordID();
	}

	/**
	* Sets the record i d of this files info.
	*
	* @param RecordID the record i d of this files info
	*/
	public void setRecordID(java.lang.String RecordID) {
		_filesInfo.setRecordID(RecordID);
	}

	public boolean isNew() {
		return _filesInfo.isNew();
	}

	public void setNew(boolean n) {
		_filesInfo.setNew(n);
	}

	public boolean isCachedModel() {
		return _filesInfo.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_filesInfo.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _filesInfo.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _filesInfo.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_filesInfo.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _filesInfo.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_filesInfo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FilesInfoWrapper((FilesInfo)_filesInfo.clone());
	}

	public int compareTo(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo filesInfo) {
		return _filesInfo.compareTo(filesInfo);
	}

	@Override
	public int hashCode() {
		return _filesInfo.hashCode();
	}

	public com.liferay.portal.model.CacheModel<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> toCacheModel() {
		return _filesInfo.toCacheModel();
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo toEscapedModel() {
		return new FilesInfoWrapper(_filesInfo.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _filesInfo.toString();
	}

	public java.lang.String toXmlString() {
		return _filesInfo.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_filesInfo.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public FilesInfo getWrappedFilesInfo() {
		return _filesInfo;
	}

	public FilesInfo getWrappedModel() {
		return _filesInfo;
	}

	public void resetOriginalValues() {
		_filesInfo.resetOriginalValues();
	}

	private FilesInfo _filesInfo;
}