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

package edu.jhu.cvrg.waveform.main.dbpersistence.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate;

import java.util.List;

/**
 * The persistence utility for the coordinate service. This utility wraps {@link CoordinatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see CoordinatePersistence
 * @see CoordinatePersistenceImpl
 * @generated
 */
public class CoordinateUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Coordinate coordinate) {
		getPersistence().clearCache(coordinate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Coordinate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Coordinate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Coordinate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Coordinate update(Coordinate coordinate, boolean merge)
		throws SystemException {
		return getPersistence().update(coordinate, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Coordinate update(Coordinate coordinate, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(coordinate, merge, serviceContext);
	}

	/**
	* Caches the coordinate in the entity cache if it is enabled.
	*
	* @param coordinate the coordinate
	*/
	public static void cacheResult(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate coordinate) {
		getPersistence().cacheResult(coordinate);
	}

	/**
	* Caches the coordinates in the entity cache if it is enabled.
	*
	* @param coordinates the coordinates
	*/
	public static void cacheResult(
		java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate> coordinates) {
		getPersistence().cacheResult(coordinates);
	}

	/**
	* Creates a new coordinate with the primary key. Does not add the coordinate to the database.
	*
	* @param CoordinateID the primary key for the new coordinate
	* @return the new coordinate
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate create(
		long CoordinateID) {
		return getPersistence().create(CoordinateID);
	}

	/**
	* Removes the coordinate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CoordinateID the primary key of the coordinate
	* @return the coordinate that was removed
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException if a coordinate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate remove(
		long CoordinateID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException {
		return getPersistence().remove(CoordinateID);
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate coordinate,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(coordinate, merge);
	}

	/**
	* Returns the coordinate with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException} if it could not be found.
	*
	* @param CoordinateID the primary key of the coordinate
	* @return the coordinate
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException if a coordinate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate findByPrimaryKey(
		long CoordinateID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException {
		return getPersistence().findByPrimaryKey(CoordinateID);
	}

	/**
	* Returns the coordinate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CoordinateID the primary key of the coordinate
	* @return the coordinate, or <code>null</code> if a coordinate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate fetchByPrimaryKey(
		long CoordinateID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(CoordinateID);
	}

	/**
	* Returns all the coordinates.
	*
	* @return the coordinates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the coordinates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of coordinates
	* @param end the upper bound of the range of coordinates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of coordinates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the coordinates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of coordinates.
	*
	* @return the number of coordinates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CoordinatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CoordinatePersistence)PortletBeanLocatorUtil.locate(edu.jhu.cvrg.waveform.main.dbpersistence.service.ClpSerializer.getServletContextName(),
					CoordinatePersistence.class.getName());

			ReferenceRegistry.registerReference(CoordinateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(CoordinatePersistence persistence) {
	}

	private static CoordinatePersistence _persistence;
}