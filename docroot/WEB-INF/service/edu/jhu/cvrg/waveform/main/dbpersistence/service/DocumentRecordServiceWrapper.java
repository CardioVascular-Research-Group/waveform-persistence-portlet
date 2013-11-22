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
 * This class is a wrapper for {@link DocumentRecordService}.
 * </p>
 *
 * @author    bbenite1
 * @see       DocumentRecordService
 * @generated
 */
public class DocumentRecordServiceWrapper implements DocumentRecordService,
	ServiceWrapper<DocumentRecordService> {
	public DocumentRecordServiceWrapper(
		DocumentRecordService documentRecordService) {
		_documentRecordService = documentRecordService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _documentRecordService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_documentRecordService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _documentRecordService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord addDocumentRecord(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		java.lang.String screenName, java.lang.String recordName,
		java.lang.String subjectID, java.lang.String originalFormat,
		double samplingRate, java.lang.String fileTreePath, int leadCount,
		int numPoints, java.util.Date dateUploaded, int age,
		java.lang.String gender, java.util.Date dateRecorded, double aduGain)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordService.addDocumentRecord(liferayUserId,
			liferayGroupId, liferayCompanyId, screenName, recordName,
			subjectID, originalFormat, samplingRate, fileTreePath, leadCount,
			numPoints, dateUploaded, age, gender, dateRecorded, aduGain);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord deleteDocumentRecord(
		java.lang.String recordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordService.deleteDocumentRecord(recordID);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord deleteDocumentRecord(
		java.lang.String recordName, java.lang.String username,
		java.lang.String subjectID, java.lang.String fileTreePath)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return _documentRecordService.deleteDocumentRecord(recordName,
			username, subjectID, fileTreePath);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByFileFormat(
		java.lang.String originalFormat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordService.getByFileFormat(originalFormat);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByFileFormat(
		java.lang.String originalFormat, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordService.getByFileFormat(originalFormat, start, end);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getBySubjectID(
		java.lang.String subjectID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordService.getBySubjectID(subjectID);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getBySubjectID(
		java.lang.String subjectID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordService.getBySubjectID(subjectID, start, end);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByScreenName(
		java.lang.String username)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordService.getByScreenName(username);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByScreenName(
		java.lang.String username, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentRecordService.getByScreenName(username, start, end);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord getRecord(
		java.lang.String recordName, java.lang.String username,
		java.lang.String subjectID, java.lang.String fileTreePath)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return _documentRecordService.getRecord(recordName, username,
			subjectID, fileTreePath);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord updateDocumentRecord(
		java.lang.String recordID, java.lang.String screenName,
		java.lang.String recordName, java.lang.String subjectID,
		java.lang.String originalFormat, double samplingRate,
		java.lang.String fileTreePath, int leadCount, int numPoints,
		java.util.Date dateUploaded, int age, java.lang.String gender,
		java.util.Date dateRecorded, double aduGain)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return _documentRecordService.updateDocumentRecord(recordID,
			screenName, recordName, subjectID, originalFormat, samplingRate,
			fileTreePath, leadCount, numPoints, dateUploaded, age, gender,
			dateRecorded, aduGain);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DocumentRecordService getWrappedDocumentRecordService() {
		return _documentRecordService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDocumentRecordService(
		DocumentRecordService documentRecordService) {
		_documentRecordService = documentRecordService;
	}

	public DocumentRecordService getWrappedService() {
		return _documentRecordService;
	}

	public void setWrappedService(DocumentRecordService documentRecordService) {
		_documentRecordService = documentRecordService;
	}

	private DocumentRecordService _documentRecordService;
}