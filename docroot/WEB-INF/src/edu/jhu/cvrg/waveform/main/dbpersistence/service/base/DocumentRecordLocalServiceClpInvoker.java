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

import edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class DocumentRecordLocalServiceClpInvoker {
	public DocumentRecordLocalServiceClpInvoker() {
		_methodName0 = "addDocumentRecord";

		_methodParameterTypes0 = new String[] {
				"edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord"
			};

		_methodName1 = "createDocumentRecord";

		_methodParameterTypes1 = new String[] { "java.lang.String" };

		_methodName2 = "deleteDocumentRecord";

		_methodParameterTypes2 = new String[] { "java.lang.String" };

		_methodName3 = "deleteDocumentRecord";

		_methodParameterTypes3 = new String[] {
				"edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord"
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

		_methodName9 = "fetchDocumentRecord";

		_methodParameterTypes9 = new String[] { "java.lang.String" };

		_methodName10 = "getDocumentRecord";

		_methodParameterTypes10 = new String[] { "java.lang.String" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getDocumentRecords";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getDocumentRecordsCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateDocumentRecord";

		_methodParameterTypes14 = new String[] {
				"edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord"
			};

		_methodName15 = "updateDocumentRecord";

		_methodParameterTypes15 = new String[] {
				"edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord",
				"boolean"
			};

		_methodName62 = "getBeanIdentifier";

		_methodParameterTypes62 = new String[] {  };

		_methodName63 = "setBeanIdentifier";

		_methodParameterTypes63 = new String[] { "java.lang.String" };

		_methodName68 = "addDocumentRecord";

		_methodParameterTypes68 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "double",
				"java.lang.String", "int", "int", "java.util.Date", "int",
				"java.lang.String", "java.util.Date", "double"
			};

		_methodName69 = "deleteDocumentRecord";

		_methodParameterTypes69 = new String[] {
				"edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord"
			};

		_methodName70 = "deleteDocumentRecord";

		_methodParameterTypes70 = new String[] { "java.lang.String" };

		_methodName71 = "deleteDocumentRecord";

		_methodParameterTypes71 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String"
			};

		_methodName72 = "getByFileFormat";

		_methodParameterTypes72 = new String[] { "java.lang.String" };

		_methodName73 = "getByFileFormat";

		_methodParameterTypes73 = new String[] { "java.lang.String", "int", "int" };

		_methodName74 = "getBySubjectID";

		_methodParameterTypes74 = new String[] { "java.lang.String" };

		_methodName75 = "getBySubjectID";

		_methodParameterTypes75 = new String[] { "java.lang.String", "int", "int" };

		_methodName76 = "getByScreenName";

		_methodParameterTypes76 = new String[] { "java.lang.String" };

		_methodName77 = "getByScreenName";

		_methodParameterTypes77 = new String[] { "java.lang.String", "int", "int" };

		_methodName78 = "getRecord";

		_methodParameterTypes78 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String"
			};

		_methodName79 = "updateDocumentRecord";

		_methodParameterTypes79 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "double",
				"java.lang.String", "int", "int", "java.util.Date", "int",
				"java.lang.String", "java.util.Date", "double"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.addDocumentRecord((edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.createDocumentRecord((java.lang.String)arguments[0]);
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.deleteDocumentRecord((java.lang.String)arguments[0]);
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.deleteDocumentRecord((edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.fetchDocumentRecord((java.lang.String)arguments[0]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.getDocumentRecord((java.lang.String)arguments[0]);
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.getDocumentRecords(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.getDocumentRecordsCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.updateDocumentRecord((edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.updateDocumentRecord((edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName62.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName63.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
			DocumentRecordLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName68.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.addDocumentRecord(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				((Double)arguments[7]).doubleValue(),
				(java.lang.String)arguments[8],
				((Integer)arguments[9]).intValue(),
				((Integer)arguments[10]).intValue(),
				(java.util.Date)arguments[11],
				((Integer)arguments[12]).intValue(),
				(java.lang.String)arguments[13], (java.util.Date)arguments[14],
				((Double)arguments[15]).doubleValue());
		}

		if (_methodName69.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.deleteDocumentRecord((edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord)arguments[0]);
		}

		if (_methodName70.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.deleteDocumentRecord((java.lang.String)arguments[0]);
		}

		if (_methodName71.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.deleteDocumentRecord((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3]);
		}

		if (_methodName72.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.getByFileFormat((java.lang.String)arguments[0]);
		}

		if (_methodName73.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.getByFileFormat((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName74.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.getBySubjectID((java.lang.String)arguments[0]);
		}

		if (_methodName75.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.getBySubjectID((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName76.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.getByScreenName((java.lang.String)arguments[0]);
		}

		if (_methodName77.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.getByScreenName((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName78.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.getRecord((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3]);
		}

		if (_methodName79.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
			return DocumentRecordLocalServiceUtil.updateDocumentRecord((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				((Double)arguments[5]).doubleValue(),
				(java.lang.String)arguments[6],
				((Integer)arguments[7]).intValue(),
				((Integer)arguments[8]).intValue(),
				(java.util.Date)arguments[9],
				((Integer)arguments[10]).intValue(),
				(java.lang.String)arguments[11], (java.util.Date)arguments[12],
				((Double)arguments[13]).doubleValue());
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
	private String _methodName73;
	private String[] _methodParameterTypes73;
	private String _methodName74;
	private String[] _methodParameterTypes74;
	private String _methodName75;
	private String[] _methodParameterTypes75;
	private String _methodName76;
	private String[] _methodParameterTypes76;
	private String _methodName77;
	private String[] _methodParameterTypes77;
	private String _methodName78;
	private String[] _methodParameterTypes78;
	private String _methodName79;
	private String[] _methodParameterTypes79;
}