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

package edu.jhu.cvrg.waveform.main.dbpersistence.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.base.AnnotationInfoLocalServiceBaseImpl;

/**
 * The implementation of the annotation info local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.AnnotationInfoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author bbenite1
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.AnnotationInfoLocalServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.AnnotationInfoLocalServiceUtil
 */
public class AnnotationInfoLocalServiceImpl
	extends AnnotationInfoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.AnnotationInfoLocalServiceUtil} to access the annotation info local service.
	 */
	public AnnotationInfo addAnnotationInfo(long liferayUserId, long liferayGroupId, long liferayCompanyId, String recordID, String createdBy, String annotationType, String name, String bioportalRef, String lead, String startCoord, String endCoord, String unitMeasurement, String description, String value, Date timestamp) throws SystemException, PortalException {
		UUID annotationID = UUID.randomUUID();
		
		AnnotationInfo annotation = annotationInfoPersistence.create(annotationID.toString());
		
		annotation.setRecordID(recordID);
		annotation.setCreatedBy(createdBy);
		annotation.setAnnotationType(annotationType);
		annotation.setName(name);
		annotation.setBioportalReference(bioportalRef);
		annotation.setLead(lead);
		annotation.setStartingCoordinateID(startCoord);
		annotation.setEndingCoordinateID(endCoord);
		annotation.setUnitOfMeasurement(unitMeasurement);
		annotation.setDescription(description);
		annotation.setValue(value);
		annotation.setTimestamp(timestamp);
		
		super.addAnnotationInfo(annotation);
		
		resourceLocalService.addResources(liferayCompanyId, liferayGroupId, liferayUserId, AnnotationInfo.class.getName(), annotation.getRecordID(), false, true, true);
		
		return annotation;
	}
	
	public AnnotationInfo deleteAnnotationInfo(AnnotationInfo annInfo) throws SystemException, PortalException {
		String startCoord = annInfo.getStartingCoordinateID();
		String endCoord = annInfo.getEndingCoordinateID();
		
		if(startCoord != null && !(startCoord.equals(""))) {
			coordinateLocalService.deleteCoordinate(startCoord);
		}
		
		if(endCoord != null && !(endCoord.equals(""))) {
			coordinateLocalService.deleteCoordinate(endCoord);
		}
		
		return annotationInfoPersistence.remove(annInfo);
	}
	
	public AnnotationInfo deleteAnnotationInfo(String annotationID) throws SystemException, PortalException {
		AnnotationInfo annInfo = annotationInfoPersistence.fetchByPrimaryKey(annotationID);
		
		return deleteAnnotationInfo(annInfo);
	}
	
	public List<AnnotationInfo> getAnnotationsByRecord(String recordID) throws SystemException {
		return annotationInfoPersistence.findByRecordID(recordID);
	}
	
	public List<AnnotationInfo> getAnnotationsByRecord(String recordID, int start, int end) throws SystemException {
		return annotationInfoPersistence.findByRecordID(recordID, start, end);
	}
	
	public AnnotationInfo getAnnotation(String recordID, String name, String annotationType, String lead) throws SystemException, NoSuchAnnotationInfoException {
		return annotationInfoPersistence.findByAnnotationProperties(recordID, name, annotationType, lead);
	}
	
	public List<AnnotationInfo> getAnnotationsByType(String recordID, String annotationType) throws SystemException {
		return annotationInfoPersistence.findByAnnotationType(annotationType, recordID);
	}
	
	public List<AnnotationInfo> getAnnotationsByType(String recordID, String annotationType, int start, int end) throws SystemException {
		return annotationInfoPersistence.findByAnnotationType(annotationType, recordID, start, end);
	}
}