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

import edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatusModel;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatusSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the UploadStatus service. Represents a row in the &quot;Database_UploadStatus&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatusModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UploadStatusImpl}.
 * </p>
 *
 * @author bbenite1
 * @see UploadStatusImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatusModel
 * @generated
 */
@JSON(strict = true)
public class UploadStatusModelImpl extends BaseModelImpl<UploadStatus>
	implements UploadStatusModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a upload status model instance should use the {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus} interface instead.
	 */
	public static final String TABLE_NAME = "Database_UploadStatus";
	public static final Object[][] TABLE_COLUMNS = {
			{ "StatusLogNumber", Types.VARCHAR },
			{ "FileTransfer", Types.VARCHAR },
			{ "FileConversion", Types.VARCHAR },
			{ "RecordCreation", Types.VARCHAR },
			{ "AnnotationCreation", Types.VARCHAR },
			{ "RecordID", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Database_UploadStatus (StatusLogNumber VARCHAR(75) not null primary key,FileTransfer VARCHAR(75) null,FileConversion VARCHAR(75) null,RecordCreation VARCHAR(75) null,AnnotationCreation VARCHAR(75) null,RecordID VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Database_UploadStatus";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static UploadStatus toModel(UploadStatusSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		UploadStatus model = new UploadStatusImpl();

		model.setStatusLogNumber(soapModel.getStatusLogNumber());
		model.setFileTransfer(soapModel.getFileTransfer());
		model.setFileConversion(soapModel.getFileConversion());
		model.setRecordCreation(soapModel.getRecordCreation());
		model.setAnnotationCreation(soapModel.getAnnotationCreation());
		model.setRecordID(soapModel.getRecordID());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<UploadStatus> toModels(UploadStatusSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<UploadStatus> models = new ArrayList<UploadStatus>(soapModels.length);

		for (UploadStatusSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus"));

	public UploadStatusModelImpl() {
	}

	public String getPrimaryKey() {
		return _StatusLogNumber;
	}

	public void setPrimaryKey(String primaryKey) {
		setStatusLogNumber(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return _StatusLogNumber;
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	public Class<?> getModelClass() {
		return UploadStatus.class;
	}

	public String getModelClassName() {
		return UploadStatus.class.getName();
	}

	@Override
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

	@Override
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

	@JSON
	public String getStatusLogNumber() {
		if (_StatusLogNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _StatusLogNumber;
		}
	}

	public void setStatusLogNumber(String StatusLogNumber) {
		_StatusLogNumber = StatusLogNumber;
	}

	@JSON
	public String getFileTransfer() {
		if (_FileTransfer == null) {
			return StringPool.BLANK;
		}
		else {
			return _FileTransfer;
		}
	}

	public void setFileTransfer(String FileTransfer) {
		_FileTransfer = FileTransfer;
	}

	@JSON
	public String getFileConversion() {
		if (_FileConversion == null) {
			return StringPool.BLANK;
		}
		else {
			return _FileConversion;
		}
	}

	public void setFileConversion(String FileConversion) {
		_FileConversion = FileConversion;
	}

	@JSON
	public String getRecordCreation() {
		if (_RecordCreation == null) {
			return StringPool.BLANK;
		}
		else {
			return _RecordCreation;
		}
	}

	public void setRecordCreation(String RecordCreation) {
		_RecordCreation = RecordCreation;
	}

	@JSON
	public String getAnnotationCreation() {
		if (_AnnotationCreation == null) {
			return StringPool.BLANK;
		}
		else {
			return _AnnotationCreation;
		}
	}

	public void setAnnotationCreation(String AnnotationCreation) {
		_AnnotationCreation = AnnotationCreation;
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
		_RecordID = RecordID;
	}

	@Override
	public UploadStatus toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (UploadStatus)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		UploadStatusImpl uploadStatusImpl = new UploadStatusImpl();

		uploadStatusImpl.setStatusLogNumber(getStatusLogNumber());
		uploadStatusImpl.setFileTransfer(getFileTransfer());
		uploadStatusImpl.setFileConversion(getFileConversion());
		uploadStatusImpl.setRecordCreation(getRecordCreation());
		uploadStatusImpl.setAnnotationCreation(getAnnotationCreation());
		uploadStatusImpl.setRecordID(getRecordID());

		uploadStatusImpl.resetOriginalValues();

		return uploadStatusImpl;
	}

	public int compareTo(UploadStatus uploadStatus) {
		String primaryKey = uploadStatus.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		UploadStatus uploadStatus = null;

		try {
			uploadStatus = (UploadStatus)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String primaryKey = uploadStatus.getPrimaryKey();

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
	}

	@Override
	public CacheModel<UploadStatus> toCacheModel() {
		UploadStatusCacheModel uploadStatusCacheModel = new UploadStatusCacheModel();

		uploadStatusCacheModel.StatusLogNumber = getStatusLogNumber();

		String StatusLogNumber = uploadStatusCacheModel.StatusLogNumber;

		if ((StatusLogNumber != null) && (StatusLogNumber.length() == 0)) {
			uploadStatusCacheModel.StatusLogNumber = null;
		}

		uploadStatusCacheModel.FileTransfer = getFileTransfer();

		String FileTransfer = uploadStatusCacheModel.FileTransfer;

		if ((FileTransfer != null) && (FileTransfer.length() == 0)) {
			uploadStatusCacheModel.FileTransfer = null;
		}

		uploadStatusCacheModel.FileConversion = getFileConversion();

		String FileConversion = uploadStatusCacheModel.FileConversion;

		if ((FileConversion != null) && (FileConversion.length() == 0)) {
			uploadStatusCacheModel.FileConversion = null;
		}

		uploadStatusCacheModel.RecordCreation = getRecordCreation();

		String RecordCreation = uploadStatusCacheModel.RecordCreation;

		if ((RecordCreation != null) && (RecordCreation.length() == 0)) {
			uploadStatusCacheModel.RecordCreation = null;
		}

		uploadStatusCacheModel.AnnotationCreation = getAnnotationCreation();

		String AnnotationCreation = uploadStatusCacheModel.AnnotationCreation;

		if ((AnnotationCreation != null) && (AnnotationCreation.length() == 0)) {
			uploadStatusCacheModel.AnnotationCreation = null;
		}

		uploadStatusCacheModel.RecordID = getRecordID();

		String RecordID = uploadStatusCacheModel.RecordID;

		if ((RecordID != null) && (RecordID.length() == 0)) {
			uploadStatusCacheModel.RecordID = null;
		}

		return uploadStatusCacheModel;
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
		sb.append(", RecordID=");
		sb.append(getRecordID());
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
			"<column><column-name>RecordID</column-name><column-value><![CDATA[");
		sb.append(getRecordID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = UploadStatus.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			UploadStatus.class
		};
	private String _StatusLogNumber;
	private String _FileTransfer;
	private String _FileConversion;
	private String _RecordCreation;
	private String _AnnotationCreation;
	private String _RecordID;
	private UploadStatus _escapedModelProxy;
}