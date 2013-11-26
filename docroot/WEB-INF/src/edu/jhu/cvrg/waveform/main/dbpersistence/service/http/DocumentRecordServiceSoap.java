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

package edu.jhu.cvrg.waveform.main.dbpersistence.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap}.
 * If the method in the service utility returns a
 * {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord}, that is translated to a
 * {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at
 * http://localhost:8080/api/secure/axis. Set the property
 * <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author    bbenite1
 * @see       DocumentRecordServiceHttp
 * @see       edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap
 * @see       edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordServiceUtil
 * @generated
 */
public class DocumentRecordServiceSoap {
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap addDocumentRecord(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		java.lang.String recordName, java.lang.String subjectID,
		java.lang.String originalFormat, double samplingRate,
		java.lang.String fileTreePath, int leadCount, int numPoints,
		java.util.Date dateUploaded, int age, java.lang.String gender,
		java.util.Date dateRecorded, double aduGain) throws RemoteException {
		try {
			edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord returnValue =
				DocumentRecordServiceUtil.addDocumentRecord(liferayUserId,
					liferayGroupId, liferayCompanyId, recordName, subjectID,
					originalFormat, samplingRate, fileTreePath, leadCount,
					numPoints, dateUploaded, age, gender, dateRecorded, aduGain);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap deleteDocumentRecord(
		java.lang.String recordID) throws RemoteException {
		try {
			edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord returnValue =
				DocumentRecordServiceUtil.deleteDocumentRecord(recordID);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap deleteDocumentRecord(
		java.lang.String recordName, long username, java.lang.String subjectID,
		java.lang.String fileTreePath) throws RemoteException {
		try {
			edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord returnValue =
				DocumentRecordServiceUtil.deleteDocumentRecord(recordName,
					username, subjectID, fileTreePath);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap[] getByFileFormat(
		java.lang.String originalFormat) throws RemoteException {
		try {
			java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> returnValue =
				DocumentRecordServiceUtil.getByFileFormat(originalFormat);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap[] getByFileFormat(
		java.lang.String originalFormat, int start, int end)
		throws RemoteException {
		try {
			java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> returnValue =
				DocumentRecordServiceUtil.getByFileFormat(originalFormat,
					start, end);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap[] getBySubjectID(
		java.lang.String subjectID) throws RemoteException {
		try {
			java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> returnValue =
				DocumentRecordServiceUtil.getBySubjectID(subjectID);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap[] getBySubjectID(
		java.lang.String subjectID, int start, int end)
		throws RemoteException {
		try {
			java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> returnValue =
				DocumentRecordServiceUtil.getBySubjectID(subjectID, start, end);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap[] getByScreenName(
		long userID) throws RemoteException {
		try {
			java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> returnValue =
				DocumentRecordServiceUtil.getByScreenName(userID);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap[] getByScreenName(
		long userID, int start, int end) throws RemoteException {
		try {
			java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord> returnValue =
				DocumentRecordServiceUtil.getByScreenName(userID, start, end);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap getRecord(
		java.lang.String recordName, long userID, java.lang.String subjectID,
		java.lang.String fileTreePath) throws RemoteException {
		try {
			edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord returnValue =
				DocumentRecordServiceUtil.getRecord(recordName, userID,
					subjectID, fileTreePath);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap updateDocumentRecord(
		java.lang.String recordID, long userID, java.lang.String recordName,
		java.lang.String subjectID, java.lang.String originalFormat,
		double samplingRate, java.lang.String fileTreePath, int leadCount,
		int numPoints, java.util.Date dateUploaded, int age,
		java.lang.String gender, java.util.Date dateRecorded, double aduGain)
		throws RemoteException {
		try {
			edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord returnValue =
				DocumentRecordServiceUtil.updateDocumentRecord(recordID,
					userID, recordName, subjectID, originalFormat,
					samplingRate, fileTreePath, leadCount, numPoints,
					dateUploaded, age, gender, dateRecorded, aduGain);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecordSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DocumentRecordServiceSoap.class);
}