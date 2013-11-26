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

package edu.jhu.cvrg.waveform.main.dbpersistence.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus;

import java.util.List;

/**
 * The persistence utility for the upload status service. This utility wraps {@link UploadStatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see UploadStatusPersistence
 * @see UploadStatusPersistenceImpl
 * @generated
 */
public class UploadStatusUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(UploadStatus uploadStatus) {
		getPersistence().clearCache(uploadStatus);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UploadStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UploadStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UploadStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static UploadStatus update(UploadStatus uploadStatus, boolean merge)
		throws SystemException {
		return getPersistence().update(uploadStatus, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static UploadStatus update(UploadStatus uploadStatus, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(uploadStatus, merge, serviceContext);
	}

	/**
	* Caches the upload status in the entity cache if it is enabled.
	*
	* @param uploadStatus the upload status
	*/
	public static void cacheResult(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus) {
		getPersistence().cacheResult(uploadStatus);
	}

	/**
	* Caches the upload statuses in the entity cache if it is enabled.
	*
	* @param uploadStatuses the upload statuses
	*/
	public static void cacheResult(
		java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus> uploadStatuses) {
		getPersistence().cacheResult(uploadStatuses);
	}

	/**
	* Creates a new upload status with the primary key. Does not add the upload status to the database.
	*
	* @param StatusLogNumber the primary key for the new upload status
	* @return the new upload status
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus create(
		long StatusLogNumber) {
		return getPersistence().create(StatusLogNumber);
	}

	/**
	* Removes the upload status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param StatusLogNumber the primary key of the upload status
	* @return the upload status that was removed
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException if a upload status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus remove(
		long StatusLogNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException {
		return getPersistence().remove(StatusLogNumber);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(uploadStatus, merge);
	}

	/**
	* Returns the upload status with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException} if it could not be found.
	*
	* @param StatusLogNumber the primary key of the upload status
	* @return the upload status
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException if a upload status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus findByPrimaryKey(
		long StatusLogNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException {
		return getPersistence().findByPrimaryKey(StatusLogNumber);
	}

	/**
	* Returns the upload status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param StatusLogNumber the primary key of the upload status
	* @return the upload status, or <code>null</code> if a upload status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus fetchByPrimaryKey(
		long StatusLogNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(StatusLogNumber);
	}

	/**
	* Returns all the upload statuses.
	*
	* @return the upload statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the upload statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of upload statuses
	* @param end the upper bound of the range of upload statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of upload statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the upload statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of upload statuses.
	*
	* @return the number of upload statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UploadStatusPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UploadStatusPersistence)PortletBeanLocatorUtil.locate(edu.jhu.cvrg.waveform.main.dbpersistence.service.ClpSerializer.getServletContextName(),
					UploadStatusPersistence.class.getName());

			ReferenceRegistry.registerReference(UploadStatusUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(UploadStatusPersistence persistence) {
	}

	private static UploadStatusPersistence _persistence;
}