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

package com.lr.goldisan.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import com.lr.goldisan.model.Company;
import com.lr.goldisan.service.CompanyService;
import com.lr.goldisan.service.CompanyServiceUtil;
import com.lr.goldisan.service.persistence.CompanyPersistence;

import java.lang.reflect.Field;

import javax.portlet.PortletException;
import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the company remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.lr.goldisan.service.impl.CompanyServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.lr.goldisan.service.impl.CompanyServiceImpl
 * @generated
 */
public abstract class CompanyServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, CompanyService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CompanyService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>CompanyServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CompanyService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		companyService = (CompanyService)aopProxy;

		_setServiceUtilService(companyService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CompanyService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Company.class;
	}

	protected String getModelClassName() {
		return Company.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = companyPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setServiceUtilService(CompanyService companyService) {
		try {
			Field field = CompanyServiceUtil.class.getDeclaredField("_service");

			field.setAccessible(true);

			field.set(null, companyService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected com.lr.goldisan.service.CompanyLocalService companyLocalService;

	protected CompanyService companyService;

	@Reference
	protected CompanyPersistence companyPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

	private static final Log _log = LogFactoryUtil.getLog(
		CompanyServiceBaseImpl.class);

    public abstract Company addCompany(String companyName, long registrationId, String email, long taxId,
                                       long phoneNumber, long gst, String address);

    public abstract Company getCompanyById(long companyId) throws PortletException, PortalException;

	public abstract Company updateCompany(String companyName, long registrationId, String email, long taxId,
										  long phoneNumber, long gst, String address);

	public abstract Company updateCompany(long companyId, String companyName, long registrationId, String email, long taxId,
										  long phoneNumber, long gst, String address);
}