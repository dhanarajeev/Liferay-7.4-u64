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

package com.lr.goldisan.service.impl;

import com.liferay.portal.aop.AopService;

import com.lr.goldisan.model.Company;
import com.lr.goldisan.model.impl.CompanyImpl;
import com.lr.goldisan.service.base.CompanyLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.lr.goldisan.model.Company",
	service = AopService.class
)
public class CompanyLocalServiceImpl extends CompanyLocalServiceBaseImpl {
	@Override
	public Company addCompany(String companyName, long registrationId, String email, long taxId, long phoneNumber, long gst, String address) {

		Company company = new CompanyImpl ();
		company.setCompanyName ( companyName );
		company.setRegistrationId ( registrationId );
		company.setEmail ( email );
		company.setTaxId ( taxId );
		company.setPhoneNumber ( phoneNumber );
		company.setGst ( gst );
		company.setAddress ( address );
		return companyPersistence.update(company);
	}
}
