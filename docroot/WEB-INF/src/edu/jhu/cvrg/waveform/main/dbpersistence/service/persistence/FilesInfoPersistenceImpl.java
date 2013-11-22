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

import edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.FilesInfoImpl;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.FilesInfoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the files info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see FilesInfoPersistence
 * @see FilesInfoUtil
 * @generated
 */
public class FilesInfoPersistenceImpl extends BasePersistenceImpl<FilesInfo>
	implements FilesInfoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FilesInfoUtil} to access the files info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FilesInfoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RECORDID = new FinderPath(FilesInfoModelImpl.ENTITY_CACHE_ENABLED,
			FilesInfoModelImpl.FINDER_CACHE_ENABLED, FilesInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRecordID",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECORDID =
		new FinderPath(FilesInfoModelImpl.ENTITY_CACHE_ENABLED,
			FilesInfoModelImpl.FINDER_CACHE_ENABLED, FilesInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRecordID",
			new String[] { String.class.getName() },
			FilesInfoModelImpl.RECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RECORDID = new FinderPath(FilesInfoModelImpl.ENTITY_CACHE_ENABLED,
			FilesInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRecordID",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FilesInfoModelImpl.ENTITY_CACHE_ENABLED,
			FilesInfoModelImpl.FINDER_CACHE_ENABLED, FilesInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FilesInfoModelImpl.ENTITY_CACHE_ENABLED,
			FilesInfoModelImpl.FINDER_CACHE_ENABLED, FilesInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FilesInfoModelImpl.ENTITY_CACHE_ENABLED,
			FilesInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the files info in the entity cache if it is enabled.
	 *
	 * @param filesInfo the files info
	 */
	public void cacheResult(FilesInfo filesInfo) {
		EntityCacheUtil.putResult(FilesInfoModelImpl.ENTITY_CACHE_ENABLED,
			FilesInfoImpl.class, filesInfo.getPrimaryKey(), filesInfo);

		filesInfo.resetOriginalValues();
	}

	/**
	 * Caches the files infos in the entity cache if it is enabled.
	 *
	 * @param filesInfos the files infos
	 */
	public void cacheResult(List<FilesInfo> filesInfos) {
		for (FilesInfo filesInfo : filesInfos) {
			if (EntityCacheUtil.getResult(
						FilesInfoModelImpl.ENTITY_CACHE_ENABLED,
						FilesInfoImpl.class, filesInfo.getPrimaryKey()) == null) {
				cacheResult(filesInfo);
			}
			else {
				filesInfo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all files infos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FilesInfoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FilesInfoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the files info.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FilesInfo filesInfo) {
		EntityCacheUtil.removeResult(FilesInfoModelImpl.ENTITY_CACHE_ENABLED,
			FilesInfoImpl.class, filesInfo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FilesInfo> filesInfos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FilesInfo filesInfo : filesInfos) {
			EntityCacheUtil.removeResult(FilesInfoModelImpl.ENTITY_CACHE_ENABLED,
				FilesInfoImpl.class, filesInfo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new files info with the primary key. Does not add the files info to the database.
	 *
	 * @param DocumentID the primary key for the new files info
	 * @return the new files info
	 */
	public FilesInfo create(String DocumentID) {
		FilesInfo filesInfo = new FilesInfoImpl();

		filesInfo.setNew(true);
		filesInfo.setPrimaryKey(DocumentID);

		return filesInfo;
	}

	/**
	 * Removes the files info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param DocumentID the primary key of the files info
	 * @return the files info that was removed
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a files info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FilesInfo remove(String DocumentID)
		throws NoSuchFilesInfoException, SystemException {
		return remove((Serializable)DocumentID);
	}

	/**
	 * Removes the files info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the files info
	 * @return the files info that was removed
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a files info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FilesInfo remove(Serializable primaryKey)
		throws NoSuchFilesInfoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FilesInfo filesInfo = (FilesInfo)session.get(FilesInfoImpl.class,
					primaryKey);

			if (filesInfo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilesInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(filesInfo);
		}
		catch (NoSuchFilesInfoException nsee) {
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
	protected FilesInfo removeImpl(FilesInfo filesInfo)
		throws SystemException {
		filesInfo = toUnwrappedModel(filesInfo);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, filesInfo);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(filesInfo);

		return filesInfo;
	}

	@Override
	public FilesInfo updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo filesInfo,
		boolean merge) throws SystemException {
		filesInfo = toUnwrappedModel(filesInfo);

		boolean isNew = filesInfo.isNew();

		FilesInfoModelImpl filesInfoModelImpl = (FilesInfoModelImpl)filesInfo;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, filesInfo, merge);

			filesInfo.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FilesInfoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((filesInfoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						filesInfoModelImpl.getOriginalRecordID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RECORDID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECORDID,
					args);

				args = new Object[] { filesInfoModelImpl.getRecordID() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RECORDID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECORDID,
					args);
			}
		}

		EntityCacheUtil.putResult(FilesInfoModelImpl.ENTITY_CACHE_ENABLED,
			FilesInfoImpl.class, filesInfo.getPrimaryKey(), filesInfo);

		return filesInfo;
	}

	protected FilesInfo toUnwrappedModel(FilesInfo filesInfo) {
		if (filesInfo instanceof FilesInfoImpl) {
			return filesInfo;
		}

		FilesInfoImpl filesInfoImpl = new FilesInfoImpl();

		filesInfoImpl.setNew(filesInfo.isNew());
		filesInfoImpl.setPrimaryKey(filesInfo.getPrimaryKey());

		filesInfoImpl.setDocumentID(filesInfo.getDocumentID());
		filesInfoImpl.setRecordID(filesInfo.getRecordID());

		return filesInfoImpl;
	}

	/**
	 * Returns the files info with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the files info
	 * @return the files info
	 * @throws com.liferay.portal.NoSuchModelException if a files info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FilesInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the files info with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException} if it could not be found.
	 *
	 * @param DocumentID the primary key of the files info
	 * @return the files info
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a files info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FilesInfo findByPrimaryKey(String DocumentID)
		throws NoSuchFilesInfoException, SystemException {
		FilesInfo filesInfo = fetchByPrimaryKey(DocumentID);

		if (filesInfo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + DocumentID);
			}

			throw new NoSuchFilesInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				DocumentID);
		}

		return filesInfo;
	}

	/**
	 * Returns the files info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the files info
	 * @return the files info, or <code>null</code> if a files info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FilesInfo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the files info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param DocumentID the primary key of the files info
	 * @return the files info, or <code>null</code> if a files info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FilesInfo fetchByPrimaryKey(String DocumentID)
		throws SystemException {
		FilesInfo filesInfo = (FilesInfo)EntityCacheUtil.getResult(FilesInfoModelImpl.ENTITY_CACHE_ENABLED,
				FilesInfoImpl.class, DocumentID);

		if (filesInfo == _nullFilesInfo) {
			return null;
		}

		if (filesInfo == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				filesInfo = (FilesInfo)session.get(FilesInfoImpl.class,
						DocumentID);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (filesInfo != null) {
					cacheResult(filesInfo);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FilesInfoModelImpl.ENTITY_CACHE_ENABLED,
						FilesInfoImpl.class, DocumentID, _nullFilesInfo);
				}

				closeSession(session);
			}
		}

		return filesInfo;
	}

	/**
	 * Returns all the files infos where RecordID = &#63;.
	 *
	 * @param RecordID the record i d
	 * @return the matching files infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<FilesInfo> findByRecordID(String RecordID)
		throws SystemException {
		return findByRecordID(RecordID, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the files infos where RecordID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param RecordID the record i d
	 * @param start the lower bound of the range of files infos
	 * @param end the upper bound of the range of files infos (not inclusive)
	 * @return the range of matching files infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<FilesInfo> findByRecordID(String RecordID, int start, int end)
		throws SystemException {
		return findByRecordID(RecordID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the files infos where RecordID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param RecordID the record i d
	 * @param start the lower bound of the range of files infos
	 * @param end the upper bound of the range of files infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching files infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<FilesInfo> findByRecordID(String RecordID, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<FilesInfo> list = (List<FilesInfo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FilesInfo filesInfo : list) {
				if (!Validator.equals(RecordID, filesInfo.getRecordID())) {
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

			query.append(_SQL_SELECT_FILESINFO_WHERE);

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

				list = (List<FilesInfo>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Returns the first files info in the ordered set where RecordID = &#63;.
	 *
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching files info
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a matching files info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FilesInfo findByRecordID_First(String RecordID,
		OrderByComparator orderByComparator)
		throws NoSuchFilesInfoException, SystemException {
		FilesInfo filesInfo = fetchByRecordID_First(RecordID, orderByComparator);

		if (filesInfo != null) {
			return filesInfo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("RecordID=");
		msg.append(RecordID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFilesInfoException(msg.toString());
	}

	/**
	 * Returns the first files info in the ordered set where RecordID = &#63;.
	 *
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching files info, or <code>null</code> if a matching files info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FilesInfo fetchByRecordID_First(String RecordID,
		OrderByComparator orderByComparator) throws SystemException {
		List<FilesInfo> list = findByRecordID(RecordID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last files info in the ordered set where RecordID = &#63;.
	 *
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching files info
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a matching files info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FilesInfo findByRecordID_Last(String RecordID,
		OrderByComparator orderByComparator)
		throws NoSuchFilesInfoException, SystemException {
		FilesInfo filesInfo = fetchByRecordID_Last(RecordID, orderByComparator);

		if (filesInfo != null) {
			return filesInfo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("RecordID=");
		msg.append(RecordID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFilesInfoException(msg.toString());
	}

	/**
	 * Returns the last files info in the ordered set where RecordID = &#63;.
	 *
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching files info, or <code>null</code> if a matching files info could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FilesInfo fetchByRecordID_Last(String RecordID,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRecordID(RecordID);

		List<FilesInfo> list = findByRecordID(RecordID, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the files infos before and after the current files info in the ordered set where RecordID = &#63;.
	 *
	 * @param DocumentID the primary key of the current files info
	 * @param RecordID the record i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next files info
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchFilesInfoException if a files info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FilesInfo[] findByRecordID_PrevAndNext(String DocumentID,
		String RecordID, OrderByComparator orderByComparator)
		throws NoSuchFilesInfoException, SystemException {
		FilesInfo filesInfo = findByPrimaryKey(DocumentID);

		Session session = null;

		try {
			session = openSession();

			FilesInfo[] array = new FilesInfoImpl[3];

			array[0] = getByRecordID_PrevAndNext(session, filesInfo, RecordID,
					orderByComparator, true);

			array[1] = filesInfo;

			array[2] = getByRecordID_PrevAndNext(session, filesInfo, RecordID,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FilesInfo getByRecordID_PrevAndNext(Session session,
		FilesInfo filesInfo, String RecordID,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FILESINFO_WHERE);

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
			Object[] values = orderByComparator.getOrderByConditionValues(filesInfo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FilesInfo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the files infos.
	 *
	 * @return the files infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<FilesInfo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	public List<FilesInfo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the files infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of files infos
	 * @param end the upper bound of the range of files infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of files infos
	 * @throws SystemException if a system exception occurred
	 */
	public List<FilesInfo> findAll(int start, int end,
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

		List<FilesInfo> list = (List<FilesInfo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FILESINFO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FILESINFO;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<FilesInfo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<FilesInfo>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the files infos where RecordID = &#63; from the database.
	 *
	 * @param RecordID the record i d
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByRecordID(String RecordID) throws SystemException {
		for (FilesInfo filesInfo : findByRecordID(RecordID)) {
			remove(filesInfo);
		}
	}

	/**
	 * Removes all the files infos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (FilesInfo filesInfo : findAll()) {
			remove(filesInfo);
		}
	}

	/**
	 * Returns the number of files infos where RecordID = &#63;.
	 *
	 * @param RecordID the record i d
	 * @return the number of matching files infos
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRecordID(String RecordID) throws SystemException {
		Object[] finderArgs = new Object[] { RecordID };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_RECORDID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FILESINFO_WHERE);

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
	 * Returns the number of files infos.
	 *
	 * @return the number of files infos
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FILESINFO);

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
	 * Initializes the files info persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.edu.jhu.cvrg.waveform.main.dbpersistence.model.FilesInfo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FilesInfo>> listenersList = new ArrayList<ModelListener<FilesInfo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FilesInfo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FilesInfoImpl.class.getName());
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
	private static final String _SQL_SELECT_FILESINFO = "SELECT filesInfo FROM FilesInfo filesInfo";
	private static final String _SQL_SELECT_FILESINFO_WHERE = "SELECT filesInfo FROM FilesInfo filesInfo WHERE ";
	private static final String _SQL_COUNT_FILESINFO = "SELECT COUNT(filesInfo) FROM FilesInfo filesInfo";
	private static final String _SQL_COUNT_FILESINFO_WHERE = "SELECT COUNT(filesInfo) FROM FilesInfo filesInfo WHERE ";
	private static final String _FINDER_COLUMN_RECORDID_RECORDID_1 = "filesInfo.RecordID IS NULL";
	private static final String _FINDER_COLUMN_RECORDID_RECORDID_2 = "filesInfo.RecordID = ?";
	private static final String _FINDER_COLUMN_RECORDID_RECORDID_3 = "(filesInfo.RecordID IS NULL OR filesInfo.RecordID = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "filesInfo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FilesInfo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FilesInfo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FilesInfoPersistenceImpl.class);
	private static FilesInfo _nullFilesInfo = new FilesInfoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FilesInfo> toCacheModel() {
				return _nullFilesInfoCacheModel;
			}
		};

	private static CacheModel<FilesInfo> _nullFilesInfoCacheModel = new CacheModel<FilesInfo>() {
			public FilesInfo toEntityModel() {
				return _nullFilesInfo;
			}
		};
}