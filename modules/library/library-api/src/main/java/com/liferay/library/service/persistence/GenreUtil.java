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

package com.liferay.library.service.persistence;

import com.liferay.library.model.Genre;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the genre service. This utility wraps <code>com.liferay.library.service.persistence.impl.GenrePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GenrePersistence
 * @generated
 */
public class GenreUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Genre genre) {
		getPersistence().clearCache(genre);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Genre> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Genre> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Genre> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Genre> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Genre> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Genre update(Genre genre) {
		return getPersistence().update(genre);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Genre update(Genre genre, ServiceContext serviceContext) {
		return getPersistence().update(genre, serviceContext);
	}

	/**
	 * Returns all the genres where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching genres
	 */
	public static List<Genre> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the genres where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @return the range of matching genres
	 */
	public static List<Genre> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the genres where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching genres
	 */
	public static List<Genre> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Genre> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the genres where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching genres
	 */
	public static List<Genre> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Genre> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first genre in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching genre
	 * @throws NoSuchGenreException if a matching genre could not be found
	 */
	public static Genre findByUuid_First(
			String uuid, OrderByComparator<Genre> orderByComparator)
		throws com.liferay.library.exception.NoSuchGenreException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first genre in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching genre, or <code>null</code> if a matching genre could not be found
	 */
	public static Genre fetchByUuid_First(
		String uuid, OrderByComparator<Genre> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last genre in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching genre
	 * @throws NoSuchGenreException if a matching genre could not be found
	 */
	public static Genre findByUuid_Last(
			String uuid, OrderByComparator<Genre> orderByComparator)
		throws com.liferay.library.exception.NoSuchGenreException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last genre in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching genre, or <code>null</code> if a matching genre could not be found
	 */
	public static Genre fetchByUuid_Last(
		String uuid, OrderByComparator<Genre> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the genres before and after the current genre in the ordered set where uuid = &#63;.
	 *
	 * @param genreId the primary key of the current genre
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next genre
	 * @throws NoSuchGenreException if a genre with the primary key could not be found
	 */
	public static Genre[] findByUuid_PrevAndNext(
			long genreId, String uuid,
			OrderByComparator<Genre> orderByComparator)
		throws com.liferay.library.exception.NoSuchGenreException {

		return getPersistence().findByUuid_PrevAndNext(
			genreId, uuid, orderByComparator);
	}

	/**
	 * Removes all the genres where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of genres where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching genres
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the genre where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGenreException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching genre
	 * @throws NoSuchGenreException if a matching genre could not be found
	 */
	public static Genre findByUUID_G(String uuid, long groupId)
		throws com.liferay.library.exception.NoSuchGenreException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the genre where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching genre, or <code>null</code> if a matching genre could not be found
	 */
	public static Genre fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the genre where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching genre, or <code>null</code> if a matching genre could not be found
	 */
	public static Genre fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the genre where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the genre that was removed
	 */
	public static Genre removeByUUID_G(String uuid, long groupId)
		throws com.liferay.library.exception.NoSuchGenreException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of genres where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching genres
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the genres where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching genres
	 */
	public static List<Genre> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the genres where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @return the range of matching genres
	 */
	public static List<Genre> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the genres where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching genres
	 */
	public static List<Genre> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Genre> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the genres where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching genres
	 */
	public static List<Genre> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Genre> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first genre in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching genre
	 * @throws NoSuchGenreException if a matching genre could not be found
	 */
	public static Genre findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Genre> orderByComparator)
		throws com.liferay.library.exception.NoSuchGenreException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first genre in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching genre, or <code>null</code> if a matching genre could not be found
	 */
	public static Genre fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Genre> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last genre in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching genre
	 * @throws NoSuchGenreException if a matching genre could not be found
	 */
	public static Genre findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Genre> orderByComparator)
		throws com.liferay.library.exception.NoSuchGenreException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last genre in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching genre, or <code>null</code> if a matching genre could not be found
	 */
	public static Genre fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Genre> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the genres before and after the current genre in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param genreId the primary key of the current genre
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next genre
	 * @throws NoSuchGenreException if a genre with the primary key could not be found
	 */
	public static Genre[] findByUuid_C_PrevAndNext(
			long genreId, String uuid, long companyId,
			OrderByComparator<Genre> orderByComparator)
		throws com.liferay.library.exception.NoSuchGenreException {

		return getPersistence().findByUuid_C_PrevAndNext(
			genreId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the genres where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of genres where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching genres
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the genre in the entity cache if it is enabled.
	 *
	 * @param genre the genre
	 */
	public static void cacheResult(Genre genre) {
		getPersistence().cacheResult(genre);
	}

	/**
	 * Caches the genres in the entity cache if it is enabled.
	 *
	 * @param genres the genres
	 */
	public static void cacheResult(List<Genre> genres) {
		getPersistence().cacheResult(genres);
	}

	/**
	 * Creates a new genre with the primary key. Does not add the genre to the database.
	 *
	 * @param genreId the primary key for the new genre
	 * @return the new genre
	 */
	public static Genre create(long genreId) {
		return getPersistence().create(genreId);
	}

	/**
	 * Removes the genre with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param genreId the primary key of the genre
	 * @return the genre that was removed
	 * @throws NoSuchGenreException if a genre with the primary key could not be found
	 */
	public static Genre remove(long genreId)
		throws com.liferay.library.exception.NoSuchGenreException {

		return getPersistence().remove(genreId);
	}

	public static Genre updateImpl(Genre genre) {
		return getPersistence().updateImpl(genre);
	}

	/**
	 * Returns the genre with the primary key or throws a <code>NoSuchGenreException</code> if it could not be found.
	 *
	 * @param genreId the primary key of the genre
	 * @return the genre
	 * @throws NoSuchGenreException if a genre with the primary key could not be found
	 */
	public static Genre findByPrimaryKey(long genreId)
		throws com.liferay.library.exception.NoSuchGenreException {

		return getPersistence().findByPrimaryKey(genreId);
	}

	/**
	 * Returns the genre with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param genreId the primary key of the genre
	 * @return the genre, or <code>null</code> if a genre with the primary key could not be found
	 */
	public static Genre fetchByPrimaryKey(long genreId) {
		return getPersistence().fetchByPrimaryKey(genreId);
	}

	/**
	 * Returns all the genres.
	 *
	 * @return the genres
	 */
	public static List<Genre> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the genres.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @return the range of genres
	 */
	public static List<Genre> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the genres.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of genres
	 */
	public static List<Genre> findAll(
		int start, int end, OrderByComparator<Genre> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the genres.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of genres
	 */
	public static List<Genre> findAll(
		int start, int end, OrderByComparator<Genre> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the genres from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of genres.
	 *
	 * @return the number of genres
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GenrePersistence getPersistence() {
		return _persistence;
	}

	private static volatile GenrePersistence _persistence;

}