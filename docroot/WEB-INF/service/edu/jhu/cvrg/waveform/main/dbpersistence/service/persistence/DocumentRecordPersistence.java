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

import edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord;

/**
 * The persistence interface for the document record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see DocumentRecordPersistenceImpl
 * @see DocumentRecordUtil
 * @generated
 */
public interface DocumentRecordPersistence extends BasePersistence<DocumentRecord> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocumentRecordUtil} to access the document record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the document record in the entity cache if it is enabled.
	*
	* @param documentRecord the document record
	*/
	public void cacheResult(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord);

	/**
	* Caches the document records in the entity cache if it is enabled.
	*
	* @param documentRecords the document records
	*/
	public void cacheResult(
		java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> documentRecords);

	/**
	* Creates a new document record with the primary key. Does not add the document record to the database.
	*
	* @param RecordID the primary key for the new document record
	* @return the new document record
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord create(
		java.lang.String RecordID);

	/**
	* Removes the document record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param RecordID the primary key of the document record
	* @return the document record that was removed
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord remove(
		java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document record with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException} if it could not be found.
	*
	* @param RecordID the primary key of the document record
	* @return the document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByPrimaryKey(
		java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	/**
	* Returns the document record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param RecordID the primary key of the document record
	* @return the document record, or <code>null</code> if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByPrimaryKey(
		java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document records where OriginalFormat = &#63;.
	*
	* @param OriginalFormat the original format
	* @return the matching document records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findByOriginalFormat(
		java.lang.String OriginalFormat)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findByOriginalFormat(
		java.lang.String OriginalFormat, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findByOriginalFormat(
		java.lang.String OriginalFormat, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document record in the ordered set where OriginalFormat = &#63;.
	*
	* @param OriginalFormat the original format
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByOriginalFormat_First(
		java.lang.String OriginalFormat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	/**
	* Returns the first document record in the ordered set where OriginalFormat = &#63;.
	*
	* @param OriginalFormat the original format
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByOriginalFormat_First(
		java.lang.String OriginalFormat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document record in the ordered set where OriginalFormat = &#63;.
	*
	* @param OriginalFormat the original format
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByOriginalFormat_Last(
		java.lang.String OriginalFormat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	/**
	* Returns the last document record in the ordered set where OriginalFormat = &#63;.
	*
	* @param OriginalFormat the original format
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByOriginalFormat_Last(
		java.lang.String OriginalFormat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document records before and after the current document record in the ordered set where OriginalFormat = &#63;.
	*
	* @param RecordID the primary key of the current document record
	* @param OriginalFormat the original format
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord[] findByOriginalFormat_PrevAndNext(
		java.lang.String RecordID, java.lang.String OriginalFormat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	/**
	* Returns the document record where RecordID = &#63; or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException} if it could not be found.
	*
	* @param RecordID the record i d
	* @return the matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByGetRecordName(
		java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	/**
	* Returns the document record where RecordID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param RecordID the record i d
	* @return the matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByGetRecordName(
		java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document record where RecordID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param RecordID the record i d
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByGetRecordName(
		java.lang.String RecordID, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document records where SubjectID = &#63;.
	*
	* @param SubjectID the subject i d
	* @return the matching document records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findBySubjectID(
		java.lang.String SubjectID)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findBySubjectID(
		java.lang.String SubjectID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findBySubjectID(
		java.lang.String SubjectID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document record in the ordered set where SubjectID = &#63;.
	*
	* @param SubjectID the subject i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findBySubjectID_First(
		java.lang.String SubjectID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	/**
	* Returns the first document record in the ordered set where SubjectID = &#63;.
	*
	* @param SubjectID the subject i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchBySubjectID_First(
		java.lang.String SubjectID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document record in the ordered set where SubjectID = &#63;.
	*
	* @param SubjectID the subject i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findBySubjectID_Last(
		java.lang.String SubjectID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	/**
	* Returns the last document record in the ordered set where SubjectID = &#63;.
	*
	* @param SubjectID the subject i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchBySubjectID_Last(
		java.lang.String SubjectID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document records before and after the current document record in the ordered set where SubjectID = &#63;.
	*
	* @param RecordID the primary key of the current document record
	* @param SubjectID the subject i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord[] findBySubjectID_PrevAndNext(
		java.lang.String RecordID, java.lang.String SubjectID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	/**
	* Returns all the document records where UserID = &#63;.
	*
	* @param UserID the user i d
	* @return the matching document records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findByUserID(
		java.lang.String UserID)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findByUserID(
		java.lang.String UserID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findByUserID(
		java.lang.String UserID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document record in the ordered set where UserID = &#63;.
	*
	* @param UserID the user i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByUserID_First(
		java.lang.String UserID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	/**
	* Returns the first document record in the ordered set where UserID = &#63;.
	*
	* @param UserID the user i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByUserID_First(
		java.lang.String UserID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document record in the ordered set where UserID = &#63;.
	*
	* @param UserID the user i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByUserID_Last(
		java.lang.String UserID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	/**
	* Returns the last document record in the ordered set where UserID = &#63;.
	*
	* @param UserID the user i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document record, or <code>null</code> if a matching document record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByUserID_Last(
		java.lang.String UserID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document records before and after the current document record in the ordered set where UserID = &#63;.
	*
	* @param RecordID the primary key of the current document record
	* @param UserID the user i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document record
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord[] findByUserID_PrevAndNext(
		java.lang.String RecordID, java.lang.String UserID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

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
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord findByRecordProperties(
		java.lang.String RecordName, java.lang.String UserID,
		java.lang.String SubjectID, java.lang.String FileTreePath)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

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
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByRecordProperties(
		java.lang.String RecordName, java.lang.String UserID,
		java.lang.String SubjectID, java.lang.String FileTreePath)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchByRecordProperties(
		java.lang.String RecordName, java.lang.String UserID,
		java.lang.String SubjectID, java.lang.String FileTreePath,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document records.
	*
	* @return the document records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the document records where OriginalFormat = &#63; from the database.
	*
	* @param OriginalFormat the original format
	* @throws SystemException if a system exception occurred
	*/
	public void removeByOriginalFormat(java.lang.String OriginalFormat)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the document record where RecordID = &#63; from the database.
	*
	* @param RecordID the record i d
	* @return the document record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord removeByGetRecordName(
		java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	/**
	* Removes all the document records where SubjectID = &#63; from the database.
	*
	* @param SubjectID the subject i d
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySubjectID(java.lang.String SubjectID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the document records where UserID = &#63; from the database.
	*
	* @param UserID the user i d
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserID(java.lang.String UserID)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord removeByRecordProperties(
		java.lang.String RecordName, java.lang.String UserID,
		java.lang.String SubjectID, java.lang.String FileTreePath)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	/**
	* Removes all the document records from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document records where OriginalFormat = &#63;.
	*
	* @param OriginalFormat the original format
	* @return the number of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public int countByOriginalFormat(java.lang.String OriginalFormat)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document records where RecordID = &#63;.
	*
	* @param RecordID the record i d
	* @return the number of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public int countByGetRecordName(java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document records where SubjectID = &#63;.
	*
	* @param SubjectID the subject i d
	* @return the number of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public int countBySubjectID(java.lang.String SubjectID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document records where UserID = &#63;.
	*
	* @param UserID the user i d
	* @return the number of matching document records
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserID(java.lang.String UserID)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByRecordProperties(java.lang.String RecordName,
		java.lang.String UserID, java.lang.String SubjectID,
		java.lang.String FileTreePath)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document records.
	*
	* @return the number of document records
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}