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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing AnnotationInfo in entity cache.
 *
 * @author bbenite1
 * @see AnnotationInfo
 * @generated
 */
public class AnnotationInfoCacheModel implements CacheModel<AnnotationInfo>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{AnnotationID=");
		sb.append(AnnotationID);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", AnnotationType=");
		sb.append(AnnotationType);
		sb.append(", Name=");
		sb.append(Name);
		sb.append(", BioportalReference=");
		sb.append(BioportalReference);
		sb.append(", Lead=");
		sb.append(Lead);
		sb.append(", StartingCoordinateID=");
		sb.append(StartingCoordinateID);
		sb.append(", EndingCoordinateID=");
		sb.append(EndingCoordinateID);
		sb.append(", UnitOfMeasurement=");
		sb.append(UnitOfMeasurement);
		sb.append(", Description=");
		sb.append(Description);
		sb.append(", Value=");
		sb.append(Value);
		sb.append(", DocumentRecordID=");
		sb.append(DocumentRecordID);
		sb.append(", Timestamp=");
		sb.append(Timestamp);
		sb.append("}");

		return sb.toString();
	}

	public AnnotationInfo toEntityModel() {
		AnnotationInfoImpl annotationInfoImpl = new AnnotationInfoImpl();

		annotationInfoImpl.setAnnotationID(AnnotationID);

		if (CreatedBy == null) {
			annotationInfoImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			annotationInfoImpl.setCreatedBy(CreatedBy);
		}

		if (AnnotationType == null) {
			annotationInfoImpl.setAnnotationType(StringPool.BLANK);
		}
		else {
			annotationInfoImpl.setAnnotationType(AnnotationType);
		}

		if (Name == null) {
			annotationInfoImpl.setName(StringPool.BLANK);
		}
		else {
			annotationInfoImpl.setName(Name);
		}

		if (BioportalReference == null) {
			annotationInfoImpl.setBioportalReference(StringPool.BLANK);
		}
		else {
			annotationInfoImpl.setBioportalReference(BioportalReference);
		}

		if (Lead == null) {
			annotationInfoImpl.setLead(StringPool.BLANK);
		}
		else {
			annotationInfoImpl.setLead(Lead);
		}

		annotationInfoImpl.setStartingCoordinateID(StartingCoordinateID);
		annotationInfoImpl.setEndingCoordinateID(EndingCoordinateID);

		if (UnitOfMeasurement == null) {
			annotationInfoImpl.setUnitOfMeasurement(StringPool.BLANK);
		}
		else {
			annotationInfoImpl.setUnitOfMeasurement(UnitOfMeasurement);
		}

		if (Description == null) {
			annotationInfoImpl.setDescription(StringPool.BLANK);
		}
		else {
			annotationInfoImpl.setDescription(Description);
		}

		if (Value == null) {
			annotationInfoImpl.setValue(StringPool.BLANK);
		}
		else {
			annotationInfoImpl.setValue(Value);
		}

		annotationInfoImpl.setDocumentRecordID(DocumentRecordID);

		if (Timestamp == Long.MIN_VALUE) {
			annotationInfoImpl.setTimestamp(null);
		}
		else {
			annotationInfoImpl.setTimestamp(new Date(Timestamp));
		}

		annotationInfoImpl.resetOriginalValues();

		return annotationInfoImpl;
	}

	public long AnnotationID;
	public String CreatedBy;
	public String AnnotationType;
	public String Name;
	public String BioportalReference;
	public String Lead;
	public long StartingCoordinateID;
	public long EndingCoordinateID;
	public String UnitOfMeasurement;
	public String Description;
	public String Value;
	public long DocumentRecordID;
	public long Timestamp;
}