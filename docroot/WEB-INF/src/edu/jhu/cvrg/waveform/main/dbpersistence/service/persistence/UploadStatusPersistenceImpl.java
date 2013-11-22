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

package edu.jhu.cvrg.waveform.main.dbpersistence.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.UploadStatusImpl;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.UploadStatusModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the upload status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see UploadStatusPersistence
 * @see UploadStatusUtil
 * @generated
 */
public class UploadStatusPersistenceImpl extends BasePersistenceImpl<UploadStatus>
	implements UploadStatusPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UploadStatusUtil} to access the upload status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UploadStatusImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UploadStatusModelImpl.ENTITY_CACHE_ENABLED,
			UploadStatusModelImpl.FINDER_CACHE_ENABLED, UploadStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UploadStatusModelImpl.ENTITY_CACHE_ENABLED,
			UploadStatusModelImpl.FINDER_CACHE_ENABLED, UploadStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UploadStatusModelImpl.ENTITY_CACHE_ENABLED,
			UploadStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the upload status in the entity cache if it is enabled.
	 *
	 * @param uploadStatus the upload status
	 */
	public void cacheResult(UploadStatus uploadStatus) {
		EntityCacheUtil.putResult(UploadStatusModelImpl.ENTITY_CACHE_ENABLED,
			UploadStatusImpl.class, uploadStatus.getPrimaryKey(), uploadStatus);

		uploadStatus.resetOriginalValues();
	}

	/**
	 * Caches the upload statuses in the entity cache if it is enabled.
	 *
	 * @param uploadStatuses the upload statuses
	 */
	public void cacheResult(List<UploadStatus> uploadStatuses) {
		for (UploadStatus uploadStatus : uploadStatuses) {
			if (EntityCacheUtil.getResult(
						UploadStatusModelImpl.ENTITY_CACHE_ENABLED,
						UploadStatusImpl.class, uploadStatus.getPrimaryKey()) == null) {
				cacheResult(uploadStatus);
			}
			else {
				uploadStatus.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all upload statuses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UploadStatusImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UploadStatusImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the upload status.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UploadStatus uploadStatus) {
		EntityCacheUtil.removeResult(UploadStatusModelImpl.ENTITY_CACHE_ENABLED,
			UploadStatusImpl.class, uploadStatus.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UploadStatus> uploadStatuses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UploadStatus uploadStatus : uploadStatuses) {
			EntityCacheUtil.removeResult(UploadStatusModelImpl.ENTITY_CACHE_ENABLED,
				UploadStatusImpl.class, uploadStatus.getPrimaryKey());
		}
	}

	/**
	 * Creates a new upload status with the primary key. Does not add the upload status to the database.
	 *
	 * @param StatusLogNumber the primary key for the new upload status
	 * @return the new upload status
	 */
	public UploadStatus create(String StatusLogNumber) {
		UploadStatus uploadStatus = new UploadStatusImpl();

		uploadStatus.setNew(true);
		uploadStatus.setPrimaryKey(StatusLogNumber);

		return uploadStatus;
	}

	/**
	 * Removes the upload status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param StatusLogNumber the primary key of the upload status
	 * @return the upload status that was removed
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException if a upload status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UploadStatus remove(String StatusLogNumber)
		throws NoSuchUploadStatusException, SystemException {
		return remove((Serializable)StatusLogNumber);
	}

	/**
	 * Removes the upload status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the upload status
	 * @return the upload status that was removed
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException if a upload status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UploadStatus remove(Serializable primaryKey)
		throws NoSuchUploadStatusException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UploadStatus uploadStatus = (UploadStatus)session.get(UploadStatusImpl.class,
					primaryKey);

			if (uploadStatus == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUploadStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(uploadStatus);
		}
		catch (NoSuchUploadStatusException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected UploadStatus removeImpl(UploadStatus uploadStatus)
		throws SystemException {
		uploadStatus = toUnwrappedModel(uploadStatus);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, uploadStatus);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(uploadStatus);

		return uploadStatus;
	}

	@Override
	public UploadStatus updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus uploadStatus,
		boolean merge) throws SystemException {
		uploadStatus = toUnwrappedModel(uploadStatus);

		boolean isNew = uploadStatus.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, uploadStatus, merge);

			uploadStatus.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(UploadStatusModelImpl.ENTITY_CACHE_ENABLED,
			UploadStatusImpl.class, uploadStatus.getPrimaryKey(), uploadStatus);

		return uploadStatus;
	}

	protected UploadStatus toUnwrappedModel(UploadStatus uploadStatus) {
		if (uploadStatus instanceof UploadStatusImpl) {
			return uploadStatus;
		}

		UploadStatusImpl uploadStatusImpl = new UploadStatusImpl();

		uploadStatusImpl.setNew(uploadStatus.isNew());
		uploadStatusImpl.setPrimaryKey(uploadStatus.getPrimaryKey());

		uploadStatusImpl.setStatusLogNumber(uploadStatus.getStatusLogNumber());
		uploadStatusImpl.setFileTransfer(uploadStatus.getFileTransfer());
		uploadStatusImpl.setFileConversion(uploadStatus.getFileConversion());
		uploadStatusImpl.setRecordCreation(uploadStatus.getRecordCreation());
		uploadStatusImpl.setAnnotationCreation(uploadStatus.getAnnotationCreation());
		uploadStatusImpl.setRecordID(uploadStatus.getRecordID());

		return uploadStatusImpl;
	}

	/**
	 * Returns the upload status with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the upload status
	 * @return the upload status
	 * @throws com.liferay.portal.NoSuchModelException if a upload status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UploadStatus findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the upload status with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException} if it could not be found.
	 *
	 * @param StatusLogNumber the primary key of the upload status
	 * @return the upload status
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchUploadStatusException if a upload status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UploadStatus findByPrimaryKey(String StatusLogNumber)
		throws NoSuchUploadStatusException, SystemException {
		UploadStatus uploadStatus = fetchByPrimaryKey(StatusLogNumber);

		if (uploadStatus == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + StatusLogNumber);
			}

			throw new NoSuchUploadStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				StatusLogNumber);
		}

		return uploadStatus;
	}

	/**
	 * Returns the upload status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the upload status
	 * @return the upload status, or <code>null</code> if a upload status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UploadStatus fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the upload status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param StatusLogNumber the primary key of the upload status
	 * @return the upload status, or <code>null</code> if a upload status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UploadStatus fetchByPrimaryKey(String StatusLogNumber)
		throws SystemException {
		UploadStatus uploadStatus = (UploadStatus)EntityCacheUtil.getResult(UploadStatusModelImpl.ENTITY_CACHE_ENABLED,
				UploadStatusImpl.class, StatusLogNumber);

		if (uploadStatus == _nullUploadStatus) {
			return null;
		}

		if (uploadStatus == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				uploadStatus = (UploadStatus)session.get(UploadStatusImpl.class,
						StatusLogNumber);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (uploadStatus != null) {
					cacheResult(uploadStatus);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(UploadStatusModelImpl.ENTITY_CACHE_ENABLED,
						UploadStatusImpl.class, StatusLogNumber,
						_nullUploadStatus);
				}

				closeSession(session);
			}
		}

		return uploadStatus;
	}

	/**
	 * Returns all the upload statuses.
	 *
	 * @return the upload statuses
	 * @throws SystemException if a system exception occurred
	 */
	public List<UploadStatus> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the upload statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of upload statuses
	 * @param end the upper bound of the range of upload statuses (not inclusive)
	 * @return the range of upload statuses
	 * @throws SystemException if a system exception occurred
	 */
	public List<UploadStatus> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the upload statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of upload statuses
	 * @param end the upper bound of the range of upload statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of upload statuses
	 * @throws SystemException if a system exception occurred
	 */
	public List<UploadStatus> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<UploadStatus> list = (List<UploadStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_UPLOADSTATUS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_UPLOADSTATUS;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<UploadStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<UploadStatus>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the upload statuses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (UploadStatus uploadStatus : findAll()) {
			remove(uploadStatus);
		}
	}

	/**
	 * Returns the number of upload statuses.
	 *
	 * @return the number of upload statuses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_UPLOADSTATUS);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the upload status persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.edu.jhu.cvrg.waveform.main.dbpersistence.model.UploadStatus")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UploadStatus>> listenersList = new ArrayList<ModelListener<UploadStatus>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UploadStatus>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(UploadStatusImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = AnnotationInfoPersistence.class)
	protected AnnotationInfoPersistence annotationInfoPersistence;
	@BeanReference(type = CoordinatePersistence.class)
	protected CoordinatePersistence coordinatePersistence;
	@BeanReference(type = DocumentRecordPersistence.class)
	protected DocumentRecordPersistence documentRecordPersistence;
	@BeanReference(type = FilesInfoPersistence.class)
	protected FilesInfoPersistence filesInfoPersistence;
	@BeanReference(type = UploadStatusPersistence.class)
	protected UploadStatusPersistence uploadStatusPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_UPLOADSTATUS = "SELECT uploadStatus FROM UploadStatus uploadStatus";
	private static final String _SQL_COUNT_UPLOADSTATUS = "SELECT COUNT(uploadStatus) FROM UploadStatus uploadStatus";
	private static final String _ORDER_BY_ENTITY_ALIAS = "uploadStatus.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UploadStatus exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UploadStatusPersistenceImpl.class);
	private static UploadStatus _nullUploadStatus = new UploadStatusImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UploadStatus> toCacheModel() {
				return _nullUploadStatusCacheModel;
			}
		};

	private static CacheModel<UploadStatus> _nullUploadStatusCacheModel = new CacheModel<UploadStatus>() {
			public UploadStatus toEntityModel() {
				return _nullUploadStatus;
			}
		};
}