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
	* @param DocumentID the primary key for the new files info
	* @return the new files info
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo create(
		java.lang.String DocumentID) {
		return getPersistence().create(DocumentID);
	}

	/**
	* Removes the files info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param DocumentID the primary key of the files info
	* @return the files info that was removed
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a files info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo remove(
		java.lang.String DocumentID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException {
		return getPersistence().remove(DocumentID);
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
	* @param DocumentID the primary key of the files info
	* @return the files info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a files info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo findByPrimaryKey(
		java.lang.String DocumentID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException {
		return getPersistence().findByPrimaryKey(DocumentID);
	}

	/**
	* Returns the files info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param DocumentID the primary key of the files info
	* @return the files info, or <code>null</code> if a files info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo fetchByPrimaryKey(
		java.lang.String DocumentID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(DocumentID);
	}

	/**
	* Returns all the files infos where FileListID = &#63;.
	*
	* @param FileListID the file list i d
	* @return the matching files infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findByFileListID(
		java.lang.String FileListID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFileListID(FileListID);
	}

	/**
	* Returns a range of all the files infos where FileListID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param FileListID the file list i d
	* @param start the lower bound of the range of files infos
	* @param end the upper bound of the range of files infos (not inclusive)
	* @return the range of matching files infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findByFileListID(
		java.lang.String FileListID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFileListID(FileListID, start, end);
	}

	/**
	* Returns an ordered range of all the files infos where FileListID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param FileListID the file list i d
	* @param start the lower bound of the range of files infos
	* @param end the upper bound of the range of files infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching files infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> findByFileListID(
		java.lang.String FileListID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFileListID(FileListID, start, end, orderByComparator);
	}

	/**
	* Returns the first files info in the ordered set where FileListID = &#63;.
	*
	* @param FileListID the file list i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching files info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a matching files info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo findByFileListID_First(
		java.lang.String FileListID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException {
		return getPersistence()
				   .findByFileListID_First(FileListID, orderByComparator);
	}

	/**
	* Returns the first files info in the ordered set where FileListID = &#63;.
	*
	* @param FileListID the file list i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching files info, or <code>null</code> if a matching files info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo fetchByFileListID_First(
		java.lang.String FileListID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFileListID_First(FileListID, orderByComparator);
	}

	/**
	* Returns the last files info in the ordered set where FileListID = &#63;.
	*
	* @param FileListID the file list i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching files info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a matching files info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo findByFileListID_Last(
		java.lang.String FileListID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException {
		return getPersistence()
				   .findByFileListID_Last(FileListID, orderByComparator);
	}

	/**
	* Returns the last files info in the ordered set where FileListID = &#63;.
	*
	* @param FileListID the file list i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching files info, or <code>null</code> if a matching files info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo fetchByFileListID_Last(
		java.lang.String FileListID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFileListID_Last(FileListID, orderByComparator);
	}

	/**
	* Returns the files infos before and after the current files info in the ordered set where FileListID = &#63;.
	*
	* @param DocumentID the primary key of the current files info
	* @param FileListID the file list i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next files info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a files info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo[] findByFileListID_PrevAndNext(
		java.lang.String DocumentID, java.lang.String FileListID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException {
		return getPersistence()
				   .findByFileListID_PrevAndNext(DocumentID, FileListID,
			orderByComparator);
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
	* Removes all the files infos where FileListID = &#63; from the database.
	*
	* @param FileListID the file list i d
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFileListID(java.lang.String FileListID)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFileListID(FileListID);
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
	* Returns the number of files infos where FileListID = &#63;.
	*
	* @param FileListID the file list i d
	* @return the number of matching files infos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFileListID(java.lang.String FileListID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFileListID(FileListID);
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