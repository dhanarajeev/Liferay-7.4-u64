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
import com.liferay.portal.kernel.exception.PortalException;
import com.lr.goldisan.model.Company;
import com.lr.goldisan.service.base.CompanyServiceBaseImpl;
import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=lr",
		"json.web.service.context.path=Company"
	},
	service = AopService.class
)
public class CompanyServiceImpl extends CompanyServiceBaseImpl {
	@Override
	public Company addCompany (String companyName, long registrationId, String email, long taxId,
							   long phoneNumber, long gst, String address)
	{
		return companyLocalService.addCompany ( companyName, registrationId, email, taxId, phoneNumber, gst, address );
	}

	@Override
	public Company getCompanyById(long companyId) throws PortalException {
		return companyLocalService.getCompany ( companyId );
	}

	@Override
	public Company updateCompany(String companyName, long registrationId, String email, long taxId, long phoneNumber, long gst, String address) {
		return null;
	}

	@Override
	public Company updateCompany (long companyId, String companyName, long registrationId, String email, long taxId,
								  long phoneNumber, long gst, String address)
	{
		Company company = companyPersistence.fetchByPrimaryKey ( companyId );
		if(company != null)
		{
			company.setCompanyName ( companyName );
			company.setRegistrationId ( registrationId );
			company.setEmail ( email );
			company.setTaxId ( taxId );
			company.setPhoneNumber ( phoneNumber );
			company.setGst ( gst );
			company.setAddress ( address );

			return companyPersistence.update ( company );
		}
		return null;
	}
}
