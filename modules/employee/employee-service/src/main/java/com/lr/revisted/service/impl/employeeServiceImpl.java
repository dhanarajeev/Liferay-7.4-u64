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

package com.lr.revisted.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.lr.revisted.model.employee;
import com.lr.revisted.service.base.employeeServiceBaseImpl;
import org.osgi.service.component.annotations.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=lr",
		"json.web.service.context.path=employee"
	},
	service = AopService.class
)
public class employeeServiceImpl extends employeeServiceBaseImpl {

	public employee addemployee(String name, long phoneNumber, String email, String address){

		return employeeLocalService.addemployee ( name, phoneNumber, email, address );
	}

	@Override
	public employee getEmployeeById(long employeeId) throws PortalException{
		return employeeLocalService.getemployee ( employeeId );
	}

	@Override
	public List<employee> getEmployees(int startIndex, int lastIndex) {
		List<employee> employees = new ArrayList<employee> ();
		employees = employeeLocalService.getemployees ( startIndex, lastIndex );
		return employees;
	}


	@Override
	public int getEmployeesCount() {
		return employeeLocalService.getemployeesCount ();
	}

	/*@Override
	public employee getemployeeById(long employeeId) throws PortalException {
		return employeeLocalService.getemployee ( employeeId );
	}

	@Override
	public List<employee> getemployees(int startIndex, int lastIndex) {
		List<employee> employees = new ArrayList<employee> ();
		employees = employeeLocalService.getemployees ( startIndex, lastIndex );
		return employees;
	}

	 */
	/*public List<employee> getEmployees(int startIndex, int lastIndex){

		List<employee> employees = new ArrayList<employee> ();
		employees = employeeLocalService.getemployees ( startIndex, lastIndex );
				return employees;
	}
	public int getEmployeesCount(){
		return employeeLocalService.getemployeesCount ();
	}*/
}
