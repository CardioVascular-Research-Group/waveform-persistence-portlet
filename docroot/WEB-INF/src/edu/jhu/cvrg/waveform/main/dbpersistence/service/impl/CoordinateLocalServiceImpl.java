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

import edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.base.CoordinateLocalServiceBaseImpl;

/**
 * The implementation of the coordinate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author bbenite1
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.CoordinateLocalServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateLocalServiceUtil
 */
public class CoordinateLocalServiceImpl extends CoordinateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateLocalServiceUtil} to access the coordinate local service.
	 */
	public Coordinate addCoordinate(long liferayUserId, long liferayGroupId, long liferayCompanyId, String coordID, double xCoord, double yCoord) throws SystemException, PortalException{

		Coordinate coordinate = coordinatePersistence.create(coordID);
		
		coordinate.setXCoordinate(xCoord);
		coordinate.setYCoordinate(yCoord);
		
		super.addCoordinate(coordinate);
		
		resourceLocalService.addResources(liferayCompanyId, liferayGroupId, liferayUserId, Coordinate.class.getName(), coordinate.getCoordinateID(), false, true, true);
		
		return coordinate;
	}
	
	public Coordinate deleteCoordinate(Coordinate coord) throws SystemException {
		return coordinatePersistence.remove(coord);
	}
	
	public Coordinate deleteCoordinate(String coordID) throws SystemException, NoSuchCoordinateException {
		return coordinatePersistence.remove(coordID);
	}
	
	public Coordinate getCoordinate(String coordID) throws NoSuchCoordinateException, SystemException {
		return coordinatePersistence.findByPrimaryKey(coordID);
	}
	
	public Coordinate updateCoordinate(String coordID, double xCoord, double yCoord) throws SystemException, PortalException{

		Coordinate coordinate = coordinatePersistence.findByPrimaryKey(coordID);
		
		coordinate.setXCoordinate(xCoord);
		coordinate.setYCoordinate(yCoord);
		
		super.updateCoordinate(coordinate);
		
		return coordinate;
	}
}