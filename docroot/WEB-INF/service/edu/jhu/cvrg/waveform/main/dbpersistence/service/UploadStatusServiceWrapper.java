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
 * This class is a wrapper for {@link UploadStatusService}.
 * </p>
 *
 * @author    bbenite1
 * @see       UploadStatusService
 * @generated
 */
public class UploadStatusServiceWrapper implements UploadStatusService,
	ServiceWrapper<UploadStatusService> {
	public UploadStatusServiceWrapper(UploadStatusService uploadStatusService) {
		_uploadStatusService = uploadStatusService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _uploadStatusService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_uploadStatusService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _uploadStatusService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public UploadStatusService getWrappedUploadStatusService() {
		return _uploadStatusService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedUploadStatusService(
		UploadStatusService uploadStatusService) {
		_uploadStatusService = uploadStatusService;
	}

	public UploadStatusService getWrappedService() {
		return _uploadStatusService;
	}

	public void setWrappedService(UploadStatusService uploadStatusService) {
		_uploadStatusService = uploadStatusService;
	}

	private UploadStatusService _uploadStatusService;
}