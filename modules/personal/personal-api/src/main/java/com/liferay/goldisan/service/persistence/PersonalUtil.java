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

package com.liferay.goldisan.service.persistence;

import com.liferay.goldisan.model.Personal;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the personal service. This utility wraps <code>com.liferay.goldisan.service.persistence.impl.PersonalPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersonalPersistence
 * @generated
 */
public class PersonalUtil {

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
	public static void clearCache(Personal personal) {
		getPersistence().clearCache(personal);
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
	public static Map<Serializable, Personal> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Personal> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Personal> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Personal> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Personal> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Personal update(Personal personal) {
		return getPersistence().update(personal);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Personal update(
		Personal personal, ServiceContext serviceContext) {

		return getPersistence().update(personal, serviceContext);
	}

	/**
	 * Returns all the personals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching personals
	 */
	public static List<Personal> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the personals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of personals
	 * @param end the upper bound of the range of personals (not inclusive)
	 * @return the range of matching personals
	 */
	public static List<Personal> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the personals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of personals
	 * @param end the upper bound of the range of personals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching personals
	 */
	public static List<Personal> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Personal> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the personals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of personals
	 * @param end the upper bound of the range of personals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching personals
	 */
	public static List<Personal> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Personal> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first personal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personal
	 * @throws NoSuchPersonalException if a matching personal could not be found
	 */
	public static Personal findByUuid_First(
			String uuid, OrderByComparator<Personal> orderByComparator)
		throws com.liferay.goldisan.exception.NoSuchPersonalException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first personal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personal, or <code>null</code> if a matching personal could not be found
	 */
	public static Personal fetchByUuid_First(
		String uuid, OrderByComparator<Personal> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last personal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personal
	 * @throws NoSuchPersonalException if a matching personal could not be found
	 */
	public static Personal findByUuid_Last(
			String uuid, OrderByComparator<Personal> orderByComparator)
		throws com.liferay.goldisan.exception.NoSuchPersonalException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last personal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personal, or <code>null</code> if a matching personal could not be found
	 */
	public static Personal fetchByUuid_Last(
		String uuid, OrderByComparator<Personal> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the personals before and after the current personal in the ordered set where uuid = &#63;.
	 *
	 * @param personId the primary key of the current personal
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next personal
	 * @throws NoSuchPersonalException if a personal with the primary key could not be found
	 */
	public static Personal[] findByUuid_PrevAndNext(
			long personId, String uuid,
			OrderByComparator<Personal> orderByComparator)
		throws com.liferay.goldisan.exception.NoSuchPersonalException {

		return getPersistence().findByUuid_PrevAndNext(
			personId, uuid, orderByComparator);
	}

	/**
	 * Removes all the personals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of personals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching personals
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the personal in the entity cache if it is enabled.
	 *
	 * @param personal the personal
	 */
	public static void cacheResult(Personal personal) {
		getPersistence().cacheResult(personal);
	}

	/**
	 * Caches the personals in the entity cache if it is enabled.
	 *
	 * @param personals the personals
	 */
	public static void cacheResult(List<Personal> personals) {
		getPersistence().cacheResult(personals);
	}

	/**
	 * Creates a new personal with the primary key. Does not add the personal to the database.
	 *
	 * @param personId the primary key for the new personal
	 * @return the new personal
	 */
	public static Personal create(long personId) {
		return getPersistence().create(personId);
	}

	/**
	 * Removes the personal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param personId the primary key of the personal
	 * @return the personal that was removed
	 * @throws NoSuchPersonalException if a personal with the primary key could not be found
	 */
	public static Personal remove(long personId)
		throws com.liferay.goldisan.exception.NoSuchPersonalException {

		return getPersistence().remove(personId);
	}

	public static Personal updateImpl(Personal personal) {
		return getPersistence().updateImpl(personal);
	}

	/**
	 * Returns the personal with the primary key or throws a <code>NoSuchPersonalException</code> if it could not be found.
	 *
	 * @param personId the primary key of the personal
	 * @return the personal
	 * @throws NoSuchPersonalException if a personal with the primary key could not be found
	 */
	public static Personal findByPrimaryKey(long personId)
		throws com.liferay.goldisan.exception.NoSuchPersonalException {

		return getPersistence().findByPrimaryKey(personId);
	}

	/**
	 * Returns the personal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param personId the primary key of the personal
	 * @return the personal, or <code>null</code> if a personal with the primary key could not be found
	 */
	public static Personal fetchByPrimaryKey(long personId) {
		return getPersistence().fetchByPrimaryKey(personId);
	}

	/**
	 * Returns all the personals.
	 *
	 * @return the personals
	 */
	public static List<Personal> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the personals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personals
	 * @param end the upper bound of the range of personals (not inclusive)
	 * @return the range of personals
	 */
	public static List<Personal> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the personals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personals
	 * @param end the upper bound of the range of personals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of personals
	 */
	public static List<Personal> findAll(
		int start, int end, OrderByComparator<Personal> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the personals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personals
	 * @param end the upper bound of the range of personals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of personals
	 */
	public static List<Personal> findAll(
		int start, int end, OrderByComparator<Personal> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the personals from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of personals.
	 *
	 * @return the number of personals
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PersonalPersistence getPersistence() {
		return _persistence;
	}

	private static volatile PersonalPersistence _persistence;

}