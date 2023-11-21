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

package com.liferay.goldisan.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Personal}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Personal
 * @generated
 */
public class PersonalWrapper
	extends BaseModelWrapper<Personal>
	implements ModelWrapper<Personal>, Personal {

	public PersonalWrapper(Personal personal) {
		super(personal);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("personId", getPersonId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("phoneNumber", getPhoneNumber());
		attributes.put("createPassword", getCreatePassword());
		attributes.put("conformPassword", getConformPassword());
		attributes.put("address", getAddress());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long personId = (Long)attributes.get("personId");

		if (personId != null) {
			setPersonId(personId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		Long phoneNumber = (Long)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
		}

		String createPassword = (String)attributes.get("createPassword");

		if (createPassword != null) {
			setCreatePassword(createPassword);
		}

		String conformPassword = (String)attributes.get("conformPassword");

		if (conformPassword != null) {
			setConformPassword(conformPassword);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}
	}

	@Override
	public Personal cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this personal.
	 *
	 * @return the address of this personal
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the conform password of this personal.
	 *
	 * @return the conform password of this personal
	 */
	@Override
	public String getConformPassword() {
		return model.getConformPassword();
	}

	/**
	 * Returns the create password of this personal.
	 *
	 * @return the create password of this personal
	 */
	@Override
	public String getCreatePassword() {
		return model.getCreatePassword();
	}

	/**
	 * Returns the email address of this personal.
	 *
	 * @return the email address of this personal
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the first name of this personal.
	 *
	 * @return the first name of this personal
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the last name of this personal.
	 *
	 * @return the last name of this personal
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the person ID of this personal.
	 *
	 * @return the person ID of this personal
	 */
	@Override
	public long getPersonId() {
		return model.getPersonId();
	}

	/**
	 * Returns the phone number of this personal.
	 *
	 * @return the phone number of this personal
	 */
	@Override
	public long getPhoneNumber() {
		return model.getPhoneNumber();
	}

	/**
	 * Returns the primary key of this personal.
	 *
	 * @return the primary key of this personal
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this personal.
	 *
	 * @return the uuid of this personal
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
	 * Sets the address of this personal.
	 *
	 * @param address the address of this personal
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the conform password of this personal.
	 *
	 * @param conformPassword the conform password of this personal
	 */
	@Override
	public void setConformPassword(String conformPassword) {
		model.setConformPassword(conformPassword);
	}

	/**
	 * Sets the create password of this personal.
	 *
	 * @param createPassword the create password of this personal
	 */
	@Override
	public void setCreatePassword(String createPassword) {
		model.setCreatePassword(createPassword);
	}

	/**
	 * Sets the email address of this personal.
	 *
	 * @param emailAddress the email address of this personal
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the first name of this personal.
	 *
	 * @param firstName the first name of this personal
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the last name of this personal.
	 *
	 * @param lastName the last name of this personal
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the person ID of this personal.
	 *
	 * @param personId the person ID of this personal
	 */
	@Override
	public void setPersonId(long personId) {
		model.setPersonId(personId);
	}

	/**
	 * Sets the phone number of this personal.
	 *
	 * @param phoneNumber the phone number of this personal
	 */
	@Override
	public void setPhoneNumber(long phoneNumber) {
		model.setPhoneNumber(phoneNumber);
	}

	/**
	 * Sets the primary key of this personal.
	 *
	 * @param primaryKey the primary key of this personal
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this personal.
	 *
	 * @param uuid the uuid of this personal
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
	protected PersonalWrapper wrap(Personal personal) {
		return new PersonalWrapper(personal);
	}

}