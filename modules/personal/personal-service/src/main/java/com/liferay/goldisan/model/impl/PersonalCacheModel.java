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

package com.liferay.goldisan.model.impl;

import com.liferay.goldisan.model.Personal;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Personal in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PersonalCacheModel
	implements CacheModel<Personal>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PersonalCacheModel)) {
			return false;
		}

		PersonalCacheModel personalCacheModel = (PersonalCacheModel)object;

		if (personId == personalCacheModel.personId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, personId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", personId=");
		sb.append(personId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", phoneNumber=");
		sb.append(phoneNumber);
		sb.append(", createPassword=");
		sb.append(createPassword);
		sb.append(", conformPassword=");
		sb.append(conformPassword);
		sb.append(", address=");
		sb.append(address);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Personal toEntityModel() {
		PersonalImpl personalImpl = new PersonalImpl();

		if (uuid == null) {
			personalImpl.setUuid("");
		}
		else {
			personalImpl.setUuid(uuid);
		}

		personalImpl.setPersonId(personId);

		if (firstName == null) {
			personalImpl.setFirstName("");
		}
		else {
			personalImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			personalImpl.setLastName("");
		}
		else {
			personalImpl.setLastName(lastName);
		}

		if (emailAddress == null) {
			personalImpl.setEmailAddress("");
		}
		else {
			personalImpl.setEmailAddress(emailAddress);
		}

		personalImpl.setPhoneNumber(phoneNumber);

		if (createPassword == null) {
			personalImpl.setCreatePassword("");
		}
		else {
			personalImpl.setCreatePassword(createPassword);
		}

		if (conformPassword == null) {
			personalImpl.setConformPassword("");
		}
		else {
			personalImpl.setConformPassword(conformPassword);
		}

		if (address == null) {
			personalImpl.setAddress("");
		}
		else {
			personalImpl.setAddress(address);
		}

		personalImpl.resetOriginalValues();

		return personalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		personId = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		emailAddress = objectInput.readUTF();

		phoneNumber = objectInput.readLong();
		createPassword = objectInput.readUTF();
		conformPassword = objectInput.readUTF();
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

		objectOutput.writeLong(personId);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		objectOutput.writeLong(phoneNumber);

		if (createPassword == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(createPassword);
		}

		if (conformPassword == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(conformPassword);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}
	}

	public String uuid;
	public long personId;
	public String firstName;
	public String lastName;
	public String emailAddress;
	public long phoneNumber;
	public String createPassword;
	public String conformPassword;
	public String address;

}