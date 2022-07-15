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

package com.liferay.library.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;LB_Address&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Address
 * @generated
 */
public class AddressTable extends BaseTable<AddressTable> {

	public static final AddressTable INSTANCE = new AddressTable();

	public final Column<AddressTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddressTable, Long> addressId = createColumn(
		"addressId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AddressTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddressTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddressTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddressTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddressTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddressTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddressTable, String> town = createColumn(
		"town", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddressTable, String> street = createColumn(
		"street", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddressTable, String> house = createColumn(
		"house", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddressTable, String> flat = createColumn(
		"flat", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddressTable() {
		super("LB_Address", AddressTable::new);
	}

}