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
 * The utility for the coordinate remote service. This utility wraps {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.CoordinateServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author bbenite1
 * @see CoordinateService
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.CoordinateServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.CoordinateServiceImpl
 * @generated
 */
public class CoordinateServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.CoordinateServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate addCoordinate(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		java.lang.String coordID, double xCoord, double yCoord)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCoordinate(liferayUserId, liferayGroupId,
			liferayCompanyId, coordID, xCoord, yCoord);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate deleteCoordinate(
		java.lang.String coordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCoordinate(coordID);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate getCoordinate(
		java.lang.String coordID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCoordinate(coordID);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate updateCoordinate(
		java.lang.String coordID, double xCoord, double yCoord)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCoordinate(coordID, xCoord, yCoord);
	}

	public static void clearService() {
		_service = null;
	}

	public static CoordinateService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CoordinateService.class.getName());

			if (invokableService instanceof CoordinateService) {
				_service = (CoordinateService)invokableService;
			}
			else {
				_service = new CoordinateServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(CoordinateServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(CoordinateService service) {
	}

	private static CoordinateService _service;
}