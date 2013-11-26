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

import edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.DocumentRecordImpl;
import edu.jhu.cvrg.waveform.main.dbpersistence.model.impl.DocumentRecordModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the document record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bbenite1
 * @see DocumentRecordPersistence
 * @see DocumentRecordUtil
 * @generated
 */
public class DocumentRecordPersistenceImpl extends BasePersistenceImpl<DocumentRecord>
	implements DocumentRecordPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DocumentRecordUtil} to access the document record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DocumentRecordImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORIGINALFORMAT =
		new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED,
			DocumentRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByOriginalFormat",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALFORMAT =
		new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED,
			DocumentRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOriginalFormat",
			new String[] { String.class.getName() },
			DocumentRecordModelImpl.ORIGINALFORMAT_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORIGINALFORMAT = new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOriginalFormat",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_GETRECORDNAME = new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED,
			DocumentRecordImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByGetRecordName", new String[] { String.class.getName() },
			DocumentRecordModelImpl.RECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GETRECORDNAME = new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGetRecordName",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBJECTID =
		new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED,
			DocumentRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySubjectID",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBJECTID =
		new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED,
			DocumentRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySubjectID",
			new String[] { String.class.getName() },
			DocumentRecordModelImpl.SUBJECTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SUBJECTID = new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySubjectID",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED,
			DocumentRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUserID",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED,
			DocumentRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserID",
			new String[] { Long.class.getName() },
			DocumentRecordModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserID",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_RECORDPROPERTIES = new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED,
			DocumentRecordImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByRecordProperties",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			},
			DocumentRecordModelImpl.RECORDNAME_COLUMN_BITMASK |
			DocumentRecordModelImpl.USERID_COLUMN_BITMASK |
			DocumentRecordModelImpl.SUBJECTID_COLUMN_BITMASK |
			DocumentRecordModelImpl.FILETREEPATH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RECORDPROPERTIES = new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRecordProperties",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED,
			DocumentRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED,
			DocumentRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the document record in the entity cache if it is enabled.
	 *
	 * @param documentRecord the document record
	 */
	public void cacheResult(DocumentRecord documentRecord) {
		EntityCacheUtil.putResult(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordImpl.class, documentRecord.getPrimaryKey(),
			documentRecord);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETRECORDNAME,
			new Object[] { documentRecord.getRecordID() }, documentRecord);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RECORDPROPERTIES,
			new Object[] {
				documentRecord.getRecordName(),
				Long.valueOf(documentRecord.getUserID()),
				
			documentRecord.getSubjectID(),
				
			documentRecord.getFileTreePath()
			}, documentRecord);

		documentRecord.resetOriginalValues();
	}

	/**
	 * Caches the document records in the entity cache if it is enabled.
	 *
	 * @param documentRecords the document records
	 */
	public void cacheResult(List<DocumentRecord> documentRecords) {
		for (DocumentRecord documentRecord : documentRecords) {
			if (EntityCacheUtil.getResult(
						DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
						DocumentRecordImpl.class, documentRecord.getPrimaryKey()) == null) {
				cacheResult(documentRecord);
			}
			else {
				documentRecord.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all document records.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DocumentRecordImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DocumentRecordImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the document record.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DocumentRecord documentRecord) {
		EntityCacheUtil.removeResult(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordImpl.class, documentRecord.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(documentRecord);
	}

	@Override
	public void clearCache(List<DocumentRecord> documentRecords) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DocumentRecord documentRecord : documentRecords) {
			EntityCacheUtil.removeResult(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
				DocumentRecordImpl.class, documentRecord.getPrimaryKey());

			clearUniqueFindersCache(documentRecord);
		}
	}

	protected void clearUniqueFindersCache(DocumentRecord documentRecord) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GETRECORDNAME,
			new Object[] { documentRecord.getRecordID() });

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RECORDPROPERTIES,
			new Object[] {
				documentRecord.getRecordName(),
				Long.valueOf(documentRecord.getUserID()),
				
			documentRecord.getSubjectID(),
				
			documentRecord.getFileTreePath()
			});
	}

	/**
	 * Creates a new document record with the primary key. Does not add the document record to the database.
	 *
	 * @param RecordID the primary key for the new document record
	 * @return the new document record
	 */
	public DocumentRecord create(String RecordID) {
		DocumentRecord documentRecord = new DocumentRecordImpl();

		documentRecord.setNew(true);
		documentRecord.setPrimaryKey(RecordID);

		return documentRecord;
	}

	/**
	 * Removes the document record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param RecordID the primary key of the document record
	 * @return the document record that was removed
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord remove(String RecordID)
		throws NoSuchDocumentRecordException, SystemException {
		return remove((Serializable)RecordID);
	}

	/**
	 * Removes the document record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the document record
	 * @return the document record that was removed
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentRecord remove(Serializable primaryKey)
		throws NoSuchDocumentRecordException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DocumentRecord documentRecord = (DocumentRecord)session.get(DocumentRecordImpl.class,
					primaryKey);

			if (documentRecord == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocumentRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(documentRecord);
		}
		catch (NoSuchDocumentRecordException nsee) {
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
	protected DocumentRecord removeImpl(DocumentRecord documentRecord)
		throws SystemException {
		documentRecord = toUnwrappedModel(documentRecord);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, documentRecord);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(documentRecord);

		return documentRecord;
	}

	@Override
	public DocumentRecord updateImpl(
		edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord documentRecord,
		boolean merge) throws SystemException {
		documentRecord = toUnwrappedModel(documentRecord);

		boolean isNew = documentRecord.isNew();

		DocumentRecordModelImpl documentRecordModelImpl = (DocumentRecordModelImpl)documentRecord;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, documentRecord, merge);

			documentRecord.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DocumentRecordModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((documentRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALFORMAT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentRecordModelImpl.getOriginalOriginalFormat()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORIGINALFORMAT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALFORMAT,
					args);

				args = new Object[] { documentRecordModelImpl.getOriginalFormat() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORIGINALFORMAT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALFORMAT,
					args);
			}

			if ((documentRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBJECTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentRecordModelImpl.getOriginalSubjectID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SUBJECTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBJECTID,
					args);

				args = new Object[] { documentRecordModelImpl.getSubjectID() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SUBJECTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBJECTID,
					args);
			}

			if ((documentRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(documentRecordModelImpl.getOriginalUserID())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] {
						Long.valueOf(documentRecordModelImpl.getUserID())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		EntityCacheUtil.putResult(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
			DocumentRecordImpl.class, documentRecord.getPrimaryKey(),
			documentRecord);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETRECORDNAME,
				new Object[] { documentRecord.getRecordID() }, documentRecord);

			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RECORDPROPERTIES,
				new Object[] {
					documentRecord.getRecordName(),
					Long.valueOf(documentRecord.getUserID()),
					
				documentRecord.getSubjectID(),
					
				documentRecord.getFileTreePath()
				}, documentRecord);
		}
		else {
			if ((documentRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_GETRECORDNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentRecordModelImpl.getOriginalRecordID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GETRECORDNAME,
					args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GETRECORDNAME,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETRECORDNAME,
					new Object[] { documentRecord.getRecordID() },
					documentRecord);
			}

			if ((documentRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_RECORDPROPERTIES.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentRecordModelImpl.getOriginalRecordName(),
						Long.valueOf(documentRecordModelImpl.getOriginalUserID()),
						
						documentRecordModelImpl.getOriginalSubjectID(),
						
						documentRecordModelImpl.getOriginalFileTreePath()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RECORDPROPERTIES,
					args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RECORDPROPERTIES,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RECORDPROPERTIES,
					new Object[] {
						documentRecord.getRecordName(),
						Long.valueOf(documentRecord.getUserID()),
						
					documentRecord.getSubjectID(),
						
					documentRecord.getFileTreePath()
					}, documentRecord);
			}
		}

		return documentRecord;
	}

	protected DocumentRecord toUnwrappedModel(DocumentRecord documentRecord) {
		if (documentRecord instanceof DocumentRecordImpl) {
			return documentRecord;
		}

		DocumentRecordImpl documentRecordImpl = new DocumentRecordImpl();

		documentRecordImpl.setNew(documentRecord.isNew());
		documentRecordImpl.setPrimaryKey(documentRecord.getPrimaryKey());

		documentRecordImpl.setRecordID(documentRecord.getRecordID());
		documentRecordImpl.setRecordName(documentRecord.getRecordName());
		documentRecordImpl.setUserID(documentRecord.getUserID());
		documentRecordImpl.setSubjectID(documentRecord.getSubjectID());
		documentRecordImpl.setOriginalFormat(documentRecord.getOriginalFormat());
		documentRecordImpl.setSamplingRate(documentRecord.getSamplingRate());
		documentRecordImpl.setFileTreePath(documentRecord.getFileTreePath());
		documentRecordImpl.setLeadCount(documentRecord.getLeadCount());
		documentRecordImpl.setNumberOfPoints(documentRecord.getNumberOfPoints());
		documentRecordImpl.setDateOfUpload(documentRecord.getDateOfUpload());
		documentRecordImpl.setAge(documentRecord.getAge());
		documentRecordImpl.setGender(documentRecord.getGender());
		documentRecordImpl.setDateOfRecording(documentRecord.getDateOfRecording());
		documentRecordImpl.setAduGain(documentRecord.getAduGain());

		return documentRecordImpl;
	}

	/**
	 * Returns the document record with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the document record
	 * @return the document record
	 * @throws com.liferay.portal.NoSuchModelException if a document record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentRecord findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the document record with the primary key or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException} if it could not be found.
	 *
	 * @param RecordID the primary key of the document record
	 * @return the document record
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord findByPrimaryKey(String RecordID)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = fetchByPrimaryKey(RecordID);

		if (documentRecord == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + RecordID);
			}

			throw new NoSuchDocumentRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				RecordID);
		}

		return documentRecord;
	}

	/**
	 * Returns the document record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the document record
	 * @return the document record, or <code>null</code> if a document record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentRecord fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the document record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param RecordID the primary key of the document record
	 * @return the document record, or <code>null</code> if a document record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord fetchByPrimaryKey(String RecordID)
		throws SystemException {
		DocumentRecord documentRecord = (DocumentRecord)EntityCacheUtil.getResult(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
				DocumentRecordImpl.class, RecordID);

		if (documentRecord == _nullDocumentRecord) {
			return null;
		}

		if (documentRecord == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				documentRecord = (DocumentRecord)session.get(DocumentRecordImpl.class,
						RecordID);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (documentRecord != null) {
					cacheResult(documentRecord);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DocumentRecordModelImpl.ENTITY_CACHE_ENABLED,
						DocumentRecordImpl.class, RecordID, _nullDocumentRecord);
				}

				closeSession(session);
			}
		}

		return documentRecord;
	}

	/**
	 * Returns all the document records where OriginalFormat = &#63;.
	 *
	 * @param OriginalFormat the original format
	 * @return the matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public List<DocumentRecord> findByOriginalFormat(String OriginalFormat)
		throws SystemException {
		return findByOriginalFormat(OriginalFormat, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document records where OriginalFormat = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param OriginalFormat the original format
	 * @param start the lower bound of the range of document records
	 * @param end the upper bound of the range of document records (not inclusive)
	 * @return the range of matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public List<DocumentRecord> findByOriginalFormat(String OriginalFormat,
		int start, int end) throws SystemException {
		return findByOriginalFormat(OriginalFormat, start, end, null);
	}

	/**
	 * Returns an ordered range of all the document records where OriginalFormat = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param OriginalFormat the original format
	 * @param start the lower bound of the range of document records
	 * @param end the upper bound of the range of document records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public List<DocumentRecord> findByOriginalFormat(String OriginalFormat,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORIGINALFORMAT;
			finderArgs = new Object[] { OriginalFormat };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORIGINALFORMAT;
			finderArgs = new Object[] {
					OriginalFormat,
					
					start, end, orderByComparator
				};
		}

		List<DocumentRecord> list = (List<DocumentRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentRecord documentRecord : list) {
				if (!Validator.equals(OriginalFormat,
							documentRecord.getOriginalFormat())) {
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

			query.append(_SQL_SELECT_DOCUMENTRECORD_WHERE);

			if (OriginalFormat == null) {
				query.append(_FINDER_COLUMN_ORIGINALFORMAT_ORIGINALFORMAT_1);
			}
			else {
				if (OriginalFormat.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ORIGINALFORMAT_ORIGINALFORMAT_3);
				}
				else {
					query.append(_FINDER_COLUMN_ORIGINALFORMAT_ORIGINALFORMAT_2);
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

				if (OriginalFormat != null) {
					qPos.add(OriginalFormat);
				}

				list = (List<DocumentRecord>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first document record in the ordered set where OriginalFormat = &#63;.
	 *
	 * @param OriginalFormat the original format
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document record
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord findByOriginalFormat_First(String OriginalFormat,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = fetchByOriginalFormat_First(OriginalFormat,
				orderByComparator);

		if (documentRecord != null) {
			return documentRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("OriginalFormat=");
		msg.append(OriginalFormat);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentRecordException(msg.toString());
	}

	/**
	 * Returns the first document record in the ordered set where OriginalFormat = &#63;.
	 *
	 * @param OriginalFormat the original format
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document record, or <code>null</code> if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord fetchByOriginalFormat_First(String OriginalFormat,
		OrderByComparator orderByComparator) throws SystemException {
		List<DocumentRecord> list = findByOriginalFormat(OriginalFormat, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document record in the ordered set where OriginalFormat = &#63;.
	 *
	 * @param OriginalFormat the original format
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document record
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord findByOriginalFormat_Last(String OriginalFormat,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = fetchByOriginalFormat_Last(OriginalFormat,
				orderByComparator);

		if (documentRecord != null) {
			return documentRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("OriginalFormat=");
		msg.append(OriginalFormat);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentRecordException(msg.toString());
	}

	/**
	 * Returns the last document record in the ordered set where OriginalFormat = &#63;.
	 *
	 * @param OriginalFormat the original format
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document record, or <code>null</code> if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord fetchByOriginalFormat_Last(String OriginalFormat,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByOriginalFormat(OriginalFormat);

		List<DocumentRecord> list = findByOriginalFormat(OriginalFormat,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document records before and after the current document record in the ordered set where OriginalFormat = &#63;.
	 *
	 * @param RecordID the primary key of the current document record
	 * @param OriginalFormat the original format
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document record
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord[] findByOriginalFormat_PrevAndNext(String RecordID,
		String OriginalFormat, OrderByComparator orderByComparator)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = findByPrimaryKey(RecordID);

		Session session = null;

		try {
			session = openSession();

			DocumentRecord[] array = new DocumentRecordImpl[3];

			array[0] = getByOriginalFormat_PrevAndNext(session, documentRecord,
					OriginalFormat, orderByComparator, true);

			array[1] = documentRecord;

			array[2] = getByOriginalFormat_PrevAndNext(session, documentRecord,
					OriginalFormat, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DocumentRecord getByOriginalFormat_PrevAndNext(Session session,
		DocumentRecord documentRecord, String OriginalFormat,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTRECORD_WHERE);

		if (OriginalFormat == null) {
			query.append(_FINDER_COLUMN_ORIGINALFORMAT_ORIGINALFORMAT_1);
		}
		else {
			if (OriginalFormat.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORIGINALFORMAT_ORIGINALFORMAT_3);
			}
			else {
				query.append(_FINDER_COLUMN_ORIGINALFORMAT_ORIGINALFORMAT_2);
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

		if (OriginalFormat != null) {
			qPos.add(OriginalFormat);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the document record where RecordID = &#63; or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException} if it could not be found.
	 *
	 * @param RecordID the record i d
	 * @return the matching document record
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord findByGetRecordName(String RecordID)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = fetchByGetRecordName(RecordID);

		if (documentRecord == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("RecordID=");
			msg.append(RecordID);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDocumentRecordException(msg.toString());
		}

		return documentRecord;
	}

	/**
	 * Returns the document record where RecordID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param RecordID the record i d
	 * @return the matching document record, or <code>null</code> if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord fetchByGetRecordName(String RecordID)
		throws SystemException {
		return fetchByGetRecordName(RecordID, true);
	}

	/**
	 * Returns the document record where RecordID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param RecordID the record i d
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching document record, or <code>null</code> if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord fetchByGetRecordName(String RecordID,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { RecordID };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GETRECORDNAME,
					finderArgs, this);
		}

		if (result instanceof DocumentRecord) {
			DocumentRecord documentRecord = (DocumentRecord)result;

			if (!Validator.equals(RecordID, documentRecord.getRecordID())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_DOCUMENTRECORD_WHERE);

			if (RecordID == null) {
				query.append(_FINDER_COLUMN_GETRECORDNAME_RECORDID_1);
			}
			else {
				if (RecordID.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GETRECORDNAME_RECORDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_GETRECORDNAME_RECORDID_2);
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

				List<DocumentRecord> list = q.list();

				result = list;

				DocumentRecord documentRecord = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETRECORDNAME,
						finderArgs, list);
				}
				else {
					documentRecord = list.get(0);

					cacheResult(documentRecord);

					if ((documentRecord.getRecordID() == null) ||
							!documentRecord.getRecordID().equals(RecordID)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETRECORDNAME,
							finderArgs, documentRecord);
					}
				}

				return documentRecord;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GETRECORDNAME,
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
				return (DocumentRecord)result;
			}
		}
	}

	/**
	 * Returns all the document records where SubjectID = &#63;.
	 *
	 * @param SubjectID the subject i d
	 * @return the matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public List<DocumentRecord> findBySubjectID(String SubjectID)
		throws SystemException {
		return findBySubjectID(SubjectID, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the document records where SubjectID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param SubjectID the subject i d
	 * @param start the lower bound of the range of document records
	 * @param end the upper bound of the range of document records (not inclusive)
	 * @return the range of matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public List<DocumentRecord> findBySubjectID(String SubjectID, int start,
		int end) throws SystemException {
		return findBySubjectID(SubjectID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the document records where SubjectID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param SubjectID the subject i d
	 * @param start the lower bound of the range of document records
	 * @param end the upper bound of the range of document records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public List<DocumentRecord> findBySubjectID(String SubjectID, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBJECTID;
			finderArgs = new Object[] { SubjectID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBJECTID;
			finderArgs = new Object[] { SubjectID, start, end, orderByComparator };
		}

		List<DocumentRecord> list = (List<DocumentRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentRecord documentRecord : list) {
				if (!Validator.equals(SubjectID, documentRecord.getSubjectID())) {
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

			query.append(_SQL_SELECT_DOCUMENTRECORD_WHERE);

			if (SubjectID == null) {
				query.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_1);
			}
			else {
				if (SubjectID.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_2);
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

				if (SubjectID != null) {
					qPos.add(SubjectID);
				}

				list = (List<DocumentRecord>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first document record in the ordered set where SubjectID = &#63;.
	 *
	 * @param SubjectID the subject i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document record
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord findBySubjectID_First(String SubjectID,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = fetchBySubjectID_First(SubjectID,
				orderByComparator);

		if (documentRecord != null) {
			return documentRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SubjectID=");
		msg.append(SubjectID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentRecordException(msg.toString());
	}

	/**
	 * Returns the first document record in the ordered set where SubjectID = &#63;.
	 *
	 * @param SubjectID the subject i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document record, or <code>null</code> if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord fetchBySubjectID_First(String SubjectID,
		OrderByComparator orderByComparator) throws SystemException {
		List<DocumentRecord> list = findBySubjectID(SubjectID, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document record in the ordered set where SubjectID = &#63;.
	 *
	 * @param SubjectID the subject i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document record
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord findBySubjectID_Last(String SubjectID,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = fetchBySubjectID_Last(SubjectID,
				orderByComparator);

		if (documentRecord != null) {
			return documentRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SubjectID=");
		msg.append(SubjectID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentRecordException(msg.toString());
	}

	/**
	 * Returns the last document record in the ordered set where SubjectID = &#63;.
	 *
	 * @param SubjectID the subject i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document record, or <code>null</code> if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord fetchBySubjectID_Last(String SubjectID,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySubjectID(SubjectID);

		List<DocumentRecord> list = findBySubjectID(SubjectID, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document records before and after the current document record in the ordered set where SubjectID = &#63;.
	 *
	 * @param RecordID the primary key of the current document record
	 * @param SubjectID the subject i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document record
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord[] findBySubjectID_PrevAndNext(String RecordID,
		String SubjectID, OrderByComparator orderByComparator)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = findByPrimaryKey(RecordID);

		Session session = null;

		try {
			session = openSession();

			DocumentRecord[] array = new DocumentRecordImpl[3];

			array[0] = getBySubjectID_PrevAndNext(session, documentRecord,
					SubjectID, orderByComparator, true);

			array[1] = documentRecord;

			array[2] = getBySubjectID_PrevAndNext(session, documentRecord,
					SubjectID, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DocumentRecord getBySubjectID_PrevAndNext(Session session,
		DocumentRecord documentRecord, String SubjectID,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTRECORD_WHERE);

		if (SubjectID == null) {
			query.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_1);
		}
		else {
			if (SubjectID.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_3);
			}
			else {
				query.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_2);
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

		if (SubjectID != null) {
			qPos.add(SubjectID);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the document records where UserID = &#63;.
	 *
	 * @param UserID the user i d
	 * @return the matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public List<DocumentRecord> findByUserID(long UserID)
		throws SystemException {
		return findByUserID(UserID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document records where UserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param UserID the user i d
	 * @param start the lower bound of the range of document records
	 * @param end the upper bound of the range of document records (not inclusive)
	 * @return the range of matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public List<DocumentRecord> findByUserID(long UserID, int start, int end)
		throws SystemException {
		return findByUserID(UserID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the document records where UserID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param UserID the user i d
	 * @param start the lower bound of the range of document records
	 * @param end the upper bound of the range of document records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public List<DocumentRecord> findByUserID(long UserID, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { UserID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { UserID, start, end, orderByComparator };
		}

		List<DocumentRecord> list = (List<DocumentRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentRecord documentRecord : list) {
				if ((UserID != documentRecord.getUserID())) {
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

			query.append(_SQL_SELECT_DOCUMENTRECORD_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

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

				qPos.add(UserID);

				list = (List<DocumentRecord>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first document record in the ordered set where UserID = &#63;.
	 *
	 * @param UserID the user i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document record
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord findByUserID_First(long UserID,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = fetchByUserID_First(UserID,
				orderByComparator);

		if (documentRecord != null) {
			return documentRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("UserID=");
		msg.append(UserID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentRecordException(msg.toString());
	}

	/**
	 * Returns the first document record in the ordered set where UserID = &#63;.
	 *
	 * @param UserID the user i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document record, or <code>null</code> if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord fetchByUserID_First(long UserID,
		OrderByComparator orderByComparator) throws SystemException {
		List<DocumentRecord> list = findByUserID(UserID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document record in the ordered set where UserID = &#63;.
	 *
	 * @param UserID the user i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document record
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord findByUserID_Last(long UserID,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = fetchByUserID_Last(UserID,
				orderByComparator);

		if (documentRecord != null) {
			return documentRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("UserID=");
		msg.append(UserID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentRecordException(msg.toString());
	}

	/**
	 * Returns the last document record in the ordered set where UserID = &#63;.
	 *
	 * @param UserID the user i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document record, or <code>null</code> if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord fetchByUserID_Last(long UserID,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUserID(UserID);

		List<DocumentRecord> list = findByUserID(UserID, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document records before and after the current document record in the ordered set where UserID = &#63;.
	 *
	 * @param RecordID the primary key of the current document record
	 * @param UserID the user i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document record
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a document record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord[] findByUserID_PrevAndNext(String RecordID,
		long UserID, OrderByComparator orderByComparator)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = findByPrimaryKey(RecordID);

		Session session = null;

		try {
			session = openSession();

			DocumentRecord[] array = new DocumentRecordImpl[3];

			array[0] = getByUserID_PrevAndNext(session, documentRecord, UserID,
					orderByComparator, true);

			array[1] = documentRecord;

			array[2] = getByUserID_PrevAndNext(session, documentRecord, UserID,
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

	protected DocumentRecord getByUserID_PrevAndNext(Session session,
		DocumentRecord documentRecord, long UserID,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTRECORD_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

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

		qPos.add(UserID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the document record where RecordName = &#63; and UserID = &#63; and SubjectID = &#63; and FileTreePath = &#63; or throws a {@link edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException} if it could not be found.
	 *
	 * @param RecordName the record name
	 * @param UserID the user i d
	 * @param SubjectID the subject i d
	 * @param FileTreePath the file tree path
	 * @return the matching document record
	 * @throws edu.jhu.cvrg.waveform.main.dbpersistence.NoSuchDocumentRecordException if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord findByRecordProperties(String RecordName,
		long UserID, String SubjectID, String FileTreePath)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = fetchByRecordProperties(RecordName,
				UserID, SubjectID, FileTreePath);

		if (documentRecord == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("RecordName=");
			msg.append(RecordName);

			msg.append(", UserID=");
			msg.append(UserID);

			msg.append(", SubjectID=");
			msg.append(SubjectID);

			msg.append(", FileTreePath=");
			msg.append(FileTreePath);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDocumentRecordException(msg.toString());
		}

		return documentRecord;
	}

	/**
	 * Returns the document record where RecordName = &#63; and UserID = &#63; and SubjectID = &#63; and FileTreePath = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param RecordName the record name
	 * @param UserID the user i d
	 * @param SubjectID the subject i d
	 * @param FileTreePath the file tree path
	 * @return the matching document record, or <code>null</code> if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord fetchByRecordProperties(String RecordName,
		long UserID, String SubjectID, String FileTreePath)
		throws SystemException {
		return fetchByRecordProperties(RecordName, UserID, SubjectID,
			FileTreePath, true);
	}

	/**
	 * Returns the document record where RecordName = &#63; and UserID = &#63; and SubjectID = &#63; and FileTreePath = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param RecordName the record name
	 * @param UserID the user i d
	 * @param SubjectID the subject i d
	 * @param FileTreePath the file tree path
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching document record, or <code>null</code> if a matching document record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord fetchByRecordProperties(String RecordName,
		long UserID, String SubjectID, String FileTreePath,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] {
				RecordName, UserID, SubjectID, FileTreePath
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_RECORDPROPERTIES,
					finderArgs, this);
		}

		if (result instanceof DocumentRecord) {
			DocumentRecord documentRecord = (DocumentRecord)result;

			if (!Validator.equals(RecordName, documentRecord.getRecordName()) ||
					(UserID != documentRecord.getUserID()) ||
					!Validator.equals(SubjectID, documentRecord.getSubjectID()) ||
					!Validator.equals(FileTreePath,
						documentRecord.getFileTreePath())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_DOCUMENTRECORD_WHERE);

			if (RecordName == null) {
				query.append(_FINDER_COLUMN_RECORDPROPERTIES_RECORDNAME_1);
			}
			else {
				if (RecordName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RECORDPROPERTIES_RECORDNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_RECORDPROPERTIES_RECORDNAME_2);
				}
			}

			query.append(_FINDER_COLUMN_RECORDPROPERTIES_USERID_2);

			if (SubjectID == null) {
				query.append(_FINDER_COLUMN_RECORDPROPERTIES_SUBJECTID_1);
			}
			else {
				if (SubjectID.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RECORDPROPERTIES_SUBJECTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_RECORDPROPERTIES_SUBJECTID_2);
				}
			}

			if (FileTreePath == null) {
				query.append(_FINDER_COLUMN_RECORDPROPERTIES_FILETREEPATH_1);
			}
			else {
				if (FileTreePath.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RECORDPROPERTIES_FILETREEPATH_3);
				}
				else {
					query.append(_FINDER_COLUMN_RECORDPROPERTIES_FILETREEPATH_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (RecordName != null) {
					qPos.add(RecordName);
				}

				qPos.add(UserID);

				if (SubjectID != null) {
					qPos.add(SubjectID);
				}

				if (FileTreePath != null) {
					qPos.add(FileTreePath);
				}

				List<DocumentRecord> list = q.list();

				result = list;

				DocumentRecord documentRecord = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RECORDPROPERTIES,
						finderArgs, list);
				}
				else {
					documentRecord = list.get(0);

					cacheResult(documentRecord);

					if ((documentRecord.getRecordName() == null) ||
							!documentRecord.getRecordName().equals(RecordName) ||
							(documentRecord.getUserID() != UserID) ||
							(documentRecord.getSubjectID() == null) ||
							!documentRecord.getSubjectID().equals(SubjectID) ||
							(documentRecord.getFileTreePath() == null) ||
							!documentRecord.getFileTreePath()
											   .equals(FileTreePath)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RECORDPROPERTIES,
							finderArgs, documentRecord);
					}
				}

				return documentRecord;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RECORDPROPERTIES,
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
				return (DocumentRecord)result;
			}
		}
	}

	/**
	 * Returns all the document records.
	 *
	 * @return the document records
	 * @throws SystemException if a system exception occurred
	 */
	public List<DocumentRecord> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of document records
	 * @param end the upper bound of the range of document records (not inclusive)
	 * @return the range of document records
	 * @throws SystemException if a system exception occurred
	 */
	public List<DocumentRecord> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the document records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of document records
	 * @param end the upper bound of the range of document records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of document records
	 * @throws SystemException if a system exception occurred
	 */
	public List<DocumentRecord> findAll(int start, int end,
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

		List<DocumentRecord> list = (List<DocumentRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCUMENTRECORD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCUMENTRECORD;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<DocumentRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<DocumentRecord>)QueryUtil.list(q,
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
	 * Removes all the document records where OriginalFormat = &#63; from the database.
	 *
	 * @param OriginalFormat the original format
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByOriginalFormat(String OriginalFormat)
		throws SystemException {
		for (DocumentRecord documentRecord : findByOriginalFormat(
				OriginalFormat)) {
			remove(documentRecord);
		}
	}

	/**
	 * Removes the document record where RecordID = &#63; from the database.
	 *
	 * @param RecordID the record i d
	 * @return the document record that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord removeByGetRecordName(String RecordID)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = findByGetRecordName(RecordID);

		return remove(documentRecord);
	}

	/**
	 * Removes all the document records where SubjectID = &#63; from the database.
	 *
	 * @param SubjectID the subject i d
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySubjectID(String SubjectID) throws SystemException {
		for (DocumentRecord documentRecord : findBySubjectID(SubjectID)) {
			remove(documentRecord);
		}
	}

	/**
	 * Removes all the document records where UserID = &#63; from the database.
	 *
	 * @param UserID the user i d
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUserID(long UserID) throws SystemException {
		for (DocumentRecord documentRecord : findByUserID(UserID)) {
			remove(documentRecord);
		}
	}

	/**
	 * Removes the document record where RecordName = &#63; and UserID = &#63; and SubjectID = &#63; and FileTreePath = &#63; from the database.
	 *
	 * @param RecordName the record name
	 * @param UserID the user i d
	 * @param SubjectID the subject i d
	 * @param FileTreePath the file tree path
	 * @return the document record that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public DocumentRecord removeByRecordProperties(String RecordName,
		long UserID, String SubjectID, String FileTreePath)
		throws NoSuchDocumentRecordException, SystemException {
		DocumentRecord documentRecord = findByRecordProperties(RecordName,
				UserID, SubjectID, FileTreePath);

		return remove(documentRecord);
	}

	/**
	 * Removes all the document records from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (DocumentRecord documentRecord : findAll()) {
			remove(documentRecord);
		}
	}

	/**
	 * Returns the number of document records where OriginalFormat = &#63;.
	 *
	 * @param OriginalFormat the original format
	 * @return the number of matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public int countByOriginalFormat(String OriginalFormat)
		throws SystemException {
		Object[] finderArgs = new Object[] { OriginalFormat };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ORIGINALFORMAT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCUMENTRECORD_WHERE);

			if (OriginalFormat == null) {
				query.append(_FINDER_COLUMN_ORIGINALFORMAT_ORIGINALFORMAT_1);
			}
			else {
				if (OriginalFormat.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ORIGINALFORMAT_ORIGINALFORMAT_3);
				}
				else {
					query.append(_FINDER_COLUMN_ORIGINALFORMAT_ORIGINALFORMAT_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (OriginalFormat != null) {
					qPos.add(OriginalFormat);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ORIGINALFORMAT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of document records where RecordID = &#63;.
	 *
	 * @param RecordID the record i d
	 * @return the number of matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGetRecordName(String RecordID) throws SystemException {
		Object[] finderArgs = new Object[] { RecordID };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GETRECORDNAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCUMENTRECORD_WHERE);

			if (RecordID == null) {
				query.append(_FINDER_COLUMN_GETRECORDNAME_RECORDID_1);
			}
			else {
				if (RecordID.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GETRECORDNAME_RECORDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_GETRECORDNAME_RECORDID_2);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GETRECORDNAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of document records where SubjectID = &#63;.
	 *
	 * @param SubjectID the subject i d
	 * @return the number of matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySubjectID(String SubjectID) throws SystemException {
		Object[] finderArgs = new Object[] { SubjectID };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SUBJECTID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCUMENTRECORD_WHERE);

			if (SubjectID == null) {
				query.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_1);
			}
			else {
				if (SubjectID.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_SUBJECTID_SUBJECTID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (SubjectID != null) {
					qPos.add(SubjectID);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SUBJECTID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of document records where UserID = &#63;.
	 *
	 * @param UserID the user i d
	 * @return the number of matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUserID(long UserID) throws SystemException {
		Object[] finderArgs = new Object[] { UserID };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_USERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCUMENTRECORD_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(UserID);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of document records where RecordName = &#63; and UserID = &#63; and SubjectID = &#63; and FileTreePath = &#63;.
	 *
	 * @param RecordName the record name
	 * @param UserID the user i d
	 * @param SubjectID the subject i d
	 * @param FileTreePath the file tree path
	 * @return the number of matching document records
	 * @throws SystemException if a system exception occurred
	 */
	public int countByRecordProperties(String RecordName, long UserID,
		String SubjectID, String FileTreePath) throws SystemException {
		Object[] finderArgs = new Object[] {
				RecordName, UserID, SubjectID, FileTreePath
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_RECORDPROPERTIES,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_DOCUMENTRECORD_WHERE);

			if (RecordName == null) {
				query.append(_FINDER_COLUMN_RECORDPROPERTIES_RECORDNAME_1);
			}
			else {
				if (RecordName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RECORDPROPERTIES_RECORDNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_RECORDPROPERTIES_RECORDNAME_2);
				}
			}

			query.append(_FINDER_COLUMN_RECORDPROPERTIES_USERID_2);

			if (SubjectID == null) {
				query.append(_FINDER_COLUMN_RECORDPROPERTIES_SUBJECTID_1);
			}
			else {
				if (SubjectID.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RECORDPROPERTIES_SUBJECTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_RECORDPROPERTIES_SUBJECTID_2);
				}
			}

			if (FileTreePath == null) {
				query.append(_FINDER_COLUMN_RECORDPROPERTIES_FILETREEPATH_1);
			}
			else {
				if (FileTreePath.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_RECORDPROPERTIES_FILETREEPATH_3);
				}
				else {
					query.append(_FINDER_COLUMN_RECORDPROPERTIES_FILETREEPATH_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (RecordName != null) {
					qPos.add(RecordName);
				}

				qPos.add(UserID);

				if (SubjectID != null) {
					qPos.add(SubjectID);
				}

				if (FileTreePath != null) {
					qPos.add(FileTreePath);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RECORDPROPERTIES,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of document records.
	 *
	 * @return the number of document records
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DOCUMENTRECORD);

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
	 * Initializes the document record persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.edu.jhu.cvrg.waveform.main.dbpersistence.model.DocumentRecord")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DocumentRecord>> listenersList = new ArrayList<ModelListener<DocumentRecord>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DocumentRecord>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DocumentRecordImpl.class.getName());
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
	private static final String _SQL_SELECT_DOCUMENTRECORD = "SELECT documentRecord FROM DocumentRecord documentRecord";
	private static final String _SQL_SELECT_DOCUMENTRECORD_WHERE = "SELECT documentRecord FROM DocumentRecord documentRecord WHERE ";
	private static final String _SQL_COUNT_DOCUMENTRECORD = "SELECT COUNT(documentRecord) FROM DocumentRecord documentRecord";
	private static final String _SQL_COUNT_DOCUMENTRECORD_WHERE = "SELECT COUNT(documentRecord) FROM DocumentRecord documentRecord WHERE ";
	private static final String _FINDER_COLUMN_ORIGINALFORMAT_ORIGINALFORMAT_1 = "documentRecord.OriginalFormat IS NULL";
	private static final String _FINDER_COLUMN_ORIGINALFORMAT_ORIGINALFORMAT_2 = "documentRecord.OriginalFormat = ?";
	private static final String _FINDER_COLUMN_ORIGINALFORMAT_ORIGINALFORMAT_3 = "(documentRecord.OriginalFormat IS NULL OR documentRecord.OriginalFormat = ?)";
	private static final String _FINDER_COLUMN_GETRECORDNAME_RECORDID_1 = "documentRecord.RecordID IS NULL";
	private static final String _FINDER_COLUMN_GETRECORDNAME_RECORDID_2 = "documentRecord.RecordID = ?";
	private static final String _FINDER_COLUMN_GETRECORDNAME_RECORDID_3 = "(documentRecord.RecordID IS NULL OR documentRecord.RecordID = ?)";
	private static final String _FINDER_COLUMN_SUBJECTID_SUBJECTID_1 = "documentRecord.SubjectID IS NULL";
	private static final String _FINDER_COLUMN_SUBJECTID_SUBJECTID_2 = "documentRecord.SubjectID = ?";
	private static final String _FINDER_COLUMN_SUBJECTID_SUBJECTID_3 = "(documentRecord.SubjectID IS NULL OR documentRecord.SubjectID = ?)";
	private static final String _FINDER_COLUMN_USERID_USERID_2 = "documentRecord.UserID = ?";
	private static final String _FINDER_COLUMN_RECORDPROPERTIES_RECORDNAME_1 = "documentRecord.RecordName IS NULL AND ";
	private static final String _FINDER_COLUMN_RECORDPROPERTIES_RECORDNAME_2 = "documentRecord.RecordName = ? AND ";
	private static final String _FINDER_COLUMN_RECORDPROPERTIES_RECORDNAME_3 = "(documentRecord.RecordName IS NULL OR documentRecord.RecordName = ?) AND ";
	private static final String _FINDER_COLUMN_RECORDPROPERTIES_USERID_2 = "documentRecord.UserID = ? AND ";
	private static final String _FINDER_COLUMN_RECORDPROPERTIES_SUBJECTID_1 = "documentRecord.SubjectID IS NULL AND ";
	private static final String _FINDER_COLUMN_RECORDPROPERTIES_SUBJECTID_2 = "documentRecord.SubjectID = ? AND ";
	private static final String _FINDER_COLUMN_RECORDPROPERTIES_SUBJECTID_3 = "(documentRecord.SubjectID IS NULL OR documentRecord.SubjectID = ?) AND ";
	private static final String _FINDER_COLUMN_RECORDPROPERTIES_FILETREEPATH_1 = "documentRecord.FileTreePath IS NULL";
	private static final String _FINDER_COLUMN_RECORDPROPERTIES_FILETREEPATH_2 = "documentRecord.FileTreePath = ?";
	private static final String _FINDER_COLUMN_RECORDPROPERTIES_FILETREEPATH_3 = "(documentRecord.FileTreePath IS NULL OR documentRecord.FileTreePath = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "documentRecord.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DocumentRecord exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DocumentRecord exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DocumentRecordPersistenceImpl.class);
	private static DocumentRecord _nullDocumentRecord = new DocumentRecordImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DocumentRecord> toCacheModel() {
				return _nullDocumentRecordCacheModel;
			}
		};

	private static CacheModel<DocumentRecord> _nullDocumentRecordCacheModel = new CacheModel<DocumentRecord>() {
			public DocumentRecord toEntityModel() {
				return _nullDocumentRecord;
			}
		};
}