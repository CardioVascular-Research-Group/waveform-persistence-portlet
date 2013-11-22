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

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.base.FilesInfoLocalServiceBaseImpl;

/**
 * The implementation of the files info local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author bbenite1
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.FilesInfoLocalServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoLocalServiceUtil
 */
public class FilesInfoLocalServiceImpl extends FilesInfoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoLocalServiceUtil} to access the files info local service.
	 */
	public FilesInfo addFilesInfo(long liferayUserId, long liferayGroupId, long liferayCompanyId, String documentID, String fileListID) throws SystemException, PortalException{

		FilesInfo file = filesInfoPersistence.create(documentID);
		
		file.setFileListID(fileListID);
		
		super.addFilesInfo(file);
		
		resourceLocalService.addResources(liferayCompanyId, liferayGroupId, liferayUserId, FilesInfo.class.getName(), file.getDocumentID(), false, true, true);
		
		return file;
	}
	
	public FilesInfo deleteFilesInfo(FilesInfo file) throws SystemException {
		return filesInfoPersistence.remove(file);
	}
	
	public FilesInfo deleteFilesInfo(String docID) throws NoSuchFilesInfoException, SystemException {
		return filesInfoPersistence.remove(docID);
	}
	
	public FilesInfo getFile(String documentID) throws NoSuchFilesInfoException, SystemException {
		return filesInfoPersistence.findByPrimaryKey(documentID);
	}
	
	public List<FilesInfo> getFiles(String fileID) throws SystemException {
		return filesInfoPersistence.findByFileListID(fileID);
	}
	
	public List<FilesInfo> getFiles(String fileID, int start, int end) throws SystemException {
		return filesInfoPersistence.findByFileListID(fileID, start, end);
	}
}