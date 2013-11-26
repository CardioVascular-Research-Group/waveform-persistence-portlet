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
 * This class is a wrapper for {@link FilesInfoService}.
 * </p>
 *
 * @author    bbenite1
 * @see       FilesInfoService
 * @generated
 */
public class FilesInfoServiceWrapper implements FilesInfoService,
	ServiceWrapper<FilesInfoService> {
	public FilesInfoServiceWrapper(FilesInfoService filesInfoService) {
		_filesInfoService = filesInfoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _filesInfoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_filesInfoService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _filesInfoService.invokeMethod(name, parameterTypes, arguments);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo addFilesInfo(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		long documentID, long fileListID,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _filesInfoService.addFilesInfo(liferayUserId, liferayGroupId,
			liferayCompanyId, documentID, fileListID, serviceContext);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo deleteFilesInfo(
		long docID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _filesInfoService.deleteFilesInfo(docID);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo getFile(
		long fileID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException {
		return _filesInfoService.getFile(fileID);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> getFiles(
		long recordID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _filesInfoService.getFiles(recordID);
	}

	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> getFiles(
		long recordID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _filesInfoService.getFiles(recordID, start, end);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public FilesInfoService getWrappedFilesInfoService() {
		return _filesInfoService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedFilesInfoService(FilesInfoService filesInfoService) {
		_filesInfoService = filesInfoService;
	}

	public FilesInfoService getWrappedService() {
		return _filesInfoService;
	}

	public void setWrappedService(FilesInfoService filesInfoService) {
		_filesInfoService = filesInfoService;
	}

	private FilesInfoService _filesInfoService;
}