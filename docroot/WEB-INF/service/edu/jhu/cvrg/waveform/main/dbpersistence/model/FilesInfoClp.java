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

	public String getPrimaryKey() {
		return _DocumentID;
	}

	public void setPrimaryKey(String primaryKey) {
		setDocumentID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return _DocumentID;
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("DocumentID", getDocumentID());
		attributes.put("FileListID", getFileListID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String DocumentID = (String)attributes.get("DocumentID");

		if (DocumentID != null) {
			setDocumentID(DocumentID);
		}

		String FileListID = (String)attributes.get("FileListID");

		if (FileListID != null) {
			setFileListID(FileListID);
		}
	}

	public String getDocumentID() {
		return _DocumentID;
	}

	public void setDocumentID(String DocumentID) {
		_DocumentID = DocumentID;
	}

	public String getFileListID() {
		return _FileListID;
	}

	public void setFileListID(String FileListID) {
		_FileListID = FileListID;
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

		clone.setDocumentID(getDocumentID());
		clone.setFileListID(getFileListID());

		return clone;
	}

	public int compareTo(FilesInfo filesInfo) {
		String primaryKey = filesInfo.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
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

		String primaryKey = filesInfo.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{DocumentID=");
		sb.append(getDocumentID());
		sb.append(", FileListID=");
		sb.append(getFileListID());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>DocumentID</column-name><column-value><![CDATA[");
		sb.append(getDocumentID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FileListID</column-name><column-value><![CDATA[");
		sb.append(getFileListID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _DocumentID;
	private String _FileListID;
	private BaseModel<?> _filesInfoRemoteModel;
}