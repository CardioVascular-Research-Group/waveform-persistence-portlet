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

package edu.jhu.cvrg.waveform.main.dbpersistence.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordLocalServiceUtil;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.base.DocumentRecordServiceBaseImpl;

/**
 * The implementation of the document record remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author bbenite1
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.DocumentRecordServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordServiceUtil
 */
public class DocumentRecordServiceImpl extends DocumentRecordServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordServiceUtil} to access the document record remote service.
	 */
	
	// TODO:  Implement Security checks for this service (BB)
	public DocumentRecord addDocumentRecord(long liferayUserId, long liferayGroupId, long liferayCompanyId, String recordName, String subjectID, String originalFormat, double samplingRate, String fileTreePath, int leadCount, int numPoints, Date dateUploaded, int age, String gender, Date dateRecorded, double aduGain) throws SystemException, PortalException{

		return DocumentRecordLocalServiceUtil.addDocumentRecord(liferayUserId, liferayGroupId, liferayCompanyId, recordName, subjectID, originalFormat, samplingRate, fileTreePath, leadCount, numPoints, dateUploaded, age, gender, dateRecorded, aduGain);
	}
	
	public DocumentRecord deleteDocumentRecord(String recordID) throws SystemException, PortalException {
				
		return DocumentRecordLocalServiceUtil.deleteDocumentRecord(recordID);
	}	
	
	public DocumentRecord deleteDocumentRecord(String recordName, long username, String subjectID, String fileTreePath) throws NoSuchDocumentRecordException, SystemException, PortalException {
				
		return DocumentRecordLocalServiceUtil.deleteDocumentRecord(recordName, username, subjectID, fileTreePath);
	}
	
	public List<DocumentRecord> getByFileFormat(String originalFormat) throws SystemException {
		return DocumentRecordLocalServiceUtil.getByFileFormat(originalFormat);
	}
	
	public List<DocumentRecord> getByFileFormat(String originalFormat, int start, int end) throws SystemException {
		return DocumentRecordLocalServiceUtil.getByFileFormat(originalFormat, start, end);
	}
	
	public List<DocumentRecord> getBySubjectID(String subjectID) throws SystemException {
		return DocumentRecordLocalServiceUtil.getBySubjectID(subjectID);
	}
	
	public List<DocumentRecord> getBySubjectID(String subjectID, int start, int end) throws SystemException {
		return DocumentRecordLocalServiceUtil.getBySubjectID(subjectID, start, end);
	}
	
	public List<DocumentRecord> getByScreenName(long userID) throws SystemException {
		return DocumentRecordLocalServiceUtil.getByScreenName(userID);
	}
	
	public List<DocumentRecord> getByScreenName(long userID, int start, int end) throws SystemException {
		return DocumentRecordLocalServiceUtil.getByScreenName(userID, start, end);
	}
	
	public DocumentRecord getRecord(String recordName, long userID, String subjectID, String fileTreePath) throws NoSuchDocumentRecordException, SystemException {
		return DocumentRecordLocalServiceUtil.getRecord(recordName, userID, subjectID, fileTreePath);
	}
	
	public DocumentRecord updateDocumentRecord(String recordID, long userID, String recordName, String subjectID, String originalFormat, double samplingRate, String fileTreePath, int leadCount, int numPoints, Date dateUploaded, int age, String gender, Date dateRecorded, double aduGain) throws NoSuchDocumentRecordException, SystemException {
		return DocumentRecordLocalServiceUtil.updateDocumentRecord(recordID, userID, recordName, subjectID, originalFormat, samplingRate, fileTreePath, leadCount, numPoints, dateUploaded, age, gender, dateRecorded, aduGain);
	}
}