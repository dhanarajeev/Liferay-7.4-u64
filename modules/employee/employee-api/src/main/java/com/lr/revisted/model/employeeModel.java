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

package com.lr.revisted.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the employee service. Represents a row in the &quot;lr_employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.lr.revisted.model.impl.employeeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.lr.revisted.model.impl.employeeImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see employee
 * @generated
 */
@ProviderType
public interface employeeModel extends BaseModel<employee> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link employee} interface instead.
	 */

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this employee.
	 *
	 * @return the uuid of this employee
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this employee.
	 *
	 * @param uuid the uuid of this employee
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the employee ID of this employee.
	 *
	 * @return the employee ID of this employee
	 */
	public long getEmployeeId();

	/**
	 * Sets the employee ID of this employee.
	 *
	 * @param employeeId the employee ID of this employee
	 */
	public void setEmployeeId(long employeeId);

	/**
	 * Returns the name of this employee.
	 *
	 * @return the name of this employee
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this employee.
	 *
	 * @param name the name of this employee
	 */
	public void setName(String name);

	/**
	 * Returns the phone number of this employee.
	 *
	 * @return the phone number of this employee
	 */
	public long getPhoneNumber();

	/**
	 * Sets the phone number of this employee.
	 *
	 * @param phoneNumber the phone number of this employee
	 */
	public void setPhoneNumber(long phoneNumber);

	/**
	 * Returns the email of this employee.
	 *
	 * @return the email of this employee
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this employee.
	 *
	 * @param email the email of this employee
	 */
	public void setEmail(String email);

	/**
	 * Returns the address of this employee.
	 *
	 * @return the address of this employee
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this employee.
	 *
	 * @param address the address of this employee
	 */
	public void setAddress(String address);

	@Override
	public employee cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}