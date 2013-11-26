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
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the document record local service. This utility wraps {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.DocumentRecordLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author bbenite1
 * @see DocumentRecordLocalService
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.DocumentRecordLocalServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.DocumentRecordLocalServiceImpl
 * @generated
 */
public class DocumentRecordLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.DocumentRecordLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the document record to the database. Also notifies the appropriate model listeners.
	*
	* @param documentRecord the document record
	* @return the document record that was added
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord addDocumentRecord(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDocumentRecord(documentRecord);
	}

	/**
	* Creates a new document record with the primary key. Does not add the document record to the database.
	*
	* @param DocumentRecordID the primary key for the new document record
	* @return the new document record
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord createDocumentRecord(
		long DocumentRecordID) {
		return getService().createDocumentRecord(DocumentRecordID);
	}

	/**
	* Deletes the document record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param DocumentRecordID the primary key of the document record
	* @return the document record that was removed
	* @throws PortalException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord deleteDocumentRecord(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDocumentRecord(DocumentRecordID);
	}

	/**
	* Deletes the document record from the database. Also notifies the appropriate model listeners.
	*
	* @param documentRecord the document record
	* @return the document record that was removed
	* @throws PortalException
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord deleteDocumentRecord(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDocumentRecord(documentRecord);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord fetchDocumentRecord(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDocumentRecord(DocumentRecordID);
	}

	/**
	* Returns the document record with the primary key.
	*
	* @param DocumentRecordID the primary key of the document record
	* @return the document record
	* @throws PortalException if a document record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord getDocumentRecord(
		long DocumentRecordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocumentRecord(DocumentRecordID);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> getDocumentRecords(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocumentRecords(start, end);
	}

	/**
	* Returns the number of document records.
	*
	* @return the number of document records
	* @throws SystemException if a system exception occurred
	*/
	public static int getDocumentRecordsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocumentRecordsCount();
	}

	/**
	* Updates the document record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param documentRecord the document record
	* @return the document record that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord updateDocumentRecord(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDocumentRecord(documentRecord);
	}

	/**
	* Updates the document record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param documentRecord the document record
	* @param merge whether to merge the document record with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the document record that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord updateDocumentRecord(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDocumentRecord(documentRecord, merge);
	}

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
		java.lang.String recordName, long userID, java.lang.String subjectID,
		java.lang.String fileTreePath)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException {
		return getService()
				   .deleteDocumentRecord(recordName, userID, subjectID,
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
		long recordID, long userID, java.lang.String recordName,
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

	public static DocumentRecordLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DocumentRecordLocalService.class.getName());

			if (invokableLocalService instanceof DocumentRecordLocalService) {
				_service = (DocumentRecordLocalService)invokableLocalService;
			}
			else {
				_service = new DocumentRecordLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DocumentRecordLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(DocumentRecordLocalService service) {
	}

	private static DocumentRecordLocalService _service;
}