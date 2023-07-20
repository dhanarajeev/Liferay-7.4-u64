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

package com.lr.revisted.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import com.lr.revisted.service.employeeServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>employeeServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class employeeServiceHttp {

	public static com.lr.revisted.model.employee addemployee(
		HttpPrincipal httpPrincipal, String name, long phoneNumber,
		String email, String address) {

		try {
			MethodKey methodKey = new MethodKey(
				employeeServiceUtil.class, "addemployee",
				_addemployeeParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, name, phoneNumber, email, address);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.lr.revisted.model.employee)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.lr.revisted.model.employee getEmployeeById(
			HttpPrincipal httpPrincipal, long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				employeeServiceUtil.class, "getEmployeeById",
				_getEmployeeByIdParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, employeeId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.lr.revisted.model.employee)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.lr.revisted.model.employee> getEmployees(
		HttpPrincipal httpPrincipal, int startIndex, int lastIndex) {

		try {
			MethodKey methodKey = new MethodKey(
				employeeServiceUtil.class, "getEmployees",
				_getEmployeesParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, startIndex, lastIndex);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.lr.revisted.model.employee>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int getEmployeesCount(HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(
				employeeServiceUtil.class, "getEmployeesCount",
				_getEmployeesCountParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(employeeServiceHttp.class);

	private static final Class<?>[] _addemployeeParameterTypes0 = new Class[] {
		String.class, long.class, String.class, String.class
	};
	private static final Class<?>[] _getEmployeeByIdParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _getEmployeesParameterTypes2 = new Class[] {
		int.class, int.class
	};
	private static final Class<?>[] _getEmployeesCountParameterTypes3 =
		new Class[] {};

}