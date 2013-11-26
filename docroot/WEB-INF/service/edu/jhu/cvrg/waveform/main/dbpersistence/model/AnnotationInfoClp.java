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

import edu.jhu.cvrg.waveform.main.dbpersistence.service.AnnotationInfoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bbenite1
 */
public class AnnotationInfoClp extends BaseModelImpl<AnnotationInfo>
	implements AnnotationInfo {
	public AnnotationInfoClp() {
	}

	public Class<?> getModelClass() {
		return AnnotationInfo.class;
	}

	public String getModelClassName() {
		return AnnotationInfo.class.getName();
	}

	public long getPrimaryKey() {
		return _AnnotationID;
	}

	public void setPrimaryKey(long primaryKey) {
		setAnnotationID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_AnnotationID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("AnnotationID", getAnnotationID());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("AnnotationType", getAnnotationType());
		attributes.put("Name", getName());
		attributes.put("BioportalReference", getBioportalReference());
		attributes.put("Lead", getLead());
		attributes.put("StartingCoordinateID", getStartingCoordinateID());
		attributes.put("EndingCoordinateID", getEndingCoordinateID());
		attributes.put("UnitOfMeasurement", getUnitOfMeasurement());
		attributes.put("Description", getDescription());
		attributes.put("Value", getValue());
		attributes.put("DocumentRecordID", getDocumentRecordID());
		attributes.put("Timestamp", getTimestamp());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long AnnotationID = (Long)attributes.get("AnnotationID");

		if (AnnotationID != null) {
			setAnnotationID(AnnotationID);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		String AnnotationType = (String)attributes.get("AnnotationType");

		if (AnnotationType != null) {
			setAnnotationType(AnnotationType);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		String BioportalReference = (String)attributes.get("BioportalReference");

		if (BioportalReference != null) {
			setBioportalReference(BioportalReference);
		}

		String Lead = (String)attributes.get("Lead");

		if (Lead != null) {
			setLead(Lead);
		}

		Long StartingCoordinateID = (Long)attributes.get("StartingCoordinateID");

		if (StartingCoordinateID != null) {
			setStartingCoordinateID(StartingCoordinateID);
		}

		Long EndingCoordinateID = (Long)attributes.get("EndingCoordinateID");

		if (EndingCoordinateID != null) {
			setEndingCoordinateID(EndingCoordinateID);
		}

		String UnitOfMeasurement = (String)attributes.get("UnitOfMeasurement");

		if (UnitOfMeasurement != null) {
			setUnitOfMeasurement(UnitOfMeasurement);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		String Value = (String)attributes.get("Value");

		if (Value != null) {
			setValue(Value);
		}

		Long DocumentRecordID = (Long)attributes.get("DocumentRecordID");

		if (DocumentRecordID != null) {
			setDocumentRecordID(DocumentRecordID);
		}

		Date Timestamp = (Date)attributes.get("Timestamp");

		if (Timestamp != null) {
			setTimestamp(Timestamp);
		}
	}

	public long getAnnotationID() {
		return _AnnotationID;
	}

	public void setAnnotationID(long AnnotationID) {
		_AnnotationID = AnnotationID;
	}

	public String getCreatedBy() {
		return _CreatedBy;
	}

	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;
	}

	public String getAnnotationType() {
		return _AnnotationType;
	}

	public void setAnnotationType(String AnnotationType) {
		_AnnotationType = AnnotationType;
	}

	public String getName() {
		return _Name;
	}

	public void setName(String Name) {
		_Name = Name;
	}

	public String getBioportalReference() {
		return _BioportalReference;
	}

	public void setBioportalReference(String BioportalReference) {
		_BioportalReference = BioportalReference;
	}

	public String getLead() {
		return _Lead;
	}

	public void setLead(String Lead) {
		_Lead = Lead;
	}

	public long getStartingCoordinateID() {
		return _StartingCoordinateID;
	}

	public void setStartingCoordinateID(long StartingCoordinateID) {
		_StartingCoordinateID = StartingCoordinateID;
	}

	public long getEndingCoordinateID() {
		return _EndingCoordinateID;
	}

	public void setEndingCoordinateID(long EndingCoordinateID) {
		_EndingCoordinateID = EndingCoordinateID;
	}

	public String getUnitOfMeasurement() {
		return _UnitOfMeasurement;
	}

	public void setUnitOfMeasurement(String UnitOfMeasurement) {
		_UnitOfMeasurement = UnitOfMeasurement;
	}

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
	}

	public String getValue() {
		return _Value;
	}

	public void setValue(String Value) {
		_Value = Value;
	}

	public long getDocumentRecordID() {
		return _DocumentRecordID;
	}

	public void setDocumentRecordID(long DocumentRecordID) {
		_DocumentRecordID = DocumentRecordID;
	}

	public Date getTimestamp() {
		return _Timestamp;
	}

	public void setTimestamp(Date Timestamp) {
		_Timestamp = Timestamp;
	}

	public BaseModel<?> getAnnotationInfoRemoteModel() {
		return _annotationInfoRemoteModel;
	}

	public void setAnnotationInfoRemoteModel(
		BaseModel<?> annotationInfoRemoteModel) {
		_annotationInfoRemoteModel = annotationInfoRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			AnnotationInfoLocalServiceUtil.addAnnotationInfo(this);
		}
		else {
			AnnotationInfoLocalServiceUtil.updateAnnotationInfo(this);
		}
	}

	@Override
	public AnnotationInfo toEscapedModel() {
		return (AnnotationInfo)Proxy.newProxyInstance(AnnotationInfo.class.getClassLoader(),
			new Class[] { AnnotationInfo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AnnotationInfoClp clone = new AnnotationInfoClp();

		clone.setAnnotationID(getAnnotationID());
		clone.setCreatedBy(getCreatedBy());
		clone.setAnnotationType(getAnnotationType());
		clone.setName(getName());
		clone.setBioportalReference(getBioportalReference());
		clone.setLead(getLead());
		clone.setStartingCoordinateID(getStartingCoordinateID());
		clone.setEndingCoordinateID(getEndingCoordinateID());
		clone.setUnitOfMeasurement(getUnitOfMeasurement());
		clone.setDescription(getDescription());
		clone.setValue(getValue());
		clone.setDocumentRecordID(getDocumentRecordID());
		clone.setTimestamp(getTimestamp());

		return clone;
	}

	public int compareTo(AnnotationInfo annotationInfo) {
		long primaryKey = annotationInfo.getPrimaryKey();

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

		AnnotationInfoClp annotationInfo = null;

		try {
			annotationInfo = (AnnotationInfoClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = annotationInfo.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{AnnotationID=");
		sb.append(getAnnotationID());
		sb.append(", CreatedBy=");
		sb.append(getCreatedBy());
		sb.append(", AnnotationType=");
		sb.append(getAnnotationType());
		sb.append(", Name=");
		sb.append(getName());
		sb.append(", BioportalReference=");
		sb.append(getBioportalReference());
		sb.append(", Lead=");
		sb.append(getLead());
		sb.append(", StartingCoordinateID=");
		sb.append(getStartingCoordinateID());
		sb.append(", EndingCoordinateID=");
		sb.append(getEndingCoordinateID());
		sb.append(", UnitOfMeasurement=");
		sb.append(getUnitOfMeasurement());
		sb.append(", Description=");
		sb.append(getDescription());
		sb.append(", Value=");
		sb.append(getValue());
		sb.append(", DocumentRecordID=");
		sb.append(getDocumentRecordID());
		sb.append(", Timestamp=");
		sb.append(getTimestamp());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append(
			"edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>AnnotationID</column-name><column-value><![CDATA[");
		sb.append(getAnnotationID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AnnotationType</column-name><column-value><![CDATA[");
		sb.append(getAnnotationType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BioportalReference</column-name><column-value><![CDATA[");
		sb.append(getBioportalReference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Lead</column-name><column-value><![CDATA[");
		sb.append(getLead());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>StartingCoordinateID</column-name><column-value><![CDATA[");
		sb.append(getStartingCoordinateID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>EndingCoordinateID</column-name><column-value><![CDATA[");
		sb.append(getEndingCoordinateID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UnitOfMeasurement</column-name><column-value><![CDATA[");
		sb.append(getUnitOfMeasurement());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DocumentRecordID</column-name><column-value><![CDATA[");
		sb.append(getDocumentRecordID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Timestamp</column-name><column-value><![CDATA[");
		sb.append(getTimestamp());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _AnnotationID;
	private String _CreatedBy;
	private String _AnnotationType;
	private String _Name;
	private String _BioportalReference;
	private String _Lead;
	private long _StartingCoordinateID;
	private long _EndingCoordinateID;
	private String _UnitOfMeasurement;
	private String _Description;
	private String _Value;
	private long _DocumentRecordID;
	private Date _Timestamp;
	private BaseModel<?> _annotationInfoRemoteModel;
}