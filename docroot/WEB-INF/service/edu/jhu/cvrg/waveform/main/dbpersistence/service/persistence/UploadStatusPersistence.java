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

import com.liferay.portal.service.persistence.BasePersistence;

import edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus;

/**
 * The persistence interface for the upload status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see UploadStatusPersistenceImpl
 * @see UploadStatusUtil
 * @generated
 */
public interface UploadStatusPersistence extends BasePersistence<UploadStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UploadStatusUtil} to access the upload status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the upload status in the entity cache if it is enabled.
	*
	* @param uploadStatus the upload status
	*/
	public void cacheResult(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus);

	/**
	* Caches the upload statuses in the entity cache if it is enabled.
	*
	* @param uploadStatuses the upload statuses
	*/
	public void cacheResult(
		java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus> uploadStatuses);

	/**
	* Creates a new upload status with the primary key. Does not add the upload status to the database.
	*
	* @param StatusLogNumber the primary key for the new upload status
	* @return the new upload status
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus create(
		java.lang.String StatusLogNumber);

	/**
	* Removes the upload status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param StatusLogNumber the primary key of the upload status
	* @return the upload status that was removed
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException if a upload status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus remove(
		java.lang.String StatusLogNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException;

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the upload status with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException} if it could not be found.
	*
	* @param StatusLogNumber the primary key of the upload status
	* @return the upload status
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException if a upload status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus findByPrimaryKey(
		java.lang.String StatusLogNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException;

	/**
	* Returns the upload status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param StatusLogNumber the primary key of the upload status
	* @return the upload status, or <code>null</code> if a upload status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus fetchByPrimaryKey(
		java.lang.String StatusLogNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the upload statuses.
	*
	* @return the upload statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the upload statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of upload statuses.
	*
	* @return the number of upload statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}