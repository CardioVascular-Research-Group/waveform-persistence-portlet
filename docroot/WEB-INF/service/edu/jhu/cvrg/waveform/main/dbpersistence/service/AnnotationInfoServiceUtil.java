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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * The utility for the annotation info remote service. This utility wraps {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.AnnotationInfoServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author bbenite1
 * @see AnnotationInfoService
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.AnnotationInfoServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.AnnotationInfoServiceImpl
 * @generated
 */
public class AnnotationInfoServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.AnnotationInfoServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo addAnnotationInfo(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		java.lang.String recordID, java.lang.String createdBy,
		java.lang.String annotationType, java.lang.String name,
		java.lang.String bioportalRef, java.lang.String lead,
		java.lang.String startCoord, java.lang.String endCoord,
		java.lang.String unitMeasurement, java.lang.String description,
		java.lang.String value, java.util.Date timestamp)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAnnotationInfo(liferayUserId, liferayGroupId,
			liferayCompanyId, recordID, createdBy, annotationType, name,
			bioportalRef, lead, startCoord, endCoord, unitMeasurement,
			description, value, timestamp);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo deleteAnnotationInfo(
		java.lang.String annotationID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAnnotationInfo(annotationID);
	}

	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> getAnnotationsByRecord(
		java.lang.String recordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAnnotationsByRecord(recordID);
	}

	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> getAnnotationsByRecord(
		java.lang.String recordID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAnnotationsByRecord(recordID, start, end);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo getAnnotation(
		java.lang.String recordID, java.lang.String name,
		java.lang.String annotationType, java.lang.String lead)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException {
		return getService().getAnnotation(recordID, name, annotationType, lead);
	}

	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> getAnnotationsByType(
		java.lang.String recordID, java.lang.String annotationType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAnnotationsByType(recordID, annotationType);
	}

	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> getAnnotationsByType(
		java.lang.String recordID, java.lang.String annotationType, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getAnnotationsByType(recordID, annotationType, start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static AnnotationInfoService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AnnotationInfoService.class.getName());

			if (invokableService instanceof AnnotationInfoService) {
				_service = (AnnotationInfoService)invokableService;
			}
			else {
				_service = new AnnotationInfoServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(AnnotationInfoServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(AnnotationInfoService service) {
	}

	private static AnnotationInfoService _service;
}