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

package edu.jhu.cvrg.waveform.main.dbpersistence.service.base;

import edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class CoordinateLocalServiceClpInvoker {
	public CoordinateLocalServiceClpInvoker() {
		_methodName0 = "addCoordinate";

		_methodParameterTypes0 = new String[] {
				"edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate"
			};

		_methodName1 = "createCoordinate";

		_methodParameterTypes1 = new String[] { "java.lang.String" };

		_methodName2 = "deleteCoordinate";

		_methodParameterTypes2 = new String[] { "java.lang.String" };

		_methodName3 = "deleteCoordinate";

		_methodParameterTypes3 = new String[] {
				"edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "fetchCoordinate";

		_methodParameterTypes9 = new String[] { "java.lang.String" };

		_methodName10 = "getCoordinate";

		_methodParameterTypes10 = new String[] { "java.lang.String" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getCoordinates";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getCoordinatesCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateCoordinate";

		_methodParameterTypes14 = new String[] {
				"edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate"
			};

		_methodName15 = "updateCoordinate";

		_methodParameterTypes15 = new String[] {
				"edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate",
				"boolean"
			};

		_methodName62 = "getBeanIdentifier";

		_methodParameterTypes62 = new String[] {  };

		_methodName63 = "setBeanIdentifier";

		_methodParameterTypes63 = new String[] { "java.lang.String" };

		_methodName68 = "addCoordinate";

		_methodParameterTypes68 = new String[] {
				"long", "long", "long", "java.lang.String", "double", "double"
			};

		_methodName69 = "deleteCoordinate";

		_methodParameterTypes69 = new String[] {
				"edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate"
			};

		_methodName70 = "deleteCoordinate";

		_methodParameterTypes70 = new String[] { "java.lang.String" };

		_methodName71 = "getCoordinate";

		_methodParameterTypes71 = new String[] { "java.lang.String" };

		_methodName72 = "updateCoordinate";

		_methodParameterTypes72 = new String[] {
				"java.lang.String", "double", "double"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return CoordinateLocalServiceUtil.addCoordinate((edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return CoordinateLocalServiceUtil.createCoordinate((java.lang.String)arguments[0]);
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return CoordinateLocalServiceUtil.deleteCoordinate((java.lang.String)arguments[0]);
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return CoordinateLocalServiceUtil.deleteCoordinate((edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return CoordinateLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return CoordinateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return CoordinateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return CoordinateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return CoordinateLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return CoordinateLocalServiceUtil.fetchCoordinate((java.lang.String)arguments[0]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return CoordinateLocalServiceUtil.getCoordinate((java.lang.String)arguments[0]);
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return CoordinateLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return CoordinateLocalServiceUtil.getCoordinates(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return CoordinateLocalServiceUtil.getCoordinatesCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return CoordinateLocalServiceUtil.updateCoordinate((edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return CoordinateLocalServiceUtil.updateCoordinate((edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName62.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
			return CoordinateLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName63.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
			CoordinateLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName68.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
			return CoordinateLocalServiceUtil.addCoordinate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3],
				((Double)arguments[4]).doubleValue(),
				((Double)arguments[5]).doubleValue());
		}

		if (_methodName69.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
			return CoordinateLocalServiceUtil.deleteCoordinate((edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate)arguments[0]);
		}

		if (_methodName70.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
			return CoordinateLocalServiceUtil.deleteCoordinate((java.lang.String)arguments[0]);
		}

		if (_methodName71.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
			return CoordinateLocalServiceUtil.getCoordinate((java.lang.String)arguments[0]);
		}

		if (_methodName72.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
			return CoordinateLocalServiceUtil.updateCoordinate((java.lang.String)arguments[0],
				((Double)arguments[1]).doubleValue(),
				((Double)arguments[2]).doubleValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName62;
	private String[] _methodParameterTypes62;
	private String _methodName63;
	private String[] _methodParameterTypes63;
	private String _methodName68;
	private String[] _methodParameterTypes68;
	private String _methodName69;
	private String[] _methodParameterTypes69;
	private String _methodName70;
	private String[] _methodParameterTypes70;
	private String _methodName71;
	private String[] _methodParameterTypes71;
	private String _methodName72;
	private String[] _methodParameterTypes72;
}