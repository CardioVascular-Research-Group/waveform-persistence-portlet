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

package edu.jhu.cvrg.waveform.main.dbpersistence.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordModel;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DocumentRecord service. Represents a row in the &quot;Database_DocumentRecord&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DocumentRecordImpl}.
 * </p>
 *
 * @author bbenite1
 * @see DocumentRecordImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordModel
 * @generated
 */
@JSON(strict = true)
public class DocumentRecordModelImpl extends BaseModelImpl<DocumentRecord>
	implements DocumentRecordModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a document record model instance should use the {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord} interface instead.
	 */
	public static final String TABLE_NAME = "Database_DocumentRecord";
	public static final Object[][] TABLE_COLUMNS = {
			{ "RecordID", Types.VARCHAR },
			{ "RecordName", Types.VARCHAR },
			{ "UserID", Types.VARCHAR },
			{ "SubjectID", Types.VARCHAR },
			{ "OriginalFormat", Types.VARCHAR },
			{ "SamplingRate", Types.DOUBLE },
			{ "FileTreePath", Types.VARCHAR },
			{ "LeadCount", Types.INTEGER },
			{ "NumberOfPoints", Types.INTEGER },
			{ "DateOfUpload", Types.TIMESTAMP },
			{ "Age", Types.INTEGER },
			{ "Gender", Types.VARCHAR },
			{ "DateOfRecording", Types.TIMESTAMP },
			{ "AduGain", Types.DOUBLE },
			{ "FileListID", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Database_DocumentRecord (RecordID VARCHAR(75) not null primary key,RecordName VARCHAR(75) null,UserID VARCHAR(75) null,SubjectID VARCHAR(75) null,OriginalFormat VARCHAR(75) null,SamplingRate DOUBLE,FileTreePath VARCHAR(75) null,LeadCount INTEGER,NumberOfPoints INTEGER,DateOfUpload DATE null,Age INTEGER,Gender VARCHAR(75) null,DateOfRecording DATE null,AduGain DOUBLE,FileListID VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Database_DocumentRecord";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord"),
			true);
	public static long FILETREEPATH_COLUMN_BITMASK = 1L;
	public static long ORIGINALFORMAT_COLUMN_BITMASK = 2L;
	public static long RECORDID_COLUMN_BITMASK = 4L;
	public static long RECORDNAME_COLUMN_BITMASK = 8L;
	public static long SUBJECTID_COLUMN_BITMASK = 16L;
	public static long USERID_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DocumentRecord toModel(DocumentRecordSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DocumentRecord model = new DocumentRecordImpl();

		model.setRecordID(soapModel.getRecordID());
		model.setRecordName(soapModel.getRecordName());
		model.setUserID(soapModel.getUserID());
		model.setSubjectID(soapModel.getSubjectID());
		model.setOriginalFormat(soapModel.getOriginalFormat());
		model.setSamplingRate(soapModel.getSamplingRate());
		model.setFileTreePath(soapModel.getFileTreePath());
		model.setLeadCount(soapModel.getLeadCount());
		model.setNumberOfPoints(soapModel.getNumberOfPoints());
		model.setDateOfUpload(soapModel.getDateOfUpload());
		model.setAge(soapModel.getAge());
		model.setGender(soapModel.getGender());
		model.setDateOfRecording(soapModel.getDateOfRecording());
		model.setAduGain(soapModel.getAduGain());
		model.setFileListID(soapModel.getFileListID());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DocumentRecord> toModels(DocumentRecordSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DocumentRecord> models = new ArrayList<DocumentRecord>(soapModels.length);

		for (DocumentRecordSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord"));

	public DocumentRecordModelImpl() {
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

	public Class<?> getModelClass() {
		return DocumentRecord.class;
	}

	public String getModelClassName() {
		return DocumentRecord.class.getName();
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
		attributes.put("FileListID", getFileListID());

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

		String FileListID = (String)attributes.get("FileListID");

		if (FileListID != null) {
			setFileListID(FileListID);
		}
	}

	@JSON
	public String getRecordID() {
		if (_RecordID == null) {
			return StringPool.BLANK;
		}
		else {
			return _RecordID;
		}
	}

	public void setRecordID(String RecordID) {
		_columnBitmask |= RECORDID_COLUMN_BITMASK;

		if (_originalRecordID == null) {
			_originalRecordID = _RecordID;
		}

		_RecordID = RecordID;
	}

	public String getOriginalRecordID() {
		return GetterUtil.getString(_originalRecordID);
	}

	@JSON
	public String getRecordName() {
		if (_RecordName == null) {
			return StringPool.BLANK;
		}
		else {
			return _RecordName;
		}
	}

	public void setRecordName(String RecordName) {
		_columnBitmask |= RECORDNAME_COLUMN_BITMASK;

		if (_originalRecordName == null) {
			_originalRecordName = _RecordName;
		}

		_RecordName = RecordName;
	}

	public String getOriginalRecordName() {
		return GetterUtil.getString(_originalRecordName);
	}

	@JSON
	public String getUserID() {
		if (_UserID == null) {
			return StringPool.BLANK;
		}
		else {
			return _UserID;
		}
	}

	public void setUserID(String UserID) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (_originalUserID == null) {
			_originalUserID = _UserID;
		}

		_UserID = UserID;
	}

	public String getOriginalUserID() {
		return GetterUtil.getString(_originalUserID);
	}

	@JSON
	public String getSubjectID() {
		if (_SubjectID == null) {
			return StringPool.BLANK;
		}
		else {
			return _SubjectID;
		}
	}

	public void setSubjectID(String SubjectID) {
		_columnBitmask |= SUBJECTID_COLUMN_BITMASK;

		if (_originalSubjectID == null) {
			_originalSubjectID = _SubjectID;
		}

		_SubjectID = SubjectID;
	}

	public String getOriginalSubjectID() {
		return GetterUtil.getString(_originalSubjectID);
	}

	@JSON
	public String getOriginalFormat() {
		if (_OriginalFormat == null) {
			return StringPool.BLANK;
		}
		else {
			return _OriginalFormat;
		}
	}

	public void setOriginalFormat(String OriginalFormat) {
		_columnBitmask |= ORIGINALFORMAT_COLUMN_BITMASK;

		if (_originalOriginalFormat == null) {
			_originalOriginalFormat = _OriginalFormat;
		}

		_OriginalFormat = OriginalFormat;
	}

	public String getOriginalOriginalFormat() {
		return GetterUtil.getString(_originalOriginalFormat);
	}

	@JSON
	public double getSamplingRate() {
		return _SamplingRate;
	}

	public void setSamplingRate(double SamplingRate) {
		_SamplingRate = SamplingRate;
	}

	@JSON
	public String getFileTreePath() {
		if (_FileTreePath == null) {
			return StringPool.BLANK;
		}
		else {
			return _FileTreePath;
		}
	}

	public void setFileTreePath(String FileTreePath) {
		_columnBitmask |= FILETREEPATH_COLUMN_BITMASK;

		if (_originalFileTreePath == null) {
			_originalFileTreePath = _FileTreePath;
		}

		_FileTreePath = FileTreePath;
	}

	public String getOriginalFileTreePath() {
		return GetterUtil.getString(_originalFileTreePath);
	}

	@JSON
	public int getLeadCount() {
		return _LeadCount;
	}

	public void setLeadCount(int LeadCount) {
		_LeadCount = LeadCount;
	}

	@JSON
	public int getNumberOfPoints() {
		return _NumberOfPoints;
	}

	public void setNumberOfPoints(int NumberOfPoints) {
		_NumberOfPoints = NumberOfPoints;
	}

	@JSON
	public Date getDateOfUpload() {
		return _DateOfUpload;
	}

	public void setDateOfUpload(Date DateOfUpload) {
		_DateOfUpload = DateOfUpload;
	}

	@JSON
	public int getAge() {
		return _Age;
	}

	public void setAge(int Age) {
		_Age = Age;
	}

	@JSON
	public String getGender() {
		if (_Gender == null) {
			return StringPool.BLANK;
		}
		else {
			return _Gender;
		}
	}

	public void setGender(String Gender) {
		_Gender = Gender;
	}

	@JSON
	public Date getDateOfRecording() {
		return _DateOfRecording;
	}

	public void setDateOfRecording(Date DateOfRecording) {
		_DateOfRecording = DateOfRecording;
	}

	@JSON
	public double getAduGain() {
		return _AduGain;
	}

	public void setAduGain(double AduGain) {
		_AduGain = AduGain;
	}

	@JSON
	public String getFileListID() {
		if (_FileListID == null) {
			return StringPool.BLANK;
		}
		else {
			return _FileListID;
		}
	}

	public void setFileListID(String FileListID) {
		_FileListID = FileListID;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public DocumentRecord toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (DocumentRecord)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		DocumentRecordImpl documentRecordImpl = new DocumentRecordImpl();

		documentRecordImpl.setRecordID(getRecordID());
		documentRecordImpl.setRecordName(getRecordName());
		documentRecordImpl.setUserID(getUserID());
		documentRecordImpl.setSubjectID(getSubjectID());
		documentRecordImpl.setOriginalFormat(getOriginalFormat());
		documentRecordImpl.setSamplingRate(getSamplingRate());
		documentRecordImpl.setFileTreePath(getFileTreePath());
		documentRecordImpl.setLeadCount(getLeadCount());
		documentRecordImpl.setNumberOfPoints(getNumberOfPoints());
		documentRecordImpl.setDateOfUpload(getDateOfUpload());
		documentRecordImpl.setAge(getAge());
		documentRecordImpl.setGender(getGender());
		documentRecordImpl.setDateOfRecording(getDateOfRecording());
		documentRecordImpl.setAduGain(getAduGain());
		documentRecordImpl.setFileListID(getFileListID());

		documentRecordImpl.resetOriginalValues();

		return documentRecordImpl;
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

		DocumentRecord documentRecord = null;

		try {
			documentRecord = (DocumentRecord)obj;
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
	public void resetOriginalValues() {
		DocumentRecordModelImpl documentRecordModelImpl = this;

		documentRecordModelImpl._originalRecordID = documentRecordModelImpl._RecordID;

		documentRecordModelImpl._originalRecordName = documentRecordModelImpl._RecordName;

		documentRecordModelImpl._originalUserID = documentRecordModelImpl._UserID;

		documentRecordModelImpl._originalSubjectID = documentRecordModelImpl._SubjectID;

		documentRecordModelImpl._originalOriginalFormat = documentRecordModelImpl._OriginalFormat;

		documentRecordModelImpl._originalFileTreePath = documentRecordModelImpl._FileTreePath;

		documentRecordModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DocumentRecord> toCacheModel() {
		DocumentRecordCacheModel documentRecordCacheModel = new DocumentRecordCacheModel();

		documentRecordCacheModel.RecordID = getRecordID();

		String RecordID = documentRecordCacheModel.RecordID;

		if ((RecordID != null) && (RecordID.length() == 0)) {
			documentRecordCacheModel.RecordID = null;
		}

		documentRecordCacheModel.RecordName = getRecordName();

		String RecordName = documentRecordCacheModel.RecordName;

		if ((RecordName != null) && (RecordName.length() == 0)) {
			documentRecordCacheModel.RecordName = null;
		}

		documentRecordCacheModel.UserID = getUserID();

		String UserID = documentRecordCacheModel.UserID;

		if ((UserID != null) && (UserID.length() == 0)) {
			documentRecordCacheModel.UserID = null;
		}

		documentRecordCacheModel.SubjectID = getSubjectID();

		String SubjectID = documentRecordCacheModel.SubjectID;

		if ((SubjectID != null) && (SubjectID.length() == 0)) {
			documentRecordCacheModel.SubjectID = null;
		}

		documentRecordCacheModel.OriginalFormat = getOriginalFormat();

		String OriginalFormat = documentRecordCacheModel.OriginalFormat;

		if ((OriginalFormat != null) && (OriginalFormat.length() == 0)) {
			documentRecordCacheModel.OriginalFormat = null;
		}

		documentRecordCacheModel.SamplingRate = getSamplingRate();

		documentRecordCacheModel.FileTreePath = getFileTreePath();

		String FileTreePath = documentRecordCacheModel.FileTreePath;

		if ((FileTreePath != null) && (FileTreePath.length() == 0)) {
			documentRecordCacheModel.FileTreePath = null;
		}

		documentRecordCacheModel.LeadCount = getLeadCount();

		documentRecordCacheModel.NumberOfPoints = getNumberOfPoints();

		Date DateOfUpload = getDateOfUpload();

		if (DateOfUpload != null) {
			documentRecordCacheModel.DateOfUpload = DateOfUpload.getTime();
		}
		else {
			documentRecordCacheModel.DateOfUpload = Long.MIN_VALUE;
		}

		documentRecordCacheModel.Age = getAge();

		documentRecordCacheModel.Gender = getGender();

		String Gender = documentRecordCacheModel.Gender;

		if ((Gender != null) && (Gender.length() == 0)) {
			documentRecordCacheModel.Gender = null;
		}

		Date DateOfRecording = getDateOfRecording();

		if (DateOfRecording != null) {
			documentRecordCacheModel.DateOfRecording = DateOfRecording.getTime();
		}
		else {
			documentRecordCacheModel.DateOfRecording = Long.MIN_VALUE;
		}

		documentRecordCacheModel.AduGain = getAduGain();

		documentRecordCacheModel.FileListID = getFileListID();

		String FileListID = documentRecordCacheModel.FileListID;

		if ((FileListID != null) && (FileListID.length() == 0)) {
			documentRecordCacheModel.FileListID = null;
		}

		return documentRecordCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

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
		sb.append(", FileListID=");
		sb.append(getFileListID());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

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
		sb.append(
			"<column><column-name>FileListID</column-name><column-value><![CDATA[");
		sb.append(getFileListID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DocumentRecord.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			DocumentRecord.class
		};
	private String _RecordID;
	private String _originalRecordID;
	private String _RecordName;
	private String _originalRecordName;
	private String _UserID;
	private String _originalUserID;
	private String _SubjectID;
	private String _originalSubjectID;
	private String _OriginalFormat;
	private String _originalOriginalFormat;
	private double _SamplingRate;
	private String _FileTreePath;
	private String _originalFileTreePath;
	private int _LeadCount;
	private int _NumberOfPoints;
	private Date _DateOfUpload;
	private int _Age;
	private String _Gender;
	private Date _DateOfRecording;
	private double _AduGain;
	private String _FileListID;
	private long _columnBitmask;
	private DocumentRecord _escapedModelProxy;
}