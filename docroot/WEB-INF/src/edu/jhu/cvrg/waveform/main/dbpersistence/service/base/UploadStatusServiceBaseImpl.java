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

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.AnnotationInfoLocalService;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.AnnotationInfoService;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateLocalService;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.CoordinateService;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordLocalService;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.DocumentRecordService;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoLocalService;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.FilesInfoService;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.UploadStatusLocalService;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.UploadStatusService;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.persistence.AnnotationInfoPersistence;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.persistence.CoordinatePersistence;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.persistence.DocumentRecordPersistence;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.persistence.FilesInfoPersistence;
import edu.jhu.cvrg.waveform.main.dbpersistence.service.persistence.UploadStatusPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the upload status remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.UploadStatusServiceImpl}.
 * </p>
 *
 * @author bbenite1
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.impl.UploadStatusServiceImpl
 * @see edu.jhu.cvrg.waveform.main.dbpersistence.service.UploadStatusServiceUtil
 * @generated
 */
public abstract class UploadStatusServiceBaseImpl extends BaseServiceImpl
	implements UploadStatusService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link edu.jhu.cvrg.waveform.main.dbpersistence.service.UploadStatusServiceUtil} to access the upload status remote service.
	 */

	/**
	 * Returns the annotation info local service.
	 *
	 * @return the annotation info local service
	 */
	public AnnotationInfoLocalService getAnnotationInfoLocalService() {
		return annotationInfoLocalService;
	}

	/**
	 * Sets the annotation info local service.
	 *
	 * @param annotationInfoLocalService the annotation info local service
	 */
	public void setAnnotationInfoLocalService(
		AnnotationInfoLocalService annotationInfoLocalService) {
		this.annotationInfoLocalService = annotationInfoLocalService;
	}

	/**
	 * Returns the annotation info remote service.
	 *
	 * @return the annotation info remote service
	 */
	public AnnotationInfoService getAnnotationInfoService() {
		return annotationInfoService;
	}

	/**
	 * Sets the annotation info remote service.
	 *
	 * @param annotationInfoService the annotation info remote service
	 */
	public void setAnnotationInfoService(
		AnnotationInfoService annotationInfoService) {
		this.annotationInfoService = annotationInfoService;
	}

	/**
	 * Returns the annotation info persistence.
	 *
	 * @return the annotation info persistence
	 */
	public AnnotationInfoPersistence getAnnotationInfoPersistence() {
		return annotationInfoPersistence;
	}

	/**
	 * Sets the annotation info persistence.
	 *
	 * @param annotationInfoPersistence the annotation info persistence
	 */
	public void setAnnotationInfoPersistence(
		AnnotationInfoPersistence annotationInfoPersistence) {
		this.annotationInfoPersistence = annotationInfoPersistence;
	}

	/**
	 * Returns the coordinate local service.
	 *
	 * @return the coordinate local service
	 */
	public CoordinateLocalService getCoordinateLocalService() {
		return coordinateLocalService;
	}

	/**
	 * Sets the coordinate local service.
	 *
	 * @param coordinateLocalService the coordinate local service
	 */
	public void setCoordinateLocalService(
		CoordinateLocalService coordinateLocalService) {
		this.coordinateLocalService = coordinateLocalService;
	}

	/**
	 * Returns the coordinate remote service.
	 *
	 * @return the coordinate remote service
	 */
	public CoordinateService getCoordinateService() {
		return coordinateService;
	}

	/**
	 * Sets the coordinate remote service.
	 *
	 * @param coordinateService the coordinate remote service
	 */
	public void setCoordinateService(CoordinateService coordinateService) {
		this.coordinateService = coordinateService;
	}

	/**
	 * Returns the coordinate persistence.
	 *
	 * @return the coordinate persistence
	 */
	public CoordinatePersistence getCoordinatePersistence() {
		return coordinatePersistence;
	}

	/**
	 * Sets the coordinate persistence.
	 *
	 * @param coordinatePersistence the coordinate persistence
	 */
	public void setCoordinatePersistence(
		CoordinatePersistence coordinatePersistence) {
		this.coordinatePersistence = coordinatePersistence;
	}

	/**
	 * Returns the document record local service.
	 *
	 * @return the document record local service
	 */
	public DocumentRecordLocalService getDocumentRecordLocalService() {
		return documentRecordLocalService;
	}

	/**
	 * Sets the document record local service.
	 *
	 * @param documentRecordLocalService the document record local service
	 */
	public void setDocumentRecordLocalService(
		DocumentRecordLocalService documentRecordLocalService) {
		this.documentRecordLocalService = documentRecordLocalService;
	}

	/**
	 * Returns the document record remote service.
	 *
	 * @return the document record remote service
	 */
	public DocumentRecordService getDocumentRecordService() {
		return documentRecordService;
	}

	/**
	 * Sets the document record remote service.
	 *
	 * @param documentRecordService the document record remote service
	 */
	public void setDocumentRecordService(
		DocumentRecordService documentRecordService) {
		this.documentRecordService = documentRecordService;
	}

	/**
	 * Returns the document record persistence.
	 *
	 * @return the document record persistence
	 */
	public DocumentRecordPersistence getDocumentRecordPersistence() {
		return documentRecordPersistence;
	}

	/**
	 * Sets the document record persistence.
	 *
	 * @param documentRecordPersistence the document record persistence
	 */
	public void setDocumentRecordPersistence(
		DocumentRecordPersistence documentRecordPersistence) {
		this.documentRecordPersistence = documentRecordPersistence;
	}

	/**
	 * Returns the files info local service.
	 *
	 * @return the files info local service
	 */
	public FilesInfoLocalService getFilesInfoLocalService() {
		return filesInfoLocalService;
	}

	/**
	 * Sets the files info local service.
	 *
	 * @param filesInfoLocalService the files info local service
	 */
	public void setFilesInfoLocalService(
		FilesInfoLocalService filesInfoLocalService) {
		this.filesInfoLocalService = filesInfoLocalService;
	}

	/**
	 * Returns the files info remote service.
	 *
	 * @return the files info remote service
	 */
	public FilesInfoService getFilesInfoService() {
		return filesInfoService;
	}

	/**
	 * Sets the files info remote service.
	 *
	 * @param filesInfoService the files info remote service
	 */
	public void setFilesInfoService(FilesInfoService filesInfoService) {
		this.filesInfoService = filesInfoService;
	}

	/**
	 * Returns the files info persistence.
	 *
	 * @return the files info persistence
	 */
	public FilesInfoPersistence getFilesInfoPersistence() {
		return filesInfoPersistence;
	}

	/**
	 * Sets the files info persistence.
	 *
	 * @param filesInfoPersistence the files info persistence
	 */
	public void setFilesInfoPersistence(
		FilesInfoPersistence filesInfoPersistence) {
		this.filesInfoPersistence = filesInfoPersistence;
	}

	/**
	 * Returns the upload status local service.
	 *
	 * @return the upload status local service
	 */
	public UploadStatusLocalService getUploadStatusLocalService() {
		return uploadStatusLocalService;
	}

	/**
	 * Sets the upload status local service.
	 *
	 * @param uploadStatusLocalService the upload status local service
	 */
	public void setUploadStatusLocalService(
		UploadStatusLocalService uploadStatusLocalService) {
		this.uploadStatusLocalService = uploadStatusLocalService;
	}

	/**
	 * Returns the upload status remote service.
	 *
	 * @return the upload status remote service
	 */
	public UploadStatusService getUploadStatusService() {
		return uploadStatusService;
	}

	/**
	 * Sets the upload status remote service.
	 *
	 * @param uploadStatusService the upload status remote service
	 */
	public void setUploadStatusService(UploadStatusService uploadStatusService) {
		this.uploadStatusService = uploadStatusService;
	}

	/**
	 * Returns the upload status persistence.
	 *
	 * @return the upload status persistence
	 */
	public UploadStatusPersistence getUploadStatusPersistence() {
		return uploadStatusPersistence;
	}

	/**
	 * Sets the upload status persistence.
	 *
	 * @param uploadStatusPersistence the upload status persistence
	 */
	public void setUploadStatusPersistence(
		UploadStatusPersistence uploadStatusPersistence) {
		this.uploadStatusPersistence = uploadStatusPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return UploadStatus.class;
	}

	protected String getModelClassName() {
		return UploadStatus.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = uploadStatusPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = AnnotationInfoLocalService.class)
	protected AnnotationInfoLocalService annotationInfoLocalService;
	@BeanReference(type = AnnotationInfoService.class)
	protected AnnotationInfoService annotationInfoService;
	@BeanReference(type = AnnotationInfoPersistence.class)
	protected AnnotationInfoPersistence annotationInfoPersistence;
	@BeanReference(type = CoordinateLocalService.class)
	protected CoordinateLocalService coordinateLocalService;
	@BeanReference(type = CoordinateService.class)
	protected CoordinateService coordinateService;
	@BeanReference(type = CoordinatePersistence.class)
	protected CoordinatePersistence coordinatePersistence;
	@BeanReference(type = DocumentRecordLocalService.class)
	protected DocumentRecordLocalService documentRecordLocalService;
	@BeanReference(type = DocumentRecordService.class)
	protected DocumentRecordService documentRecordService;
	@BeanReference(type = DocumentRecordPersistence.class)
	protected DocumentRecordPersistence documentRecordPersistence;
	@BeanReference(type = FilesInfoLocalService.class)
	protected FilesInfoLocalService filesInfoLocalService;
	@BeanReference(type = FilesInfoService.class)
	protected FilesInfoService filesInfoService;
	@BeanReference(type = FilesInfoPersistence.class)
	protected FilesInfoPersistence filesInfoPersistence;
	@BeanReference(type = UploadStatusLocalService.class)
	protected UploadStatusLocalService uploadStatusLocalService;
	@BeanReference(type = UploadStatusService.class)
	protected UploadStatusService uploadStatusService;
	@BeanReference(type = UploadStatusPersistence.class)
	protected UploadStatusPersistence uploadStatusPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private UploadStatusServiceClpInvoker _clpInvoker = new UploadStatusServiceClpInvoker();
}