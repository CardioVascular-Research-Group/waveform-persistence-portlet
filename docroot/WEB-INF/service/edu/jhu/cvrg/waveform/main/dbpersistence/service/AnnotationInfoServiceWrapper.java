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

package edu.jhu.cvrg.waveform.main.dbpersistence.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link AnnotationInfoService}.
 * </p>
 *
 * @author    bbenite1
 * @see       AnnotationInfoService
 * @generated
 */
public class AnnotationInfoServiceWrapper implements AnnotationInfoService,
	ServiceWrapper<AnnotationInfoService> {
	public AnnotationInfoServiceWrapper(
		AnnotationInfoService annotationInfoService) {
		_annotationInfoService = annotationInfoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _annotationInfoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_annotationInfoService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _annotationInfoService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo addAnnotationInfo(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		long recordID, java.lang.String createdBy,
		java.lang.String annotationType, java.lang.String name,
		java.lang.String bioportalRef, java.lang.String lead, long startCoord,
		long endCoord, java.lang.String unitMeasurement,
		java.lang.String description, java.lang.String value,
		java.util.Date timestamp)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _annotationInfoService.addAnnotationInfo(liferayUserId,
			liferayGroupId, liferayCompanyId, recordID, createdBy,
			annotationType, name, bioportalRef, lead, startCoord, endCoord,
			unitMeasurement, description, value, timestamp);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo deleteAnnotationInfo(
		java.lang.String annotationID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _annotationInfoService.deleteAnnotationInfo(annotationID);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> getAnnotationsByRecord(
		long recordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _annotationInfoService.getAnnotationsByRecord(recordID);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> getAnnotationsByRecord(
		long recordID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _annotationInfoService.getAnnotationsByRecord(recordID, start,
			end);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo getAnnotation(
		long recordID, java.lang.String name, java.lang.String annotationType,
		java.lang.String lead)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException {
		return _annotationInfoService.getAnnotation(recordID, name,
			annotationType, lead);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> getAnnotationsByType(
		long recordID, java.lang.String annotationType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _annotationInfoService.getAnnotationsByType(recordID,
			annotationType);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> getAnnotationsByType(
		long recordID, java.lang.String annotationType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _annotationInfoService.getAnnotationsByType(recordID,
			annotationType, start, end);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public AnnotationInfoService getWrappedAnnotationInfoService() {
		return _annotationInfoService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedAnnotationInfoService(
		AnnotationInfoService annotationInfoService) {
		_annotationInfoService = annotationInfoService;
	}

	public AnnotationInfoService getWrappedService() {
		return _annotationInfoService;
	}

	public void setWrappedService(AnnotationInfoService annotationInfoService) {
		_annotationInfoService = annotationInfoService;
	}

	private AnnotationInfoService _annotationInfoService;
}