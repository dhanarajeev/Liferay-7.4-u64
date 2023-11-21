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

package com.lr.goldisan.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CompanyService}.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyService
 * @generated
 */
public class CompanyServiceWrapper
	implements CompanyService, ServiceWrapper<CompanyService> {

	public CompanyServiceWrapper() {
		this(null);
	}

	public CompanyServiceWrapper(CompanyService companyService) {
		_companyService = companyService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _companyService.getOSGiServiceIdentifier();
	}

	@Override
	public CompanyService getWrappedService() {
		return _companyService;
	}

	@Override
	public void setWrappedService(CompanyService companyService) {
		_companyService = companyService;
	}

	private CompanyService _companyService;

}