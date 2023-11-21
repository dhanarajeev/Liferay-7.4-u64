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

package com.lr.goldisan.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Company}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Company
 * @generated
 */
public class CompanyWrapper
	extends BaseModelWrapper<Company>
	implements Company, ModelWrapper<Company> {

	public CompanyWrapper(Company company) {
		super(company);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("companyId", getCompanyId());
		attributes.put("companyName", getCompanyName());
		attributes.put("registrationId", getRegistrationId());
		attributes.put("email", getEmail());
		attributes.put("taxId", getTaxId());
		attributes.put("phoneNumber", getPhoneNumber());
		attributes.put("gst", getGst());
		attributes.put("address", getAddress());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		Long registrationId = (Long)attributes.get("registrationId");

		if (registrationId != null) {
			setRegistrationId(registrationId);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long taxId = (Long)attributes.get("taxId");

		if (taxId != null) {
			setTaxId(taxId);
		}

		Long phoneNumber = (Long)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
		}

		Long gst = (Long)attributes.get("gst");

		if (gst != null) {
			setGst(gst);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}
	}

	@Override
	public Company cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this company.
	 *
	 * @return the address of this company
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the company ID of this company.
	 *
	 * @return the company ID of this company
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this company.
	 *
	 * @return the company name of this company
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the email of this company.
	 *
	 * @return the email of this company
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the gst of this company.
	 *
	 * @return the gst of this company
	 */
	@Override
	public long getGst() {
		return model.getGst();
	}

	/**
	 * Returns the phone number of this company.
	 *
	 * @return the phone number of this company
	 */
	@Override
	public long getPhoneNumber() {
		return model.getPhoneNumber();
	}

	/**
	 * Returns the primary key of this company.
	 *
	 * @return the primary key of this company
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the registration ID of this company.
	 *
	 * @return the registration ID of this company
	 */
	@Override
	public long getRegistrationId() {
		return model.getRegistrationId();
	}

	/**
	 * Returns the tax ID of this company.
	 *
	 * @return the tax ID of this company
	 */
	@Override
	public long getTaxId() {
		return model.getTaxId();
	}

	/**
	 * Returns the uuid of this company.
	 *
	 * @return the uuid of this company
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
	 * Sets the address of this company.
	 *
	 * @param address the address of this company
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the company ID of this company.
	 *
	 * @param companyId the company ID of this company
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this company.
	 *
	 * @param companyName the company name of this company
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the email of this company.
	 *
	 * @param email the email of this company
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the gst of this company.
	 *
	 * @param gst the gst of this company
	 */
	@Override
	public void setGst(long gst) {
		model.setGst(gst);
	}

	/**
	 * Sets the phone number of this company.
	 *
	 * @param phoneNumber the phone number of this company
	 */
	@Override
	public void setPhoneNumber(long phoneNumber) {
		model.setPhoneNumber(phoneNumber);
	}

	/**
	 * Sets the primary key of this company.
	 *
	 * @param primaryKey the primary key of this company
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the registration ID of this company.
	 *
	 * @param registrationId the registration ID of this company
	 */
	@Override
	public void setRegistrationId(long registrationId) {
		model.setRegistrationId(registrationId);
	}

	/**
	 * Sets the tax ID of this company.
	 *
	 * @param taxId the tax ID of this company
	 */
	@Override
	public void setTaxId(long taxId) {
		model.setTaxId(taxId);
	}

	/**
	 * Sets the uuid of this company.
	 *
	 * @param uuid the uuid of this company
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
	protected CompanyWrapper wrap(Company company) {
		return new CompanyWrapper(company);
	}

}