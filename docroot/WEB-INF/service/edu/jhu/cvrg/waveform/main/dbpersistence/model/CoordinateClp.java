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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bbenite1
 */
public class CoordinateClp extends BaseModelImpl<Coordinate>
	implements Coordinate {
	public CoordinateClp() {
	}

	public Class<?> getModelClass() {
		return Coordinate.class;
	}

	public String getModelClassName() {
		return Coordinate.class.getName();
	}

	public String getPrimaryKey() {
		return _CoordinateID;
	}

	public void setPrimaryKey(String primaryKey) {
		setCoordinateID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return _CoordinateID;
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CoordinateID", getCoordinateID());
		attributes.put("xCoordinate", getXCoordinate());
		attributes.put("yCoordinate", getYCoordinate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String CoordinateID = (String)attributes.get("CoordinateID");

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

	public String getCoordinateID() {
		return _CoordinateID;
	}

	public void setCoordinateID(String CoordinateID) {
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

	public BaseModel<?> getCoordinateRemoteModel() {
		return _coordinateRemoteModel;
	}

	public void setCoordinateRemoteModel(BaseModel<?> coordinateRemoteModel) {
		_coordinateRemoteModel = coordinateRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			CoordinateLocalServiceUtil.addCoordinate(this);
		}
		else {
			CoordinateLocalServiceUtil.updateCoordinate(this);
		}
	}

	@Override
	public Coordinate toEscapedModel() {
		return (Coordinate)Proxy.newProxyInstance(Coordinate.class.getClassLoader(),
			new Class[] { Coordinate.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CoordinateClp clone = new CoordinateClp();

		clone.setCoordinateID(getCoordinateID());
		clone.setXCoordinate(getXCoordinate());
		clone.setYCoordinate(getYCoordinate());

		return clone;
	}

	public int compareTo(Coordinate coordinate) {
		String primaryKey = coordinate.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		CoordinateClp coordinate = null;

		try {
			coordinate = (CoordinateClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String primaryKey = coordinate.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{CoordinateID=");
		sb.append(getCoordinateID());
		sb.append(", xCoordinate=");
		sb.append(getXCoordinate());
		sb.append(", yCoordinate=");
		sb.append(getYCoordinate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>CoordinateID</column-name><column-value><![CDATA[");
		sb.append(getCoordinateID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xCoordinate</column-name><column-value><![CDATA[");
		sb.append(getXCoordinate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yCoordinate</column-name><column-value><![CDATA[");
		sb.append(getYCoordinate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _CoordinateID;
	private double _xCoordinate;
	private double _yCoordinate;
	private BaseModel<?> _coordinateRemoteModel;
}