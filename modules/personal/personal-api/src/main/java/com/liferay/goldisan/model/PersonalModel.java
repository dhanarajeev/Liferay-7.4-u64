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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Personal service. Represents a row in the &quot;lr_Personal&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.goldisan.model.impl.PersonalModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.goldisan.model.impl.PersonalImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Personal
 * @generated
 */
@ProviderType
public interface PersonalModel extends BaseModel<Personal> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a personal model instance should use the {@link Personal} interface instead.
	 */

	/**
	 * Returns the primary key of this personal.
	 *
	 * @return the primary key of this personal
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this personal.
	 *
	 * @param primaryKey the primary key of this personal
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this personal.
	 *
	 * @return the uuid of this personal
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this personal.
	 *
	 * @param uuid the uuid of this personal
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the person ID of this personal.
	 *
	 * @return the person ID of this personal
	 */
	public long getPersonId();

	/**
	 * Sets the person ID of this personal.
	 *
	 * @param personId the person ID of this personal
	 */
	public void setPersonId(long personId);

	/**
	 * Returns the first name of this personal.
	 *
	 * @return the first name of this personal
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this personal.
	 *
	 * @param firstName the first name of this personal
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this personal.
	 *
	 * @return the last name of this personal
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this personal.
	 *
	 * @param lastName the last name of this personal
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the email address of this personal.
	 *
	 * @return the email address of this personal
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this personal.
	 *
	 * @param emailAddress the email address of this personal
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the phone number of this personal.
	 *
	 * @return the phone number of this personal
	 */
	public long getPhoneNumber();

	/**
	 * Sets the phone number of this personal.
	 *
	 * @param phoneNumber the phone number of this personal
	 */
	public void setPhoneNumber(long phoneNumber);

	/**
	 * Returns the create password of this personal.
	 *
	 * @return the create password of this personal
	 */
	@AutoEscape
	public String getCreatePassword();

	/**
	 * Sets the create password of this personal.
	 *
	 * @param createPassword the create password of this personal
	 */
	public void setCreatePassword(String createPassword);

	/**
	 * Returns the conform password of this personal.
	 *
	 * @return the conform password of this personal
	 */
	@AutoEscape
	public String getConformPassword();

	/**
	 * Sets the conform password of this personal.
	 *
	 * @param conformPassword the conform password of this personal
	 */
	public void setConformPassword(String conformPassword);

	/**
	 * Returns the address of this personal.
	 *
	 * @return the address of this personal
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this personal.
	 *
	 * @param address the address of this personal
	 */
	public void setAddress(String address);

	@Override
	public Personal cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}