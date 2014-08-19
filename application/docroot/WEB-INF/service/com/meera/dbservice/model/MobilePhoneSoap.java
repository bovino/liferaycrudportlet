/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.meera.dbservice.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LiferaySavvy
 * @generated
 */
public class MobilePhoneSoap implements Serializable {
	public static MobilePhoneSoap toSoapModel(MobilePhone model) {
		MobilePhoneSoap soapModel = new MobilePhoneSoap();

		soapModel.setMobilePhoneId(model.getMobilePhoneId());
		soapModel.setName(model.getName());
		soapModel.setBrand(model.getBrand());
		soapModel.setDescription(model.getDescription());
		soapModel.setReleaseDate(model.getReleaseDate());
		soapModel.setPrice(model.getPrice());

		return soapModel;
	}

	public static MobilePhoneSoap[] toSoapModels(MobilePhone[] models) {
		MobilePhoneSoap[] soapModels = new MobilePhoneSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MobilePhoneSoap[][] toSoapModels(MobilePhone[][] models) {
		MobilePhoneSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MobilePhoneSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MobilePhoneSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MobilePhoneSoap[] toSoapModels(List<MobilePhone> models) {
		List<MobilePhoneSoap> soapModels = new ArrayList<MobilePhoneSoap>(models.size());

		for (MobilePhone model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MobilePhoneSoap[soapModels.size()]);
	}

	public MobilePhoneSoap() {
	}

	public long getPrimaryKey() {
		return _mobilePhoneId;
	}

	public void setPrimaryKey(long pk) {
		setMobilePhoneId(pk);
	}

	public long getMobilePhoneId() {
		return _mobilePhoneId;
	}

	public void setMobilePhoneId(long mobilePhoneId) {
		_mobilePhoneId = mobilePhoneId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getBrand() {
		return _brand;
	}

	public void setBrand(String brand) {
		_brand = brand;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Date getReleaseDate() {
		return _releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		_releaseDate = releaseDate;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	private long _mobilePhoneId;
	private String _name;
	private String _brand;
	private String _description;
	private Date _releaseDate;
	private double _price;
}