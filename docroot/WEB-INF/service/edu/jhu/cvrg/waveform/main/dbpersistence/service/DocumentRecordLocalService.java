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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the document record local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author bbenite1
 * @see DocumentRecordLocalServiceUtil
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.DocumentRecordLocalServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.DocumentRecordLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DocumentRecordLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocumentRecordLocalServiceUtil} to access the document record local service. Add custom service methods to {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.DocumentRecordLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the document record to the database. Also notifies the appropriate model listeners.
	*
	* @param documentRecord the document record
	* @return the document record that was added
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord addDocumentRecord(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new document record with the primary key. Does not add the document record to the database.
	*
	* @param RecordID the primary key for the new document record
	* @return the new document record
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord createDocumentRecord(
		java.lang.String RecordID);

	/**
	* Deletes the document record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param RecordID the primary key of the document record
	* @return the document record that was removed
	* @throws PortalException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord deleteDocumentRecord(
		java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the document record from the database. Also notifies the appropriate model listeners.
	*
	* @param documentRecord the document record
	* @return the document record that was removed
	* @throws PortalException
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord deleteDocumentRecord(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchDocumentRecord(
		java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document record with the primary key.
	*
	* @param RecordID the primary key of the document record
	* @return the document record
	* @throws PortalException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord getDocumentRecord(
		java.lang.String RecordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getDocumentRecords(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document records.
	*
	* @return the number of document records
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDocumentRecordsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the document record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param documentRecord the document record
	* @return the document record that was updated
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord updateDocumentRecord(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the document record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param documentRecord the document record
	* @param merge whether to merge the document record with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the document record that was updated
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord updateDocumentRecord(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord addDocumentRecord(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		java.lang.String recordName, java.lang.String subjectID,
		java.lang.String originalFormat, double samplingRate,
		java.lang.String fileTreePath, int leadCount, int numPoints,
		java.util.Date dateUploaded, int age, java.lang.String gender,
		java.util.Date dateRecorded, double aduGain)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord deleteDocumentRecord(
		java.lang.String recordName, long userID, java.lang.String subjectID,
		java.lang.String fileTreePath)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByFileFormat(
		java.lang.String originalFormat)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByFileFormat(
		java.lang.String originalFormat, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getBySubjectID(
		java.lang.String subjectID)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getBySubjectID(
		java.lang.String subjectID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByScreenName(
		long userID) throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByScreenName(
		long userID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord getRecord(
		java.lang.String recordName, long userID, java.lang.String subjectID,
		java.lang.String fileTreePath)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord updateDocumentRecord(
		java.lang.String recordID, long userID, java.lang.String recordName,
		java.lang.String subjectID, java.lang.String originalFormat,
		double samplingRate, java.lang.String fileTreePath, int leadCount,
		int numPoints, java.util.Date dateUploaded, int age,
		java.lang.String gender, java.util.Date dateRecorded, double aduGain)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;
}