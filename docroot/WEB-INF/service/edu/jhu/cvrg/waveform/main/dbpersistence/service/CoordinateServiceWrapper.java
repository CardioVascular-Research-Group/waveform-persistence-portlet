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
 * This class is a wrapper for {@link CoordinateService}.
 * </p>
 *
 * @author    bbenite1
 * @see       CoordinateService
 * @generated
 */
public class CoordinateServiceWrapper implements CoordinateService,
	ServiceWrapper<CoordinateService> {
	public CoordinateServiceWrapper(CoordinateService coordinateService) {
		_coordinateService = coordinateService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _coordinateService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_coordinateService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _coordinateService.invokeMethod(name, parameterTypes, arguments);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate addCoordinate(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		double xCoord, double yCoord)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _coordinateService.addCoordinate(liferayUserId, liferayGroupId,
			liferayCompanyId, xCoord, yCoord);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate deleteCoordinate(
		long coordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _coordinateService.deleteCoordinate(coordID);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate getCoordinate(
		long coordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _coordinateService.getCoordinate(coordID);
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate updateCoordinate(
		long coordID, double xCoord, double yCoord)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _coordinateService.updateCoordinate(coordID, xCoord, yCoord);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public CoordinateService getWrappedCoordinateService() {
		return _coordinateService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedCoordinateService(CoordinateService coordinateService) {
		_coordinateService = coordinateService;
	}

	public CoordinateService getWrappedService() {
		return _coordinateService;
	}

	public void setWrappedService(CoordinateService coordinateService) {
		_coordinateService = coordinateService;
	}

	private CoordinateService _coordinateService;
}