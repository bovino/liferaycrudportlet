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

package com.meera.dbservice.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.meera.dbservice.model.MobilePhone;
import com.meera.dbservice.service.MobilePhoneLocalService;
import com.meera.dbservice.service.persistence.MobilePhonePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the mobile phone local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.meera.dbservice.service.impl.MobilePhoneLocalServiceImpl}.
 * </p>
 *
 * @author LiferaySavvy
 * @see com.meera.dbservice.service.impl.MobilePhoneLocalServiceImpl
 * @see com.meera.dbservice.service.MobilePhoneLocalServiceUtil
 * @generated
 */
public abstract class MobilePhoneLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements MobilePhoneLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.meera.dbservice.service.MobilePhoneLocalServiceUtil} to access the mobile phone local service.
	 */

	/**
	 * Adds the mobile phone to the database. Also notifies the appropriate model listeners.
	 *
	 * @param mobilePhone the mobile phone
	 * @return the mobile phone that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MobilePhone addMobilePhone(MobilePhone mobilePhone)
		throws SystemException {
		mobilePhone.setNew(true);

		return mobilePhonePersistence.update(mobilePhone);
	}

	/**
	 * Creates a new mobile phone with the primary key. Does not add the mobile phone to the database.
	 *
	 * @param mobilePhoneId the primary key for the new mobile phone
	 * @return the new mobile phone
	 */
	@Override
	public MobilePhone createMobilePhone(long mobilePhoneId) {
		return mobilePhonePersistence.create(mobilePhoneId);
	}

	/**
	 * Deletes the mobile phone with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param mobilePhoneId the primary key of the mobile phone
	 * @return the mobile phone that was removed
	 * @throws PortalException if a mobile phone with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MobilePhone deleteMobilePhone(long mobilePhoneId)
		throws PortalException, SystemException {
		return mobilePhonePersistence.remove(mobilePhoneId);
	}

	/**
	 * Deletes the mobile phone from the database. Also notifies the appropriate model listeners.
	 *
	 * @param mobilePhone the mobile phone
	 * @return the mobile phone that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MobilePhone deleteMobilePhone(MobilePhone mobilePhone)
		throws SystemException {
		return mobilePhonePersistence.remove(mobilePhone);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(MobilePhone.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return mobilePhonePersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return mobilePhonePersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return mobilePhonePersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return mobilePhonePersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return mobilePhonePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public MobilePhone fetchMobilePhone(long mobilePhoneId)
		throws SystemException {
		return mobilePhonePersistence.fetchByPrimaryKey(mobilePhoneId);
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
	public MobilePhone getMobilePhone(long mobilePhoneId)
		throws PortalException, SystemException {
		return mobilePhonePersistence.findByPrimaryKey(mobilePhoneId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return mobilePhonePersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<MobilePhone> getMobilePhones(int start, int end)
		throws SystemException {
		return mobilePhonePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of mobile phones.
	 *
	 * @return the number of mobile phones
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getMobilePhonesCount() throws SystemException {
		return mobilePhonePersistence.countAll();
	}

	/**
	 * Updates the mobile phone in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param mobilePhone the mobile phone
	 * @return the mobile phone that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MobilePhone updateMobilePhone(MobilePhone mobilePhone)
		throws SystemException {
		return mobilePhonePersistence.update(mobilePhone);
	}

	/**
	 * Returns the mobile phone local service.
	 *
	 * @return the mobile phone local service
	 */
	public com.meera.dbservice.service.MobilePhoneLocalService getMobilePhoneLocalService() {
		return mobilePhoneLocalService;
	}

	/**
	 * Sets the mobile phone local service.
	 *
	 * @param mobilePhoneLocalService the mobile phone local service
	 */
	public void setMobilePhoneLocalService(
		com.meera.dbservice.service.MobilePhoneLocalService mobilePhoneLocalService) {
		this.mobilePhoneLocalService = mobilePhoneLocalService;
	}

	/**
	 * Returns the mobile phone persistence.
	 *
	 * @return the mobile phone persistence
	 */
	public MobilePhonePersistence getMobilePhonePersistence() {
		return mobilePhonePersistence;
	}

	/**
	 * Sets the mobile phone persistence.
	 *
	 * @param mobilePhonePersistence the mobile phone persistence
	 */
	public void setMobilePhonePersistence(
		MobilePhonePersistence mobilePhonePersistence) {
		this.mobilePhonePersistence = mobilePhonePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.meera.dbservice.model.MobilePhone",
			mobilePhoneLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.meera.dbservice.model.MobilePhone");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return MobilePhone.class;
	}

	protected String getModelClassName() {
		return MobilePhone.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = mobilePhonePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.meera.dbservice.service.MobilePhoneLocalService.class)
	protected com.meera.dbservice.service.MobilePhoneLocalService mobilePhoneLocalService;
	@BeanReference(type = MobilePhonePersistence.class)
	protected MobilePhonePersistence mobilePhonePersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private MobilePhoneLocalServiceClpInvoker _clpInvoker = new MobilePhoneLocalServiceClpInvoker();
}