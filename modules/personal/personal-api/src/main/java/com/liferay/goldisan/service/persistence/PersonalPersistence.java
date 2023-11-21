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

import com.liferay.goldisan.exception.NoSuchPersonalException;
import com.liferay.goldisan.model.Personal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the personal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersonalUtil
 * @generated
 */
@ProviderType
public interface PersonalPersistence extends BasePersistence<Personal> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PersonalUtil} to access the personal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the personals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching personals
	 */
	public java.util.List<Personal> findByUuid(String uuid);

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
	public java.util.List<Personal> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Personal> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personal>
			orderByComparator);

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
	public java.util.List<Personal> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personal>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first personal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personal
	 * @throws NoSuchPersonalException if a matching personal could not be found
	 */
	public Personal findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Personal>
				orderByComparator)
		throws NoSuchPersonalException;

	/**
	 * Returns the first personal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personal, or <code>null</code> if a matching personal could not be found
	 */
	public Personal fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Personal>
			orderByComparator);

	/**
	 * Returns the last personal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personal
	 * @throws NoSuchPersonalException if a matching personal could not be found
	 */
	public Personal findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Personal>
				orderByComparator)
		throws NoSuchPersonalException;

	/**
	 * Returns the last personal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personal, or <code>null</code> if a matching personal could not be found
	 */
	public Personal fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Personal>
			orderByComparator);

	/**
	 * Returns the personals before and after the current personal in the ordered set where uuid = &#63;.
	 *
	 * @param personId the primary key of the current personal
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next personal
	 * @throws NoSuchPersonalException if a personal with the primary key could not be found
	 */
	public Personal[] findByUuid_PrevAndNext(
			long personId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Personal>
				orderByComparator)
		throws NoSuchPersonalException;

	/**
	 * Removes all the personals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of personals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching personals
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the personal in the entity cache if it is enabled.
	 *
	 * @param personal the personal
	 */
	public void cacheResult(Personal personal);

	/**
	 * Caches the personals in the entity cache if it is enabled.
	 *
	 * @param personals the personals
	 */
	public void cacheResult(java.util.List<Personal> personals);

	/**
	 * Creates a new personal with the primary key. Does not add the personal to the database.
	 *
	 * @param personId the primary key for the new personal
	 * @return the new personal
	 */
	public Personal create(long personId);

	/**
	 * Removes the personal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param personId the primary key of the personal
	 * @return the personal that was removed
	 * @throws NoSuchPersonalException if a personal with the primary key could not be found
	 */
	public Personal remove(long personId) throws NoSuchPersonalException;

	public Personal updateImpl(Personal personal);

	/**
	 * Returns the personal with the primary key or throws a <code>NoSuchPersonalException</code> if it could not be found.
	 *
	 * @param personId the primary key of the personal
	 * @return the personal
	 * @throws NoSuchPersonalException if a personal with the primary key could not be found
	 */
	public Personal findByPrimaryKey(long personId)
		throws NoSuchPersonalException;

	/**
	 * Returns the personal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param personId the primary key of the personal
	 * @return the personal, or <code>null</code> if a personal with the primary key could not be found
	 */
	public Personal fetchByPrimaryKey(long personId);

	/**
	 * Returns all the personals.
	 *
	 * @return the personals
	 */
	public java.util.List<Personal> findAll();

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
	public java.util.List<Personal> findAll(int start, int end);

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
	public java.util.List<Personal> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personal>
			orderByComparator);

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
	public java.util.List<Personal> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Personal>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the personals from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of personals.
	 *
	 * @return the number of personals
	 */
	public int countAll();

}