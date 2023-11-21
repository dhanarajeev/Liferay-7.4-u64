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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;lr_Company&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Company
 * @generated
 */
public class CompanyTable extends BaseTable<CompanyTable> {

	public static final CompanyTable INSTANCE = new CompanyTable();

	public final Column<CompanyTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CompanyTable, String> companyName = createColumn(
		"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, Long> registrationId = createColumn(
		"registrationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, Long> taxId = createColumn(
		"taxId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, Long> phoneNumber = createColumn(
		"phoneNumber", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, Long> gst = createColumn(
		"gst", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> address = createColumn(
		"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private CompanyTable() {
		super("lr_Company", CompanyTable::new);
	}

}