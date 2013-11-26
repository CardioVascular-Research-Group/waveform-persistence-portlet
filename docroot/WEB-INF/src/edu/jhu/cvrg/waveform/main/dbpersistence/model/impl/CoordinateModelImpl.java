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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateModel;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Coordinate service. Represents a row in the &quot;Database_Coordinate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CoordinateImpl}.
 * </p>
 *
 * @author bbenite1
 * @see CoordinateImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateModel
 * @generated
 */
@JSON(strict = true)
public class CoordinateModelImpl extends BaseModelImpl<Coordinate>
	implements CoordinateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a coordinate model instance should use the {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate} interface instead.
	 */
	public static final String TABLE_NAME = "Database_Coordinate";
	public static final Object[][] TABLE_COLUMNS = {
			{ "CoordinateID", Types.BIGINT },
			{ "xCoordinate", Types.DOUBLE },
			{ "yCoordinate", Types.DOUBLE }
		};
	public static final String TABLE_SQL_CREATE = "create table Database_Coordinate (CoordinateID LONG not null primary key,xCoordinate DOUBLE,yCoordinate DOUBLE)";
	public static final String TABLE_SQL_DROP = "drop table Database_Coordinate";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Coordinate toModel(CoordinateSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Coordinate model = new CoordinateImpl();

		model.setCoordinateID(soapModel.getCoordinateID());
		model.setXCoordinate(soapModel.getXCoordinate());
		model.setYCoordinate(soapModel.getYCoordinate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Coordinate> toModels(CoordinateSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Coordinate> models = new ArrayList<Coordinate>(soapModels.length);

		for (CoordinateSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate"));

	public CoordinateModelImpl() {
	}

	public long getPrimaryKey() {
		return _CoordinateID;
	}

	public void setPrimaryKey(long primaryKey) {
		setCoordinateID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_CoordinateID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return Coordinate.class;
	}

	public String getModelClassName() {
		return Coordinate.class.getName();
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

	@JSON
	public long getCoordinateID() {
		return _CoordinateID;
	}

	public void setCoordinateID(long CoordinateID) {
		_CoordinateID = CoordinateID;
	}

	@JSON
	public double getXCoordinate() {
		return _xCoordinate;
	}

	public void setXCoordinate(double xCoordinate) {
		_xCoordinate = xCoordinate;
	}

	@JSON
	public double getYCoordinate() {
		return _yCoordinate;
	}

	public void setYCoordinate(double yCoordinate) {
		_yCoordinate = yCoordinate;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Coordinate.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Coordinate toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Coordinate)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		CoordinateImpl coordinateImpl = new CoordinateImpl();

		coordinateImpl.setCoordinateID(getCoordinateID());
		coordinateImpl.setXCoordinate(getXCoordinate());
		coordinateImpl.setYCoordinate(getYCoordinate());

		coordinateImpl.resetOriginalValues();

		return coordinateImpl;
	}

	public int compareTo(Coordinate coordinate) {
		long primaryKey = coordinate.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Coordinate coordinate = null;

		try {
			coordinate = (Coordinate)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = coordinate.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Coordinate> toCacheModel() {
		CoordinateCacheModel coordinateCacheModel = new CoordinateCacheModel();

		coordinateCacheModel.CoordinateID = getCoordinateID();

		coordinateCacheModel.xCoordinate = getXCoordinate();

		coordinateCacheModel.yCoordinate = getYCoordinate();

		return coordinateCacheModel;
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

	private static ClassLoader _classLoader = Coordinate.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Coordinate.class
		};
	private long _CoordinateID;
	private double _xCoordinate;
	private double _yCoordinate;
	private Coordinate _escapedModelProxy;
}