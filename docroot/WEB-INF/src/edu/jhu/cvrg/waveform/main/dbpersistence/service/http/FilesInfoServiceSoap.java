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

import edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoSoap}.
 * If the method in the service utility returns a
 * {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo}, that is translated to a
 * {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoSoap}. Methods that SOAP cannot
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
 * @see       FilesInfoServiceHttp
 * @see       edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoSoap
 * @see       edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoServiceUtil
 * @generated
 */
public class FilesInfoServiceSoap {
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoSoap addFilesInfo(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		long documentID, long fileListID,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo returnValue =
				FilesInfoServiceUtil.addFilesInfo(liferayUserId,
					liferayGroupId, liferayCompanyId, documentID, fileListID,
					serviceContext);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoSoap deleteFilesInfo(
		long docID) throws RemoteException {
		try {
			edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo returnValue =
				FilesInfoServiceUtil.deleteFilesInfo(docID);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoSoap getFile(
		long fileID) throws RemoteException {
		try {
			edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo returnValue =
				FilesInfoServiceUtil.getFile(fileID);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoSoap[] getFiles(
		long recordID) throws RemoteException {
		try {
			java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> returnValue =
				FilesInfoServiceUtil.getFiles(recordID);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoSoap[] getFiles(
		long recordID, int start, int end) throws RemoteException {
		try {
			java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> returnValue =
				FilesInfoServiceUtil.getFiles(recordID, start, end);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfoSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(FilesInfoServiceSoap.class);
}