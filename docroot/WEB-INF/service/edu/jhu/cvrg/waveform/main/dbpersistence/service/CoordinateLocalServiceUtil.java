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
 * The utility for the coordinate local service. This utility wraps {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.CoordinateLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author bbenite1
 * @see CoordinateLocalService
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.CoordinateLocalServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.CoordinateLocalServiceImpl
 * @generated
 */
public class CoordinateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.CoordinateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the coordinate to the database. Also notifies the appropriate model listeners.
	*
	* @param coordinate the coordinate
	* @return the coordinate that was added
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate addCoordinate(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate coordinate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCoordinate(coordinate);
	}

	/**
	* Creates a new coordinate with the primary key. Does not add the coordinate to the database.
	*
	* @param CoordinateID the primary key for the new coordinate
	* @return the new coordinate
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate createCoordinate(
		java.lang.String CoordinateID) {
		return getService().createCoordinate(CoordinateID);
	}

	/**
	* Deletes the coordinate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CoordinateID the primary key of the coordinate
	* @return the coordinate that was removed
	* @throws PortalException if a coordinate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate deleteCoordinate(
		java.lang.String CoordinateID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCoordinate(CoordinateID);
	}

	/**
	* Deletes the coordinate from the database. Also notifies the appropriate model listeners.
	*
	* @param coordinate the coordinate
	* @return the coordinate that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate deleteCoordinate(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate coordinate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCoordinate(coordinate);
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

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate fetchCoordinate(
		java.lang.String CoordinateID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCoordinate(CoordinateID);
	}

	/**
	* Returns the coordinate with the primary key.
	*
	* @param CoordinateID the primary key of the coordinate
	* @return the coordinate
	* @throws PortalException if a coordinate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate getCoordinate(
		java.lang.String CoordinateID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCoordinate(CoordinateID);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the coordinates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of coordinates
	* @param end the upper bound of the range of coordinates (not inclusive)
	* @return the range of coordinates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate> getCoordinates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCoordinates(start, end);
	}

	/**
	* Returns the number of coordinates.
	*
	* @return the number of coordinates
	* @throws SystemException if a system exception occurred
	*/
	public static int getCoordinatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCoordinatesCount();
	}

	/**
	* Updates the coordinate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param coordinate the coordinate
	* @return the coordinate that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate updateCoordinate(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate coordinate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCoordinate(coordinate);
	}

	/**
	* Updates the coordinate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param coordinate the coordinate
	* @param merge whether to merge the coordinate with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the coordinate that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate updateCoordinate(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate coordinate,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCoordinate(coordinate, merge);
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

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate addCoordinate(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		java.lang.String coordID, double xCoord, double yCoord)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCoordinate(liferayUserId, liferayGroupId,
			liferayCompanyId, coordID, xCoord, yCoord);
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

	public static CoordinateLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CoordinateLocalService.class.getName());

			if (invokableLocalService instanceof CoordinateLocalService) {
				_service = (CoordinateLocalService)invokableLocalService;
			}
			else {
				_service = new CoordinateLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CoordinateLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(CoordinateLocalService service) {
	}

	private static CoordinateLocalService _service;
}