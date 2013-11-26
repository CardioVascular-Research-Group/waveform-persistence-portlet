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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bbenite1
 */
public class FilesInfoClp extends BaseModelImpl<FilesInfo> implements FilesInfo {
	public FilesInfoClp() {
	}

	public Class<?> getModelClass() {
		return FilesInfo.class;
	}

	public String getModelClassName() {
		return FilesInfo.class.getName();
	}

	public long getPrimaryKey() {
		return _FileID;
	}

	public void setPrimaryKey(long primaryKey) {
		setFileID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_FileID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("FileID", getFileID());
		attributes.put("DocumentRecordID", getDocumentRecordID());

		return attributes;
	}

	@Override
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

	public BaseModel<?> getFilesInfoRemoteModel() {
		return _filesInfoRemoteModel;
	}

	public void setFilesInfoRemoteModel(BaseModel<?> filesInfoRemoteModel) {
		_filesInfoRemoteModel = filesInfoRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			FilesInfoLocalServiceUtil.addFilesInfo(this);
		}
		else {
			FilesInfoLocalServiceUtil.updateFilesInfo(this);
		}
	}

	@Override
	public FilesInfo toEscapedModel() {
		return (FilesInfo)Proxy.newProxyInstance(FilesInfo.class.getClassLoader(),
			new Class[] { FilesInfo.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FilesInfoClp clone = new FilesInfoClp();

		clone.setFileID(getFileID());
		clone.setDocumentRecordID(getDocumentRecordID());

		return clone;
	}

	public int compareTo(FilesInfo filesInfo) {
		long primaryKey = filesInfo.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		FilesInfoClp filesInfo = null;

		try {
			filesInfo = (FilesInfoClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = filesInfo.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{FileID=");
		sb.append(getFileID());
		sb.append(", DocumentRecordID=");
		sb.append(getDocumentRecordID());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>FileID</column-name><column-value><![CDATA[");
		sb.append(getFileID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DocumentRecordID</column-name><column-value><![CDATA[");
		sb.append(getDocumentRecordID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _FileID;
	private long _DocumentRecordID;
	private BaseModel<?> _filesInfoRemoteModel;
}