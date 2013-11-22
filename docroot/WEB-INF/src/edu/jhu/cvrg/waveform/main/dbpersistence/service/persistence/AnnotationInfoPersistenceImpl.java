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
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.AnnotationInfoImpl;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.AnnotationInfoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the annotation info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see AnnotationInfoPersistence
 * @see AnnotationInfoUtil
 * @generated
 */
public class AnnotationInfoPersistenceImpl extends BasePersistenceImpl<AnnotationInfo>
	implements AnnotationInfoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AnnotationInfoUtil} to access the annotation info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AnnotationInfoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RECORDID = new FinderPath(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoModelImpl.FINDER_CACHE_ENABLED,
			AnnotationInfoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRecordID",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECORDID =
		new FinderPath(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoModelImpl.FINDER_CACHE_ENABLED,
			AnnotationInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRecordID",
			new String[] { String.class.getName() },
			AnnotationInfoModelImpl.RECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RECORDID = new FinderPath(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRecordID",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_ANNOTATIONPROPERTIES = new FinderPath(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoModelImpl.FINDER_CACHE_ENABLED,
			AnnotationInfoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByAnnotationProperties",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			AnnotationInfoModelImpl.RECORDID_COLUMN_BITMASK |
			AnnotationInfoModelImpl.NAME_COLUMN_BITMASK |
			AnnotationInfoModelImpl.ANNOTATIONTYPE_COLUMN_BITMASK |
			AnnotationInfoModelImpl.LEAD_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ANNOTATIONPROPERTIES = new FinderPath(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAnnotationProperties",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ANNOTATIONTYPE =
		new FinderPath(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoModelImpl.FINDER_CACHE_ENABLED,
			AnnotationInfoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAnnotationType",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANNOTATIONTYPE =
		new FinderPath(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoModelImpl.FINDER_CACHE_ENABLED,
			AnnotationInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAnnotationType",
			new String[] { String.class.getName(), String.class.getName() },
			AnnotationInfoModelImpl.ANNOTATIONTYPE_COLUMN_BITMASK |
			AnnotationInfoModelImpl.RECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ANNOTATIONTYPE = new FinderPath(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAnnotationType",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoModelImpl.FINDER_CACHE_ENABLED,
			AnnotationInfoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoModelImpl.FINDER_CACHE_ENABLED,
			AnnotationInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the annotation info in the entity cache if it is enabled.
	 *
	 * @param annotationInfo the annotation info
	 */
	public void cacheResult(AnnotationInfo annotationInfo) {
		EntityCacheUtil.putResult(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoImpl.class, annotationInfo.getPrimaryKey(),
			annotationInfo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ANNOTATIONPROPERTIES,
			new Object[] {
				annotationInfo.getRecordID(),
				
			annotationInfo.getName(),
				
			annotationInfo.getAnnotationType(),
				
			annotationInfo.getLead()
			}, annotationInfo);

		annotationInfo.resetOriginalValues();
	}

	/**
	 * Caches the annotation infos in the entity cache if it is enabled.
	 *
	 * @param annotationInfos the annotation infos
	 */
	public void cacheResult(List<AnnotationInfo> annotationInfos) {
		for (AnnotationInfo annotationInfo : annotationInfos) {
			if (EntityCacheUtil.getResult(
						AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
						AnnotationInfoImpl.class, annotationInfo.getPrimaryKey()) == null) {
				cacheResult(annotationInfo);
			}
			else {
				annotationInfo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all annotation infos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AnnotationInfoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AnnotationInfoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the annotation info.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AnnotationInfo annotationInfo) {
		EntityCacheUtil.removeResult(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoImpl.class, annotationInfo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(annotationInfo);
	}

	@Override
	public void clearCache(List<AnnotationInfo> annotationInfos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AnnotationInfo annotationInfo : annotationInfos) {
			EntityCacheUtil.removeResult(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
				AnnotationInfoImpl.class, annotationInfo.getPrimaryKey());

			clearUniqueFindersCache(annotationInfo);
		}
	}

	protected void clearUniqueFindersCache(AnnotationInfo annotationInfo) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ANNOTATIONPROPERTIES,
			new Object[] {
				annotationInfo.getRecordID(),
				
			annotationInfo.getName(),
				
			annotationInfo.getAnnotationType(),
				
			annotationInfo.getLead()
			});
	}

	/**
	 * Creates a new annotation info with the primary key. Does not add the annotation info to the database.
	 *
	 * @param AnnotationID the primary key for the new annotation info
	 * @return the new annotation info
	 */
	public AnnotationInfo create(String AnnotationID) {
		AnnotationInfo annotationInfo = new AnnotationInfoImpl();

		annotationInfo.setNew(true);
		annotationInfo.setPrimaryKey(AnnotationID);

		return annotationInfo;
	}

	/**
	 * Removes the annotation info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param AnnotationID the primary key of the annotation info
	 * @return the annotation info that was removed
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a annotation info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo remove(String AnnotationID)
		throws NoSuchAnnotationInfoException, SystemException {
		return remove((Serializable)AnnotationID);
	}

	/**
	 * Removes the annotation info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the annotation info
	 * @return the annotation info that was removed
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a annotation info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnnotationInfo remove(Serializable primaryKey)
		throws NoSuchAnnotationInfoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AnnotationInfo annotationInfo = (AnnotationInfo)session.get(AnnotationInfoImpl.class,
					primaryKey);

			if (annotationInfo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAnnotationInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(annotationInfo);
		}
		catch (NoSuchAnnotationInfoException nsee) {
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
	protected AnnotationInfo removeImpl(AnnotationInfo annotationInfo)
		throws SystemException {
		annotationInfo = toUnwrappedModel(annotationInfo);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, annotationInfo);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(annotationInfo);

		return annotationInfo;
	}

	@Override
	public AnnotationInfo updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo annotationInfo,
		boolean merge) throws SystemException {
		annotationInfo = toUnwrappedModel(annotationInfo);

		boolean isNew = annotationInfo.isNew();

		AnnotationInfoModelImpl annotationInfoModelImpl = (AnnotationInfoModelImpl)annotationInfo;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, annotationInfo, merge);

			annotationInfo.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AnnotationInfoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((annotationInfoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						annotationInfoModelImpl.getOriginalRecordID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RECORDID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECORDID,
					args);

				args = new Object[] { annotationInfoModelImpl.getRecordID() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RECORDID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECORDID,
					args);
			}

			if ((annotationInfoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANNOTATIONTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						annotationInfoModelImpl.getOriginalAnnotationType(),
						
						annotationInfoModelImpl.getOriginalRecordID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ANNOTATIONTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANNOTATIONTYPE,
					args);

				args = new Object[] {
						annotationInfoModelImpl.getAnnotationType(),
						
						annotationInfoModelImpl.getRecordID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ANNOTATIONTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANNOTATIONTYPE,
					args);
			}
		}

		EntityCacheUtil.putResult(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
			AnnotationInfoImpl.class, annotationInfo.getPrimaryKey(),
			annotationInfo);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ANNOTATIONPROPERTIES,
				new Object[] {
					annotationInfo.getRecordID(),
					
				annotationInfo.getName(),
					
				annotationInfo.getAnnotationType(),
					
				annotationInfo.getLead()
				}, annotationInfo);
		}
		else {
			if ((annotationInfoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ANNOTATIONPROPERTIES.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						annotationInfoModelImpl.getOriginalRecordID(),
						
						annotationInfoModelImpl.getOriginalName(),
						
						annotationInfoModelImpl.getOriginalAnnotationType(),
						
						annotationInfoModelImpl.getOriginalLead()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ANNOTATIONPROPERTIES,
					args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ANNOTATIONPROPERTIES,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ANNOTATIONPROPERTIES,
					new Object[] {
						annotationInfo.getRecordID(),
						
					annotationInfo.getName(),
						
					annotationInfo.getAnnotationType(),
						
					annotationInfo.getLead()
					}, annotationInfo);
			}
		}

		return annotationInfo;
	}

	protected AnnotationInfo toUnwrappedModel(AnnotationInfo annotationInfo) {
		if (annotationInfo instanceof AnnotationInfoImpl) {
			return annotationInfo;
		}

		AnnotationInfoImpl annotationInfoImpl = new AnnotationInfoImpl();

		annotationInfoImpl.setNew(annotationInfo.isNew());
		annotationInfoImpl.setPrimaryKey(annotationInfo.getPrimaryKey());

		annotationInfoImpl.setAnnotationID(annotationInfo.getAnnotationID());
		annotationInfoImpl.setCreatedBy(annotationInfo.getCreatedBy());
		annotationInfoImpl.setAnnotationType(annotationInfo.getAnnotationType());
		annotationInfoImpl.setName(annotationInfo.getName());
		annotationInfoImpl.setBioportalReference(annotationInfo.getBioportalReference());
		annotationInfoImpl.setLead(annotationInfo.getLead());
		annotationInfoImpl.setStartingCoordinateID(annotationInfo.getStartingCoordinateID());
		annotationInfoImpl.setEndingCoordinateID(annotationInfo.getEndingCoordinateID());
		annotationInfoImpl.setUnitOfMeasurement(annotationInfo.getUnitOfMeasurement());
		annotationInfoImpl.setDescription(annotationInfo.getDescription());
		annotationInfoImpl.setValue(annotationInfo.getValue());
		annotationInfoImpl.setRecordID(annotationInfo.getRecordID());
		annotationInfoImpl.setTimestamp(annotationInfo.getTimestamp());

		return annotationInfoImpl;
	}

	/**
	 * Returns the annotation info with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the annotation info
	 * @return the annotation info
	 * @throws com.liferay.portal.NoSuchModelException if a annotation info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnnotationInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the annotation info with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException} if it could not be found.
	 *
	 * @param AnnotationID the primary key of the annotation info
	 * @return the annotation info
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a annotation info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo findByPrimaryKey(String AnnotationID)
		throws NoSuchAnnotationInfoException, SystemException {
		AnnotationInfo annotationInfo = fetchByPrimaryKey(AnnotationID);

		if (annotationInfo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + AnnotationID);
			}

			throw new NoSuchAnnotationInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				AnnotationID);
		}

		return annotationInfo;
	}

	/**
	 * Returns the annotation info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the annotation info
	 * @return the annotation info, or <code>null</code> if a annotation info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AnnotationInfo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the annotation info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param AnnotationID the primary key of the annotation info
	 * @return the annotation info, or <code>null</code> if a annotation info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo fetchByPrimaryKey(String AnnotationID)
		throws SystemException {
		AnnotationInfo annotationInfo = (AnnotationInfo)EntityCacheUtil.getResult(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
				AnnotationInfoImpl.class, AnnotationID);

		if (annotationInfo == _nullAnnotationInfo) {
			return null;
		}

		if (annotationInfo == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				annotationInfo = (AnnotationInfo)session.get(AnnotationInfoImpl.class,
						AnnotationID);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (annotationInfo != null) {
					cacheResult(annotationInfo);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(AnnotationInfoModelImpl.ENTITY_CACHE_ENABLED,
						AnnotationInfoImpl.class, AnnotationID,
						_nullAnnotationInfo);
				}

				closeSession(session);
			}
		}

		return annotationInfo;
	}

	/**
	 * Returns all the annotation infos where RecordID = &#63;.
	 *
	 * @param RecordID the record i d
	 * @return the matching annotation infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<AnnotationInfo> findByRecordID(String RecordID)
		throws SystemException {
		return findByRecordID(RecordID, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the annotation infos where RecordID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param RecordID the record i d
	 * @param start the lower bound of the range of annotation infos
	 * @param end the upper bound of the range of annotation infos (not inclusive)
	 * @return the range of matching annotation infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<AnnotationInfo> findByRecordID(String RecordID, int start,
		int end) throws SystemException {
		return findByRecordID(RecordID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the annotation infos where RecordID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param RecordID the record i d
	 * @param start the lower bound of the range of annotation infos
	 * @param end the upper bound of the range of annotation infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching annotation infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<AnnotationInfo> findByRecordID(String RecordID, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECORDID;
			finderArgs = new Object[] { RecordID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RECORDID;
			finderArgs = new Object[] { RecordID, start, end, orderByComparator };
		}

		List<AnnotationInfo> list = (List<AnnotationInfo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AnnotationInfo annotationInfo : list) {
				if (!Validator.equals(RecordID, annotationInfo.getRecordID())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_ANNOTATIONINFO_WHERE);

			if (RecordID == null) {
				query.append(_FINDER_COLUMN_RECORDID_RECORDID_1);
			}
			else {
				if (RecordID.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RECORDID_RECORDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_RECORDID_RECORDID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (RecordID != null) {
					qPos.add(RecordID);
				}

				list = (List<AnnotationInfo>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Returns the first annotation info in the ordered set where RecordID = &#63;.
	 *
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching annotation info
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a matching annotation info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo findByRecordID_First(String RecordID,
		OrderByComparator orderByComparator)
		throws NoSuchAnnotationInfoException, SystemException {
		AnnotationInfo annotationInfo = fetchByRecordID_First(RecordID,
				orderByComparator);

		if (annotationInfo != null) {
			return annotationInfo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("RecordID=");
		msg.append(RecordID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAnnotationInfoException(msg.toString());
	}

	/**
	 * Returns the first annotation info in the ordered set where RecordID = &#63;.
	 *
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching annotation info, or <code>null</code> if a matching annotation info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo fetchByRecordID_First(String RecordID,
		OrderByComparator orderByComparator) throws SystemException {
		List<AnnotationInfo> list = findByRecordID(RecordID, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last annotation info in the ordered set where RecordID = &#63;.
	 *
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching annotation info
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a matching annotation info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo findByRecordID_Last(String RecordID,
		OrderByComparator orderByComparator)
		throws NoSuchAnnotationInfoException, SystemException {
		AnnotationInfo annotationInfo = fetchByRecordID_Last(RecordID,
				orderByComparator);

		if (annotationInfo != null) {
			return annotationInfo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("RecordID=");
		msg.append(RecordID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAnnotationInfoException(msg.toString());
	}

	/**
	 * Returns the last annotation info in the ordered set where RecordID = &#63;.
	 *
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching annotation info, or <code>null</code> if a matching annotation info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo fetchByRecordID_Last(String RecordID,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRecordID(RecordID);

		List<AnnotationInfo> list = findByRecordID(RecordID, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the annotation infos before and after the current annotation info in the ordered set where RecordID = &#63;.
	 *
	 * @param AnnotationID the primary key of the current annotation info
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next annotation info
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a annotation info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo[] findByRecordID_PrevAndNext(String AnnotationID,
		String RecordID, OrderByComparator orderByComparator)
		throws NoSuchAnnotationInfoException, SystemException {
		AnnotationInfo annotationInfo = findByPrimaryKey(AnnotationID);

		Session session = null;

		try {
			session = openSession();

			AnnotationInfo[] array = new AnnotationInfoImpl[3];

			array[0] = getByRecordID_PrevAndNext(session, annotationInfo,
					RecordID, orderByComparator, true);

			array[1] = annotationInfo;

			array[2] = getByRecordID_PrevAndNext(session, annotationInfo,
					RecordID, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AnnotationInfo getByRecordID_PrevAndNext(Session session,
		AnnotationInfo annotationInfo, String RecordID,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ANNOTATIONINFO_WHERE);

		if (RecordID == null) {
			query.append(_FINDER_COLUMN_RECORDID_RECORDID_1);
		}
		else {
			if (RecordID.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RECORDID_RECORDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_RECORDID_RECORDID_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (RecordID != null) {
			qPos.add(RecordID);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(annotationInfo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AnnotationInfo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the annotation info where RecordID = &#63; and Name = &#63; and AnnotationType = &#63; and Lead = &#63; or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException} if it could not be found.
	 *
	 * @param RecordID the record i d
	 * @param Name the name
	 * @param AnnotationType the annotation type
	 * @param Lead the lead
	 * @return the matching annotation info
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a matching annotation info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo findByAnnotationProperties(String RecordID,
		String Name, String AnnotationType, String Lead)
		throws NoSuchAnnotationInfoException, SystemException {
		AnnotationInfo annotationInfo = fetchByAnnotationProperties(RecordID,
				Name, AnnotationType, Lead);

		if (annotationInfo == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("RecordID=");
			msg.append(RecordID);

			msg.append(", Name=");
			msg.append(Name);

			msg.append(", AnnotationType=");
			msg.append(AnnotationType);

			msg.append(", Lead=");
			msg.append(Lead);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchAnnotationInfoException(msg.toString());
		}

		return annotationInfo;
	}

	/**
	 * Returns the annotation info where RecordID = &#63; and Name = &#63; and AnnotationType = &#63; and Lead = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param RecordID the record i d
	 * @param Name the name
	 * @param AnnotationType the annotation type
	 * @param Lead the lead
	 * @return the matching annotation info, or <code>null</code> if a matching annotation info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo fetchByAnnotationProperties(String RecordID,
		String Name, String AnnotationType, String Lead)
		throws SystemException {
		return fetchByAnnotationProperties(RecordID, Name, AnnotationType,
			Lead, true);
	}

	/**
	 * Returns the annotation info where RecordID = &#63; and Name = &#63; and AnnotationType = &#63; and Lead = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param RecordID the record i d
	 * @param Name the name
	 * @param AnnotationType the annotation type
	 * @param Lead the lead
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching annotation info, or <code>null</code> if a matching annotation info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo fetchByAnnotationProperties(String RecordID,
		String Name, String AnnotationType, String Lead,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { RecordID, Name, AnnotationType, Lead };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ANNOTATIONPROPERTIES,
					finderArgs, this);
		}

		if (result instanceof AnnotationInfo) {
			AnnotationInfo annotationInfo = (AnnotationInfo)result;

			if (!Validator.equals(RecordID, annotationInfo.getRecordID()) ||
					!Validator.equals(Name, annotationInfo.getName()) ||
					!Validator.equals(AnnotationType,
						annotationInfo.getAnnotationType()) ||
					!Validator.equals(Lead, annotationInfo.getLead())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_ANNOTATIONINFO_WHERE);

			if (RecordID == null) {
				query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_RECORDID_1);
			}
			else {
				if (RecordID.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_RECORDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_RECORDID_2);
				}
			}

			if (Name == null) {
				query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_NAME_1);
			}
			else {
				if (Name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_NAME_2);
				}
			}

			if (AnnotationType == null) {
				query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_ANNOTATIONTYPE_1);
			}
			else {
				if (AnnotationType.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_ANNOTATIONTYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_ANNOTATIONTYPE_2);
				}
			}

			if (Lead == null) {
				query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_LEAD_1);
			}
			else {
				if (Lead.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_LEAD_3);
				}
				else {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_LEAD_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (RecordID != null) {
					qPos.add(RecordID);
				}

				if (Name != null) {
					qPos.add(Name);
				}

				if (AnnotationType != null) {
					qPos.add(AnnotationType);
				}

				if (Lead != null) {
					qPos.add(Lead);
				}

				List<AnnotationInfo> list = q.list();

				result = list;

				AnnotationInfo annotationInfo = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ANNOTATIONPROPERTIES,
						finderArgs, list);
				}
				else {
					annotationInfo = list.get(0);

					cacheResult(annotationInfo);

					if ((annotationInfo.getRecordID() == null) ||
							!annotationInfo.getRecordID().equals(RecordID) ||
							(annotationInfo.getName() == null) ||
							!annotationInfo.getName().equals(Name) ||
							(annotationInfo.getAnnotationType() == null) ||
							!annotationInfo.getAnnotationType()
											   .equals(AnnotationType) ||
							(annotationInfo.getLead() == null) ||
							!annotationInfo.getLead().equals(Lead)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ANNOTATIONPROPERTIES,
							finderArgs, annotationInfo);
					}
				}

				return annotationInfo;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ANNOTATIONPROPERTIES,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (AnnotationInfo)result;
			}
		}
	}

	/**
	 * Returns all the annotation infos where AnnotationType = &#63; and RecordID = &#63;.
	 *
	 * @param AnnotationType the annotation type
	 * @param RecordID the record i d
	 * @return the matching annotation infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<AnnotationInfo> findByAnnotationType(String AnnotationType,
		String RecordID) throws SystemException {
		return findByAnnotationType(AnnotationType, RecordID,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the annotation infos where AnnotationType = &#63; and RecordID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param AnnotationType the annotation type
	 * @param RecordID the record i d
	 * @param start the lower bound of the range of annotation infos
	 * @param end the upper bound of the range of annotation infos (not inclusive)
	 * @return the range of matching annotation infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<AnnotationInfo> findByAnnotationType(String AnnotationType,
		String RecordID, int start, int end) throws SystemException {
		return findByAnnotationType(AnnotationType, RecordID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the annotation infos where AnnotationType = &#63; and RecordID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param AnnotationType the annotation type
	 * @param RecordID the record i d
	 * @param start the lower bound of the range of annotation infos
	 * @param end the upper bound of the range of annotation infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching annotation infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<AnnotationInfo> findByAnnotationType(String AnnotationType,
		String RecordID, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANNOTATIONTYPE;
			finderArgs = new Object[] { AnnotationType, RecordID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ANNOTATIONTYPE;
			finderArgs = new Object[] {
					AnnotationType, RecordID,
					
					start, end, orderByComparator
				};
		}

		List<AnnotationInfo> list = (List<AnnotationInfo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AnnotationInfo annotationInfo : list) {
				if (!Validator.equals(AnnotationType,
							annotationInfo.getAnnotationType()) ||
						!Validator.equals(RecordID, annotationInfo.getRecordID())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ANNOTATIONINFO_WHERE);

			if (AnnotationType == null) {
				query.append(_FINDER_COLUMN_ANNOTATIONTYPE_ANNOTATIONTYPE_1);
			}
			else {
				if (AnnotationType.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ANNOTATIONTYPE_ANNOTATIONTYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ANNOTATIONTYPE_ANNOTATIONTYPE_2);
				}
			}

			if (RecordID == null) {
				query.append(_FINDER_COLUMN_ANNOTATIONTYPE_RECORDID_1);
			}
			else {
				if (RecordID.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ANNOTATIONTYPE_RECORDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ANNOTATIONTYPE_RECORDID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (AnnotationType != null) {
					qPos.add(AnnotationType);
				}

				if (RecordID != null) {
					qPos.add(RecordID);
				}

				list = (List<AnnotationInfo>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Returns the first annotation info in the ordered set where AnnotationType = &#63; and RecordID = &#63;.
	 *
	 * @param AnnotationType the annotation type
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching annotation info
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a matching annotation info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo findByAnnotationType_First(String AnnotationType,
		String RecordID, OrderByComparator orderByComparator)
		throws NoSuchAnnotationInfoException, SystemException {
		AnnotationInfo annotationInfo = fetchByAnnotationType_First(AnnotationType,
				RecordID, orderByComparator);

		if (annotationInfo != null) {
			return annotationInfo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("AnnotationType=");
		msg.append(AnnotationType);

		msg.append(", RecordID=");
		msg.append(RecordID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAnnotationInfoException(msg.toString());
	}

	/**
	 * Returns the first annotation info in the ordered set where AnnotationType = &#63; and RecordID = &#63;.
	 *
	 * @param AnnotationType the annotation type
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching annotation info, or <code>null</code> if a matching annotation info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo fetchByAnnotationType_First(String AnnotationType,
		String RecordID, OrderByComparator orderByComparator)
		throws SystemException {
		List<AnnotationInfo> list = findByAnnotationType(AnnotationType,
				RecordID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last annotation info in the ordered set where AnnotationType = &#63; and RecordID = &#63;.
	 *
	 * @param AnnotationType the annotation type
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching annotation info
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a matching annotation info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo findByAnnotationType_Last(String AnnotationType,
		String RecordID, OrderByComparator orderByComparator)
		throws NoSuchAnnotationInfoException, SystemException {
		AnnotationInfo annotationInfo = fetchByAnnotationType_Last(AnnotationType,
				RecordID, orderByComparator);

		if (annotationInfo != null) {
			return annotationInfo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("AnnotationType=");
		msg.append(AnnotationType);

		msg.append(", RecordID=");
		msg.append(RecordID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAnnotationInfoException(msg.toString());
	}

	/**
	 * Returns the last annotation info in the ordered set where AnnotationType = &#63; and RecordID = &#63;.
	 *
	 * @param AnnotationType the annotation type
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching annotation info, or <code>null</code> if a matching annotation info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo fetchByAnnotationType_Last(String AnnotationType,
		String RecordID, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByAnnotationType(AnnotationType, RecordID);

		List<AnnotationInfo> list = findByAnnotationType(AnnotationType,
				RecordID, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the annotation infos before and after the current annotation info in the ordered set where AnnotationType = &#63; and RecordID = &#63;.
	 *
	 * @param AnnotationID the primary key of the current annotation info
	 * @param AnnotationType the annotation type
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next annotation info
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchAnnotationInfoException if a annotation info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo[] findByAnnotationType_PrevAndNext(
		String AnnotationID, String AnnotationType, String RecordID,
		OrderByComparator orderByComparator)
		throws NoSuchAnnotationInfoException, SystemException {
		AnnotationInfo annotationInfo = findByPrimaryKey(AnnotationID);

		Session session = null;

		try {
			session = openSession();

			AnnotationInfo[] array = new AnnotationInfoImpl[3];

			array[0] = getByAnnotationType_PrevAndNext(session, annotationInfo,
					AnnotationType, RecordID, orderByComparator, true);

			array[1] = annotationInfo;

			array[2] = getByAnnotationType_PrevAndNext(session, annotationInfo,
					AnnotationType, RecordID, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AnnotationInfo getByAnnotationType_PrevAndNext(Session session,
		AnnotationInfo annotationInfo, String AnnotationType, String RecordID,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ANNOTATIONINFO_WHERE);

		if (AnnotationType == null) {
			query.append(_FINDER_COLUMN_ANNOTATIONTYPE_ANNOTATIONTYPE_1);
		}
		else {
			if (AnnotationType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ANNOTATIONTYPE_ANNOTATIONTYPE_3);
			}
			else {
				query.append(_FINDER_COLUMN_ANNOTATIONTYPE_ANNOTATIONTYPE_2);
			}
		}

		if (RecordID == null) {
			query.append(_FINDER_COLUMN_ANNOTATIONTYPE_RECORDID_1);
		}
		else {
			if (RecordID.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ANNOTATIONTYPE_RECORDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_ANNOTATIONTYPE_RECORDID_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (AnnotationType != null) {
			qPos.add(AnnotationType);
		}

		if (RecordID != null) {
			qPos.add(RecordID);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(annotationInfo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AnnotationInfo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the annotation infos.
	 *
	 * @return the annotation infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<AnnotationInfo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the annotation infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of annotation infos
	 * @param end the upper bound of the range of annotation infos (not inclusive)
	 * @return the range of annotation infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<AnnotationInfo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the annotation infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of annotation infos
	 * @param end the upper bound of the range of annotation infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of annotation infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<AnnotationInfo> findAll(int start, int end,
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

		List<AnnotationInfo> list = (List<AnnotationInfo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ANNOTATIONINFO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANNOTATIONINFO;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<AnnotationInfo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<AnnotationInfo>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the annotation infos where RecordID = &#63; from the database.
	 *
	 * @param RecordID the record i d
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRecordID(String RecordID) throws SystemException {
		for (AnnotationInfo annotationInfo : findByRecordID(RecordID)) {
			remove(annotationInfo);
		}
	}

	/**
	 * Removes the annotation info where RecordID = &#63; and Name = &#63; and AnnotationType = &#63; and Lead = &#63; from the database.
	 *
	 * @param RecordID the record i d
	 * @param Name the name
	 * @param AnnotationType the annotation type
	 * @param Lead the lead
	 * @return the annotation info that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public AnnotationInfo removeByAnnotationProperties(String RecordID,
		String Name, String AnnotationType, String Lead)
		throws NoSuchAnnotationInfoException, SystemException {
		AnnotationInfo annotationInfo = findByAnnotationProperties(RecordID,
				Name, AnnotationType, Lead);

		return remove(annotationInfo);
	}

	/**
	 * Removes all the annotation infos where AnnotationType = &#63; and RecordID = &#63; from the database.
	 *
	 * @param AnnotationType the annotation type
	 * @param RecordID the record i d
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAnnotationType(String AnnotationType, String RecordID)
		throws SystemException {
		for (AnnotationInfo annotationInfo : findByAnnotationType(
				AnnotationType, RecordID)) {
			remove(annotationInfo);
		}
	}

	/**
	 * Removes all the annotation infos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (AnnotationInfo annotationInfo : findAll()) {
			remove(annotationInfo);
		}
	}

	/**
	 * Returns the number of annotation infos where RecordID = &#63;.
	 *
	 * @param RecordID the record i d
	 * @return the number of matching annotation infos
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRecordID(String RecordID) throws SystemException {
		Object[] finderArgs = new Object[] { RecordID };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_RECORDID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ANNOTATIONINFO_WHERE);

			if (RecordID == null) {
				query.append(_FINDER_COLUMN_RECORDID_RECORDID_1);
			}
			else {
				if (RecordID.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RECORDID_RECORDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_RECORDID_RECORDID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (RecordID != null) {
					qPos.add(RecordID);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RECORDID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of annotation infos where RecordID = &#63; and Name = &#63; and AnnotationType = &#63; and Lead = &#63;.
	 *
	 * @param RecordID the record i d
	 * @param Name the name
	 * @param AnnotationType the annotation type
	 * @param Lead the lead
	 * @return the number of matching annotation infos
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAnnotationProperties(String RecordID, String Name,
		String AnnotationType, String Lead) throws SystemException {
		Object[] finderArgs = new Object[] { RecordID, Name, AnnotationType, Lead };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ANNOTATIONPROPERTIES,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_ANNOTATIONINFO_WHERE);

			if (RecordID == null) {
				query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_RECORDID_1);
			}
			else {
				if (RecordID.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_RECORDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_RECORDID_2);
				}
			}

			if (Name == null) {
				query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_NAME_1);
			}
			else {
				if (Name.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_NAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_NAME_2);
				}
			}

			if (AnnotationType == null) {
				query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_ANNOTATIONTYPE_1);
			}
			else {
				if (AnnotationType.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_ANNOTATIONTYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_ANNOTATIONTYPE_2);
				}
			}

			if (Lead == null) {
				query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_LEAD_1);
			}
			else {
				if (Lead.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_LEAD_3);
				}
				else {
					query.append(_FINDER_COLUMN_ANNOTATIONPROPERTIES_LEAD_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (RecordID != null) {
					qPos.add(RecordID);
				}

				if (Name != null) {
					qPos.add(Name);
				}

				if (AnnotationType != null) {
					qPos.add(AnnotationType);
				}

				if (Lead != null) {
					qPos.add(Lead);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ANNOTATIONPROPERTIES,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of annotation infos where AnnotationType = &#63; and RecordID = &#63;.
	 *
	 * @param AnnotationType the annotation type
	 * @param RecordID the record i d
	 * @return the number of matching annotation infos
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAnnotationType(String AnnotationType, String RecordID)
		throws SystemException {
		Object[] finderArgs = new Object[] { AnnotationType, RecordID };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ANNOTATIONTYPE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ANNOTATIONINFO_WHERE);

			if (AnnotationType == null) {
				query.append(_FINDER_COLUMN_ANNOTATIONTYPE_ANNOTATIONTYPE_1);
			}
			else {
				if (AnnotationType.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ANNOTATIONTYPE_ANNOTATIONTYPE_3);
				}
				else {
					query.append(_FINDER_COLUMN_ANNOTATIONTYPE_ANNOTATIONTYPE_2);
				}
			}

			if (RecordID == null) {
				query.append(_FINDER_COLUMN_ANNOTATIONTYPE_RECORDID_1);
			}
			else {
				if (RecordID.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ANNOTATIONTYPE_RECORDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ANNOTATIONTYPE_RECORDID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (AnnotationType != null) {
					qPos.add(AnnotationType);
				}

				if (RecordID != null) {
					qPos.add(RecordID);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ANNOTATIONTYPE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of annotation infos.
	 *
	 * @return the number of annotation infos
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANNOTATIONINFO);

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
	 * Initializes the annotation info persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.edu.jhu.cvrg.waveform.main.dbpersistence.model.AnnotationInfo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AnnotationInfo>> listenersList = new ArrayList<ModelListener<AnnotationInfo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AnnotationInfo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AnnotationInfoImpl.class.getName());
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
	private static final String _SQL_SELECT_ANNOTATIONINFO = "SELECT annotationInfo FROM AnnotationInfo annotationInfo";
	private static final String _SQL_SELECT_ANNOTATIONINFO_WHERE = "SELECT annotationInfo FROM AnnotationInfo annotationInfo WHERE ";
	private static final String _SQL_COUNT_ANNOTATIONINFO = "SELECT COUNT(annotationInfo) FROM AnnotationInfo annotationInfo";
	private static final String _SQL_COUNT_ANNOTATIONINFO_WHERE = "SELECT COUNT(annotationInfo) FROM AnnotationInfo annotationInfo WHERE ";
	private static final String _FINDER_COLUMN_RECORDID_RECORDID_1 = "annotationInfo.RecordID IS NULL";
	private static final String _FINDER_COLUMN_RECORDID_RECORDID_2 = "annotationInfo.RecordID = ?";
	private static final String _FINDER_COLUMN_RECORDID_RECORDID_3 = "(annotationInfo.RecordID IS NULL OR annotationInfo.RecordID = ?)";
	private static final String _FINDER_COLUMN_ANNOTATIONPROPERTIES_RECORDID_1 = "annotationInfo.RecordID IS NULL AND ";
	private static final String _FINDER_COLUMN_ANNOTATIONPROPERTIES_RECORDID_2 = "annotationInfo.RecordID = ? AND ";
	private static final String _FINDER_COLUMN_ANNOTATIONPROPERTIES_RECORDID_3 = "(annotationInfo.RecordID IS NULL OR annotationInfo.RecordID = ?) AND ";
	private static final String _FINDER_COLUMN_ANNOTATIONPROPERTIES_NAME_1 = "annotationInfo.Name IS NULL AND ";
	private static final String _FINDER_COLUMN_ANNOTATIONPROPERTIES_NAME_2 = "annotationInfo.Name = ? AND ";
	private static final String _FINDER_COLUMN_ANNOTATIONPROPERTIES_NAME_3 = "(annotationInfo.Name IS NULL OR annotationInfo.Name = ?) AND ";
	private static final String _FINDER_COLUMN_ANNOTATIONPROPERTIES_ANNOTATIONTYPE_1 =
		"annotationInfo.AnnotationType IS NULL AND ";
	private static final String _FINDER_COLUMN_ANNOTATIONPROPERTIES_ANNOTATIONTYPE_2 =
		"annotationInfo.AnnotationType = ? AND ";
	private static final String _FINDER_COLUMN_ANNOTATIONPROPERTIES_ANNOTATIONTYPE_3 =
		"(annotationInfo.AnnotationType IS NULL OR annotationInfo.AnnotationType = ?) AND ";
	private static final String _FINDER_COLUMN_ANNOTATIONPROPERTIES_LEAD_1 = "annotationInfo.Lead IS NULL";
	private static final String _FINDER_COLUMN_ANNOTATIONPROPERTIES_LEAD_2 = "annotationInfo.Lead = ?";
	private static final String _FINDER_COLUMN_ANNOTATIONPROPERTIES_LEAD_3 = "(annotationInfo.Lead IS NULL OR annotationInfo.Lead = ?)";
	private static final String _FINDER_COLUMN_ANNOTATIONTYPE_ANNOTATIONTYPE_1 = "annotationInfo.AnnotationType IS NULL AND ";
	private static final String _FINDER_COLUMN_ANNOTATIONTYPE_ANNOTATIONTYPE_2 = "annotationInfo.AnnotationType = ? AND ";
	private static final String _FINDER_COLUMN_ANNOTATIONTYPE_ANNOTATIONTYPE_3 = "(annotationInfo.AnnotationType IS NULL OR annotationInfo.AnnotationType = ?) AND ";
	private static final String _FINDER_COLUMN_ANNOTATIONTYPE_RECORDID_1 = "annotationInfo.RecordID IS NULL";
	private static final String _FINDER_COLUMN_ANNOTATIONTYPE_RECORDID_2 = "annotationInfo.RecordID = ?";
	private static final String _FINDER_COLUMN_ANNOTATIONTYPE_RECORDID_3 = "(annotationInfo.RecordID IS NULL OR annotationInfo.RecordID = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "annotationInfo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AnnotationInfo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AnnotationInfo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AnnotationInfoPersistenceImpl.class);
	private static AnnotationInfo _nullAnnotationInfo = new AnnotationInfoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AnnotationInfo> toCacheModel() {
				return _nullAnnotationInfoCacheModel;
			}
		};

	private static CacheModel<AnnotationInfo> _nullAnnotationInfoCacheModel = new CacheModel<AnnotationInfo>() {
			public AnnotationInfo toEntityModel() {
				return _nullAnnotationInfo;
			}
		};
}