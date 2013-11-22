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
import com.liferay.portal.service.ServiceContext;

import edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoLocalServiceUtil;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.base.FilesInfoServiceBaseImpl;

/**
 * The implementation of the files info remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author bbenite1
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.FilesInfoServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoServiceUtil
 */
public class FilesInfoServiceImpl extends FilesInfoServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoServiceUtil} to access the files info remote service.
	 */
	public FilesInfo addFilesInfo(long liferayUserId, long liferayGroupId, long liferayCompanyId, String documentID, String fileListID, ServiceContext serviceContext) throws SystemException, PortalException {
		// TODO:  Add permissions check in Liferay for security.  Implement security classes to utilize Liferay Security (BB)

		return FilesInfoLocalServiceUtil.addFilesInfo(liferayUserId, liferayGroupId, liferayCompanyId, documentID, fileListID);
	}
	
	public FilesInfo deleteFilesInfo(String docID) throws SystemException, PortalException {
		return FilesInfoLocalServiceUtil.deleteFilesInfo(docID);
	}
	
	public FilesInfo getFile(String documentID) throws NoSuchFilesInfoException, SystemException {
		return FilesInfoLocalServiceUtil.getFile(documentID);
	}
	
	public List<FilesInfo> getFiles(String fileID) throws SystemException {
		return FilesInfoLocalServiceUtil.getFiles(fileID);
	}
	
	public List<FilesInfo> getFiles(String fileID, int start, int end) throws SystemException {
		return FilesInfoLocalServiceUtil.getFiles(fileID, start, end);
	}
}