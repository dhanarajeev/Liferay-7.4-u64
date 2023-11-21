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

package com.lr.goldisannew.service.impl;

import com.liferay.portal.aop.AopService;

import com.lr.goldisannew.model.Store;
import com.lr.goldisannew.model.impl.StoreImpl;
import com.lr.goldisannew.service.base.StoreLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.lr.goldisannew.model.Store",
	service = AopService.class
)
public class StoreLocalServiceImpl extends StoreLocalServiceBaseImpl {
	@Override
	public Store addStore(long branchId, String branchName, String address, long contactNumber)
	{
		Store store = new StoreImpl ();

		store.setBranchId ( branchId );
		store.setBranchName ( branchName );
		store.setAddress ( address );
		store.setContactNumber ( contactNumber );
		return storePersistence.update(store);
	}
}
