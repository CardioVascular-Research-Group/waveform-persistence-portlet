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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.AnnotationInfoLocalServiceUtil;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.base.AnnotationInfoServiceBaseImpl;

/**
 * The implementation of the annotation info remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.AnnotationInfoService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author bbenite1
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.AnnotationInfoServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.AnnotationInfoServiceUtil
 */
public class AnnotationInfoServiceImpl extends AnnotationInfoServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.AnnotationInfoServiceUtil} to access the annotation info remote service.
	 */
	public AnnotationInfo addAnnotationInfo(long liferayUserId, long liferayGroupId, long liferayCompanyId, String recordID, String createdBy, String annotationType, String name, String bioportalRef, String lead, String startCoord, String endCoord, String unitMeasurement, String description, String value, Date timestamp) throws SystemException, PortalException {

		return AnnotationInfoLocalServiceUtil.addAnnotationInfo(liferayUserId, liferayGroupId, liferayCompanyId, recordID, createdBy, annotationType, name, bioportalRef, lead, startCoord, endCoord, unitMeasurement, description, value, timestamp);
	}
	
	public AnnotationInfo deleteAnnotationInfo(String annotationID) throws SystemException, PortalException {

		return AnnotationInfoLocalServiceUtil.deleteAnnotationInfo(annotationID);
	}
	
	public List<AnnotationInfo> getAnnotationsByRecord(String recordID) throws SystemException {
		return AnnotationInfoLocalServiceUtil.getAnnotationsByRecord(recordID);
	}
	
	public List<AnnotationInfo> getAnnotationsByRecord(String recordID, int start, int end) throws SystemException {
		return AnnotationInfoLocalServiceUtil.getAnnotationsByRecord(recordID);
	}
	
	public AnnotationInfo getAnnotation(String recordID, String name, String annotationType, String lead) throws SystemException, NoSuchAnnotationInfoException {
		return AnnotationInfoLocalServiceUtil.getAnnotation(recordID, name, annotationType, lead);
	}
	
	public List<AnnotationInfo> getAnnotationsByType(String recordID, String annotationType) throws SystemException {
		return AnnotationInfoLocalServiceUtil.getAnnotationsByType(recordID, annotationType);
	}
	
	public List<AnnotationInfo> getAnnotationsByType(String recordID, String annotationType, int start, int end) throws SystemException {
		return AnnotationInfoLocalServiceUtil.getAnnotationsByType(recordID, annotationType);
	}
}