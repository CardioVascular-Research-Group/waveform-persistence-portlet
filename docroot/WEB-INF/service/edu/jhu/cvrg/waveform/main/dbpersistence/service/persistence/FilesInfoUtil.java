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

import edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo;

import java.util.List;

/**
 * The persistence utility for the files info service. This utility wraps {@link FilesInfoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see FilesInfoPersistence
 * @see FilesInfoPersistenceImpl
 * @generated
 */
public class FilesInfoUtil {
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
	public static void clearCache(FilesInfo filesInfo) {
		getPersistence().clearCache(filesInfo);
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
	public static List<FilesInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilesInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilesInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static FilesInfo update(FilesInfo filesInfo, boolean merge)
		throws SystemException {
		return getPersistence().update(filesInfo, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static FilesInfo update(FilesInfo filesInfo, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(filesInfo, merge, serviceContext);
	}

	/**
	* Caches the files info in the entity cache if it is enabled.
	*
	* @param filesInfo the files info
	*/
	public static void cacheResult(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo filesInfo) {
		getPersistence().cacheResult(filesInfo);
	}

	/**
	* Caches the files infos in the entity cache if it is enabled.
	*
	* @param filesInfos the files infos
	*/
	public static void cacheResult(
		java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> filesInfos) {
		getPersistence().cacheResult(filesInfos);
	}

	/**
	* Creates a new files info with the primary key. Does not add the files info to the database.
	*
	* @param FileID the primary key for the new files info
	* @return the new files info
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo create(
		long FileID) {
		return getPersistence().create(FileID);
	}

	/**
	* Removes the files info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FileID the primary key of the files info
	* @return the files info that was removed
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a files info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo remove(
		long FileID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException {
		return getPersistence().remove(FileID);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo filesInfo,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(filesInfo, merge);
	}

	/**
	* Returns the files info with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException} if it could not be found.
	*
	* @param FileID the primary key of the files info
	* @return the files info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a files info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo findByPrimaryKey(
		long FileID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException {
		return getPersistence().findByPrimaryKey(FileID);
	}

	/**
	* Returns the files info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param FileID the primary key of the files info
	* @return the files info, or <code>null</code> if a files info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo fetchByPrimaryKey(
		long FileID) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(FileID);
	}

	/**
	* Returns all the files infos where DocumentRecordID = &#63;.
	*
	* @param DocumentRecordID the document record i d
	* @return the matching files infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findByDocumentRecordID(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDocumentRecordID(DocumentRecordID);
	}

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
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findByDocumentRecordID(
		long DocumentRecordID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentRecordID(DocumentRecordID, start, end);
	}

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
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findByDocumentRecordID(
		long DocumentRecordID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentRecordID(DocumentRecordID, start, end,
			orderByComparator);
	}

	/**
	* Returns the first files info in the ordered set where DocumentRecordID = &#63;.
	*
	* @param DocumentRecordID the document record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching files info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a matching files info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo findByDocumentRecordID_First(
		long DocumentRecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException {
		return getPersistence()
				   .findByDocumentRecordID_First(DocumentRecordID,
			orderByComparator);
	}

	/**
	* Returns the first files info in the ordered set where DocumentRecordID = &#63;.
	*
	* @param DocumentRecordID the document record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching files info, or <code>null</code> if a matching files info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo fetchByDocumentRecordID_First(
		long DocumentRecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentRecordID_First(DocumentRecordID,
			orderByComparator);
	}

	/**
	* Returns the last files info in the ordered set where DocumentRecordID = &#63;.
	*
	* @param DocumentRecordID the document record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching files info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a matching files info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo findByDocumentRecordID_Last(
		long DocumentRecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException {
		return getPersistence()
				   .findByDocumentRecordID_Last(DocumentRecordID,
			orderByComparator);
	}

	/**
	* Returns the last files info in the ordered set where DocumentRecordID = &#63;.
	*
	* @param DocumentRecordID the document record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching files info, or <code>null</code> if a matching files info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo fetchByDocumentRecordID_Last(
		long DocumentRecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentRecordID_Last(DocumentRecordID,
			orderByComparator);
	}

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
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo[] findByDocumentRecordID_PrevAndNext(
		long FileID, long DocumentRecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException {
		return getPersistence()
				   .findByDocumentRecordID_PrevAndNext(FileID,
			DocumentRecordID, orderByComparator);
	}

	/**
	* Returns all the files infos.
	*
	* @return the files infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the files infos where DocumentRecordID = &#63; from the database.
	*
	* @param DocumentRecordID the document record i d
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentRecordID(long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDocumentRecordID(DocumentRecordID);
	}

	/**
	* Removes all the files infos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of files infos where DocumentRecordID = &#63;.
	*
	* @param DocumentRecordID the document record i d
	* @return the number of matching files infos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentRecordID(long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDocumentRecordID(DocumentRecordID);
	}

	/**
	* Returns the number of files infos.
	*
	* @return the number of files infos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FilesInfoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FilesInfoPersistence)PortletBeanLocatorUtil.locate(edu.jhu.cvrg.waveform.main.dbpersistence.service.ClpSerializer.getServletContextName(),
					FilesInfoPersistence.class.getName());

			ReferenceRegistry.registerReference(FilesInfoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(FilesInfoPersistence persistence) {
	}

	private static FilesInfoPersistence _persistence;
}