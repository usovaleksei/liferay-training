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

package com.liferay.library.model.impl;

import com.liferay.library.model.Book;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Book in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BookCacheModel implements CacheModel<Book>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BookCacheModel)) {
			return false;
		}

		BookCacheModel bookCacheModel = (BookCacheModel)object;

		if (bookId == bookCacheModel.bookId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bookId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", bookId=");
		sb.append(bookId);
		sb.append(", authorId=");
		sb.append(authorId);
		sb.append(", bookTitle=");
		sb.append(bookTitle);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", genreId=");
		sb.append(genreId);
		sb.append(", studentId=");
		sb.append(studentId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Book toEntityModel() {
		BookImpl bookImpl = new BookImpl();

		if (uuid == null) {
			bookImpl.setUuid("");
		}
		else {
			bookImpl.setUuid(uuid);
		}

		bookImpl.setBookId(bookId);
		bookImpl.setAuthorId(authorId);

		if (bookTitle == null) {
			bookImpl.setBookTitle("");
		}
		else {
			bookImpl.setBookTitle(bookTitle);
		}

		if (createDate == Long.MIN_VALUE) {
			bookImpl.setCreateDate(null);
		}
		else {
			bookImpl.setCreateDate(new Date(createDate));
		}

		bookImpl.setGenreId(genreId);
		bookImpl.setStudentId(studentId);

		bookImpl.resetOriginalValues();

		return bookImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		bookId = objectInput.readLong();

		authorId = objectInput.readLong();
		bookTitle = objectInput.readUTF();
		createDate = objectInput.readLong();

		genreId = objectInput.readLong();

		studentId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(bookId);

		objectOutput.writeLong(authorId);

		if (bookTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bookTitle);
		}

		objectOutput.writeLong(createDate);

		objectOutput.writeLong(genreId);

		objectOutput.writeLong(studentId);
	}

	public String uuid;
	public long bookId;
	public long authorId;
	public String bookTitle;
	public long createDate;
	public long genreId;
	public long studentId;

}