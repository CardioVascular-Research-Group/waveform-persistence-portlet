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
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * The interface for the document record remote service.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author bbenite1
 * @see DocumentRecordServiceUtil
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.DocumentRecordServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.DocumentRecordServiceImpl
 * @generated
 */
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DocumentRecordService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocumentRecordServiceUtil} to access the document record remote service. Add custom service methods to {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.DocumentRecordServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

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
		java.lang.String recordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord deleteDocumentRecord(
		java.lang.String recordName, long username, java.lang.String subjectID,
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