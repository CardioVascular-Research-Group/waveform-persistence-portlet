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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * The utility for the document record remote service. This utility wraps {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.DocumentRecordServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author bbenite1
 * @see DocumentRecordService
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.DocumentRecordServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.DocumentRecordServiceImpl
 * @generated
 */
public class DocumentRecordServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.DocumentRecordServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord addDocumentRecord(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		java.lang.String recordName, java.lang.String subjectID,
		java.lang.String originalFormat, double samplingRate,
		java.lang.String fileTreePath, int leadCount, int numPoints,
		java.util.Date dateUploaded, int age, java.lang.String gender,
		java.util.Date dateRecorded, double aduGain)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDocumentRecord(liferayUserId, liferayGroupId,
			liferayCompanyId, recordName, subjectID, originalFormat,
			samplingRate, fileTreePath, leadCount, numPoints, dateUploaded,
			age, gender, dateRecorded, aduGain);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord deleteDocumentRecord(
		java.lang.String recordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDocumentRecord(recordID);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord deleteDocumentRecord(
		java.lang.String recordName, long username, java.lang.String subjectID,
		java.lang.String fileTreePath)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getService()
				   .deleteDocumentRecord(recordName, username, subjectID,
			fileTreePath);
	}

	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByFileFormat(
		java.lang.String originalFormat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByFileFormat(originalFormat);
	}

	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByFileFormat(
		java.lang.String originalFormat, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByFileFormat(originalFormat, start, end);
	}

	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getBySubjectID(
		java.lang.String subjectID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBySubjectID(subjectID);
	}

	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getBySubjectID(
		java.lang.String subjectID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBySubjectID(subjectID, start, end);
	}

	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByScreenName(
		long userID) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByScreenName(userID);
	}

	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getByScreenName(
		long userID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByScreenName(userID, start, end);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord getRecord(
		java.lang.String recordName, long userID, java.lang.String subjectID,
		java.lang.String fileTreePath)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getService()
				   .getRecord(recordName, userID, subjectID, fileTreePath);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord updateDocumentRecord(
		java.lang.String recordID, long userID, java.lang.String recordName,
		java.lang.String subjectID, java.lang.String originalFormat,
		double samplingRate, java.lang.String fileTreePath, int leadCount,
		int numPoints, java.util.Date dateUploaded, int age,
		java.lang.String gender, java.util.Date dateRecorded, double aduGain)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getService()
				   .updateDocumentRecord(recordID, userID, recordName,
			subjectID, originalFormat, samplingRate, fileTreePath, leadCount,
			numPoints, dateUploaded, age, gender, dateRecorded, aduGain);
	}

	public static void clearService() {
		_service = null;
	}

	public static DocumentRecordService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DocumentRecordService.class.getName());

			if (invokableService instanceof DocumentRecordService) {
				_service = (DocumentRecordService)invokableService;
			}
			else {
				_service = new DocumentRecordServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(DocumentRecordServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(DocumentRecordService service) {
	}

	private static DocumentRecordService _service;
}