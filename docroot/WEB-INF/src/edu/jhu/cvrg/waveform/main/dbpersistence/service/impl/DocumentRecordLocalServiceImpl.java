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
import java.util.UUID;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.base.DocumentRecordLocalServiceBaseImpl;

/**
 * The implementation of the document record local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author bbenite1
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.DocumentRecordLocalServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordLocalServiceUtil
 */
public class DocumentRecordLocalServiceImpl
	extends DocumentRecordLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordLocalServiceUtil} to access the document record local service.
	 */
	public DocumentRecord addDocumentRecord(long liferayUserId, long liferayGroupId, long liferayCompanyId, String recordName, String subjectID, String originalFormat, double samplingRate, String fileTreePath, int leadCount, int numPoints, Date dateUploaded, int age, String gender, Date dateRecorded, double aduGain) throws SystemException, PortalException{
		
		long documentRecordID = CounterLocalServiceUtil.increment(DocumentRecord.class.getName());
		
		DocumentRecord docRecord = documentRecordPersistence.create(documentRecordID);
		
		docRecord.setUserID(liferayUserId);
		docRecord.setRecordName(recordName);
		docRecord.setSubjectID(subjectID);
		docRecord.setOriginalFormat(originalFormat);
		docRecord.setSamplingRate(samplingRate);
		docRecord.setFileTreePath(fileTreePath);
		docRecord.setLeadCount(leadCount);
		docRecord.setNumberOfPoints(numPoints);
		docRecord.setDateOfUpload(dateUploaded);
		docRecord.setDateOfRecording(dateRecorded);
		docRecord.setAge(age);
		docRecord.setGender(gender);
		docRecord.setAduGain(aduGain);
		
		super.addDocumentRecord(docRecord);
		
		resourceLocalService.addResources(liferayCompanyId, liferayGroupId, liferayUserId, DocumentRecord.class.getName(), docRecord.getDocumentRecordID(), false, true, true);
		
		return docRecord;
	}
	
	public DocumentRecord deleteDocumentRecord(DocumentRecord docRecord) throws SystemException, PortalException {
		// Note:  Since deletion of records is only performed during testing, performance isn't an issue and this code will suffice.  If we ever
		// allow users to remove records, redo the following code blocks to use a custom SQL query that will delete
		// all instances of the respective entities at once instead - BB 11/14/2013 
		
		// Delete file records first
		long recordID = docRecord.getPrimaryKey();
		
		List<FilesInfo> fInfoList = filesInfoPersistence.findByDocumentRecordID(recordID);
		
		for(FilesInfo filesInfo : fInfoList) {
			filesInfoLocalService.deleteFilesInfo(filesInfo);
		}
		
		// Now delete associated annotations
		List<AnnotationInfo> annInfoList = annotationInfoPersistence.findByDocumentRecordID(recordID);
		
		for(AnnotationInfo annInfo : annInfoList) {
			annotationInfoLocalService.deleteAnnotationInfo(annInfo);
		}
		
		
		return documentRecordPersistence.remove(docRecord);
	}
	
	public DocumentRecord deleteDocumentRecord(String recordID) throws SystemException, PortalException {
		DocumentRecord docRecord = documentRecordPersistence.fetchByPrimaryKey(recordID);
		
		return deleteDocumentRecord(docRecord);
	}	
	
	public DocumentRecord deleteDocumentRecord(String recordName, long userID, String subjectID, String fileTreePath) throws NoSuchDocumentRecordException, SystemException, PortalException {
		DocumentRecord docRecord = documentRecordPersistence.findByRecordProperties(recordName, userID, subjectID, fileTreePath);
		
		return deleteDocumentRecord(docRecord);
	}
	
	public List<DocumentRecord> getByFileFormat(String originalFormat) throws SystemException {
		return documentRecordPersistence.findByOriginalFormat(originalFormat);
	}
	
	public List<DocumentRecord> getByFileFormat(String originalFormat, int start, int end) throws SystemException {
		return documentRecordPersistence.findByOriginalFormat(originalFormat, start, end);
	}
	
	public List<DocumentRecord> getBySubjectID(String subjectID) throws SystemException {
		return documentRecordPersistence.findBySubjectID(subjectID);
	}
	
	public List<DocumentRecord> getBySubjectID(String subjectID, int start, int end) throws SystemException {
		return documentRecordPersistence.findBySubjectID(subjectID, start, end);
	}
	
	public List<DocumentRecord> getByScreenName(long userID) throws SystemException {
		return documentRecordPersistence.findByUserID(userID);
	}
	
	public List<DocumentRecord> getByScreenName(long userID, int start, int end) throws SystemException {
		return documentRecordPersistence.findByUserID(userID, start, end);
	}
	
	public DocumentRecord getRecord(String recordName, long userID, String subjectID, String fileTreePath) throws NoSuchDocumentRecordException, SystemException {
		return documentRecordPersistence.findByRecordProperties(recordName, userID, subjectID, fileTreePath);
	}
	
	public DocumentRecord updateDocumentRecord(long recordID, long userID, String recordName, String subjectID, String originalFormat, double samplingRate, String fileTreePath, int leadCount, int numPoints, Date dateUploaded, int age, String gender, Date dateRecorded, double aduGain) throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord docRecord = documentRecordPersistence.findByPrimaryKey(recordID);
		
		docRecord.setUserID(userID);
		docRecord.setSubjectID(subjectID);
		docRecord.setRecordName(recordName);
		docRecord.setOriginalFormat(originalFormat);
		docRecord.setSamplingRate(samplingRate);
		docRecord.setFileTreePath(fileTreePath);
		docRecord.setLeadCount(leadCount);
		docRecord.setNumberOfPoints(numPoints);
		docRecord.setAge(age);
		docRecord.setGender(gender);
		docRecord.setDateOfRecording(dateRecorded);
		docRecord.setDateOfUpload(dateUploaded);
		docRecord.setAduGain(aduGain);
		
		super.updateDocumentRecord(docRecord);
		
		return docRecord;
	}
}