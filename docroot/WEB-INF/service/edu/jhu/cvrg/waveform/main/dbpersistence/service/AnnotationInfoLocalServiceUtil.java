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
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the annotation info local service. This utility wraps {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.AnnotationInfoLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author bbenite1
 * @see AnnotationInfoLocalService
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.AnnotationInfoLocalServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.AnnotationInfoLocalServiceImpl
 * @generated
 */
public class AnnotationInfoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.AnnotationInfoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the annotation info to the database. Also notifies the appropriate model listeners.
	*
	* @param annotationInfo the annotation info
	* @return the annotation info that was added
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo addAnnotationInfo(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo annotationInfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAnnotationInfo(annotationInfo);
	}

	/**
	* Creates a new annotation info with the primary key. Does not add the annotation info to the database.
	*
	* @param AnnotationID the primary key for the new annotation info
	* @return the new annotation info
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo createAnnotationInfo(
		java.lang.String AnnotationID) {
		return getService().createAnnotationInfo(AnnotationID);
	}

	/**
	* Deletes the annotation info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param AnnotationID the primary key of the annotation info
	* @return the annotation info that was removed
	* @throws PortalException if a annotation info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo deleteAnnotationInfo(
		java.lang.String AnnotationID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAnnotationInfo(AnnotationID);
	}

	/**
	* Deletes the annotation info from the database. Also notifies the appropriate model listeners.
	*
	* @param annotationInfo the annotation info
	* @return the annotation info that was removed
	* @throws PortalException
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo deleteAnnotationInfo(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo annotationInfo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAnnotationInfo(annotationInfo);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo fetchAnnotationInfo(
		java.lang.String AnnotationID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAnnotationInfo(AnnotationID);
	}

	/**
	* Returns the annotation info with the primary key.
	*
	* @param AnnotationID the primary key of the annotation info
	* @return the annotation info
	* @throws PortalException if a annotation info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo getAnnotationInfo(
		java.lang.String AnnotationID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAnnotationInfo(AnnotationID);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the annotation infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of annotation infos
	* @param end the upper bound of the range of annotation infos (not inclusive)
	* @return the range of annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> getAnnotationInfos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAnnotationInfos(start, end);
	}

	/**
	* Returns the number of annotation infos.
	*
	* @return the number of annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static int getAnnotationInfosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAnnotationInfosCount();
	}

	/**
	* Updates the annotation info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param annotationInfo the annotation info
	* @return the annotation info that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo updateAnnotationInfo(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo annotationInfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAnnotationInfo(annotationInfo);
	}

	/**
	* Updates the annotation info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param annotationInfo the annotation info
	* @param merge whether to merge the annotation info with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the annotation info that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo updateAnnotationInfo(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo annotationInfo,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAnnotationInfo(annotationInfo, merge);
	}

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

	public static AnnotationInfoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AnnotationInfoLocalService.class.getName());

			if (invokableLocalService instanceof AnnotationInfoLocalService) {
				_service = (AnnotationInfoLocalService)invokableLocalService;
			}
			else {
				_service = new AnnotationInfoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AnnotationInfoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(AnnotationInfoLocalService service) {
	}

	private static AnnotationInfoLocalService _service;
}