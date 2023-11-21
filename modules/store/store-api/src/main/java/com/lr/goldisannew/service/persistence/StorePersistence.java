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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.lr.goldisannew.exception.NoSuchStoreException;
import com.lr.goldisannew.model.Store;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the store service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StoreUtil
 * @generated
 */
@ProviderType
public interface StorePersistence extends BasePersistence<Store> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StoreUtil} to access the store persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the stores where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching stores
	 */
	public java.util.List<Store> findByUuid(String uuid);

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
	public java.util.List<Store> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Store> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Store>
			orderByComparator);

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
	public java.util.List<Store> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Store>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first store in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store
	 * @throws NoSuchStoreException if a matching store could not be found
	 */
	public Store findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Store>
				orderByComparator)
		throws NoSuchStoreException;

	/**
	 * Returns the first store in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching store, or <code>null</code> if a matching store could not be found
	 */
	public Store fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Store>
			orderByComparator);

	/**
	 * Returns the last store in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store
	 * @throws NoSuchStoreException if a matching store could not be found
	 */
	public Store findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Store>
				orderByComparator)
		throws NoSuchStoreException;

	/**
	 * Returns the last store in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching store, or <code>null</code> if a matching store could not be found
	 */
	public Store fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Store>
			orderByComparator);

	/**
	 * Returns the stores before and after the current store in the ordered set where uuid = &#63;.
	 *
	 * @param storeId the primary key of the current store
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next store
	 * @throws NoSuchStoreException if a store with the primary key could not be found
	 */
	public Store[] findByUuid_PrevAndNext(
			long storeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Store>
				orderByComparator)
		throws NoSuchStoreException;

	/**
	 * Removes all the stores where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of stores where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching stores
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the store in the entity cache if it is enabled.
	 *
	 * @param store the store
	 */
	public void cacheResult(Store store);

	/**
	 * Caches the stores in the entity cache if it is enabled.
	 *
	 * @param stores the stores
	 */
	public void cacheResult(java.util.List<Store> stores);

	/**
	 * Creates a new store with the primary key. Does not add the store to the database.
	 *
	 * @param storeId the primary key for the new store
	 * @return the new store
	 */
	public Store create(long storeId);

	/**
	 * Removes the store with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param storeId the primary key of the store
	 * @return the store that was removed
	 * @throws NoSuchStoreException if a store with the primary key could not be found
	 */
	public Store remove(long storeId) throws NoSuchStoreException;

	public Store updateImpl(Store store);

	/**
	 * Returns the store with the primary key or throws a <code>NoSuchStoreException</code> if it could not be found.
	 *
	 * @param storeId the primary key of the store
	 * @return the store
	 * @throws NoSuchStoreException if a store with the primary key could not be found
	 */
	public Store findByPrimaryKey(long storeId) throws NoSuchStoreException;

	/**
	 * Returns the store with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param storeId the primary key of the store
	 * @return the store, or <code>null</code> if a store with the primary key could not be found
	 */
	public Store fetchByPrimaryKey(long storeId);

	/**
	 * Returns all the stores.
	 *
	 * @return the stores
	 */
	public java.util.List<Store> findAll();

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
	public java.util.List<Store> findAll(int start, int end);

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
	public java.util.List<Store> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Store>
			orderByComparator);

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
	public java.util.List<Store> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Store>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the stores from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of stores.
	 *
	 * @return the number of stores
	 */
	public int countAll();

}