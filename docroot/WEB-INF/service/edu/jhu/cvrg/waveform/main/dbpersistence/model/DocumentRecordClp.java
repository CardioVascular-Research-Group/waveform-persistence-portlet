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

import edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bbenite1
 */
public class DocumentRecordClp extends BaseModelImpl<DocumentRecord>
	implements DocumentRecord {
	public DocumentRecordClp() {
	}

	public Class<?> getModelClass() {
		return DocumentRecord.class;
	}

	public String getModelClassName() {
		return DocumentRecord.class.getName();
	}

	public String getPrimaryKey() {
		return _RecordID;
	}

	public void setPrimaryKey(String primaryKey) {
		setRecordID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return _RecordID;
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
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

	@Override
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

	public BaseModel<?> getDocumentRecordRemoteModel() {
		return _documentRecordRemoteModel;
	}

	public void setDocumentRecordRemoteModel(
		BaseModel<?> documentRecordRemoteModel) {
		_documentRecordRemoteModel = documentRecordRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			DocumentRecordLocalServiceUtil.addDocumentRecord(this);
		}
		else {
			DocumentRecordLocalServiceUtil.updateDocumentRecord(this);
		}
	}

	@Override
	public DocumentRecord toEscapedModel() {
		return (DocumentRecord)Proxy.newProxyInstance(DocumentRecord.class.getClassLoader(),
			new Class[] { DocumentRecord.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DocumentRecordClp clone = new DocumentRecordClp();

		clone.setRecordID(getRecordID());
		clone.setRecordName(getRecordName());
		clone.setUserID(getUserID());
		clone.setSubjectID(getSubjectID());
		clone.setOriginalFormat(getOriginalFormat());
		clone.setSamplingRate(getSamplingRate());
		clone.setFileTreePath(getFileTreePath());
		clone.setLeadCount(getLeadCount());
		clone.setNumberOfPoints(getNumberOfPoints());
		clone.setDateOfUpload(getDateOfUpload());
		clone.setAge(getAge());
		clone.setGender(getGender());
		clone.setDateOfRecording(getDateOfRecording());
		clone.setAduGain(getAduGain());

		return clone;
	}

	public int compareTo(DocumentRecord documentRecord) {
		String primaryKey = documentRecord.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		DocumentRecordClp documentRecord = null;

		try {
			documentRecord = (DocumentRecordClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String primaryKey = documentRecord.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{RecordID=");
		sb.append(getRecordID());
		sb.append(", RecordName=");
		sb.append(getRecordName());
		sb.append(", UserID=");
		sb.append(getUserID());
		sb.append(", SubjectID=");
		sb.append(getSubjectID());
		sb.append(", OriginalFormat=");
		sb.append(getOriginalFormat());
		sb.append(", SamplingRate=");
		sb.append(getSamplingRate());
		sb.append(", FileTreePath=");
		sb.append(getFileTreePath());
		sb.append(", LeadCount=");
		sb.append(getLeadCount());
		sb.append(", NumberOfPoints=");
		sb.append(getNumberOfPoints());
		sb.append(", DateOfUpload=");
		sb.append(getDateOfUpload());
		sb.append(", Age=");
		sb.append(getAge());
		sb.append(", Gender=");
		sb.append(getGender());
		sb.append(", DateOfRecording=");
		sb.append(getDateOfRecording());
		sb.append(", AduGain=");
		sb.append(getAduGain());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append(
			"edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>RecordID</column-name><column-value><![CDATA[");
		sb.append(getRecordID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>RecordName</column-name><column-value><![CDATA[");
		sb.append(getRecordName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UserID</column-name><column-value><![CDATA[");
		sb.append(getUserID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SubjectID</column-name><column-value><![CDATA[");
		sb.append(getSubjectID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>OriginalFormat</column-name><column-value><![CDATA[");
		sb.append(getOriginalFormat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SamplingRate</column-name><column-value><![CDATA[");
		sb.append(getSamplingRate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FileTreePath</column-name><column-value><![CDATA[");
		sb.append(getFileTreePath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LeadCount</column-name><column-value><![CDATA[");
		sb.append(getLeadCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NumberOfPoints</column-name><column-value><![CDATA[");
		sb.append(getNumberOfPoints());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DateOfUpload</column-name><column-value><![CDATA[");
		sb.append(getDateOfUpload());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Age</column-name><column-value><![CDATA[");
		sb.append(getAge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DateOfRecording</column-name><column-value><![CDATA[");
		sb.append(getDateOfRecording());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AduGain</column-name><column-value><![CDATA[");
		sb.append(getAduGain());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _documentRecordRemoteModel;
}