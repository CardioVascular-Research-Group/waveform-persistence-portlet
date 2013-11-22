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

package edu.jhu.cvrg.waveform.main.dbpersistence.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateLocalServiceUtil;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.base.CoordinateServiceBaseImpl;

/**
 * The implementation of the coordinate remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author bbenite1
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.CoordinateServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateServiceUtil
 */
public class CoordinateServiceImpl extends CoordinateServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateServiceUtil} to access the coordinate remote service.
	 */
	public Coordinate addCoordinate(long liferayUserId, long liferayGroupId, long liferayCompanyId, String coordID, double xCoord, double yCoord) throws SystemException, PortalException{

		return CoordinateLocalServiceUtil.addCoordinate(liferayUserId, liferayGroupId, liferayCompanyId, coordID, xCoord, yCoord);
	}
	
	public Coordinate deleteCoordinate(String coordID) throws SystemException, PortalException {
		return CoordinateLocalServiceUtil.deleteCoordinate(coordID);
	}
	
	public Coordinate getCoordinate(String coordID) throws SystemException, PortalException {
		return CoordinateLocalServiceUtil.getCoordinate(coordID);
	}
	
	public Coordinate updateCoordinate(String coordID, double xCoord, double yCoord) throws SystemException, PortalException{

		return CoordinateLocalServiceUtil.updateCoordinate(coordID, xCoord, yCoord);
	}
}