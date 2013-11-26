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

import edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo;

/**
 * The persistence interface for the files info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see FilesInfoPersistenceImpl
 * @see FilesInfoUtil
 * @generated
 */
public interface FilesInfoPersistence extends BasePersistence<FilesInfo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilesInfoUtil} to access the files info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the files info in the entity cache if it is enabled.
	*
	* @param filesInfo the files info
	*/
	public void cacheResult(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo filesInfo);

	/**
	* Caches the files infos in the entity cache if it is enabled.
	*
	* @param filesInfos the files infos
	*/
	public void cacheResult(
		java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> filesInfos);

	/**
	* Creates a new files info with the primary key. Does not add the files info to the database.
	*
	* @param FileID the primary key for the new files info
	* @return the new files info
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo create(
		long FileID);

	/**
	* Removes the files info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FileID the primary key of the files info
	* @return the files info that was removed
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a files info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo remove(
		long FileID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException;

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo filesInfo,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the files info with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException} if it could not be found.
	*
	* @param FileID the primary key of the files info
	* @return the files info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a files info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo findByPrimaryKey(
		long FileID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException;

	/**
	* Returns the files info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param FileID the primary key of the files info
	* @return the files info, or <code>null</code> if a files info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo fetchByPrimaryKey(
		long FileID) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the files infos where DocumentRecordID = &#63;.
	*
	* @param DocumentRecordID the document record i d
	* @return the matching files infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findByDocumentRecordID(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the files infos where DocumentRecordID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DocumentRecordID the document record i d
	* @param start the lower bound of the range of files infos
	* @param end the upper bound of the range of files infos (not inclusive)
	* @return the range of matching files infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findByDocumentRecordID(
		long DocumentRecordID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the files infos where DocumentRecordID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DocumentRecordID the document record i d
	* @param start the lower bound of the range of files infos
	* @param end the upper bound of the range of files infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching files infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findByDocumentRecordID(
		long DocumentRecordID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first files info in the ordered set where DocumentRecordID = &#63;.
	*
	* @param DocumentRecordID the document record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching files info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a matching files info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo findByDocumentRecordID_First(
		long DocumentRecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException;

	/**
	* Returns the first files info in the ordered set where DocumentRecordID = &#63;.
	*
	* @param DocumentRecordID the document record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching files info, or <code>null</code> if a matching files info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo fetchByDocumentRecordID_First(
		long DocumentRecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last files info in the ordered set where DocumentRecordID = &#63;.
	*
	* @param DocumentRecordID the document record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching files info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a matching files info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo findByDocumentRecordID_Last(
		long DocumentRecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException;

	/**
	* Returns the last files info in the ordered set where DocumentRecordID = &#63;.
	*
	* @param DocumentRecordID the document record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching files info, or <code>null</code> if a matching files info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo fetchByDocumentRecordID_Last(
		long DocumentRecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the files infos before and after the current files info in the ordered set where DocumentRecordID = &#63;.
	*
	* @param FileID the primary key of the current files info
	* @param DocumentRecordID the document record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next files info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a files info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo[] findByDocumentRecordID_PrevAndNext(
		long FileID, long DocumentRecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException;

	/**
	* Returns all the files infos.
	*
	* @return the files infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the files infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of files infos
	* @param end the upper bound of the range of files infos (not inclusive)
	* @return the range of files infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the files infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of files infos
	* @param end the upper bound of the range of files infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of files infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the files infos where DocumentRecordID = &#63; from the database.
	*
	* @param DocumentRecordID the document record i d
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentRecordID(long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the files infos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of files infos where DocumentRecordID = &#63;.
	*
	* @param DocumentRecordID the document record i d
	* @return the number of matching files infos
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentRecordID(long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of files infos.
	*
	* @return the number of files infos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}