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

package com.lr.goldisan.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.lr.goldisan.model.Company;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Company in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CompanyCacheModel implements CacheModel<Company>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CompanyCacheModel)) {
			return false;
		}

		CompanyCacheModel companyCacheModel = (CompanyCacheModel)object;

		if (companyId == companyCacheModel.companyId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, companyId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", registrationId=");
		sb.append(registrationId);
		sb.append(", email=");
		sb.append(email);
		sb.append(", taxId=");
		sb.append(taxId);
		sb.append(", phoneNumber=");
		sb.append(phoneNumber);
		sb.append(", gst=");
		sb.append(gst);
		sb.append(", address=");
		sb.append(address);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Company toEntityModel() {
		CompanyImpl companyImpl = new CompanyImpl();

		if (uuid == null) {
			companyImpl.setUuid("");
		}
		else {
			companyImpl.setUuid(uuid);
		}

		companyImpl.setCompanyId(companyId);

		if (companyName == null) {
			companyImpl.setCompanyName("");
		}
		else {
			companyImpl.setCompanyName(companyName);
		}

		companyImpl.setRegistrationId(registrationId);

		if (email == null) {
			companyImpl.setEmail("");
		}
		else {
			companyImpl.setEmail(email);
		}

		companyImpl.setTaxId(taxId);
		companyImpl.setPhoneNumber(phoneNumber);
		companyImpl.setGst(gst);

		if (address == null) {
			companyImpl.setAddress("");
		}
		else {
			companyImpl.setAddress(address);
		}

		companyImpl.resetOriginalValues();

		return companyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		companyId = objectInput.readLong();
		companyName = objectInput.readUTF();

		registrationId = objectInput.readLong();
		email = objectInput.readUTF();

		taxId = objectInput.readLong();

		phoneNumber = objectInput.readLong();

		gst = objectInput.readLong();
		address = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(companyId);

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		objectOutput.writeLong(registrationId);

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(taxId);

		objectOutput.writeLong(phoneNumber);

		objectOutput.writeLong(gst);

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}
	}

	public String uuid;
	public long companyId;
	public String companyName;
	public long registrationId;
	public String email;
	public long taxId;
	public long phoneNumber;
	public long gst;
	public String address;

}