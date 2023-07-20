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

package com.lr.revisted.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.lr.revisted.model.employee;
import com.lr.revisted.model.employeeModel;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the employee service. Represents a row in the &quot;lr_employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>employeeModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link employeeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see employeeImpl
 * @generated
 */
@JSON(strict = true)
public class employeeModelImpl
	extends BaseModelImpl<employee> implements employeeModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee model instance should use the <code>employee</code> interface instead.
	 */
	public static final String TABLE_NAME = "lr_employee";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"employeeId", Types.BIGINT},
		{"name", Types.VARCHAR}, {"phoneNumber", Types.BIGINT},
		{"email", Types.VARCHAR}, {"address", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("employeeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phoneNumber", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table lr_employee (uuid_ VARCHAR(75) null,employeeId LONG not null primary key,name VARCHAR(75) null,phoneNumber LONG,email VARCHAR(75) null,address VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table lr_employee";

	public static final String ORDER_BY_JPQL =
		" ORDER BY employee.employeeId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY lr_employee.employeeId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long EMPLOYEEID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public employeeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _employeeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return employee.class;
	}

	@Override
	public String getModelClassName() {
		return employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<employee, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<employee, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<employee, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((employee)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<employee, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<employee, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(employee)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<employee, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<employee, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<employee, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<employee, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<employee, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<employee, Object>>();
		Map<String, BiConsumer<employee, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<employee, ?>>();

		attributeGetterFunctions.put("uuid", employee::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<employee, String>)employee::setUuid);
		attributeGetterFunctions.put("employeeId", employee::getEmployeeId);
		attributeSetterBiConsumers.put(
			"employeeId", (BiConsumer<employee, Long>)employee::setEmployeeId);
		attributeGetterFunctions.put("name", employee::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<employee, String>)employee::setName);
		attributeGetterFunctions.put("phoneNumber", employee::getPhoneNumber);
		attributeSetterBiConsumers.put(
			"phoneNumber",
			(BiConsumer<employee, Long>)employee::setPhoneNumber);
		attributeGetterFunctions.put("email", employee::getEmail);
		attributeSetterBiConsumers.put(
			"email", (BiConsumer<employee, String>)employee::setEmail);
		attributeGetterFunctions.put("address", employee::getAddress);
		attributeSetterBiConsumers.put(
			"address", (BiConsumer<employee, String>)employee::setAddress);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(long employeeId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_employeeId = employeeId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
	}

	@JSON
	@Override
	public long getPhoneNumber() {
		return _phoneNumber;
	}

	@Override
	public void setPhoneNumber(long phoneNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_phoneNumber = phoneNumber;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return "";
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_email = email;
	}

	@JSON
	@Override
	public String getAddress() {
		if (_address == null) {
			return "";
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_address = address;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, employee.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public employee toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, employee>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		employeeImpl employeeImpl = new employeeImpl();

		employeeImpl.setUuid(getUuid());
		employeeImpl.setEmployeeId(getEmployeeId());
		employeeImpl.setName(getName());
		employeeImpl.setPhoneNumber(getPhoneNumber());
		employeeImpl.setEmail(getEmail());
		employeeImpl.setAddress(getAddress());

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public employee cloneWithOriginalValues() {
		employeeImpl employeeImpl = new employeeImpl();

		employeeImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		employeeImpl.setEmployeeId(
			this.<Long>getColumnOriginalValue("employeeId"));
		employeeImpl.setName(this.<String>getColumnOriginalValue("name"));
		employeeImpl.setPhoneNumber(
			this.<Long>getColumnOriginalValue("phoneNumber"));
		employeeImpl.setEmail(this.<String>getColumnOriginalValue("email"));
		employeeImpl.setAddress(this.<String>getColumnOriginalValue("address"));

		return employeeImpl;
	}

	@Override
	public int compareTo(employee employee) {
		long primaryKey = employee.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof employee)) {
			return false;
		}

		employee employee = (employee)object;

		long primaryKey = employee.getPrimaryKey();

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

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<employee> toCacheModel() {
		employeeCacheModel employeeCacheModel = new employeeCacheModel();

		employeeCacheModel.uuid = getUuid();

		String uuid = employeeCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			employeeCacheModel.uuid = null;
		}

		employeeCacheModel.employeeId = getEmployeeId();

		employeeCacheModel.name = getName();

		String name = employeeCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			employeeCacheModel.name = null;
		}

		employeeCacheModel.phoneNumber = getPhoneNumber();

		employeeCacheModel.email = getEmail();

		String email = employeeCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			employeeCacheModel.email = null;
		}

		employeeCacheModel.address = getAddress();

		String address = employeeCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			employeeCacheModel.address = null;
		}

		return employeeCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<employee, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<employee, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<employee, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((employee)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, employee>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					employee.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _employeeId;
	private String _name;
	private long _phoneNumber;
	private String _email;
	private String _address;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<employee, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((employee)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("employeeId", _employeeId);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("phoneNumber", _phoneNumber);
		_columnOriginalValues.put("email", _email);
		_columnOriginalValues.put("address", _address);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("employeeId", 2L);

		columnBitmasks.put("name", 4L);

		columnBitmasks.put("phoneNumber", 8L);

		columnBitmasks.put("email", 16L);

		columnBitmasks.put("address", 32L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private employee _escapedModel;

}