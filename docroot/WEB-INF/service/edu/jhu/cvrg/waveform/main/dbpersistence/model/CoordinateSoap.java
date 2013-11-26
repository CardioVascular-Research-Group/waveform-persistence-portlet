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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.http.CoordinateServiceSoap}.
 *
 * @author    bbenite1
 * @see       edu.jhu.cvrg.waveform.main.dbpersistence.service.http.CoordinateServiceSoap
 * @generated
 */
public class CoordinateSoap implements Serializable {
	public static CoordinateSoap toSoapModel(Coordinate model) {
		CoordinateSoap soapModel = new CoordinateSoap();

		soapModel.setCoordinateID(model.getCoordinateID());
		soapModel.setXCoordinate(model.getXCoordinate());
		soapModel.setYCoordinate(model.getYCoordinate());

		return soapModel;
	}

	public static CoordinateSoap[] toSoapModels(Coordinate[] models) {
		CoordinateSoap[] soapModels = new CoordinateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CoordinateSoap[][] toSoapModels(Coordinate[][] models) {
		CoordinateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CoordinateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CoordinateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CoordinateSoap[] toSoapModels(List<Coordinate> models) {
		List<CoordinateSoap> soapModels = new ArrayList<CoordinateSoap>(models.size());

		for (Coordinate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CoordinateSoap[soapModels.size()]);
	}

	public CoordinateSoap() {
	}

	public long getPrimaryKey() {
		return _CoordinateID;
	}

	public void setPrimaryKey(long pk) {
		setCoordinateID(pk);
	}

	public long getCoordinateID() {
		return _CoordinateID;
	}

	public void setCoordinateID(long CoordinateID) {
		_CoordinateID = CoordinateID;
	}

	public double getXCoordinate() {
		return _xCoordinate;
	}

	public void setXCoordinate(double xCoordinate) {
		_xCoordinate = xCoordinate;
	}

	public double getYCoordinate() {
		return _yCoordinate;
	}

	public void setYCoordinate(double yCoordinate) {
		_yCoordinate = yCoordinate;
	}

	private long _CoordinateID;
	private double _xCoordinate;
	private double _yCoordinate;
}