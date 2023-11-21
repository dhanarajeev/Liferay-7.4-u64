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

package com.liferay.goldisan.service.impl;

import com.liferay.goldisan.model.Personal;
import com.liferay.goldisan.service.base.PersonalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=lr",
		"json.web.service.context.path=Personal"
	},
	service = AopService.class
)
public class PersonalServiceImpl extends PersonalServiceBaseImpl {
@Override
	public Personal addPersonal(String firstName, String lastName, String emailAddress, long phoneNumber,
								String createPassword, String conformPassword, String address)
	{
		return personalLocalService.addPersonal ( firstName, lastName, emailAddress, phoneNumber, createPassword, conformPassword, address );
	}
	@Override
	public Personal getPersonalById(long personalId) throws PortalException {
		return personalLocalService.getPersonal ( personalId );
	}

	@Override
	public List< Personal> getPersonals(int startIndex, int lastIndex) {
		List<Personal> personals = new ArrayList< Personal > ();
		personals = personalLocalService.getPersonals ( startIndex, lastIndex );
		return personals;
	}
	@Override
	public Personal deletePersonal(long personalId) throws PortalException {
		Personal personal = personalLocalService.getPersonal ( personalId );
		return personalLocalService.deletePersonal ( personal );
	}

	@Override
	public Personal updatePersonal(long personalId, String firstName,String lastName, String emailAddress,
								   long phoneNumber, String createPassword,String conformPassword, String address) {
		Personal personal = personalPersistence.fetchByPrimaryKey ( personalId );

		if(personal != null)
		{
			personal.setFirstName ( firstName );
			personal.setLastName ( lastName );
			personal.setEmailAddress ( emailAddress );
			personal.setPhoneNumber ( phoneNumber );
			personal.setCreatePassword ( createPassword );
			personal.setConformPassword ( conformPassword );
			personal.setAddress ( address );

			return personalPersistence.update ( personal );
		}
		return null;
	}
}
