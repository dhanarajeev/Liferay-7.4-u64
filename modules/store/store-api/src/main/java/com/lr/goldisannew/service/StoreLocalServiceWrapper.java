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

package com.lr.goldisannew.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.lr.goldisannew.model.Store;

/**
 * Provides a wrapper for {@link StoreLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StoreLocalService
 * @generated
 */
public class StoreLocalServiceWrapper
	implements ServiceWrapper<StoreLocalService>, StoreLocalService {

	public StoreLocalServiceWrapper() {
		this(null);
	}

	public StoreLocalServiceWrapper(StoreLocalService storeLocalService) {
		_storeLocalService = storeLocalService;
	}

	/**
	 * Adds the store to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StoreLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param store the store
	 * @return the store that was added
	 */
	@Override
	public com.lr.goldisannew.model.Store addStore(
		com.lr.goldisannew.model.Store store) {

		return _storeLocalService.addStore(store);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _storeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new store with the primary key. Does not add the store to the database.
	 *
	 * @param storeId the primary key for the new store
	 * @return the new store
	 */
	@Override
	public com.lr.goldisannew.model.Store createStore(long storeId) {
		return _storeLocalService.createStore(storeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _storeLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the store with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StoreLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param storeId the primary key of the store
	 * @return the store that was removed
	 * @throws PortalException if a store with the primary key could not be found
	 */
	@Override
	public com.lr.goldisannew.model.Store deleteStore(long storeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _storeLocalService.deleteStore(storeId);
	}

	/**
	 * Deletes the store from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StoreLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param store the store
	 * @return the store that was removed
	 */
	@Override
	public com.lr.goldisannew.model.Store deleteStore(
		com.lr.goldisannew.model.Store store) {

		return _storeLocalService.deleteStore(store);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _storeLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _storeLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _storeLocalService.dynamicQuery();
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

		return _storeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.lr.goldisannew.model.impl.StoreModelImpl</code>.
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

		return _storeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.lr.goldisannew.model.impl.StoreModelImpl</code>.
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

		return _storeLocalService.dynamicQuery(
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

		return _storeLocalService.dynamicQueryCount(dynamicQuery);
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

		return _storeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.lr.goldisannew.model.Store fetchStore(long storeId) {
		return _storeLocalService.fetchStore(storeId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _storeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _storeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _storeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _storeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the store with the primary key.
	 *
	 * @param storeId the primary key of the store
	 * @return the store
	 * @throws PortalException if a store with the primary key could not be found
	 */
	@Override
	public com.lr.goldisannew.model.Store getStore(long storeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _storeLocalService.getStore(storeId);
	}

	/**
	 * Returns a range of all the stores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.lr.goldisannew.model.impl.StoreModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stores
	 * @param end the upper bound of the range of stores (not inclusive)
	 * @return the range of stores
	 */
	@Override
	public java.util.List<com.lr.goldisannew.model.Store> getStores(
		int start, int end) {

		return _storeLocalService.getStores(start, end);
	}

	/**
	 * Returns the number of stores.
	 *
	 * @return the number of stores
	 */
	@Override
	public int getStoresCount() {
		return _storeLocalService.getStoresCount();
	}

	/**
	 * Updates the store in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StoreLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param store the store
	 * @return the store that was updated
	 */
	@Override
	public com.lr.goldisannew.model.Store updateStore(
		com.lr.goldisannew.model.Store store) {

		return _storeLocalService.updateStore(store);
	}

	@Override
	public Store addStore(long branchId, String branchName, String address, long contactNumber) {
		return null;
	}

	@Override
	public StoreLocalService getWrappedService() {
		return _storeLocalService;
	}

	@Override
	public void setWrappedService(StoreLocalService storeLocalService) {
		_storeLocalService = storeLocalService;
	}

	private StoreLocalService _storeLocalService;

}
