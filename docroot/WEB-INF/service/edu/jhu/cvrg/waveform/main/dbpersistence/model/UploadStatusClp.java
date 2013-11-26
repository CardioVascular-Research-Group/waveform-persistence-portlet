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

import edu.jhu.cvrg.waveform.main.dbpersistence.service.UploadStatusLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bbenite1
 */
public class UploadStatusClp extends BaseModelImpl<UploadStatus>
	implements UploadStatus {
	public UploadStatusClp() {
	}

	public Class<?> getModelClass() {
		return UploadStatus.class;
	}

	public String getModelClassName() {
		return UploadStatus.class.getName();
	}

	public long getPrimaryKey() {
		return _StatusLogNumber;
	}

	public void setPrimaryKey(long primaryKey) {
		setStatusLogNumber(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_StatusLogNumber);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("StatusLogNumber", getStatusLogNumber());
		attributes.put("FileTransfer", getFileTransfer());
		attributes.put("FileConversion", getFileConversion());
		attributes.put("RecordCreation", getRecordCreation());
		attributes.put("AnnotationCreation", getAnnotationCreation());
		attributes.put("DocumentRecordID", getDocumentRecordID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long StatusLogNumber = (Long)attributes.get("StatusLogNumber");

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

		Long DocumentRecordID = (Long)attributes.get("DocumentRecordID");

		if (DocumentRecordID != null) {
			setDocumentRecordID(DocumentRecordID);
		}
	}

	public long getStatusLogNumber() {
		return _StatusLogNumber;
	}

	public void setStatusLogNumber(long StatusLogNumber) {
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

	public long getDocumentRecordID() {
		return _DocumentRecordID;
	}

	public void setDocumentRecordID(long DocumentRecordID) {
		_DocumentRecordID = DocumentRecordID;
	}

	public BaseModel<?> getUploadStatusRemoteModel() {
		return _uploadStatusRemoteModel;
	}

	public void setUploadStatusRemoteModel(BaseModel<?> uploadStatusRemoteModel) {
		_uploadStatusRemoteModel = uploadStatusRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			UploadStatusLocalServiceUtil.addUploadStatus(this);
		}
		else {
			UploadStatusLocalServiceUtil.updateUploadStatus(this);
		}
	}

	@Override
	public UploadStatus toEscapedModel() {
		return (UploadStatus)Proxy.newProxyInstance(UploadStatus.class.getClassLoader(),
			new Class[] { UploadStatus.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UploadStatusClp clone = new UploadStatusClp();

		clone.setStatusLogNumber(getStatusLogNumber());
		clone.setFileTransfer(getFileTransfer());
		clone.setFileConversion(getFileConversion());
		clone.setRecordCreation(getRecordCreation());
		clone.setAnnotationCreation(getAnnotationCreation());
		clone.setDocumentRecordID(getDocumentRecordID());

		return clone;
	}

	public int compareTo(UploadStatus uploadStatus) {
		long primaryKey = uploadStatus.getPrimaryKey();

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

		UploadStatusClp uploadStatus = null;

		try {
			uploadStatus = (UploadStatusClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = uploadStatus.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{StatusLogNumber=");
		sb.append(getStatusLogNumber());
		sb.append(", FileTransfer=");
		sb.append(getFileTransfer());
		sb.append(", FileConversion=");
		sb.append(getFileConversion());
		sb.append(", RecordCreation=");
		sb.append(getRecordCreation());
		sb.append(", AnnotationCreation=");
		sb.append(getAnnotationCreation());
		sb.append(", DocumentRecordID=");
		sb.append(getDocumentRecordID());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>StatusLogNumber</column-name><column-value><![CDATA[");
		sb.append(getStatusLogNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FileTransfer</column-name><column-value><![CDATA[");
		sb.append(getFileTransfer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FileConversion</column-name><column-value><![CDATA[");
		sb.append(getFileConversion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>RecordCreation</column-name><column-value><![CDATA[");
		sb.append(getRecordCreation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AnnotationCreation</column-name><column-value><![CDATA[");
		sb.append(getAnnotationCreation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DocumentRecordID</column-name><column-value><![CDATA[");
		sb.append(getDocumentRecordID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _StatusLogNumber;
	private String _FileTransfer;
	private String _FileConversion;
	private String _RecordCreation;
	private String _AnnotationCreation;
	private long _DocumentRecordID;
	private BaseModel<?> _uploadStatusRemoteModel;
}