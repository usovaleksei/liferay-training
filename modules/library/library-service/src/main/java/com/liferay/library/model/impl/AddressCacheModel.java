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

import com.liferay.library.model.Address;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Address in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddressCacheModel implements CacheModel<Address>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddressCacheModel)) {
			return false;
		}

		AddressCacheModel addressCacheModel = (AddressCacheModel)object;

		if (addressId == addressCacheModel.addressId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", addressId=");
		sb.append(addressId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", town=");
		sb.append(town);
		sb.append(", street=");
		sb.append(street);
		sb.append(", house=");
		sb.append(house);
		sb.append(", flat=");
		sb.append(flat);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Address toEntityModel() {
		AddressImpl addressImpl = new AddressImpl();

		if (uuid == null) {
			addressImpl.setUuid("");
		}
		else {
			addressImpl.setUuid(uuid);
		}

		addressImpl.setAddressId(addressId);
		addressImpl.setGroupId(groupId);
		addressImpl.setCompanyId(companyId);
		addressImpl.setUserId(userId);

		if (userName == null) {
			addressImpl.setUserName("");
		}
		else {
			addressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addressImpl.setCreateDate(null);
		}
		else {
			addressImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addressImpl.setModifiedDate(null);
		}
		else {
			addressImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (town == null) {
			addressImpl.setTown("");
		}
		else {
			addressImpl.setTown(town);
		}

		if (street == null) {
			addressImpl.setStreet("");
		}
		else {
			addressImpl.setStreet(street);
		}

		if (house == null) {
			addressImpl.setHouse("");
		}
		else {
			addressImpl.setHouse(house);
		}

		if (flat == null) {
			addressImpl.setFlat("");
		}
		else {
			addressImpl.setFlat(flat);
		}

		addressImpl.resetOriginalValues();

		return addressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		addressId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		town = objectInput.readUTF();
		street = objectInput.readUTF();
		house = objectInput.readUTF();
		flat = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(addressId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (town == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(town);
		}

		if (street == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(street);
		}

		if (house == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(house);
		}

		if (flat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(flat);
		}
	}

	public String uuid;
	public long addressId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String town;
	public String street;
	public String house;
	public String flat;

}