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

package com.lr.goldisannew.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.lr.goldisannew.model.Store;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Store in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StoreCacheModel implements CacheModel<Store>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof StoreCacheModel)) {
			return false;
		}

		StoreCacheModel storeCacheModel = (StoreCacheModel)object;

		if (storeId == storeCacheModel.storeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, storeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", storeId=");
		sb.append(storeId);
		sb.append(", branchId=");
		sb.append(branchId);
		sb.append(", branchName=");
		sb.append(branchName);
		sb.append(", address=");
		sb.append(address);
		sb.append(", contactNumber=");
		sb.append(contactNumber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Store toEntityModel() {
		StoreImpl storeImpl = new StoreImpl();

		if (uuid == null) {
			storeImpl.setUuid("");
		}
		else {
			storeImpl.setUuid(uuid);
		}

		storeImpl.setStoreId(storeId);
		storeImpl.setBranchId(branchId);

		if (branchName == null) {
			storeImpl.setBranchName("");
		}
		else {
			storeImpl.setBranchName(branchName);
		}

		if (address == null) {
			storeImpl.setAddress("");
		}
		else {
			storeImpl.setAddress(address);
		}

		storeImpl.setContactNumber(contactNumber);

		storeImpl.resetOriginalValues();

		return storeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		storeId = objectInput.readLong();

		branchId = objectInput.readLong();
		branchName = objectInput.readUTF();
		address = objectInput.readUTF();

		contactNumber = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(storeId);

		objectOutput.writeLong(branchId);

		if (branchName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(branchName);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		objectOutput.writeLong(contactNumber);
	}

	public String uuid;
	public long storeId;
	public long branchId;
	public String branchName;
	public String address;
	public long contactNumber;

}