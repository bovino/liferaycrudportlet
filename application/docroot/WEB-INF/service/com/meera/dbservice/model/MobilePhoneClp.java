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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.meera.dbservice.service.ClpSerializer;
import com.meera.dbservice.service.MobilePhoneLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MarceloBezerra
 */
public class MobilePhoneClp extends BaseModelImpl<MobilePhone>
	implements MobilePhone {
	public MobilePhoneClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MobilePhone.class;
	}

	@Override
	public String getModelClassName() {
		return MobilePhone.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _mobilePhoneId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMobilePhoneId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _mobilePhoneId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mobilePhoneId", getMobilePhoneId());
		attributes.put("name", getName());
		attributes.put("brand", getBrand());
		attributes.put("description", getDescription());
		attributes.put("releaseDate", getReleaseDate());
		attributes.put("price", getPrice());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mobilePhoneId = (Long)attributes.get("mobilePhoneId");

		if (mobilePhoneId != null) {
			setMobilePhoneId(mobilePhoneId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String brand = (String)attributes.get("brand");

		if (brand != null) {
			setBrand(brand);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date releaseDate = (Date)attributes.get("releaseDate");

		if (releaseDate != null) {
			setReleaseDate(releaseDate);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}
	}

	@Override
	public long getMobilePhoneId() {
		return _mobilePhoneId;
	}

	@Override
	public void setMobilePhoneId(long mobilePhoneId) {
		_mobilePhoneId = mobilePhoneId;

		if (_mobilePhoneRemoteModel != null) {
			try {
				Class<?> clazz = _mobilePhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setMobilePhoneId", long.class);

				method.invoke(_mobilePhoneRemoteModel, mobilePhoneId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_mobilePhoneRemoteModel != null) {
			try {
				Class<?> clazz = _mobilePhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_mobilePhoneRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBrand() {
		return _brand;
	}

	@Override
	public void setBrand(String brand) {
		_brand = brand;

		if (_mobilePhoneRemoteModel != null) {
			try {
				Class<?> clazz = _mobilePhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setBrand", String.class);

				method.invoke(_mobilePhoneRemoteModel, brand);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_mobilePhoneRemoteModel != null) {
			try {
				Class<?> clazz = _mobilePhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_mobilePhoneRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getReleaseDate() {
		return _releaseDate;
	}

	@Override
	public void setReleaseDate(Date releaseDate) {
		_releaseDate = releaseDate;

		if (_mobilePhoneRemoteModel != null) {
			try {
				Class<?> clazz = _mobilePhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setReleaseDate", Date.class);

				method.invoke(_mobilePhoneRemoteModel, releaseDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPrice() {
		return _price;
	}

	@Override
	public void setPrice(double price) {
		_price = price;

		if (_mobilePhoneRemoteModel != null) {
			try {
				Class<?> clazz = _mobilePhoneRemoteModel.getClass();

				Method method = clazz.getMethod("setPrice", double.class);

				method.invoke(_mobilePhoneRemoteModel, price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMobilePhoneRemoteModel() {
		return _mobilePhoneRemoteModel;
	}

	public void setMobilePhoneRemoteModel(BaseModel<?> mobilePhoneRemoteModel) {
		_mobilePhoneRemoteModel = mobilePhoneRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _mobilePhoneRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_mobilePhoneRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MobilePhoneLocalServiceUtil.addMobilePhone(this);
		}
		else {
			MobilePhoneLocalServiceUtil.updateMobilePhone(this);
		}
	}

	@Override
	public MobilePhone toEscapedModel() {
		return (MobilePhone)ProxyUtil.newProxyInstance(MobilePhone.class.getClassLoader(),
			new Class[] { MobilePhone.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MobilePhoneClp clone = new MobilePhoneClp();

		clone.setMobilePhoneId(getMobilePhoneId());
		clone.setName(getName());
		clone.setBrand(getBrand());
		clone.setDescription(getDescription());
		clone.setReleaseDate(getReleaseDate());
		clone.setPrice(getPrice());

		return clone;
	}

	@Override
	public int compareTo(MobilePhone mobilePhone) {
		int value = 0;

		if (getMobilePhoneId() < mobilePhone.getMobilePhoneId()) {
			value = -1;
		}
		else if (getMobilePhoneId() > mobilePhone.getMobilePhoneId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MobilePhoneClp)) {
			return false;
		}

		MobilePhoneClp mobilePhone = (MobilePhoneClp)obj;

		long primaryKey = mobilePhone.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{mobilePhoneId=");
		sb.append(getMobilePhoneId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", brand=");
		sb.append(getBrand());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", releaseDate=");
		sb.append(getReleaseDate());
		sb.append(", price=");
		sb.append(getPrice());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.meera.dbservice.model.MobilePhone");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>mobilePhoneId</column-name><column-value><![CDATA[");
		sb.append(getMobilePhoneId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>brand</column-name><column-value><![CDATA[");
		sb.append(getBrand());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>releaseDate</column-name><column-value><![CDATA[");
		sb.append(getReleaseDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>price</column-name><column-value><![CDATA[");
		sb.append(getPrice());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _mobilePhoneId;
	private String _name;
	private String _brand;
	private String _description;
	private Date _releaseDate;
	private double _price;
	private BaseModel<?> _mobilePhoneRemoteModel;
}