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

package edu.jhu.cvrg.waveform.main.dbpersistence.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the files info local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author bbenite1
 * @see FilesInfoLocalServiceUtil
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.base.FilesInfoLocalServiceBaseImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.FilesInfoLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface FilesInfoLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilesInfoLocalServiceUtil} to access the files info local service. Add custom service methods to {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.FilesInfoLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the files info to the database. Also notifies the appropriate model listeners.
	*
	* @param filesInfo the files info
	* @return the files info that was added
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo addFilesInfo(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo filesInfo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new files info with the primary key. Does not add the files info to the database.
	*
	* @param DocumentID the primary key for the new files info
	* @return the new files info
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo createFilesInfo(
		java.lang.String DocumentID);

	/**
	* Deletes the files info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param DocumentID the primary key of the files info
	* @return the files info that was removed
	* @throws PortalException if a files info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo deleteFilesInfo(
		java.lang.String DocumentID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the files info from the database. Also notifies the appropriate model listeners.
	*
	* @param filesInfo the files info
	* @return the files info that was removed
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo deleteFilesInfo(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo filesInfo)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo fetchFilesInfo(
		java.lang.String DocumentID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the files info with the primary key.
	*
	* @param DocumentID the primary key of the files info
	* @return the files info
	* @throws PortalException if a files info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo getFilesInfo(
		java.lang.String DocumentID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the files infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of files infos
	* @param end the upper bound of the range of files infos (not inclusive)
	* @return the range of files infos
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> getFilesInfos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of files infos.
	*
	* @return the number of files infos
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFilesInfosCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the files info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param filesInfo the files info
	* @return the files info that was updated
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo updateFilesInfo(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo filesInfo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the files info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param filesInfo the files info
	* @param merge whether to merge the files info with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the files info that was updated
	* @throws SystemException if a system exception occurred
	*/
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo updateFilesInfo(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo filesInfo,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo addFilesInfo(
		long liferayUserId, long liferayGroupId, long liferayCompanyId,
		java.lang.String documentID, java.lang.String fileListID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo getFile(
		java.lang.String documentID)
		throws com.liferay.portal.kernel.exception.SystemException,
			edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> getFiles(
		java.lang.String fileID)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo> getFiles(
		java.lang.String fileID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;
}