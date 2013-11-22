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

import edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo;

import java.util.List;

/**
 * The persistence utility for the annotation info service. This utility wraps {@link AnnotationInfoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see AnnotationInfoPersistence
 * @see AnnotationInfoPersistenceImpl
 * @generated
 */
public class AnnotationInfoUtil {
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
	public static void clearCache(AnnotationInfo annotationInfo) {
		getPersistence().clearCache(annotationInfo);
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
	public static List<AnnotationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AnnotationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AnnotationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static AnnotationInfo update(AnnotationInfo annotationInfo,
		boolean merge) throws SystemException {
		return getPersistence().update(annotationInfo, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static AnnotationInfo update(AnnotationInfo annotationInfo,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(annotationInfo, merge, serviceContext);
	}

	/**
	* Caches the annotation info in the entity cache if it is enabled.
	*
	* @param annotationInfo the annotation info
	*/
	public static void cacheResult(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo annotationInfo) {
		getPersistence().cacheResult(annotationInfo);
	}

	/**
	* Caches the annotation infos in the entity cache if it is enabled.
	*
	* @param annotationInfos the annotation infos
	*/
	public static void cacheResult(
		java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> annotationInfos) {
		getPersistence().cacheResult(annotationInfos);
	}

	/**
	* Creates a new annotation info with the primary key. Does not add the annotation info to the database.
	*
	* @param AnnotationID the primary key for the new annotation info
	* @return the new annotation info
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo create(
		java.lang.String AnnotationID) {
		return getPersistence().create(AnnotationID);
	}

	/**
	* Removes the annotation info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param AnnotationID the primary key of the annotation info
	* @return the annotation info that was removed
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a annotation info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo remove(
		java.lang.String AnnotationID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException {
		return getPersistence().remove(AnnotationID);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo annotationInfo,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(annotationInfo, merge);
	}

	/**
	* Returns the annotation info with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException} if it could not be found.
	*
	* @param AnnotationID the primary key of the annotation info
	* @return the annotation info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a annotation info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo findByPrimaryKey(
		java.lang.String AnnotationID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException {
		return getPersistence().findByPrimaryKey(AnnotationID);
	}

	/**
	* Returns the annotation info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param AnnotationID the primary key of the annotation info
	* @return the annotation info, or <code>null</code> if a annotation info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo fetchByPrimaryKey(
		java.lang.String AnnotationID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(AnnotationID);
	}

	/**
	* Returns all the annotation infos where RecordID = &#63;.
	*
	* @param RecordID the record i d
	* @return the matching annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> findByRecordID(
		java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRecordID(RecordID);
	}

	/**
	* Returns a range of all the annotation infos where RecordID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param RecordID the record i d
	* @param start the lower bound of the range of annotation infos
	* @param end the upper bound of the range of annotation infos (not inclusive)
	* @return the range of matching annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> findByRecordID(
		java.lang.String RecordID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRecordID(RecordID, start, end);
	}

	/**
	* Returns an ordered range of all the annotation infos where RecordID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param RecordID the record i d
	* @param start the lower bound of the range of annotation infos
	* @param end the upper bound of the range of annotation infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> findByRecordID(
		java.lang.String RecordID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRecordID(RecordID, start, end, orderByComparator);
	}

	/**
	* Returns the first annotation info in the ordered set where RecordID = &#63;.
	*
	* @param RecordID the record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching annotation info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a matching annotation info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo findByRecordID_First(
		java.lang.String RecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException {
		return getPersistence().findByRecordID_First(RecordID, orderByComparator);
	}

	/**
	* Returns the first annotation info in the ordered set where RecordID = &#63;.
	*
	* @param RecordID the record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching annotation info, or <code>null</code> if a matching annotation info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo fetchByRecordID_First(
		java.lang.String RecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRecordID_First(RecordID, orderByComparator);
	}

	/**
	* Returns the last annotation info in the ordered set where RecordID = &#63;.
	*
	* @param RecordID the record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching annotation info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a matching annotation info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo findByRecordID_Last(
		java.lang.String RecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException {
		return getPersistence().findByRecordID_Last(RecordID, orderByComparator);
	}

	/**
	* Returns the last annotation info in the ordered set where RecordID = &#63;.
	*
	* @param RecordID the record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching annotation info, or <code>null</code> if a matching annotation info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo fetchByRecordID_Last(
		java.lang.String RecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRecordID_Last(RecordID, orderByComparator);
	}

	/**
	* Returns the annotation infos before and after the current annotation info in the ordered set where RecordID = &#63;.
	*
	* @param AnnotationID the primary key of the current annotation info
	* @param RecordID the record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next annotation info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a annotation info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo[] findByRecordID_PrevAndNext(
		java.lang.String AnnotationID, java.lang.String RecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException {
		return getPersistence()
				   .findByRecordID_PrevAndNext(AnnotationID, RecordID,
			orderByComparator);
	}

	/**
	* Returns the annotation info where RecordID = &#63; and Name = &#63; and AnnotationType = &#63; and Lead = &#63; or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException} if it could not be found.
	*
	* @param RecordID the record i d
	* @param Name the name
	* @param AnnotationType the annotation type
	* @param Lead the lead
	* @return the matching annotation info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a matching annotation info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo findByAnnotationProperties(
		java.lang.String RecordID, java.lang.String Name,
		java.lang.String AnnotationType, java.lang.String Lead)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException {
		return getPersistence()
				   .findByAnnotationProperties(RecordID, Name, AnnotationType,
			Lead);
	}

	/**
	* Returns the annotation info where RecordID = &#63; and Name = &#63; and AnnotationType = &#63; and Lead = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param RecordID the record i d
	* @param Name the name
	* @param AnnotationType the annotation type
	* @param Lead the lead
	* @return the matching annotation info, or <code>null</code> if a matching annotation info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo fetchByAnnotationProperties(
		java.lang.String RecordID, java.lang.String Name,
		java.lang.String AnnotationType, java.lang.String Lead)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAnnotationProperties(RecordID, Name, AnnotationType,
			Lead);
	}

	/**
	* Returns the annotation info where RecordID = &#63; and Name = &#63; and AnnotationType = &#63; and Lead = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param RecordID the record i d
	* @param Name the name
	* @param AnnotationType the annotation type
	* @param Lead the lead
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching annotation info, or <code>null</code> if a matching annotation info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo fetchByAnnotationProperties(
		java.lang.String RecordID, java.lang.String Name,
		java.lang.String AnnotationType, java.lang.String Lead,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAnnotationProperties(RecordID, Name, AnnotationType,
			Lead, retrieveFromCache);
	}

	/**
	* Returns all the annotation infos where AnnotationType = &#63; and RecordID = &#63;.
	*
	* @param AnnotationType the annotation type
	* @param RecordID the record i d
	* @return the matching annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> findByAnnotationType(
		java.lang.String AnnotationType, java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAnnotationType(AnnotationType, RecordID);
	}

	/**
	* Returns a range of all the annotation infos where AnnotationType = &#63; and RecordID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param AnnotationType the annotation type
	* @param RecordID the record i d
	* @param start the lower bound of the range of annotation infos
	* @param end the upper bound of the range of annotation infos (not inclusive)
	* @return the range of matching annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> findByAnnotationType(
		java.lang.String AnnotationType, java.lang.String RecordID, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAnnotationType(AnnotationType, RecordID, start, end);
	}

	/**
	* Returns an ordered range of all the annotation infos where AnnotationType = &#63; and RecordID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param AnnotationType the annotation type
	* @param RecordID the record i d
	* @param start the lower bound of the range of annotation infos
	* @param end the upper bound of the range of annotation infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> findByAnnotationType(
		java.lang.String AnnotationType, java.lang.String RecordID, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAnnotationType(AnnotationType, RecordID, start, end,
			orderByComparator);
	}

	/**
	* Returns the first annotation info in the ordered set where AnnotationType = &#63; and RecordID = &#63;.
	*
	* @param AnnotationType the annotation type
	* @param RecordID the record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching annotation info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a matching annotation info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo findByAnnotationType_First(
		java.lang.String AnnotationType, java.lang.String RecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException {
		return getPersistence()
				   .findByAnnotationType_First(AnnotationType, RecordID,
			orderByComparator);
	}

	/**
	* Returns the first annotation info in the ordered set where AnnotationType = &#63; and RecordID = &#63;.
	*
	* @param AnnotationType the annotation type
	* @param RecordID the record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching annotation info, or <code>null</code> if a matching annotation info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo fetchByAnnotationType_First(
		java.lang.String AnnotationType, java.lang.String RecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAnnotationType_First(AnnotationType, RecordID,
			orderByComparator);
	}

	/**
	* Returns the last annotation info in the ordered set where AnnotationType = &#63; and RecordID = &#63;.
	*
	* @param AnnotationType the annotation type
	* @param RecordID the record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching annotation info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a matching annotation info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo findByAnnotationType_Last(
		java.lang.String AnnotationType, java.lang.String RecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException {
		return getPersistence()
				   .findByAnnotationType_Last(AnnotationType, RecordID,
			orderByComparator);
	}

	/**
	* Returns the last annotation info in the ordered set where AnnotationType = &#63; and RecordID = &#63;.
	*
	* @param AnnotationType the annotation type
	* @param RecordID the record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching annotation info, or <code>null</code> if a matching annotation info could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo fetchByAnnotationType_Last(
		java.lang.String AnnotationType, java.lang.String RecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAnnotationType_Last(AnnotationType, RecordID,
			orderByComparator);
	}

	/**
	* Returns the annotation infos before and after the current annotation info in the ordered set where AnnotationType = &#63; and RecordID = &#63;.
	*
	* @param AnnotationID the primary key of the current annotation info
	* @param AnnotationType the annotation type
	* @param RecordID the record i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next annotation info
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a annotation info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo[] findByAnnotationType_PrevAndNext(
		java.lang.String AnnotationID, java.lang.String AnnotationType,
		java.lang.String RecordID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException {
		return getPersistence()
				   .findByAnnotationType_PrevAndNext(AnnotationID,
			AnnotationType, RecordID, orderByComparator);
	}

	/**
	* Returns all the annotation infos.
	*
	* @return the annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the annotation infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of annotation infos
	* @param end the upper bound of the range of annotation infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the annotation infos where RecordID = &#63; from the database.
	*
	* @param RecordID the record i d
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRecordID(java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRecordID(RecordID);
	}

	/**
	* Removes the annotation info where RecordID = &#63; and Name = &#63; and AnnotationType = &#63; and Lead = &#63; from the database.
	*
	* @param RecordID the record i d
	* @param Name the name
	* @param AnnotationType the annotation type
	* @param Lead the lead
	* @return the annotation info that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo removeByAnnotationProperties(
		java.lang.String RecordID, java.lang.String Name,
		java.lang.String AnnotationType, java.lang.String Lead)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException {
		return getPersistence()
				   .removeByAnnotationProperties(RecordID, Name,
			AnnotationType, Lead);
	}

	/**
	* Removes all the annotation infos where AnnotationType = &#63; and RecordID = &#63; from the database.
	*
	* @param AnnotationType the annotation type
	* @param RecordID the record i d
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAnnotationType(java.lang.String AnnotationType,
		java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAnnotationType(AnnotationType, RecordID);
	}

	/**
	* Removes all the annotation infos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of annotation infos where RecordID = &#63;.
	*
	* @param RecordID the record i d
	* @return the number of matching annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRecordID(java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRecordID(RecordID);
	}

	/**
	* Returns the number of annotation infos where RecordID = &#63; and Name = &#63; and AnnotationType = &#63; and Lead = &#63;.
	*
	* @param RecordID the record i d
	* @param Name the name
	* @param AnnotationType the annotation type
	* @param Lead the lead
	* @return the number of matching annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAnnotationProperties(java.lang.String RecordID,
		java.lang.String Name, java.lang.String AnnotationType,
		java.lang.String Lead)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAnnotationProperties(RecordID, Name, AnnotationType,
			Lead);
	}

	/**
	* Returns the number of annotation infos where AnnotationType = &#63; and RecordID = &#63;.
	*
	* @param AnnotationType the annotation type
	* @param RecordID the record i d
	* @return the number of matching annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAnnotationType(java.lang.String AnnotationType,
		java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAnnotationType(AnnotationType, RecordID);
	}

	/**
	* Returns the number of annotation infos.
	*
	* @return the number of annotation infos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AnnotationInfoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AnnotationInfoPersistence)PortletBeanLocatorUtil.locate(edu.jhu.cvrg.waveform.main.dbpersistence.service.ClpSerializer.getServletContextName(),
					AnnotationInfoPersistence.class.getName());

			ReferenceRegistry.registerReference(AnnotationInfoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(AnnotationInfoPersistence persistence) {
	}

	private static AnnotationInfoPersistence _persistence;
}