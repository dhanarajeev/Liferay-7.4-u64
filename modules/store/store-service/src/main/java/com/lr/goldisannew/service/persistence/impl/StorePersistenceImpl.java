/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.lr.goldisannew.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUID;

import com.lr.goldisannew.exception.NoSuchStoreException;
import com.lr.goldisannew.model.Store;
import com.lr.goldisannew.model.StoreTable;
import com.lr.goldisannew.model.impl.StoreImpl;
import com.lr.goldisannew.model.impl.StoreModelImpl;
import com.lr.goldisannew.service.persistence.StorePersistence;
import com.lr.goldisannew.service.persistence.StoreUtil;
import com.lr.goldisannew.service.persistence.impl.constants.lrPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the store service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = StorePersistence.class)
public class StorePersistenceImpl
	extends BasePersistenceImpl<Store> implements StorePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>StoreUtil</code> to access the store persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		StoreImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the stores where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching stores
	 */
	@Override
	public List<Store> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the stores where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of stores
	 * @param end the upper bound of the range of stores (not inclusive)
	 * @return the range of matching stores
	 */
	@Override
	public List<Store> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the stores where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of stores
	 * @param end the upper bound of the range of stores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching stores
	 */
	@Override
	public List<Store> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Store> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the stores where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of stores
	 * @param end the upper bound of the range of stores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching stores
	 */
	@Override
	public List<Store> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Store> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Store> list = null;

		if (useFinderCache) {
			list = (List<Store>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Store store : list) {
					if (!uuid.equals(store.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_STORE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(StoreModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Store>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first store in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store
	 * @throws NoSuchStoreException if a matching store could not be found
	 */
	@Override
	public Store findByUuid_First(
			String uuid, OrderByComparator<Store> orderByComparator)
		throws NoSuchStoreException {

		Store store = fetchByUuid_First(uuid, orderByComparator);

		if (store != null) {
			return store;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchStoreException(sb.toString());
	}

	/**
	 * Returns the first store in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store, or <code>null</code> if a matching store could not be found
	 */
	@Override
	public Store fetchByUuid_First(
		String uuid, OrderByComparator<Store> orderByComparator) {

		List<Store> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last store in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store
	 * @throws NoSuchStoreException if a matching store could not be found
	 */
	@Override
	public Store findByUuid_Last(
			String uuid, OrderByComparator<Store> orderByComparator)
		throws NoSuchStoreException {

		Store store = fetchByUuid_Last(uuid, orderByComparator);

		if (store != null) {
			return store;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchStoreException(sb.toString());
	}

	/**
	 * Returns the last store in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store, or <code>null</code> if a matching store could not be found
	 */
	@Override
	public Store fetchByUuid_Last(
		String uuid, OrderByComparator<Store> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Store> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the stores before and after the current store in the ordered set where uuid = &#63;.
	 *
	 * @param storeId the primary key of the current store
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next store
	 * @throws NoSuchStoreException if a store with the primary key could not be found
	 */
	@Override
	public Store[] findByUuid_PrevAndNext(
			long storeId, String uuid,
			OrderByComparator<Store> orderByComparator)
		throws NoSuchStoreException {

		uuid = Objects.toString(uuid, "");

		Store store = findByPrimaryKey(storeId);

		Session session = null;

		try {
			session = openSession();

			Store[] array = new StoreImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, store, uuid, orderByComparator, true);

			array[1] = store;

			array[2] = getByUuid_PrevAndNext(
				session, store, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Store getByUuid_PrevAndNext(
		Session session, Store store, String uuid,
		OrderByComparator<Store> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_STORE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(StoreModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(store)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Store> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the stores where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Store store :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(store);
		}
	}

	/**
	 * Returns the number of stores where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching stores
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_STORE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "store.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(store.uuid IS NULL OR store.uuid = '')";

	public StorePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Store.class);

		setModelImplClass(StoreImpl.class);
		setModelPKClass(long.class);

		setTable(StoreTable.INSTANCE);
	}

	/**
	 * Caches the store in the entity cache if it is enabled.
	 *
	 * @param store the store
	 */
	@Override
	public void cacheResult(Store store) {
		entityCache.putResult(StoreImpl.class, store.getPrimaryKey(), store);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the stores in the entity cache if it is enabled.
	 *
	 * @param stores the stores
	 */
	@Override
	public void cacheResult(List<Store> stores) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (stores.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Store store : stores) {
			if (entityCache.getResult(StoreImpl.class, store.getPrimaryKey()) ==
					null) {

				cacheResult(store);
			}
		}
	}

	/**
	 * Clears the cache for all stores.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(StoreImpl.class);

		finderCache.clearCache(StoreImpl.class);
	}

	/**
	 * Clears the cache for the store.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Store store) {
		entityCache.removeResult(StoreImpl.class, store);
	}

	@Override
	public void clearCache(List<Store> stores) {
		for (Store store : stores) {
			entityCache.removeResult(StoreImpl.class, store);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(StoreImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(StoreImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new store with the primary key. Does not add the store to the database.
	 *
	 * @param storeId the primary key for the new store
	 * @return the new store
	 */
	@Override
	public Store create(long storeId) {
		Store store = new StoreImpl();

		store.setNew(true);
		store.setPrimaryKey(storeId);

		String uuid = _portalUUID.generate();

		store.setUuid(uuid);

		return store;
	}

	/**
	 * Removes the store with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param storeId the primary key of the store
	 * @return the store that was removed
	 * @throws NoSuchStoreException if a store with the primary key could not be found
	 */
	@Override
	public Store remove(long storeId) throws NoSuchStoreException {
		return remove((Serializable)storeId);
	}

	/**
	 * Removes the store with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the store
	 * @return the store that was removed
	 * @throws NoSuchStoreException if a store with the primary key could not be found
	 */
	@Override
	public Store remove(Serializable primaryKey) throws NoSuchStoreException {
		Session session = null;

		try {
			session = openSession();

			Store store = (Store)session.get(StoreImpl.class, primaryKey);

			if (store == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStoreException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(store);
		}
		catch (NoSuchStoreException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Store removeImpl(Store store) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(store)) {
				store = (Store)session.get(
					StoreImpl.class, store.getPrimaryKeyObj());
			}

			if (store != null) {
				session.delete(store);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (store != null) {
			clearCache(store);
		}

		return store;
	}

	@Override
	public Store updateImpl(Store store) {
		boolean isNew = store.isNew();

		if (!(store instanceof StoreModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(store.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(store);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in store proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Store implementation " +
					store.getClass());
		}

		StoreModelImpl storeModelImpl = (StoreModelImpl)store;

		if (Validator.isNull(store.getUuid())) {
			String uuid = _portalUUID.generate();

			store.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(store);
			}
			else {
				store = (Store)session.merge(store);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(StoreImpl.class, storeModelImpl, false, true);

		if (isNew) {
			store.setNew(false);
		}

		store.resetOriginalValues();

		return store;
	}

	/**
	 * Returns the store with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the store
	 * @return the store
	 * @throws NoSuchStoreException if a store with the primary key could not be found
	 */
	@Override
	public Store findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStoreException {

		Store store = fetchByPrimaryKey(primaryKey);

		if (store == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStoreException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return store;
	}

	/**
	 * Returns the store with the primary key or throws a <code>NoSuchStoreException</code> if it could not be found.
	 *
	 * @param storeId the primary key of the store
	 * @return the store
	 * @throws NoSuchStoreException if a store with the primary key could not be found
	 */
	@Override
	public Store findByPrimaryKey(long storeId) throws NoSuchStoreException {
		return findByPrimaryKey((Serializable)storeId);
	}

	/**
	 * Returns the store with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param storeId the primary key of the store
	 * @return the store, or <code>null</code> if a store with the primary key could not be found
	 */
	@Override
	public Store fetchByPrimaryKey(long storeId) {
		return fetchByPrimaryKey((Serializable)storeId);
	}

	/**
	 * Returns all the stores.
	 *
	 * @return the stores
	 */
	@Override
	public List<Store> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the stores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stores
	 * @param end the upper bound of the range of stores (not inclusive)
	 * @return the range of stores
	 */
	@Override
	public List<Store> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the stores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stores
	 * @param end the upper bound of the range of stores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of stores
	 */
	@Override
	public List<Store> findAll(
		int start, int end, OrderByComparator<Store> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the stores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StoreModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stores
	 * @param end the upper bound of the range of stores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of stores
	 */
	@Override
	public List<Store> findAll(
		int start, int end, OrderByComparator<Store> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Store> list = null;

		if (useFinderCache) {
			list = (List<Store>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_STORE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_STORE;

				sql = sql.concat(StoreModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Store>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the stores from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Store store : findAll()) {
			remove(store);
		}
	}

	/**
	 * Returns the number of stores.
	 *
	 * @return the number of stores
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_STORE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "storeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_STORE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return StoreModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the store persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_setStoreUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setStoreUtilPersistence(null);

		entityCache.removeCache(StoreImpl.class.getName());
	}

	private void _setStoreUtilPersistence(StorePersistence storePersistence) {
		try {
			Field field = StoreUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, storePersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = lrPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = lrPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = lrPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_STORE =
		"SELECT store FROM Store store";

	private static final String _SQL_SELECT_STORE_WHERE =
		"SELECT store FROM Store store WHERE ";

	private static final String _SQL_COUNT_STORE =
		"SELECT COUNT(store) FROM Store store";

	private static final String _SQL_COUNT_STORE_WHERE =
		"SELECT COUNT(store) FROM Store store WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "store.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Store exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Store exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		StorePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

}