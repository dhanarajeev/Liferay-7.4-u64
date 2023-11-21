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

package com.lr.goldisan.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.lr.goldisan.exception.NoSuchCompanyException;
import com.lr.goldisan.model.Company;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the company service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyUtil
 * @generated
 */
@ProviderType
public interface CompanyPersistence extends BasePersistence<Company> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompanyUtil} to access the company persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the companies where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching companies
	 */
	public java.util.List<Company> findByUuid(String uuid);

	/**
	 * Returns a range of all the companies where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of companies
	 * @param end the upper bound of the range of companies (not inclusive)
	 * @return the range of matching companies
	 */
	public java.util.List<Company> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the companies where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of companies
	 * @param end the upper bound of the range of companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching companies
	 */
	public java.util.List<Company> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Company>
			orderByComparator);

	/**
	 * Returns an ordered range of all the companies where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of companies
	 * @param end the upper bound of the range of companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching companies
	 */
	public java.util.List<Company> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Company>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first company in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company
	 * @throws NoSuchCompanyException if a matching company could not be found
	 */
	public Company findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Company>
				orderByComparator)
		throws NoSuchCompanyException;

	/**
	 * Returns the first company in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company, or <code>null</code> if a matching company could not be found
	 */
	public Company fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Company>
			orderByComparator);

	/**
	 * Returns the last company in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company
	 * @throws NoSuchCompanyException if a matching company could not be found
	 */
	public Company findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Company>
				orderByComparator)
		throws NoSuchCompanyException;

	/**
	 * Returns the last company in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company, or <code>null</code> if a matching company could not be found
	 */
	public Company fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Company>
			orderByComparator);

	/**
	 * Returns the companies before and after the current company in the ordered set where uuid = &#63;.
	 *
	 * @param companyId the primary key of the current company
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next company
	 * @throws NoSuchCompanyException if a company with the primary key could not be found
	 */
	public Company[] findByUuid_PrevAndNext(
			long companyId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Company>
				orderByComparator)
		throws NoSuchCompanyException;

	/**
	 * Removes all the companies where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of companies where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching companies
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the companies where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching companies
	 */
	public java.util.List<Company> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the companies where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of companies
	 * @param end the upper bound of the range of companies (not inclusive)
	 * @return the range of matching companies
	 */
	public java.util.List<Company> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the companies where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of companies
	 * @param end the upper bound of the range of companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching companies
	 */
	public java.util.List<Company> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Company>
			orderByComparator);

	/**
	 * Returns an ordered range of all the companies where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of companies
	 * @param end the upper bound of the range of companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching companies
	 */
	public java.util.List<Company> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Company>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first company in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company
	 * @throws NoSuchCompanyException if a matching company could not be found
	 */
	public Company findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Company>
				orderByComparator)
		throws NoSuchCompanyException;

	/**
	 * Returns the first company in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company, or <code>null</code> if a matching company could not be found
	 */
	public Company fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Company>
			orderByComparator);

	/**
	 * Returns the last company in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company
	 * @throws NoSuchCompanyException if a matching company could not be found
	 */
	public Company findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Company>
				orderByComparator)
		throws NoSuchCompanyException;

	/**
	 * Returns the last company in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company, or <code>null</code> if a matching company could not be found
	 */
	public Company fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Company>
			orderByComparator);

	/**
	 * Removes all the companies where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of companies where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching companies
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the company in the entity cache if it is enabled.
	 *
	 * @param company the company
	 */
	public void cacheResult(Company company);

	/**
	 * Caches the companies in the entity cache if it is enabled.
	 *
	 * @param companies the companies
	 */
	public void cacheResult(java.util.List<Company> companies);

	/**
	 * Creates a new company with the primary key. Does not add the company to the database.
	 *
	 * @param companyId the primary key for the new company
	 * @return the new company
	 */
	public Company create(long companyId);

	/**
	 * Removes the company with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyId the primary key of the company
	 * @return the company that was removed
	 * @throws NoSuchCompanyException if a company with the primary key could not be found
	 */
	public Company remove(long companyId) throws NoSuchCompanyException;

	public Company updateImpl(Company company);

	/**
	 * Returns the company with the primary key or throws a <code>NoSuchCompanyException</code> if it could not be found.
	 *
	 * @param companyId the primary key of the company
	 * @return the company
	 * @throws NoSuchCompanyException if a company with the primary key could not be found
	 */
	public Company findByPrimaryKey(long companyId)
		throws NoSuchCompanyException;

	/**
	 * Returns the company with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyId the primary key of the company
	 * @return the company, or <code>null</code> if a company with the primary key could not be found
	 */
	public Company fetchByPrimaryKey(long companyId);

	/**
	 * Returns all the companies.
	 *
	 * @return the companies
	 */
	public java.util.List<Company> findAll();

	/**
	 * Returns a range of all the companies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of companies
	 * @param end the upper bound of the range of companies (not inclusive)
	 * @return the range of companies
	 */
	public java.util.List<Company> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the companies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of companies
	 * @param end the upper bound of the range of companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of companies
	 */
	public java.util.List<Company> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Company>
			orderByComparator);

	/**
	 * Returns an ordered range of all the companies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of companies
	 * @param end the upper bound of the range of companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of companies
	 */
	public java.util.List<Company> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Company>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the companies from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of companies.
	 *
	 * @return the number of companies
	 */
	public int countAll();

}