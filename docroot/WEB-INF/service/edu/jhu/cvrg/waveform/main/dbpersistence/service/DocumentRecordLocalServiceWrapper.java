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
 * This class is a wrapper for {@link DocumentRecordLocalService}.
 * </p>
 *
 * @author    bbenite1
 * @see       DocumentRecordLocalService
 * @generated
 */
public class DocumentRecordLocalServiceWrapper
	implements DocumentRecordLocalService,
		ServiceWrapper<DocumentRecordLocalService> {
	public DocumentRecordLocalServiceWrapper(
		DocumentRecordLocalService documentRecordLocalService) {
		_documentRecordLocalService = documentRecordLocalService;
	}

	/**
	* Adds the document record to the database. Also notifies the appropriate model listeners.
	*
	* @param documentRecord the document record
	* @return the document record that was added
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord addDocumentRecord(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.addDocumentRecord(documentRecord);
	}

	/**
	* Creates a new document record with the primary key. Does not add the document record to the database.
	*
	* @param DocumentRecordID the primary key for the new document record
	* @return the new document record
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord createDocumentRecord(
		long DocumentRecordID) {
		return _documentRecordLocalService.createDocumentRecord(DocumentRecordID);
	}

	/**
	* Deletes the document record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param DocumentRecordID the primary key of the document record
	* @return the document record that was removed
	* @throws PortalException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord deleteDocumentRecord(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.deleteDocumentRecord(DocumentRecordID);
	}

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
			com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.deleteDocumentRecord(documentRecord);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _documentRecordLocalService.dynamicQuery();
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
		return _documentRecordLocalService.dynamicQuery(dynamicQuery);
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
		return _documentRecordLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _documentRecordLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _documentRecordLocalService.dynamicQueryCount(dynamicQuery);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchDocumentRecord(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.fetchDocumentRecord(DocumentRecordID);
	}

	/**
	* Returns the document record with the primary key.
	*
	* @param DocumentRecordID the primary key of the document record
	* @return the document record
	* @throws PortalException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord getDocumentRecord(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.getDocumentRecord(DocumentRecordID);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getDocumentRecords(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.getDocumentRecords(start, end);
	}

	/**
	* Returns the number of document records.
	*
	* @return the number of document records
	* @throws SystemException if a system exception occurred
	*/
	public int getDocumentRecordsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.getDocumentRecordsCount();
	}

	/**
	* Updates the document record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param documentRecord the document record
	* @return the document record that was updated
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord updateDocumentRecord(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.updateDocumentRecord(documentRecord);
	}

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
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.updateDocumentRecord(documentRecord,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _documentRecordLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_documentRecordLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _documentRecordLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord addDocumentRecord(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		java.lang.String recordName, java.lang.String subjectID,
		java.lang.String originalFormat, double samplingRate,
		java.lang.String fileTreePath, int leadCount, int numPoints,
		java.util.Date dateUploaded, int age, java.lang.String gender,
		java.util.Date dateRecorded, double aduGain)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.addDocumentRecord(liferayUserId,
			liferayGroupId, liferayCompanyId, recordName, subjectID,
			originalFormat, samplingRate, fileTreePath, leadCount, numPoints,
			dateUploaded, age, gender, dateRecorded, aduGain);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord deleteDocumentRecord(
		java.lang.String recordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.deleteDocumentRecord(recordID);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord deleteDocumentRecord(
		java.lang.String recordName, long userID, java.lang.String subjectID,
		java.lang.String fileTreePath)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return _documentRecordLocalService.deleteDocumentRecord(recordName,
			userID, subjectID, fileTreePath);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByFileFormat(
		java.lang.String originalFormat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.getByFileFormat(originalFormat);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByFileFormat(
		java.lang.String originalFormat, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.getByFileFormat(originalFormat,
			start, end);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getBySubjectID(
		java.lang.String subjectID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.getBySubjectID(subjectID);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getBySubjectID(
		java.lang.String subjectID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.getBySubjectID(subjectID, start, end);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByScreenName(
		long userID) throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.getByScreenName(userID);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByScreenName(
		long userID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordLocalService.getByScreenName(userID, start, end);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord getRecord(
		java.lang.String recordName, long userID, java.lang.String subjectID,
		java.lang.String fileTreePath)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return _documentRecordLocalService.getRecord(recordName, userID,
			subjectID, fileTreePath);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord updateDocumentRecord(
		long recordID, long userID, java.lang.String recordName,
		java.lang.String subjectID, java.lang.String originalFormat,
		double samplingRate, java.lang.String fileTreePath, int leadCount,
		int numPoints, java.util.Date dateUploaded, int age,
		java.lang.String gender, java.util.Date dateRecorded, double aduGain)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return _documentRecordLocalService.updateDocumentRecord(recordID,
			userID, recordName, subjectID, originalFormat, samplingRate,
			fileTreePath, leadCount, numPoints, dateUploaded, age, gender,
			dateRecorded, aduGain);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DocumentRecordLocalService getWrappedDocumentRecordLocalService() {
		return _documentRecordLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDocumentRecordLocalService(
		DocumentRecordLocalService documentRecordLocalService) {
		_documentRecordLocalService = documentRecordLocalService;
	}

	public DocumentRecordLocalService getWrappedService() {
		return _documentRecordLocalService;
	}

	public void setWrappedService(
		DocumentRecordLocalService documentRecordLocalService) {
		_documentRecordLocalService = documentRecordLocalService;
	}

	private DocumentRecordLocalService _documentRecordLocalService;
}