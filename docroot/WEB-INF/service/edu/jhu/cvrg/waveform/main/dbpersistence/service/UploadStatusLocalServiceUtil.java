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
 * The utility for the upload status local service. This utility wraps {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.UploadStatusLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author bbenite1
 * @see UploadStatusLocalService
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.UploadStatusLocalServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.UploadStatusLocalServiceImpl
 * @generated
 */
public class UploadStatusLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.UploadStatusLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the upload status to the database. Also notifies the appropriate model listeners.
	*
	* @param uploadStatus the upload status
	* @return the upload status that was added
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus addUploadStatus(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addUploadStatus(uploadStatus);
	}

	/**
	* Creates a new upload status with the primary key. Does not add the upload status to the database.
	*
	* @param StatusLogNumber the primary key for the new upload status
	* @return the new upload status
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus createUploadStatus(
		long StatusLogNumber) {
		return getService().createUploadStatus(StatusLogNumber);
	}

	/**
	* Deletes the upload status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param StatusLogNumber the primary key of the upload status
	* @return the upload status that was removed
	* @throws PortalException if a upload status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus deleteUploadStatus(
		long StatusLogNumber)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUploadStatus(StatusLogNumber);
	}

	/**
	* Deletes the upload status from the database. Also notifies the appropriate model listeners.
	*
	* @param uploadStatus the upload status
	* @return the upload status that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus deleteUploadStatus(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUploadStatus(uploadStatus);
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

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus fetchUploadStatus(
		long StatusLogNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchUploadStatus(StatusLogNumber);
	}

	/**
	* Returns the upload status with the primary key.
	*
	* @param StatusLogNumber the primary key of the upload status
	* @return the upload status
	* @throws PortalException if a upload status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus getUploadStatus(
		long StatusLogNumber)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUploadStatus(StatusLogNumber);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the upload statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of upload statuses
	* @param end the upper bound of the range of upload statuses (not inclusive)
	* @return the range of upload statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus> getUploadStatuses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUploadStatuses(start, end);
	}

	/**
	* Returns the number of upload statuses.
	*
	* @return the number of upload statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int getUploadStatusesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUploadStatusesCount();
	}

	/**
	* Updates the upload status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param uploadStatus the upload status
	* @return the upload status that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus updateUploadStatus(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateUploadStatus(uploadStatus);
	}

	/**
	* Updates the upload status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param uploadStatus the upload status
	* @param merge whether to merge the upload status with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the upload status that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus updateUploadStatus(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateUploadStatus(uploadStatus, merge);
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

	public static void clearService() {
		_service = null;
	}

	public static UploadStatusLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					UploadStatusLocalService.class.getName());

			if (invokableLocalService instanceof UploadStatusLocalService) {
				_service = (UploadStatusLocalService)invokableLocalService;
			}
			else {
				_service = new UploadStatusLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(UploadStatusLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(UploadStatusLocalService service) {
	}

	private static UploadStatusLocalService _service;
}