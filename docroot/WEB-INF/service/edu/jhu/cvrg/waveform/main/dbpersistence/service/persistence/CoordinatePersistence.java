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

import com.liferay.portal.service.persistence.BasePersistence;

import edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate;

/**
 * The persistence interface for the coordinate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see CoordinatePersistenceImpl
 * @see CoordinateUtil
 * @generated
 */
public interface CoordinatePersistence extends BasePersistence<Coordinate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CoordinateUtil} to access the coordinate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the coordinate in the entity cache if it is enabled.
	*
	* @param coordinate the coordinate
	*/
	public void cacheResult(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate coordinate);

	/**
	* Caches the coordinates in the entity cache if it is enabled.
	*
	* @param coordinates the coordinates
	*/
	public void cacheResult(
		java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate> coordinates);

	/**
	* Creates a new coordinate with the primary key. Does not add the coordinate to the database.
	*
	* @param CoordinateID the primary key for the new coordinate
	* @return the new coordinate
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate create(
		long CoordinateID);

	/**
	* Removes the coordinate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CoordinateID the primary key of the coordinate
	* @return the coordinate that was removed
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException if a coordinate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate remove(
		long CoordinateID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException;

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate coordinate,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the coordinate with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException} if it could not be found.
	*
	* @param CoordinateID the primary key of the coordinate
	* @return the coordinate
	* @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException if a coordinate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate findByPrimaryKey(
		long CoordinateID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException;

	/**
	* Returns the coordinate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CoordinateID the primary key of the coordinate
	* @return the coordinate, or <code>null</code> if a coordinate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate fetchByPrimaryKey(
		long CoordinateID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the coordinates.
	*
	* @return the coordinates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the coordinates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of coordinates.
	*
	* @return the number of coordinates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}