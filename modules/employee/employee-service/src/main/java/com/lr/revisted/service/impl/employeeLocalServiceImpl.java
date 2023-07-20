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
import com.lr.revisted.model.employee;
import com.lr.revisted.model.impl.employeeImpl;
import com.lr.revisted.service.base.employeeLocalServiceBaseImpl;
import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.lr.revisted.model.employee",
	service = AopService.class
)
public class employeeLocalServiceImpl extends employeeLocalServiceBaseImpl {

	@Override
	public employee addemployee( String name, long phoneNumber, String email, String address)
	{
		employee employee = new employeeImpl ();

		employee.setName ( name );
		employee.setPhoneNumber ( phoneNumber );
		employee.setEmail ( email );
		employee.setAddress ( address );

		long employeeId = counterLocalService.increment (employee.class.getName ());
		employee.setEmployeeId ( employeeId );

		employeeLocalService.addemployee ( employee );
		return employee;
	}
}
