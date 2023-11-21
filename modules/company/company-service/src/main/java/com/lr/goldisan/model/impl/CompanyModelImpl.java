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

package com.lr.goldisan.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.lr.goldisan.model.Company;
import com.lr.goldisan.model.CompanyModel;

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
 * The base model implementation for the Company service. Represents a row in the &quot;lr_Company&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CompanyModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CompanyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyImpl
 * @generated
 */
@JSON(strict = true)
public class CompanyModelImpl
	extends BaseModelImpl<Company> implements CompanyModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a company model instance should use the <code>Company</code> interface instead.
	 */
	public static final String TABLE_NAME = "lr_Company";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"companyId", Types.BIGINT},
		{"companyName", Types.VARCHAR}, {"registrationId", Types.BIGINT},
		{"email", Types.VARCHAR}, {"taxId", Types.BIGINT},
		{"phoneNumber", Types.BIGINT}, {"gst", Types.BIGINT},
		{"address", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("registrationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("taxId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("phoneNumber", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("gst", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table lr_Company (uuid_ VARCHAR(75) null,companyId LONG not null primary key,companyName VARCHAR(75) null,registrationId LONG,email VARCHAR(75) null,taxId LONG,phoneNumber LONG,gst LONG,address VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table lr_Company";

	public static final String ORDER_BY_JPQL =
		" ORDER BY company.companyId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY lr_Company.companyId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 2L;

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

	public CompanyModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _companyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCompanyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _companyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Company.class;
	}

	@Override
	public String getModelClassName() {
		return Company.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Company, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Company, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Company, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Company)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Company, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Company, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Company)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Company, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Company, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<Company, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Company, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Company, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Company, Object>>();
		Map<String, BiConsumer<Company, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Company, ?>>();

		attributeGetterFunctions.put("uuid", Company::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Company, String>)Company::setUuid);
		attributeGetterFunctions.put("companyId", Company::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Company, Long>)Company::setCompanyId);
		attributeGetterFunctions.put("companyName", Company::getCompanyName);
		attributeSetterBiConsumers.put(
			"companyName",
			(BiConsumer<Company, String>)Company::setCompanyName);
		attributeGetterFunctions.put(
			"registrationId", Company::getRegistrationId);
		attributeSetterBiConsumers.put(
			"registrationId",
			(BiConsumer<Company, Long>)Company::setRegistrationId);
		attributeGetterFunctions.put("email", Company::getEmail);
		attributeSetterBiConsumers.put(
			"email", (BiConsumer<Company, String>)Company::setEmail);
		attributeGetterFunctions.put("taxId", Company::getTaxId);
		attributeSetterBiConsumers.put(
			"taxId", (BiConsumer<Company, Long>)Company::setTaxId);
		attributeGetterFunctions.put("phoneNumber", Company::getPhoneNumber);
		attributeSetterBiConsumers.put(
			"phoneNumber", (BiConsumer<Company, Long>)Company::setPhoneNumber);
		attributeGetterFunctions.put("gst", Company::getGst);
		attributeSetterBiConsumers.put(
			"gst", (BiConsumer<Company, Long>)Company::setGst);
		attributeGetterFunctions.put("address", Company::getAddress);
		attributeSetterBiConsumers.put(
			"address", (BiConsumer<Company, String>)Company::setAddress);

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
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@JSON
	@Override
	public String getCompanyName() {
		if (_companyName == null) {
			return "";
		}
		else {
			return _companyName;
		}
	}

	@Override
	public void setCompanyName(String companyName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyName = companyName;
	}

	@JSON
	@Override
	public long getRegistrationId() {
		return _registrationId;
	}

	@Override
	public void setRegistrationId(long registrationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_registrationId = registrationId;
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
	public long getTaxId() {
		return _taxId;
	}

	@Override
	public void setTaxId(long taxId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_taxId = taxId;
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
	public long getGst() {
		return _gst;
	}

	@Override
	public void setGst(long gst) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_gst = gst;
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
			getCompanyId(), Company.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Company toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Company>
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
		CompanyImpl companyImpl = new CompanyImpl();

		companyImpl.setUuid(getUuid());
		companyImpl.setCompanyId(getCompanyId());
		companyImpl.setCompanyName(getCompanyName());
		companyImpl.setRegistrationId(getRegistrationId());
		companyImpl.setEmail(getEmail());
		companyImpl.setTaxId(getTaxId());
		companyImpl.setPhoneNumber(getPhoneNumber());
		companyImpl.setGst(getGst());
		companyImpl.setAddress(getAddress());

		companyImpl.resetOriginalValues();

		return companyImpl;
	}

	@Override
	public Company cloneWithOriginalValues() {
		CompanyImpl companyImpl = new CompanyImpl();

		companyImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		companyImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		companyImpl.setCompanyName(
			this.<String>getColumnOriginalValue("companyName"));
		companyImpl.setRegistrationId(
			this.<Long>getColumnOriginalValue("registrationId"));
		companyImpl.setEmail(this.<String>getColumnOriginalValue("email"));
		companyImpl.setTaxId(this.<Long>getColumnOriginalValue("taxId"));
		companyImpl.setPhoneNumber(
			this.<Long>getColumnOriginalValue("phoneNumber"));
		companyImpl.setGst(this.<Long>getColumnOriginalValue("gst"));
		companyImpl.setAddress(this.<String>getColumnOriginalValue("address"));

		return companyImpl;
	}

	@Override
	public int compareTo(Company company) {
		long primaryKey = company.getPrimaryKey();

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

		if (!(object instanceof Company)) {
			return false;
		}

		Company company = (Company)object;

		long primaryKey = company.getPrimaryKey();

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
	public CacheModel<Company> toCacheModel() {
		CompanyCacheModel companyCacheModel = new CompanyCacheModel();

		companyCacheModel.uuid = getUuid();

		String uuid = companyCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			companyCacheModel.uuid = null;
		}

		companyCacheModel.companyId = getCompanyId();

		companyCacheModel.companyName = getCompanyName();

		String companyName = companyCacheModel.companyName;

		if ((companyName != null) && (companyName.length() == 0)) {
			companyCacheModel.companyName = null;
		}

		companyCacheModel.registrationId = getRegistrationId();

		companyCacheModel.email = getEmail();

		String email = companyCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			companyCacheModel.email = null;
		}

		companyCacheModel.taxId = getTaxId();

		companyCacheModel.phoneNumber = getPhoneNumber();

		companyCacheModel.gst = getGst();

		companyCacheModel.address = getAddress();

		String address = companyCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			companyCacheModel.address = null;
		}

		return companyCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Company, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Company, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Company, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Company)this);

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

		private static final Function<InvocationHandler, Company>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Company.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _companyId;
	private String _companyName;
	private long _registrationId;
	private String _email;
	private long _taxId;
	private long _phoneNumber;
	private long _gst;
	private String _address;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Company, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Company)this);
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
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("companyName", _companyName);
		_columnOriginalValues.put("registrationId", _registrationId);
		_columnOriginalValues.put("email", _email);
		_columnOriginalValues.put("taxId", _taxId);
		_columnOriginalValues.put("phoneNumber", _phoneNumber);
		_columnOriginalValues.put("gst", _gst);
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

		columnBitmasks.put("companyId", 2L);

		columnBitmasks.put("companyName", 4L);

		columnBitmasks.put("registrationId", 8L);

		columnBitmasks.put("email", 16L);

		columnBitmasks.put("taxId", 32L);

		columnBitmasks.put("phoneNumber", 64L);

		columnBitmasks.put("gst", 128L);

		columnBitmasks.put("address", 256L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Company _escapedModel;

}