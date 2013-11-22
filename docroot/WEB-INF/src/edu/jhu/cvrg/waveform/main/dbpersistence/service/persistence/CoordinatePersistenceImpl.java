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

import edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.CoordinateImpl;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.CoordinateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the coordinate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see CoordinatePersistence
 * @see CoordinateUtil
 * @generated
 */
public class CoordinatePersistenceImpl extends BasePersistenceImpl<Coordinate>
	implements CoordinatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CoordinateUtil} to access the coordinate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CoordinateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CoordinateModelImpl.ENTITY_CACHE_ENABLED,
			CoordinateModelImpl.FINDER_CACHE_ENABLED, CoordinateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CoordinateModelImpl.ENTITY_CACHE_ENABLED,
			CoordinateModelImpl.FINDER_CACHE_ENABLED, CoordinateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CoordinateModelImpl.ENTITY_CACHE_ENABLED,
			CoordinateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the coordinate in the entity cache if it is enabled.
	 *
	 * @param coordinate the coordinate
	 */
	public void cacheResult(Coordinate coordinate) {
		EntityCacheUtil.putResult(CoordinateModelImpl.ENTITY_CACHE_ENABLED,
			CoordinateImpl.class, coordinate.getPrimaryKey(), coordinate);

		coordinate.resetOriginalValues();
	}

	/**
	 * Caches the coordinates in the entity cache if it is enabled.
	 *
	 * @param coordinates the coordinates
	 */
	public void cacheResult(List<Coordinate> coordinates) {
		for (Coordinate coordinate : coordinates) {
			if (EntityCacheUtil.getResult(
						CoordinateModelImpl.ENTITY_CACHE_ENABLED,
						CoordinateImpl.class, coordinate.getPrimaryKey()) == null) {
				cacheResult(coordinate);
			}
			else {
				coordinate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all coordinates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CoordinateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CoordinateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the coordinate.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Coordinate coordinate) {
		EntityCacheUtil.removeResult(CoordinateModelImpl.ENTITY_CACHE_ENABLED,
			CoordinateImpl.class, coordinate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Coordinate> coordinates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Coordinate coordinate : coordinates) {
			EntityCacheUtil.removeResult(CoordinateModelImpl.ENTITY_CACHE_ENABLED,
				CoordinateImpl.class, coordinate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new coordinate with the primary key. Does not add the coordinate to the database.
	 *
	 * @param CoordinateID the primary key for the new coordinate
	 * @return the new coordinate
	 */
	public Coordinate create(String CoordinateID) {
		Coordinate coordinate = new CoordinateImpl();

		coordinate.setNew(true);
		coordinate.setPrimaryKey(CoordinateID);

		return coordinate;
	}

	/**
	 * Removes the coordinate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CoordinateID the primary key of the coordinate
	 * @return the coordinate that was removed
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException if a coordinate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Coordinate remove(String CoordinateID)
		throws NoSuchCoordinateException, SystemException {
		return remove((Serializable)CoordinateID);
	}

	/**
	 * Removes the coordinate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the coordinate
	 * @return the coordinate that was removed
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException if a coordinate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Coordinate remove(Serializable primaryKey)
		throws NoSuchCoordinateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Coordinate coordinate = (Coordinate)session.get(CoordinateImpl.class,
					primaryKey);

			if (coordinate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCoordinateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(coordinate);
		}
		catch (NoSuchCoordinateException nsee) {
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
	protected Coordinate removeImpl(Coordinate coordinate)
		throws SystemException {
		coordinate = toUnwrappedModel(coordinate);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, coordinate);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(coordinate);

		return coordinate;
	}

	@Override
	public Coordinate updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate coordinate,
		boolean merge) throws SystemException {
		coordinate = toUnwrappedModel(coordinate);

		boolean isNew = coordinate.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, coordinate, merge);

			coordinate.setNew(false);
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

		EntityCacheUtil.putResult(CoordinateModelImpl.ENTITY_CACHE_ENABLED,
			CoordinateImpl.class, coordinate.getPrimaryKey(), coordinate);

		return coordinate;
	}

	protected Coordinate toUnwrappedModel(Coordinate coordinate) {
		if (coordinate instanceof CoordinateImpl) {
			return coordinate;
		}

		CoordinateImpl coordinateImpl = new CoordinateImpl();

		coordinateImpl.setNew(coordinate.isNew());
		coordinateImpl.setPrimaryKey(coordinate.getPrimaryKey());

		coordinateImpl.setCoordinateID(coordinate.getCoordinateID());
		coordinateImpl.setXCoordinate(coordinate.getXCoordinate());
		coordinateImpl.setYCoordinate(coordinate.getYCoordinate());

		return coordinateImpl;
	}

	/**
	 * Returns the coordinate with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the coordinate
	 * @return the coordinate
	 * @throws com.liferay.portal.NoSuchModelException if a coordinate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Coordinate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the coordinate with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException} if it could not be found.
	 *
	 * @param CoordinateID the primary key of the coordinate
	 * @return the coordinate
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchCoordinateException if a coordinate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Coordinate findByPrimaryKey(String CoordinateID)
		throws NoSuchCoordinateException, SystemException {
		Coordinate coordinate = fetchByPrimaryKey(CoordinateID);

		if (coordinate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + CoordinateID);
			}

			throw new NoSuchCoordinateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				CoordinateID);
		}

		return coordinate;
	}

	/**
	 * Returns the coordinate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the coordinate
	 * @return the coordinate, or <code>null</code> if a coordinate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Coordinate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the coordinate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CoordinateID the primary key of the coordinate
	 * @return the coordinate, or <code>null</code> if a coordinate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Coordinate fetchByPrimaryKey(String CoordinateID)
		throws SystemException {
		Coordinate coordinate = (Coordinate)EntityCacheUtil.getResult(CoordinateModelImpl.ENTITY_CACHE_ENABLED,
				CoordinateImpl.class, CoordinateID);

		if (coordinate == _nullCoordinate) {
			return null;
		}

		if (coordinate == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				coordinate = (Coordinate)session.get(CoordinateImpl.class,
						CoordinateID);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (coordinate != null) {
					cacheResult(coordinate);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(CoordinateModelImpl.ENTITY_CACHE_ENABLED,
						CoordinateImpl.class, CoordinateID, _nullCoordinate);
				}

				closeSession(session);
			}
		}

		return coordinate;
	}

	/**
	 * Returns all the coordinates.
	 *
	 * @return the coordinates
	 * @throws SystemException if a system exception occurred
	 */
	public List<Coordinate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the coordinates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of coordinates
	 * @param end the upper bound of the range of coordinates (not inclusive)
	 * @return the range of coordinates
	 * @throws SystemException if a system exception occurred
	 */
	public List<Coordinate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the coordinates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of coordinates
	 * @param end the upper bound of the range of coordinates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of coordinates
	 * @throws SystemException if a system exception occurred
	 */
	public List<Coordinate> findAll(int start, int end,
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

		List<Coordinate> list = (List<Coordinate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_COORDINATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COORDINATE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Coordinate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Coordinate>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the coordinates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Coordinate coordinate : findAll()) {
			remove(coordinate);
		}
	}

	/**
	 * Returns the number of coordinates.
	 *
	 * @return the number of coordinates
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COORDINATE);

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
	 * Initializes the coordinate persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.edu.jhu.cvrg.waveform.main.dbpersistence.model.Coordinate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Coordinate>> listenersList = new ArrayList<ModelListener<Coordinate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Coordinate>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CoordinateImpl.class.getName());
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
	private static final String _SQL_SELECT_COORDINATE = "SELECT coordinate FROM Coordinate coordinate";
	private static final String _SQL_COUNT_COORDINATE = "SELECT COUNT(coordinate) FROM Coordinate coordinate";
	private static final String _ORDER_BY_ENTITY_ALIAS = "coordinate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Coordinate exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CoordinatePersistenceImpl.class);
	private static Coordinate _nullCoordinate = new CoordinateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Coordinate> toCacheModel() {
				return _nullCoordinateCacheModel;
			}
		};

	private static CacheModel<Coordinate> _nullCoordinateCacheModel = new CacheModel<Coordinate>() {
			public Coordinate toEntityModel() {
				return _nullCoordinate;
			}
		};
}