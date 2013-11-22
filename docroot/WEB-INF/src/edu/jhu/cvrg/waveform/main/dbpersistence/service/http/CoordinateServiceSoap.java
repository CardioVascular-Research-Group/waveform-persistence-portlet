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

import edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateSoap}.
 * If the method in the service utility returns a
 * {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate}, that is translated to a
 * {@link edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateSoap}. Methods that SOAP cannot
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
 * @see       CoordinateServiceHttp
 * @see       edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateSoap
 * @see       edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateServiceUtil
 * @generated
 */
public class CoordinateServiceSoap {
	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateSoap addCoordinate(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		java.lang.String coordID, double xCoord, double yCoord)
		throws RemoteException {
		try {
			edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate returnValue =
				CoordinateServiceUtil.addCoordinate(liferayUserId,
					liferayGroupId, liferayCompanyId, coordID, xCoord, yCoord);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateSoap deleteCoordinate(
		java.lang.String coordID) throws RemoteException {
		try {
			edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate returnValue =
				CoordinateServiceUtil.deleteCoordinate(coordID);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateSoap getCoordinate(
		java.lang.String coordID) throws RemoteException {
		try {
			edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate returnValue =
				CoordinateServiceUtil.getCoordinate(coordID);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateSoap updateCoordinate(
		java.lang.String coordID, double xCoord, double yCoord)
		throws RemoteException {
		try {
			edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate returnValue =
				CoordinateServiceUtil.updateCoordinate(coordID, xCoord, yCoord);

			return edu.jhu.cvrg.waveform.main.dbpersistence.model.CoordinateSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CoordinateServiceSoap.class);
}