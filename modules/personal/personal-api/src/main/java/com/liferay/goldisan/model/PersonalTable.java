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

package com.liferay.goldisan.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;lr_Personal&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Personal
 * @generated
 */
public class PersonalTable extends BaseTable<PersonalTable> {

	public static final PersonalTable INSTANCE = new PersonalTable();

	public final Column<PersonalTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PersonalTable, Long> personId = createColumn(
		"personId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PersonalTable, String> firstName = createColumn(
		"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PersonalTable, String> lastName = createColumn(
		"lastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PersonalTable, String> emailAddress = createColumn(
		"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PersonalTable, Long> phoneNumber = createColumn(
		"phoneNumber", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PersonalTable, String> createPassword = createColumn(
		"createPassword", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PersonalTable, String> conformPassword = createColumn(
		"conformPassword", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PersonalTable, String> address = createColumn(
		"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private PersonalTable() {
		super("lr_Personal", PersonalTable::new);
	}

}