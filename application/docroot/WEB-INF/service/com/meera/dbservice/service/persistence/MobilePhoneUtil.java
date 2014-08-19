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

package com.meera.dbservice.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.meera.dbservice.model.MobilePhone;

import java.util.List;

/**
 * The persistence utility for the mobile phone service. This utility wraps {@link MobilePhonePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LiferaySavvy
 * @see MobilePhonePersistence
 * @see MobilePhonePersistenceImpl
 * @generated
 */
public class MobilePhoneUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MobilePhone mobilePhone) {
		getPersistence().clearCache(mobilePhone);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MobilePhone> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MobilePhone> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MobilePhone> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MobilePhone update(MobilePhone mobilePhone)
		throws SystemException {
		return getPersistence().update(mobilePhone);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MobilePhone update(MobilePhone mobilePhone,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(mobilePhone, serviceContext);
	}

	/**
	* Caches the mobile phone in the entity cache if it is enabled.
	*
	* @param mobilePhone the mobile phone
	*/
	public static void cacheResult(
		com.meera.dbservice.model.MobilePhone mobilePhone) {
		getPersistence().cacheResult(mobilePhone);
	}

	/**
	* Caches the mobile phones in the entity cache if it is enabled.
	*
	* @param mobilePhones the mobile phones
	*/
	public static void cacheResult(
		java.util.List<com.meera.dbservice.model.MobilePhone> mobilePhones) {
		getPersistence().cacheResult(mobilePhones);
	}

	/**
	* Creates a new mobile phone with the primary key. Does not add the mobile phone to the database.
	*
	* @param mobilePhoneId the primary key for the new mobile phone
	* @return the new mobile phone
	*/
	public static com.meera.dbservice.model.MobilePhone create(
		long mobilePhoneId) {
		return getPersistence().create(mobilePhoneId);
	}

	/**
	* Removes the mobile phone with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param mobilePhoneId the primary key of the mobile phone
	* @return the mobile phone that was removed
	* @throws com.meera.dbservice.NoSuchMobilePhoneException if a mobile phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.dbservice.model.MobilePhone remove(
		long mobilePhoneId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.dbservice.NoSuchMobilePhoneException {
		return getPersistence().remove(mobilePhoneId);
	}

	public static com.meera.dbservice.model.MobilePhone updateImpl(
		com.meera.dbservice.model.MobilePhone mobilePhone)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(mobilePhone);
	}

	/**
	* Returns the mobile phone with the primary key or throws a {@link com.meera.dbservice.NoSuchMobilePhoneException} if it could not be found.
	*
	* @param mobilePhoneId the primary key of the mobile phone
	* @return the mobile phone
	* @throws com.meera.dbservice.NoSuchMobilePhoneException if a mobile phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.dbservice.model.MobilePhone findByPrimaryKey(
		long mobilePhoneId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.dbservice.NoSuchMobilePhoneException {
		return getPersistence().findByPrimaryKey(mobilePhoneId);
	}

	/**
	* Returns the mobile phone with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param mobilePhoneId the primary key of the mobile phone
	* @return the mobile phone, or <code>null</code> if a mobile phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.dbservice.model.MobilePhone fetchByPrimaryKey(
		long mobilePhoneId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(mobilePhoneId);
	}

	/**
	* Returns all the mobile phones.
	*
	* @return the mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.dbservice.model.MobilePhone> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mobile phones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.MobilePhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mobile phones
	* @param end the upper bound of the range of mobile phones (not inclusive)
	* @return the range of mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.dbservice.model.MobilePhone> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mobile phones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.MobilePhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mobile phones
	* @param end the upper bound of the range of mobile phones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.dbservice.model.MobilePhone> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mobile phones from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mobile phones.
	*
	* @return the number of mobile phones
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MobilePhonePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MobilePhonePersistence)PortletBeanLocatorUtil.locate(com.meera.dbservice.service.ClpSerializer.getServletContextName(),
					MobilePhonePersistence.class.getName());

			ReferenceRegistry.registerReference(MobilePhoneUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MobilePhonePersistence persistence) {
	}

	private static MobilePhonePersistence _persistence;
}