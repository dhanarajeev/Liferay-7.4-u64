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

package com.lr.goldisannew.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.lr.goldisannew.model.Store;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the store service. This utility wraps <code>com.lr.goldisannew.service.persistence.impl.StorePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StorePersistence
 * @generated
 */
public class StoreUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Store store) {
		getPersistence().clearCache(store);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Store> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Store> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Store> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Store> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Store> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Store update(Store store) {
		return getPersistence().update(store);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Store update(Store store, ServiceContext serviceContext) {
		return getPersistence().update(store, serviceContext);
	}

	/**
	 * Returns all the stores where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching stores
	 */
	public static List<Store> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
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
	public static List<Store> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
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
	public static List<Store> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Store> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
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
	public static List<Store> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Store> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first store in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store
	 * @throws NoSuchStoreException if a matching store could not be found
	 */
	public static Store findByUuid_First(
			String uuid, OrderByComparator<Store> orderByComparator)
		throws com.lr.goldisannew.exception.NoSuchStoreException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first store in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store, or <code>null</code> if a matching store could not be found
	 */
	public static Store fetchByUuid_First(
		String uuid, OrderByComparator<Store> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last store in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store
	 * @throws NoSuchStoreException if a matching store could not be found
	 */
	public static Store findByUuid_Last(
			String uuid, OrderByComparator<Store> orderByComparator)
		throws com.lr.goldisannew.exception.NoSuchStoreException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last store in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store, or <code>null</code> if a matching store could not be found
	 */
	public static Store fetchByUuid_Last(
		String uuid, OrderByComparator<Store> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
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
	public static Store[] findByUuid_PrevAndNext(
			long storeId, String uuid,
			OrderByComparator<Store> orderByComparator)
		throws com.lr.goldisannew.exception.NoSuchStoreException {

		return getPersistence().findByUuid_PrevAndNext(
			storeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the stores where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of stores where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching stores
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the store in the entity cache if it is enabled.
	 *
	 * @param store the store
	 */
	public static void cacheResult(Store store) {
		getPersistence().cacheResult(store);
	}

	/**
	 * Caches the stores in the entity cache if it is enabled.
	 *
	 * @param stores the stores
	 */
	public static void cacheResult(List<Store> stores) {
		getPersistence().cacheResult(stores);
	}

	/**
	 * Creates a new store with the primary key. Does not add the store to the database.
	 *
	 * @param storeId the primary key for the new store
	 * @return the new store
	 */
	public static Store create(long storeId) {
		return getPersistence().create(storeId);
	}

	/**
	 * Removes the store with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param storeId the primary key of the store
	 * @return the store that was removed
	 * @throws NoSuchStoreException if a store with the primary key could not be found
	 */
	public static Store remove(long storeId)
		throws com.lr.goldisannew.exception.NoSuchStoreException {

		return getPersistence().remove(storeId);
	}

	public static Store updateImpl(Store store) {
		return getPersistence().updateImpl(store);
	}

	/**
	 * Returns the store with the primary key or throws a <code>NoSuchStoreException</code> if it could not be found.
	 *
	 * @param storeId the primary key of the store
	 * @return the store
	 * @throws NoSuchStoreException if a store with the primary key could not be found
	 */
	public static Store findByPrimaryKey(long storeId)
		throws com.lr.goldisannew.exception.NoSuchStoreException {

		return getPersistence().findByPrimaryKey(storeId);
	}

	/**
	 * Returns the store with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param storeId the primary key of the store
	 * @return the store, or <code>null</code> if a store with the primary key could not be found
	 */
	public static Store fetchByPrimaryKey(long storeId) {
		return getPersistence().fetchByPrimaryKey(storeId);
	}

	/**
	 * Returns all the stores.
	 *
	 * @return the stores
	 */
	public static List<Store> findAll() {
		return getPersistence().findAll();
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
	public static List<Store> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Store> findAll(
		int start, int end, OrderByComparator<Store> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Store> findAll(
		int start, int end, OrderByComparator<Store> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the stores from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of stores.
	 *
	 * @return the number of stores
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static StorePersistence getPersistence() {
		return _persistence;
	}

	private static volatile StorePersistence _persistence;

}