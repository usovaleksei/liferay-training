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
 * The table class for the &quot;LB_Book&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Book
 * @generated
 */
public class BookTable extends BaseTable<BookTable> {

	public static final BookTable INSTANCE = new BookTable();

	public final Column<BookTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BookTable, Long> bookId = createColumn(
		"bookId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BookTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BookTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BookTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BookTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BookTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BookTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BookTable, Long> authorId = createColumn(
		"authorId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BookTable, String> bookTitle = createColumn(
		"bookTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BookTable, Date> publishingYear = createColumn(
		"publishingYear", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BookTable, Long> genreId = createColumn(
		"genreId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BookTable, Long> studentId = createColumn(
		"studentId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private BookTable() {
		super("LB_Book", BookTable::new);
	}

}