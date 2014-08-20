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

package com.meera.dbservice.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MobilePhoneLocalService}.
 *
 * @author MarceloBezerra
 * @see MobilePhoneLocalService
 * @generated
 */
public class MobilePhoneLocalServiceWrapper implements MobilePhoneLocalService,
	ServiceWrapper<MobilePhoneLocalService> {
	public MobilePhoneLocalServiceWrapper(
		MobilePhoneLocalService mobilePhoneLocalService) {
		_mobilePhoneLocalService = mobilePhoneLocalService;
	}

	/**
	* Adds the mobile phone to the database. Also notifies the appropriate model listeners.
	*
	* @param mobilePhone the mobile phone
	* @return the mobile phone that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.dbservice.model.MobilePhone addMobilePhone(
		com.meera.dbservice.model.MobilePhone mobilePhone)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.addMobilePhone(mobilePhone);
	}

	/**
	* Creates a new mobile phone with the primary key. Does not add the mobile phone to the database.
	*
	* @param mobilePhoneId the primary key for the new mobile phone
	* @return the new mobile phone
	*/
	@Override
	public com.meera.dbservice.model.MobilePhone createMobilePhone(
		long mobilePhoneId) {
		return _mobilePhoneLocalService.createMobilePhone(mobilePhoneId);
	}

	/**
	* Deletes the mobile phone with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param mobilePhoneId the primary key of the mobile phone
	* @return the mobile phone that was removed
	* @throws PortalException if a mobile phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.dbservice.model.MobilePhone deleteMobilePhone(
		long mobilePhoneId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.deleteMobilePhone(mobilePhoneId);
	}

	/**
	* Deletes the mobile phone from the database. Also notifies the appropriate model listeners.
	*
	* @param mobilePhone the mobile phone
	* @return the mobile phone that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.dbservice.model.MobilePhone deleteMobilePhone(
		com.meera.dbservice.model.MobilePhone mobilePhone)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.deleteMobilePhone(mobilePhone);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _mobilePhoneLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.MobilePhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.dbservice.model.impl.MobilePhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.meera.dbservice.model.MobilePhone fetchMobilePhone(
		long mobilePhoneId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.fetchMobilePhone(mobilePhoneId);
	}

	/**
	* Returns the mobile phone with the primary key.
	*
	* @param mobilePhoneId the primary key of the mobile phone
	* @return the mobile phone
	* @throws PortalException if a mobile phone with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.dbservice.model.MobilePhone getMobilePhone(
		long mobilePhoneId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.getMobilePhone(mobilePhoneId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.meera.dbservice.model.MobilePhone> getMobilePhones(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.getMobilePhones(start, end);
	}

	/**
	* Returns the number of mobile phones.
	*
	* @return the number of mobile phones
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getMobilePhonesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.getMobilePhonesCount();
	}

	/**
	* Updates the mobile phone in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mobilePhone the mobile phone
	* @return the mobile phone that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.dbservice.model.MobilePhone updateMobilePhone(
		com.meera.dbservice.model.MobilePhone mobilePhone)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mobilePhoneLocalService.updateMobilePhone(mobilePhone);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _mobilePhoneLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_mobilePhoneLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _mobilePhoneLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MobilePhoneLocalService getWrappedMobilePhoneLocalService() {
		return _mobilePhoneLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMobilePhoneLocalService(
		MobilePhoneLocalService mobilePhoneLocalService) {
		_mobilePhoneLocalService = mobilePhoneLocalService;
	}

	@Override
	public MobilePhoneLocalService getWrappedService() {
		return _mobilePhoneLocalService;
	}

	@Override
	public void setWrappedService(
		MobilePhoneLocalService mobilePhoneLocalService) {
		_mobilePhoneLocalService = mobilePhoneLocalService;
	}

	private MobilePhoneLocalService _mobilePhoneLocalService;
}