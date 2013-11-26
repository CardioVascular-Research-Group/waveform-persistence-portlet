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

import edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord;

import java.util.List;

/**
 * The persistence utility for the document record service. This utility wraps {@link DocumentRecordPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see DocumentRecordPersistence
 * @see DocumentRecordPersistenceImpl
 * @generated
 */
public class DocumentRecordUtil {
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
	public static void clearCache(DocumentRecord documentRecord) {
		getPersistence().clearCache(documentRecord);
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
	public static List<DocumentRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DocumentRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DocumentRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DocumentRecord update(DocumentRecord documentRecord,
		boolean merge) throws SystemException {
		return getPersistence().update(documentRecord, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DocumentRecord update(DocumentRecord documentRecord,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(documentRecord, merge, serviceContext);
	}

	/**
	* Caches the document record in the entity cache if it is enabled.
	*
	* @param documentRecord the document record
	*/
	public static void cacheResult(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord) {
		getPersistence().cacheResult(documentRecord);
	}

	/**
	* Caches the document records in the entity cache if it is enabled.
	*
	* @param documentRecords the document records
	*/
	public static void cacheResult(
		java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> documentRecords) {
		getPersistence().cacheResult(documentRecords);
	}

	/**
	* Creates a new document record with the primary key. Does not add the document record to the database.
	*
	* @param DocumentRecordID the primary key for the new document record
	* @return the new document record
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord create(
		long DocumentRecordID) {
		return getPersistence().create(DocumentRecordID);
	}

	/**
	* Removes the document record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param DocumentRecordID the primary key of the document record
	* @return the document record that was removed
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord remove(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence().remove(DocumentRecordID);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(documentRecord, merge);
	}

	/**
	* Returns the document record with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException} if it could not be found.
	*
	* @param DocumentRecordID the primary key of the document record
	* @return the document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByPrimaryKey(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence().findByPrimaryKey(DocumentRecordID);
	}

	/**
	* Returns the document record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param DocumentRecordID the primary key of the document record
	* @return the document record, or <code>null</code> if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByPrimaryKey(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(DocumentRecordID);
	}

	/**
	* Returns all the document records where OriginalFormat = &#63;.
	*
	* @param OriginalFormat the original format
	* @return the matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findByOriginalFormat(
		java.lang.String OriginalFormat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOriginalFormat(OriginalFormat);
	}

	/**
	* Returns a range of all the document records where OriginalFormat = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param OriginalFormat the original format
	* @param start the lower bound of the range of document records
	* @param end the upper bound of the range of document records (not inclusive)
	* @return the range of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findByOriginalFormat(
		java.lang.String OriginalFormat, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOriginalFormat(OriginalFormat, start, end);
	}

	/**
	* Returns an ordered range of all the document records where OriginalFormat = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param OriginalFormat the original format
	* @param start the lower bound of the range of document records
	* @param end the upper bound of the range of document records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findByOriginalFormat(
		java.lang.String OriginalFormat, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOriginalFormat(OriginalFormat, start, end,
			orderByComparator);
	}

	/**
	* Returns the first document record in the ordered set where OriginalFormat = &#63;.
	*
	* @param OriginalFormat the original format
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByOriginalFormat_First(
		java.lang.String OriginalFormat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence()
				   .findByOriginalFormat_First(OriginalFormat, orderByComparator);
	}

	/**
	* Returns the first document record in the ordered set where OriginalFormat = &#63;.
	*
	* @param OriginalFormat the original format
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByOriginalFormat_First(
		java.lang.String OriginalFormat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOriginalFormat_First(OriginalFormat,
			orderByComparator);
	}

	/**
	* Returns the last document record in the ordered set where OriginalFormat = &#63;.
	*
	* @param OriginalFormat the original format
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByOriginalFormat_Last(
		java.lang.String OriginalFormat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence()
				   .findByOriginalFormat_Last(OriginalFormat, orderByComparator);
	}

	/**
	* Returns the last document record in the ordered set where OriginalFormat = &#63;.
	*
	* @param OriginalFormat the original format
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByOriginalFormat_Last(
		java.lang.String OriginalFormat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByOriginalFormat_Last(OriginalFormat, orderByComparator);
	}

	/**
	* Returns the document records before and after the current document record in the ordered set where OriginalFormat = &#63;.
	*
	* @param DocumentRecordID the primary key of the current document record
	* @param OriginalFormat the original format
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord[] findByOriginalFormat_PrevAndNext(
		long DocumentRecordID, java.lang.String OriginalFormat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence()
				   .findByOriginalFormat_PrevAndNext(DocumentRecordID,
			OriginalFormat, orderByComparator);
	}

	/**
	* Returns the document record where DocumentRecordID = &#63; or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException} if it could not be found.
	*
	* @param DocumentRecordID the document record i d
	* @return the matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByRecordName(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence().findByRecordName(DocumentRecordID);
	}

	/**
	* Returns the document record where DocumentRecordID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param DocumentRecordID the document record i d
	* @return the matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByRecordName(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRecordName(DocumentRecordID);
	}

	/**
	* Returns the document record where DocumentRecordID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param DocumentRecordID the document record i d
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByRecordName(
		long DocumentRecordID, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRecordName(DocumentRecordID, retrieveFromCache);
	}

	/**
	* Returns all the document records where SubjectID = &#63;.
	*
	* @param SubjectID the subject i d
	* @return the matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findBySubjectID(
		java.lang.String SubjectID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySubjectID(SubjectID);
	}

	/**
	* Returns a range of all the document records where SubjectID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param SubjectID the subject i d
	* @param start the lower bound of the range of document records
	* @param end the upper bound of the range of document records (not inclusive)
	* @return the range of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findBySubjectID(
		java.lang.String SubjectID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySubjectID(SubjectID, start, end);
	}

	/**
	* Returns an ordered range of all the document records where SubjectID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param SubjectID the subject i d
	* @param start the lower bound of the range of document records
	* @param end the upper bound of the range of document records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findBySubjectID(
		java.lang.String SubjectID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySubjectID(SubjectID, start, end, orderByComparator);
	}

	/**
	* Returns the first document record in the ordered set where SubjectID = &#63;.
	*
	* @param SubjectID the subject i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findBySubjectID_First(
		java.lang.String SubjectID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence()
				   .findBySubjectID_First(SubjectID, orderByComparator);
	}

	/**
	* Returns the first document record in the ordered set where SubjectID = &#63;.
	*
	* @param SubjectID the subject i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchBySubjectID_First(
		java.lang.String SubjectID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySubjectID_First(SubjectID, orderByComparator);
	}

	/**
	* Returns the last document record in the ordered set where SubjectID = &#63;.
	*
	* @param SubjectID the subject i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findBySubjectID_Last(
		java.lang.String SubjectID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence()
				   .findBySubjectID_Last(SubjectID, orderByComparator);
	}

	/**
	* Returns the last document record in the ordered set where SubjectID = &#63;.
	*
	* @param SubjectID the subject i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchBySubjectID_Last(
		java.lang.String SubjectID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySubjectID_Last(SubjectID, orderByComparator);
	}

	/**
	* Returns the document records before and after the current document record in the ordered set where SubjectID = &#63;.
	*
	* @param DocumentRecordID the primary key of the current document record
	* @param SubjectID the subject i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord[] findBySubjectID_PrevAndNext(
		long DocumentRecordID, java.lang.String SubjectID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence()
				   .findBySubjectID_PrevAndNext(DocumentRecordID, SubjectID,
			orderByComparator);
	}

	/**
	* Returns all the document records where UserID = &#63;.
	*
	* @param UserID the user i d
	* @return the matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findByUserID(
		long UserID) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserID(UserID);
	}

	/**
	* Returns a range of all the document records where UserID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param UserID the user i d
	* @param start the lower bound of the range of document records
	* @param end the upper bound of the range of document records (not inclusive)
	* @return the range of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findByUserID(
		long UserID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserID(UserID, start, end);
	}

	/**
	* Returns an ordered range of all the document records where UserID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param UserID the user i d
	* @param start the lower bound of the range of document records
	* @param end the upper bound of the range of document records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findByUserID(
		long UserID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserID(UserID, start, end, orderByComparator);
	}

	/**
	* Returns the first document record in the ordered set where UserID = &#63;.
	*
	* @param UserID the user i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByUserID_First(
		long UserID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence().findByUserID_First(UserID, orderByComparator);
	}

	/**
	* Returns the first document record in the ordered set where UserID = &#63;.
	*
	* @param UserID the user i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByUserID_First(
		long UserID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserID_First(UserID, orderByComparator);
	}

	/**
	* Returns the last document record in the ordered set where UserID = &#63;.
	*
	* @param UserID the user i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByUserID_Last(
		long UserID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence().findByUserID_Last(UserID, orderByComparator);
	}

	/**
	* Returns the last document record in the ordered set where UserID = &#63;.
	*
	* @param UserID the user i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByUserID_Last(
		long UserID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserID_Last(UserID, orderByComparator);
	}

	/**
	* Returns the document records before and after the current document record in the ordered set where UserID = &#63;.
	*
	* @param DocumentRecordID the primary key of the current document record
	* @param UserID the user i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord[] findByUserID_PrevAndNext(
		long DocumentRecordID, long UserID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence()
				   .findByUserID_PrevAndNext(DocumentRecordID, UserID,
			orderByComparator);
	}

	/**
	* Returns the document record where RecordName = &#63; and UserID = &#63; and SubjectID = &#63; and FileTreePath = &#63; or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException} if it could not be found.
	*
	* @param RecordName the record name
	* @param UserID the user i d
	* @param SubjectID the subject i d
	* @param FileTreePath the file tree path
	* @return the matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByRecordProperties(
		java.lang.String RecordName, long UserID, java.lang.String SubjectID,
		java.lang.String FileTreePath)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence()
				   .findByRecordProperties(RecordName, UserID, SubjectID,
			FileTreePath);
	}

	/**
	* Returns the document record where RecordName = &#63; and UserID = &#63; and SubjectID = &#63; and FileTreePath = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param RecordName the record name
	* @param UserID the user i d
	* @param SubjectID the subject i d
	* @param FileTreePath the file tree path
	* @return the matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByRecordProperties(
		java.lang.String RecordName, long UserID, java.lang.String SubjectID,
		java.lang.String FileTreePath)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRecordProperties(RecordName, UserID, SubjectID,
			FileTreePath);
	}

	/**
	* Returns the document record where RecordName = &#63; and UserID = &#63; and SubjectID = &#63; and FileTreePath = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param RecordName the record name
	* @param UserID the user i d
	* @param SubjectID the subject i d
	* @param FileTreePath the file tree path
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByRecordProperties(
		java.lang.String RecordName, long UserID, java.lang.String SubjectID,
		java.lang.String FileTreePath, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRecordProperties(RecordName, UserID, SubjectID,
			FileTreePath, retrieveFromCache);
	}

	/**
	* Returns all the document records.
	*
	* @return the document records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the document records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of document records
	* @param end the upper bound of the range of document records (not inclusive)
	* @return the range of document records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the document records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of document records
	* @param end the upper bound of the range of document records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of document records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the document records where OriginalFormat = &#63; from the database.
	*
	* @param OriginalFormat the original format
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByOriginalFormat(java.lang.String OriginalFormat)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByOriginalFormat(OriginalFormat);
	}

	/**
	* Removes the document record where DocumentRecordID = &#63; from the database.
	*
	* @param DocumentRecordID the document record i d
	* @return the document record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord removeByRecordName(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence().removeByRecordName(DocumentRecordID);
	}

	/**
	* Removes all the document records where SubjectID = &#63; from the database.
	*
	* @param SubjectID the subject i d
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySubjectID(java.lang.String SubjectID)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySubjectID(SubjectID);
	}

	/**
	* Removes all the document records where UserID = &#63; from the database.
	*
	* @param UserID the user i d
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserID(long UserID)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserID(UserID);
	}

	/**
	* Removes the document record where RecordName = &#63; and UserID = &#63; and SubjectID = &#63; and FileTreePath = &#63; from the database.
	*
	* @param RecordName the record name
	* @param UserID the user i d
	* @param SubjectID the subject i d
	* @param FileTreePath the file tree path
	* @return the document record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord removeByRecordProperties(
		java.lang.String RecordName, long UserID, java.lang.String SubjectID,
		java.lang.String FileTreePath)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getPersistence()
				   .removeByRecordProperties(RecordName, UserID, SubjectID,
			FileTreePath);
	}

	/**
	* Removes all the document records from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of document records where OriginalFormat = &#63;.
	*
	* @param OriginalFormat the original format
	* @return the number of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByOriginalFormat(java.lang.String OriginalFormat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByOriginalFormat(OriginalFormat);
	}

	/**
	* Returns the number of document records where DocumentRecordID = &#63;.
	*
	* @param DocumentRecordID the document record i d
	* @return the number of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRecordName(long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRecordName(DocumentRecordID);
	}

	/**
	* Returns the number of document records where SubjectID = &#63;.
	*
	* @param SubjectID the subject i d
	* @return the number of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySubjectID(java.lang.String SubjectID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySubjectID(SubjectID);
	}

	/**
	* Returns the number of document records where UserID = &#63;.
	*
	* @param UserID the user i d
	* @return the number of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserID(long UserID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserID(UserID);
	}

	/**
	* Returns the number of document records where RecordName = &#63; and UserID = &#63; and SubjectID = &#63; and FileTreePath = &#63;.
	*
	* @param RecordName the record name
	* @param UserID the user i d
	* @param SubjectID the subject i d
	* @param FileTreePath the file tree path
	* @return the number of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRecordProperties(java.lang.String RecordName,
		long UserID, java.lang.String SubjectID, java.lang.String FileTreePath)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByRecordProperties(RecordName, UserID, SubjectID,
			FileTreePath);
	}

	/**
	* Returns the number of document records.
	*
	* @return the number of document records
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DocumentRecordPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DocumentRecordPersistence)PortletBeanLocatorUtil.locate(edu.jhu.cvrg.waveform.main.dbpersistence.service.ClpSerializer.getServletContextName(),
					DocumentRecordPersistence.class.getName());

			ReferenceRegistry.registerReference(DocumentRecordUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(DocumentRecordPersistence persistence) {
	}

	private static DocumentRecordPersistence _persistence;
}