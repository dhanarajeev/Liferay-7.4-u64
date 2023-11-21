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

package com.lr.goldisannew.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Store}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Store
 * @generated
 */
public class StoreWrapper
	extends BaseModelWrapper<Store> implements ModelWrapper<Store>, Store {

	public StoreWrapper(Store store) {
		super(store);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("storeId", getStoreId());
		attributes.put("branchId", getBranchId());
		attributes.put("branchName", getBranchName());
		attributes.put("address", getAddress());
		attributes.put("contactNumber", getContactNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long storeId = (Long)attributes.get("storeId");

		if (storeId != null) {
			setStoreId(storeId);
		}

		Long branchId = (Long)attributes.get("branchId");

		if (branchId != null) {
			setBranchId(branchId);
		}

		String branchName = (String)attributes.get("branchName");

		if (branchName != null) {
			setBranchName(branchName);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Long contactNumber = (Long)attributes.get("contactNumber");

		if (contactNumber != null) {
			setContactNumber(contactNumber);
		}
	}

	@Override
	public Store cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this store.
	 *
	 * @return the address of this store
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the branch ID of this store.
	 *
	 * @return the branch ID of this store
	 */
	@Override
	public long getBranchId() {
		return model.getBranchId();
	}

	/**
	 * Returns the branch name of this store.
	 *
	 * @return the branch name of this store
	 */
	@Override
	public String getBranchName() {
		return model.getBranchName();
	}

	/**
	 * Returns the contact number of this store.
	 *
	 * @return the contact number of this store
	 */
	@Override
	public long getContactNumber() {
		return model.getContactNumber();
	}

	/**
	 * Returns the primary key of this store.
	 *
	 * @return the primary key of this store
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the store ID of this store.
	 *
	 * @return the store ID of this store
	 */
	@Override
	public long getStoreId() {
		return model.getStoreId();
	}

	/**
	 * Returns the uuid of this store.
	 *
	 * @return the uuid of this store
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address of this store.
	 *
	 * @param address the address of this store
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the branch ID of this store.
	 *
	 * @param branchId the branch ID of this store
	 */
	@Override
	public void setBranchId(long branchId) {
		model.setBranchId(branchId);
	}

	/**
	 * Sets the branch name of this store.
	 *
	 * @param branchName the branch name of this store
	 */
	@Override
	public void setBranchName(String branchName) {
		model.setBranchName(branchName);
	}

	/**
	 * Sets the contact number of this store.
	 *
	 * @param contactNumber the contact number of this store
	 */
	@Override
	public void setContactNumber(long contactNumber) {
		model.setContactNumber(contactNumber);
	}

	/**
	 * Sets the primary key of this store.
	 *
	 * @param primaryKey the primary key of this store
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the store ID of this store.
	 *
	 * @param storeId the store ID of this store
	 */
	@Override
	public void setStoreId(long storeId) {
		model.setStoreId(storeId);
	}

	/**
	 * Sets the uuid of this store.
	 *
	 * @param uuid the uuid of this store
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected StoreWrapper wrap(Store store) {
		return new StoreWrapper(store);
	}

}