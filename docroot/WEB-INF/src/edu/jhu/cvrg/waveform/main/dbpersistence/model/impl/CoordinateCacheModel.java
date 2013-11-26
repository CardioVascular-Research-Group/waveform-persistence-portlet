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

package edu.jhu.cvrg.waveform.main.dbpersistence.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate;

import java.io.Serializable;

/**
 * The cache model class for representing Coordinate in entity cache.
 *
 * @author bbenite1
 * @see Coordinate
 * @generated
 */
public class CoordinateCacheModel implements CacheModel<Coordinate>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{CoordinateID=");
		sb.append(CoordinateID);
		sb.append(", xCoordinate=");
		sb.append(xCoordinate);
		sb.append(", yCoordinate=");
		sb.append(yCoordinate);
		sb.append("}");

		return sb.toString();
	}

	public Coordinate toEntityModel() {
		CoordinateImpl coordinateImpl = new CoordinateImpl();

		coordinateImpl.setCoordinateID(CoordinateID);
		coordinateImpl.setXCoordinate(xCoordinate);
		coordinateImpl.setYCoordinate(yCoordinate);

		coordinateImpl.resetOriginalValues();

		return coordinateImpl;
	}

	public long CoordinateID;
	public double xCoordinate;
	public double yCoordinate;
}