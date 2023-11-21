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

package com.liferay.goldisan.service;

import com.liferay.goldisan.model.Personal;
import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PersonalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PersonalLocalService
 * @generated
 */
public class PersonalLocalServiceWrapper
	implements PersonalLocalService, ServiceWrapper<PersonalLocalService> {

	public PersonalLocalServiceWrapper() {
		this(null);
	}

	public PersonalLocalServiceWrapper(
		PersonalLocalService personalLocalService) {

		_personalLocalService = personalLocalService;
	}

	/**
	 * Adds the personal to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersonalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param personal the personal
	 * @return the personal that was added
	 */
	@Override
	public com.liferay.goldisan.model.Personal addPersonal(
		com.liferay.goldisan.model.Personal personal) {

		return _personalLocalService.addPersonal(personal);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personalLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new personal with the primary key. Does not add the personal to the database.
	 *
	 * @param personId the primary key for the new personal
	 * @return the new personal
	 */
	@Override
	public com.liferay.goldisan.model.Personal createPersonal(long personId) {
		return _personalLocalService.createPersonal(personId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personalLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the personal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersonalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param personId the primary key of the personal
	 * @return the personal that was removed
	 * @throws PortalException if a personal with the primary key could not be found
	 */
	@Override
	public com.liferay.goldisan.model.Personal deletePersonal(long personId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personalLocalService.deletePersonal(personId);
	}

	/**
	 * Deletes the personal from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersonalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param personal the personal
	 * @return the personal that was removed
	 */
	@Override
	public com.liferay.goldisan.model.Personal deletePersonal(
		com.liferay.goldisan.model.Personal personal) {

		return _personalLocalService.deletePersonal(personal);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _personalLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _personalLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _personalLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _personalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.goldisan.model.impl.PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _personalLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.goldisan.model.impl.PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _personalLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _personalLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _personalLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.goldisan.model.Personal fetchPersonal(long personId) {
		return _personalLocalService.fetchPersonal(personId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _personalLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _personalLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _personalLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personalLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the personal with the primary key.
	 *
	 * @param personId the primary key of the personal
	 * @return the personal
	 * @throws PortalException if a personal with the primary key could not be found
	 */
	@Override
	public com.liferay.goldisan.model.Personal getPersonal(long personId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personalLocalService.getPersonal(personId);
	}

	/**
	 * Returns a range of all the personals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.goldisan.model.impl.PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personals
	 * @param end the upper bound of the range of personals (not inclusive)
	 * @return the range of personals
	 */
	@Override
	public java.util.List<com.liferay.goldisan.model.Personal> getPersonals(
		int start, int end) {

		return _personalLocalService.getPersonals(start, end);
	}

	/**
	 * Returns the number of personals.
	 *
	 * @return the number of personals
	 */
	@Override
	public int getPersonalsCount() {
		return _personalLocalService.getPersonalsCount();
	}

	/**
	 * Updates the personal in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersonalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param personal the personal
	 * @return the personal that was updated
	 */
	@Override
	public com.liferay.goldisan.model.Personal updatePersonal(
		com.liferay.goldisan.model.Personal personal) {

		return _personalLocalService.updatePersonal(personal);
	}

	@Override
	public Personal addPersonal(String firstName, String lastName, String emailAddress, long phoneNumber, String createPassword, String conformPassword, String address) {
		return null;
	}

	@Override
	public PersonalLocalService getWrappedService() {
		return _personalLocalService;
	}

	@Override
	public void setWrappedService(PersonalLocalService personalLocalService) {
		_personalLocalService = personalLocalService;
	}

	private PersonalLocalService _personalLocalService;

}
