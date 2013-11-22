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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AnnotationInfo}.
 * </p>
 *
 * @author    bbenite1
 * @see       AnnotationInfo
 * @generated
 */
public class AnnotationInfoWrapper implements AnnotationInfo,
	ModelWrapper<AnnotationInfo> {
	public AnnotationInfoWrapper(AnnotationInfo annotationInfo) {
		_annotationInfo = annotationInfo;
	}

	public Class<?> getModelClass() {
		return AnnotationInfo.class;
	}

	public String getModelClassName() {
		return AnnotationInfo.class.getName();
	}

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
		attributes.put("RecordID", getRecordID());
		attributes.put("Timestamp", getTimestamp());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		String AnnotationID = (String)attributes.get("AnnotationID");

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

		String StartingCoordinateID = (String)attributes.get(
				"StartingCoordinateID");

		if (StartingCoordinateID != null) {
			setStartingCoordinateID(StartingCoordinateID);
		}

		String EndingCoordinateID = (String)attributes.get("EndingCoordinateID");

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

		String RecordID = (String)attributes.get("RecordID");

		if (RecordID != null) {
			setRecordID(RecordID);
		}

		Date Timestamp = (Date)attributes.get("Timestamp");

		if (Timestamp != null) {
			setTimestamp(Timestamp);
		}
	}

	/**
	* Returns the primary key of this annotation info.
	*
	* @return the primary key of this annotation info
	*/
	public java.lang.String getPrimaryKey() {
		return _annotationInfo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this annotation info.
	*
	* @param primaryKey the primary key of this annotation info
	*/
	public void setPrimaryKey(java.lang.String primaryKey) {
		_annotationInfo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the annotation i d of this annotation info.
	*
	* @return the annotation i d of this annotation info
	*/
	public java.lang.String getAnnotationID() {
		return _annotationInfo.getAnnotationID();
	}

	/**
	* Sets the annotation i d of this annotation info.
	*
	* @param AnnotationID the annotation i d of this annotation info
	*/
	public void setAnnotationID(java.lang.String AnnotationID) {
		_annotationInfo.setAnnotationID(AnnotationID);
	}

	/**
	* Returns the created by of this annotation info.
	*
	* @return the created by of this annotation info
	*/
	public java.lang.String getCreatedBy() {
		return _annotationInfo.getCreatedBy();
	}

	/**
	* Sets the created by of this annotation info.
	*
	* @param CreatedBy the created by of this annotation info
	*/
	public void setCreatedBy(java.lang.String CreatedBy) {
		_annotationInfo.setCreatedBy(CreatedBy);
	}

	/**
	* Returns the annotation type of this annotation info.
	*
	* @return the annotation type of this annotation info
	*/
	public java.lang.String getAnnotationType() {
		return _annotationInfo.getAnnotationType();
	}

	/**
	* Sets the annotation type of this annotation info.
	*
	* @param AnnotationType the annotation type of this annotation info
	*/
	public void setAnnotationType(java.lang.String AnnotationType) {
		_annotationInfo.setAnnotationType(AnnotationType);
	}

	/**
	* Returns the name of this annotation info.
	*
	* @return the name of this annotation info
	*/
	public java.lang.String getName() {
		return _annotationInfo.getName();
	}

	/**
	* Sets the name of this annotation info.
	*
	* @param Name the name of this annotation info
	*/
	public void setName(java.lang.String Name) {
		_annotationInfo.setName(Name);
	}

	/**
	* Returns the bioportal reference of this annotation info.
	*
	* @return the bioportal reference of this annotation info
	*/
	public java.lang.String getBioportalReference() {
		return _annotationInfo.getBioportalReference();
	}

	/**
	* Sets the bioportal reference of this annotation info.
	*
	* @param BioportalReference the bioportal reference of this annotation info
	*/
	public void setBioportalReference(java.lang.String BioportalReference) {
		_annotationInfo.setBioportalReference(BioportalReference);
	}

	/**
	* Returns the lead of this annotation info.
	*
	* @return the lead of this annotation info
	*/
	public java.lang.String getLead() {
		return _annotationInfo.getLead();
	}

	/**
	* Sets the lead of this annotation info.
	*
	* @param Lead the lead of this annotation info
	*/
	public void setLead(java.lang.String Lead) {
		_annotationInfo.setLead(Lead);
	}

	/**
	* Returns the starting coordinate i d of this annotation info.
	*
	* @return the starting coordinate i d of this annotation info
	*/
	public java.lang.String getStartingCoordinateID() {
		return _annotationInfo.getStartingCoordinateID();
	}

	/**
	* Sets the starting coordinate i d of this annotation info.
	*
	* @param StartingCoordinateID the starting coordinate i d of this annotation info
	*/
	public void setStartingCoordinateID(java.lang.String StartingCoordinateID) {
		_annotationInfo.setStartingCoordinateID(StartingCoordinateID);
	}

	/**
	* Returns the ending coordinate i d of this annotation info.
	*
	* @return the ending coordinate i d of this annotation info
	*/
	public java.lang.String getEndingCoordinateID() {
		return _annotationInfo.getEndingCoordinateID();
	}

	/**
	* Sets the ending coordinate i d of this annotation info.
	*
	* @param EndingCoordinateID the ending coordinate i d of this annotation info
	*/
	public void setEndingCoordinateID(java.lang.String EndingCoordinateID) {
		_annotationInfo.setEndingCoordinateID(EndingCoordinateID);
	}

	/**
	* Returns the unit of measurement of this annotation info.
	*
	* @return the unit of measurement of this annotation info
	*/
	public java.lang.String getUnitOfMeasurement() {
		return _annotationInfo.getUnitOfMeasurement();
	}

	/**
	* Sets the unit of measurement of this annotation info.
	*
	* @param UnitOfMeasurement the unit of measurement of this annotation info
	*/
	public void setUnitOfMeasurement(java.lang.String UnitOfMeasurement) {
		_annotationInfo.setUnitOfMeasurement(UnitOfMeasurement);
	}

	/**
	* Returns the description of this annotation info.
	*
	* @return the description of this annotation info
	*/
	public java.lang.String getDescription() {
		return _annotationInfo.getDescription();
	}

	/**
	* Sets the description of this annotation info.
	*
	* @param Description the description of this annotation info
	*/
	public void setDescription(java.lang.String Description) {
		_annotationInfo.setDescription(Description);
	}

	/**
	* Returns the value of this annotation info.
	*
	* @return the value of this annotation info
	*/
	public java.lang.String getValue() {
		return _annotationInfo.getValue();
	}

	/**
	* Sets the value of this annotation info.
	*
	* @param Value the value of this annotation info
	*/
	public void setValue(java.lang.String Value) {
		_annotationInfo.setValue(Value);
	}

	/**
	* Returns the record i d of this annotation info.
	*
	* @return the record i d of this annotation info
	*/
	public java.lang.String getRecordID() {
		return _annotationInfo.getRecordID();
	}

	/**
	* Sets the record i d of this annotation info.
	*
	* @param RecordID the record i d of this annotation info
	*/
	public void setRecordID(java.lang.String RecordID) {
		_annotationInfo.setRecordID(RecordID);
	}

	/**
	* Returns the timestamp of this annotation info.
	*
	* @return the timestamp of this annotation info
	*/
	public java.util.Date getTimestamp() {
		return _annotationInfo.getTimestamp();
	}

	/**
	* Sets the timestamp of this annotation info.
	*
	* @param Timestamp the timestamp of this annotation info
	*/
	public void setTimestamp(java.util.Date Timestamp) {
		_annotationInfo.setTimestamp(Timestamp);
	}

	public boolean isNew() {
		return _annotationInfo.isNew();
	}

	public void setNew(boolean n) {
		_annotationInfo.setNew(n);
	}

	public boolean isCachedModel() {
		return _annotationInfo.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_annotationInfo.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _annotationInfo.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _annotationInfo.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_annotationInfo.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _annotationInfo.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_annotationInfo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AnnotationInfoWrapper((AnnotationInfo)_annotationInfo.clone());
	}

	public int compareTo(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo annotationInfo) {
		return _annotationInfo.compareTo(annotationInfo);
	}

	@Override
	public int hashCode() {
		return _annotationInfo.hashCode();
	}

	public com.liferay.portal.model.CacheModel<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> toCacheModel() {
		return _annotationInfo.toCacheModel();
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo toEscapedModel() {
		return new AnnotationInfoWrapper(_annotationInfo.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _annotationInfo.toString();
	}

	public java.lang.String toXmlString() {
		return _annotationInfo.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_annotationInfo.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public AnnotationInfo getWrappedAnnotationInfo() {
		return _annotationInfo;
	}

	public AnnotationInfo getWrappedModel() {
		return _annotationInfo;
	}

	public void resetOriginalValues() {
		_annotationInfo.resetOriginalValues();
	}

	private AnnotationInfo _annotationInfo;
}