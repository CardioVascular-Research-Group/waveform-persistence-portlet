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

package edu.jhu.cvrg.waveform.main.dbpersistence.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Coordinate}.
 * </p>
 *
 * @author    bbenite1
 * @see       Coordinate
 * @generated
 */
public class CoordinateWrapper implements Coordinate, ModelWrapper<Coordinate> {
	public CoordinateWrapper(Coordinate coordinate) {
		_coordinate = coordinate;
	}

	public Class<?> getModelClass() {
		return Coordinate.class;
	}

	public String getModelClassName() {
		return Coordinate.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CoordinateID", getCoordinateID());
		attributes.put("xCoordinate", getXCoordinate());
		attributes.put("yCoordinate", getYCoordinate());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long CoordinateID = (Long)attributes.get("CoordinateID");

		if (CoordinateID != null) {
			setCoordinateID(CoordinateID);
		}

		Double xCoordinate = (Double)attributes.get("xCoordinate");

		if (xCoordinate != null) {
			setXCoordinate(xCoordinate);
		}

		Double yCoordinate = (Double)attributes.get("yCoordinate");

		if (yCoordinate != null) {
			setYCoordinate(yCoordinate);
		}
	}

	/**
	* Returns the primary key of this coordinate.
	*
	* @return the primary key of this coordinate
	*/
	public long getPrimaryKey() {
		return _coordinate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this coordinate.
	*
	* @param primaryKey the primary key of this coordinate
	*/
	public void setPrimaryKey(long primaryKey) {
		_coordinate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the coordinate i d of this coordinate.
	*
	* @return the coordinate i d of this coordinate
	*/
	public long getCoordinateID() {
		return _coordinate.getCoordinateID();
	}

	/**
	* Sets the coordinate i d of this coordinate.
	*
	* @param CoordinateID the coordinate i d of this coordinate
	*/
	public void setCoordinateID(long CoordinateID) {
		_coordinate.setCoordinateID(CoordinateID);
	}

	/**
	* Returns the x coordinate of this coordinate.
	*
	* @return the x coordinate of this coordinate
	*/
	public double getXCoordinate() {
		return _coordinate.getXCoordinate();
	}

	/**
	* Sets the x coordinate of this coordinate.
	*
	* @param xCoordinate the x coordinate of this coordinate
	*/
	public void setXCoordinate(double xCoordinate) {
		_coordinate.setXCoordinate(xCoordinate);
	}

	/**
	* Returns the y coordinate of this coordinate.
	*
	* @return the y coordinate of this coordinate
	*/
	public double getYCoordinate() {
		return _coordinate.getYCoordinate();
	}

	/**
	* Sets the y coordinate of this coordinate.
	*
	* @param yCoordinate the y coordinate of this coordinate
	*/
	public void setYCoordinate(double yCoordinate) {
		_coordinate.setYCoordinate(yCoordinate);
	}

	public boolean isNew() {
		return _coordinate.isNew();
	}

	public void setNew(boolean n) {
		_coordinate.setNew(n);
	}

	public boolean isCachedModel() {
		return _coordinate.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_coordinate.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _coordinate.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _coordinate.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_coordinate.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _coordinate.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_coordinate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CoordinateWrapper((Coordinate)_coordinate.clone());
	}

	public int compareTo(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate coordinate) {
		return _coordinate.compareTo(coordinate);
	}

	@Override
	public int hashCode() {
		return _coordinate.hashCode();
	}

	public com.liferay.portal.model.CacheModel<edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate> toCacheModel() {
		return _coordinate.toCacheModel();
	}

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate toEscapedModel() {
		return new CoordinateWrapper(_coordinate.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _coordinate.toString();
	}

	public java.lang.String toXmlString() {
		return _coordinate.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_coordinate.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Coordinate getWrappedCoordinate() {
		return _coordinate;
	}

	public Coordinate getWrappedModel() {
		return _coordinate;
	}

	public void resetOriginalValues() {
		_coordinate.resetOriginalValues();
	}

	private Coordinate _coordinate;
}