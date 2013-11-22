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

import edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class CoordinateServiceClpInvoker {
	public CoordinateServiceClpInvoker() {
		_methodName46 = "getBeanIdentifier";

		_methodParameterTypes46 = new String[] {  };

		_methodName47 = "setBeanIdentifier";

		_methodParameterTypes47 = new String[] { "java.lang.String" };

		_methodName52 = "addCoordinate";

		_methodParameterTypes52 = new String[] {
				"long", "long", "long", "java.lang.String", "double", "double"
			};

		_methodName53 = "deleteCoordinate";

		_methodParameterTypes53 = new String[] { "java.lang.String" };

		_methodName54 = "getCoordinate";

		_methodParameterTypes54 = new String[] { "java.lang.String" };

		_methodName55 = "updateCoordinate";

		_methodParameterTypes55 = new String[] {
				"java.lang.String", "double", "double"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return CoordinateServiceUtil.getBeanIdentifier();
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			CoordinateServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
			return CoordinateServiceUtil.addCoordinate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3],
				((Double)arguments[4]).doubleValue(),
				((Double)arguments[5]).doubleValue());
		}

		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
			return CoordinateServiceUtil.deleteCoordinate((java.lang.String)arguments[0]);
		}

		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
			return CoordinateServiceUtil.getCoordinate((java.lang.String)arguments[0]);
		}

		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
			return CoordinateServiceUtil.updateCoordinate((java.lang.String)arguments[0],
				((Double)arguments[1]).doubleValue(),
				((Double)arguments[2]).doubleValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName52;
	private String[] _methodParameterTypes52;
	private String _methodName53;
	private String[] _methodParameterTypes53;
	private String _methodName54;
	private String[] _methodParameterTypes54;
	private String _methodName55;
	private String[] _methodParameterTypes55;
}