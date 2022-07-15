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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Book}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Book
 * @generated
 */
public class BookWrapper
	extends BaseModelWrapper<Book> implements Book, ModelWrapper<Book> {

	public BookWrapper(Book book) {
		super(book);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bookId", getBookId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("authorId", getAuthorId());
		attributes.put("bookTitle", getBookTitle());
		attributes.put("publishingYear", getPublishingYear());
		attributes.put("genreId", getGenreId());
		attributes.put("studentId", getStudentId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long authorId = (Long)attributes.get("authorId");

		if (authorId != null) {
			setAuthorId(authorId);
		}

		String bookTitle = (String)attributes.get("bookTitle");

		if (bookTitle != null) {
			setBookTitle(bookTitle);
		}

		Date publishingYear = (Date)attributes.get("publishingYear");

		if (publishingYear != null) {
			setPublishingYear(publishingYear);
		}

		Long genreId = (Long)attributes.get("genreId");

		if (genreId != null) {
			setGenreId(genreId);
		}

		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}
	}

	@Override
	public Book cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the author ID of this book.
	 *
	 * @return the author ID of this book
	 */
	@Override
	public long getAuthorId() {
		return model.getAuthorId();
	}

	/**
	 * Returns the book ID of this book.
	 *
	 * @return the book ID of this book
	 */
	@Override
	public long getBookId() {
		return model.getBookId();
	}

	/**
	 * Returns the book title of this book.
	 *
	 * @return the book title of this book
	 */
	@Override
	public String getBookTitle() {
		return model.getBookTitle();
	}

	/**
	 * Returns the company ID of this book.
	 *
	 * @return the company ID of this book
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this book.
	 *
	 * @return the create date of this book
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the genre ID of this book.
	 *
	 * @return the genre ID of this book
	 */
	@Override
	public long getGenreId() {
		return model.getGenreId();
	}

	/**
	 * Returns the group ID of this book.
	 *
	 * @return the group ID of this book
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this book.
	 *
	 * @return the modified date of this book
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this book.
	 *
	 * @return the primary key of this book
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the publishing year of this book.
	 *
	 * @return the publishing year of this book
	 */
	@Override
	public Date getPublishingYear() {
		return model.getPublishingYear();
	}

	/**
	 * Returns the student ID of this book.
	 *
	 * @return the student ID of this book
	 */
	@Override
	public long getStudentId() {
		return model.getStudentId();
	}

	/**
	 * Returns the user ID of this book.
	 *
	 * @return the user ID of this book
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this book.
	 *
	 * @return the user name of this book
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this book.
	 *
	 * @return the user uuid of this book
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this book.
	 *
	 * @return the uuid of this book
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the author ID of this book.
	 *
	 * @param authorId the author ID of this book
	 */
	@Override
	public void setAuthorId(long authorId) {
		model.setAuthorId(authorId);
	}

	/**
	 * Sets the book ID of this book.
	 *
	 * @param bookId the book ID of this book
	 */
	@Override
	public void setBookId(long bookId) {
		model.setBookId(bookId);
	}

	/**
	 * Sets the book title of this book.
	 *
	 * @param bookTitle the book title of this book
	 */
	@Override
	public void setBookTitle(String bookTitle) {
		model.setBookTitle(bookTitle);
	}

	/**
	 * Sets the company ID of this book.
	 *
	 * @param companyId the company ID of this book
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this book.
	 *
	 * @param createDate the create date of this book
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the genre ID of this book.
	 *
	 * @param genreId the genre ID of this book
	 */
	@Override
	public void setGenreId(long genreId) {
		model.setGenreId(genreId);
	}

	/**
	 * Sets the group ID of this book.
	 *
	 * @param groupId the group ID of this book
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this book.
	 *
	 * @param modifiedDate the modified date of this book
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this book.
	 *
	 * @param primaryKey the primary key of this book
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the publishing year of this book.
	 *
	 * @param publishingYear the publishing year of this book
	 */
	@Override
	public void setPublishingYear(Date publishingYear) {
		model.setPublishingYear(publishingYear);
	}

	/**
	 * Sets the student ID of this book.
	 *
	 * @param studentId the student ID of this book
	 */
	@Override
	public void setStudentId(long studentId) {
		model.setStudentId(studentId);
	}

	/**
	 * Sets the user ID of this book.
	 *
	 * @param userId the user ID of this book
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this book.
	 *
	 * @param userName the user name of this book
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this book.
	 *
	 * @param userUuid the user uuid of this book
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this book.
	 *
	 * @param uuid the uuid of this book
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected BookWrapper wrap(Book book) {
		return new BookWrapper(book);
	}

}