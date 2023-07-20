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

package com.lr.revisted.service;

import com.liferay.portal.kernel.exception.PortalException;

import com.lr.revisted.model.employee;

import java.util.List;

/**
 * Provides the remote service utility for employee. This utility wraps
 * <code>com.lr.revisted.service.impl.employeeServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see employeeService
 * @generated
 */
public class employeeServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.lr.revisted.service.impl.employeeServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static employee addemployee(
		String name, long phoneNumber, String email, String address) {

		return getService().addemployee(name, phoneNumber, email, address);
	}

	public static employee getEmployeeById(long employeeId)
		throws PortalException {

		return getService().getEmployeeById(employeeId);
	}

	public static List<employee> getEmployees(int startIndex, int lastIndex) {
		return getService().getEmployees(startIndex, lastIndex);
	}

	public static int getEmployeesCount() {
		return getService().getEmployeesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static employeeService getService() {
		return _service;
	}

	private static volatile employeeService _service;

}