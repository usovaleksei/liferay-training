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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Genre}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Genre
 * @generated
 */
public class GenreWrapper
	extends BaseModelWrapper<Genre> implements Genre, ModelWrapper<Genre> {

	public GenreWrapper(Genre genre) {
		super(genre);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("genreId", getGenreId());
		attributes.put("title", getTitle());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long genreId = (Long)attributes.get("genreId");

		if (genreId != null) {
			setGenreId(genreId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}
	}

	@Override
	public Genre cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the genre ID of this genre.
	 *
	 * @return the genre ID of this genre
	 */
	@Override
	public long getGenreId() {
		return model.getGenreId();
	}

	/**
	 * Returns the primary key of this genre.
	 *
	 * @return the primary key of this genre
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the title of this genre.
	 *
	 * @return the title of this genre
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the uuid of this genre.
	 *
	 * @return the uuid of this genre
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
	 * Sets the genre ID of this genre.
	 *
	 * @param genreId the genre ID of this genre
	 */
	@Override
	public void setGenreId(long genreId) {
		model.setGenreId(genreId);
	}

	/**
	 * Sets the primary key of this genre.
	 *
	 * @param primaryKey the primary key of this genre
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the title of this genre.
	 *
	 * @param title the title of this genre
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the uuid of this genre.
	 *
	 * @param uuid the uuid of this genre
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected GenreWrapper wrap(Genre genre) {
		return new GenreWrapper(genre);
	}

}