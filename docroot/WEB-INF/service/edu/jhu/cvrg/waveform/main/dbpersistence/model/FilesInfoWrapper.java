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

		attributes.put("FileID", getFileID());
		attributes.put("DocumentRecordID", getDocumentRecordID());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long FileID = (Long)attributes.get("FileID");

		if (FileID != null) {
			setFileID(FileID);
		}

		Long DocumentRecordID = (Long)attributes.get("DocumentRecordID");

		if (DocumentRecordID != null) {
			setDocumentRecordID(DocumentRecordID);
		}
	}

	/**
	* Returns the primary key of this files info.
	*
	* @return the primary key of this files info
	*/
	public long getPrimaryKey() {
		return _filesInfo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this files info.
	*
	* @param primaryKey the primary key of this files info
	*/
	public void setPrimaryKey(long primaryKey) {
		_filesInfo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the file i d of this files info.
	*
	* @return the file i d of this files info
	*/
	public long getFileID() {
		return _filesInfo.getFileID();
	}

	/**
	* Sets the file i d of this files info.
	*
	* @param FileID the file i d of this files info
	*/
	public void setFileID(long FileID) {
		_filesInfo.setFileID(FileID);
	}

	/**
	* Returns the document record i d of this files info.
	*
	* @return the document record i d of this files info
	*/
	public long getDocumentRecordID() {
		return _filesInfo.getDocumentRecordID();
	}

	/**
	* Sets the document record i d of this files info.
	*
	* @param DocumentRecordID the document record i d of this files info
	*/
	public void setDocumentRecordID(long DocumentRecordID) {
		_filesInfo.setDocumentRecordID(DocumentRecordID);
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