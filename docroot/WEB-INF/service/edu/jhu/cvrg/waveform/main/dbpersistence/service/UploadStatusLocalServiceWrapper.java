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
 * This class is a wrapper for {@link UploadStatusLocalService}.
 * </p>
 *
 * @author    bbenite1
 * @see       UploadStatusLocalService
 * @generated
 */
public class UploadStatusLocalServiceWrapper implements UploadStatusLocalService,
	ServiceWrapper<UploadStatusLocalService> {
	public UploadStatusLocalServiceWrapper(
		UploadStatusLocalService uploadStatusLocalService) {
		_uploadStatusLocalService = uploadStatusLocalService;
	}

	/**
	* Adds the upload status to the database. Also notifies the appropriate model listeners.
	*
	* @param uploadStatus the upload status
	* @return the upload status that was added
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus addUploadStatus(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.addUploadStatus(uploadStatus);
	}

	/**
	* Creates a new upload status with the primary key. Does not add the upload status to the database.
	*
	* @param StatusLogNumber the primary key for the new upload status
	* @return the new upload status
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus createUploadStatus(
		long StatusLogNumber) {
		return _uploadStatusLocalService.createUploadStatus(StatusLogNumber);
	}

	/**
	* Deletes the upload status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param StatusLogNumber the primary key of the upload status
	* @return the upload status that was removed
	* @throws PortalException if a upload status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus deleteUploadStatus(
		long StatusLogNumber)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.deleteUploadStatus(StatusLogNumber);
	}

	/**
	* Deletes the upload status from the database. Also notifies the appropriate model listeners.
	*
	* @param uploadStatus the upload status
	* @return the upload status that was removed
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus deleteUploadStatus(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.deleteUploadStatus(uploadStatus);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _uploadStatusLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.dynamicQueryCount(dynamicQuery);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus fetchUploadStatus(
		long StatusLogNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.fetchUploadStatus(StatusLogNumber);
	}

	/**
	* Returns the upload status with the primary key.
	*
	* @param StatusLogNumber the primary key of the upload status
	* @return the upload status
	* @throws PortalException if a upload status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus getUploadStatus(
		long StatusLogNumber)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.getUploadStatus(StatusLogNumber);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus> getUploadStatuses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.getUploadStatuses(start, end);
	}

	/**
	* Returns the number of upload statuses.
	*
	* @return the number of upload statuses
	* @throws SystemException if a system exception occurred
	*/
	public int getUploadStatusesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.getUploadStatusesCount();
	}

	/**
	* Updates the upload status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param uploadStatus the upload status
	* @return the upload status that was updated
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus updateUploadStatus(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.updateUploadStatus(uploadStatus);
	}

	/**
	* Updates the upload status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param uploadStatus the upload status
	* @param merge whether to merge the upload status with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the upload status that was updated
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus updateUploadStatus(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _uploadStatusLocalService.updateUploadStatus(uploadStatus, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _uploadStatusLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_uploadStatusLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _uploadStatusLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public UploadStatusLocalService getWrappedUploadStatusLocalService() {
		return _uploadStatusLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedUploadStatusLocalService(
		UploadStatusLocalService uploadStatusLocalService) {
		_uploadStatusLocalService = uploadStatusLocalService;
	}

	public UploadStatusLocalService getWrappedService() {
		return _uploadStatusLocalService;
	}

	public void setWrappedService(
		UploadStatusLocalService uploadStatusLocalService) {
		_uploadStatusLocalService = uploadStatusLocalService;
	}

	private UploadStatusLocalService _uploadStatusLocalService;
}