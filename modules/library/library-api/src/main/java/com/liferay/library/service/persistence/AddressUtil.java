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

import com.liferay.library.model.Address;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the address service. This utility wraps <code>com.liferay.library.service.persistence.impl.AddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddressPersistence
 * @generated
 */
public class AddressUtil {

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
	public static void clearCache(Address address) {
		getPersistence().clearCache(address);
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
	public static Map<Serializable, Address> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Address> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Address> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Address> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Address> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Address update(Address address) {
		return getPersistence().update(address);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Address update(
		Address address, ServiceContext serviceContext) {

		return getPersistence().update(address, serviceContext);
	}

	/**
	 * Returns all the addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching addresses
	 */
	public static List<Address> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of addresses
	 * @param end the upper bound of the range of addresses (not inclusive)
	 * @return the range of matching addresses
	 */
	public static List<Address> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of addresses
	 * @param end the upper bound of the range of addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching addresses
	 */
	public static List<Address> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Address> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of addresses
	 * @param end the upper bound of the range of addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching addresses
	 */
	public static List<Address> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Address> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching address
	 * @throws NoSuchAddressException if a matching address could not be found
	 */
	public static Address findByUuid_First(
			String uuid, OrderByComparator<Address> orderByComparator)
		throws com.liferay.library.exception.NoSuchAddressException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching address, or <code>null</code> if a matching address could not be found
	 */
	public static Address fetchByUuid_First(
		String uuid, OrderByComparator<Address> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching address
	 * @throws NoSuchAddressException if a matching address could not be found
	 */
	public static Address findByUuid_Last(
			String uuid, OrderByComparator<Address> orderByComparator)
		throws com.liferay.library.exception.NoSuchAddressException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching address, or <code>null</code> if a matching address could not be found
	 */
	public static Address fetchByUuid_Last(
		String uuid, OrderByComparator<Address> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the addresses before and after the current address in the ordered set where uuid = &#63;.
	 *
	 * @param addressId the primary key of the current address
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next address
	 * @throws NoSuchAddressException if a address with the primary key could not be found
	 */
	public static Address[] findByUuid_PrevAndNext(
			long addressId, String uuid,
			OrderByComparator<Address> orderByComparator)
		throws com.liferay.library.exception.NoSuchAddressException {

		return getPersistence().findByUuid_PrevAndNext(
			addressId, uuid, orderByComparator);
	}

	/**
	 * Removes all the addresses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching addresses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the address where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAddressException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching address
	 * @throws NoSuchAddressException if a matching address could not be found
	 */
	public static Address findByUUID_G(String uuid, long groupId)
		throws com.liferay.library.exception.NoSuchAddressException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching address, or <code>null</code> if a matching address could not be found
	 */
	public static Address fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching address, or <code>null</code> if a matching address could not be found
	 */
	public static Address fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the address where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the address that was removed
	 */
	public static Address removeByUUID_G(String uuid, long groupId)
		throws com.liferay.library.exception.NoSuchAddressException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of addresses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching addresses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching addresses
	 */
	public static List<Address> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of addresses
	 * @param end the upper bound of the range of addresses (not inclusive)
	 * @return the range of matching addresses
	 */
	public static List<Address> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of addresses
	 * @param end the upper bound of the range of addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching addresses
	 */
	public static List<Address> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Address> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of addresses
	 * @param end the upper bound of the range of addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching addresses
	 */
	public static List<Address> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Address> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching address
	 * @throws NoSuchAddressException if a matching address could not be found
	 */
	public static Address findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Address> orderByComparator)
		throws com.liferay.library.exception.NoSuchAddressException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching address, or <code>null</code> if a matching address could not be found
	 */
	public static Address fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Address> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching address
	 * @throws NoSuchAddressException if a matching address could not be found
	 */
	public static Address findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Address> orderByComparator)
		throws com.liferay.library.exception.NoSuchAddressException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching address, or <code>null</code> if a matching address could not be found
	 */
	public static Address fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Address> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the addresses before and after the current address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param addressId the primary key of the current address
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next address
	 * @throws NoSuchAddressException if a address with the primary key could not be found
	 */
	public static Address[] findByUuid_C_PrevAndNext(
			long addressId, String uuid, long companyId,
			OrderByComparator<Address> orderByComparator)
		throws com.liferay.library.exception.NoSuchAddressException {

		return getPersistence().findByUuid_C_PrevAndNext(
			addressId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the addresses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching addresses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the address in the entity cache if it is enabled.
	 *
	 * @param address the address
	 */
	public static void cacheResult(Address address) {
		getPersistence().cacheResult(address);
	}

	/**
	 * Caches the addresses in the entity cache if it is enabled.
	 *
	 * @param addresses the addresses
	 */
	public static void cacheResult(List<Address> addresses) {
		getPersistence().cacheResult(addresses);
	}

	/**
	 * Creates a new address with the primary key. Does not add the address to the database.
	 *
	 * @param addressId the primary key for the new address
	 * @return the new address
	 */
	public static Address create(long addressId) {
		return getPersistence().create(addressId);
	}

	/**
	 * Removes the address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addressId the primary key of the address
	 * @return the address that was removed
	 * @throws NoSuchAddressException if a address with the primary key could not be found
	 */
	public static Address remove(long addressId)
		throws com.liferay.library.exception.NoSuchAddressException {

		return getPersistence().remove(addressId);
	}

	public static Address updateImpl(Address address) {
		return getPersistence().updateImpl(address);
	}

	/**
	 * Returns the address with the primary key or throws a <code>NoSuchAddressException</code> if it could not be found.
	 *
	 * @param addressId the primary key of the address
	 * @return the address
	 * @throws NoSuchAddressException if a address with the primary key could not be found
	 */
	public static Address findByPrimaryKey(long addressId)
		throws com.liferay.library.exception.NoSuchAddressException {

		return getPersistence().findByPrimaryKey(addressId);
	}

	/**
	 * Returns the address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addressId the primary key of the address
	 * @return the address, or <code>null</code> if a address with the primary key could not be found
	 */
	public static Address fetchByPrimaryKey(long addressId) {
		return getPersistence().fetchByPrimaryKey(addressId);
	}

	/**
	 * Returns all the addresses.
	 *
	 * @return the addresses
	 */
	public static List<Address> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of addresses
	 * @param end the upper bound of the range of addresses (not inclusive)
	 * @return the range of addresses
	 */
	public static List<Address> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of addresses
	 * @param end the upper bound of the range of addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of addresses
	 */
	public static List<Address> findAll(
		int start, int end, OrderByComparator<Address> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of addresses
	 * @param end the upper bound of the range of addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of addresses
	 */
	public static List<Address> findAll(
		int start, int end, OrderByComparator<Address> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of addresses.
	 *
	 * @return the number of addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddressPersistence getPersistence() {
		return _persistence;
	}

	private static volatile AddressPersistence _persistence;

}