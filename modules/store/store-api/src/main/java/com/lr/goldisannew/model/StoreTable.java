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

package com.lr.goldisannew.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;lr_Store&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Store
 * @generated
 */
public class StoreTable extends BaseTable<StoreTable> {

	public static final StoreTable INSTANCE = new StoreTable();

	public final Column<StoreTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StoreTable, Long> storeId = createColumn(
		"storeId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<StoreTable, Long> branchId = createColumn(
		"branchId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<StoreTable, String> branchName = createColumn(
		"branchName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StoreTable, String> address = createColumn(
		"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StoreTable, Long> contactNumber = createColumn(
		"contactNumber", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private StoreTable() {
		super("lr_Store", StoreTable::new);
	}

}