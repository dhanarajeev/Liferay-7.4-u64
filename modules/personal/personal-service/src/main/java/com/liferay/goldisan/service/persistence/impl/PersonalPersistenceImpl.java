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

package com.liferay.goldisan.service.persistence.impl;

import com.liferay.goldisan.exception.NoSuchPersonalException;
import com.liferay.goldisan.model.Personal;
import com.liferay.goldisan.model.PersonalTable;
import com.liferay.goldisan.model.impl.PersonalImpl;
import com.liferay.goldisan.model.impl.PersonalModelImpl;
import com.liferay.goldisan.service.persistence.PersonalPersistence;
import com.liferay.goldisan.service.persistence.PersonalUtil;
import com.liferay.goldisan.service.persistence.impl.constants.lrPersistenceConstants;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUID;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the personal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PersonalPersistence.class)
public class PersonalPersistenceImpl
	extends BasePersistenceImpl<Personal> implements PersonalPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PersonalUtil</code> to access the personal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PersonalImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the personals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching personals
	 */
	@Override
	public List<Personal> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the personals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of personals
	 * @param end the upper bound of the range of personals (not inclusive)
	 * @return the range of matching personals
	 */
	@Override
	public List<Personal> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the personals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of personals
	 * @param end the upper bound of the range of personals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching personals
	 */
	@Override
	public List<Personal> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Personal> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the personals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of personals
	 * @param end the upper bound of the range of personals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching personals
	 */
	@Override
	public List<Personal> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Personal> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Personal> list = null;

		if (useFinderCache) {
			list = (List<Personal>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Personal personal : list) {
					if (!uuid.equals(personal.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PERSONAL_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PersonalModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Personal>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first personal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personal
	 * @throws NoSuchPersonalException if a matching personal could not be found
	 */
	@Override
	public Personal findByUuid_First(
			String uuid, OrderByComparator<Personal> orderByComparator)
		throws NoSuchPersonalException {

		Personal personal = fetchByUuid_First(uuid, orderByComparator);

		if (personal != null) {
			return personal;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPersonalException(sb.toString());
	}

	/**
	 * Returns the first personal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personal, or <code>null</code> if a matching personal could not be found
	 */
	@Override
	public Personal fetchByUuid_First(
		String uuid, OrderByComparator<Personal> orderByComparator) {

		List<Personal> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last personal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personal
	 * @throws NoSuchPersonalException if a matching personal could not be found
	 */
	@Override
	public Personal findByUuid_Last(
			String uuid, OrderByComparator<Personal> orderByComparator)
		throws NoSuchPersonalException {

		Personal personal = fetchByUuid_Last(uuid, orderByComparator);

		if (personal != null) {
			return personal;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPersonalException(sb.toString());
	}

	/**
	 * Returns the last personal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personal, or <code>null</code> if a matching personal could not be found
	 */
	@Override
	public Personal fetchByUuid_Last(
		String uuid, OrderByComparator<Personal> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Personal> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the personals before and after the current personal in the ordered set where uuid = &#63;.
	 *
	 * @param personId the primary key of the current personal
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next personal
	 * @throws NoSuchPersonalException if a personal with the primary key could not be found
	 */
	@Override
	public Personal[] findByUuid_PrevAndNext(
			long personId, String uuid,
			OrderByComparator<Personal> orderByComparator)
		throws NoSuchPersonalException {

		uuid = Objects.toString(uuid, "");

		Personal personal = findByPrimaryKey(personId);

		Session session = null;

		try {
			session = openSession();

			Personal[] array = new PersonalImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, personal, uuid, orderByComparator, true);

			array[1] = personal;

			array[2] = getByUuid_PrevAndNext(
				session, personal, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Personal getByUuid_PrevAndNext(
		Session session, Personal personal, String uuid,
		OrderByComparator<Personal> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PERSONAL_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PersonalModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(personal)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Personal> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the personals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Personal personal :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(personal);
		}
	}

	/**
	 * Returns the number of personals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching personals
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PERSONAL_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"personal.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(personal.uuid IS NULL OR personal.uuid = '')";

	public PersonalPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Personal.class);

		setModelImplClass(PersonalImpl.class);
		setModelPKClass(long.class);

		setTable(PersonalTable.INSTANCE);
	}

	/**
	 * Caches the personal in the entity cache if it is enabled.
	 *
	 * @param personal the personal
	 */
	@Override
	public void cacheResult(Personal personal) {
		entityCache.putResult(
			PersonalImpl.class, personal.getPrimaryKey(), personal);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the personals in the entity cache if it is enabled.
	 *
	 * @param personals the personals
	 */
	@Override
	public void cacheResult(List<Personal> personals) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (personals.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Personal personal : personals) {
			if (entityCache.getResult(
					PersonalImpl.class, personal.getPrimaryKey()) == null) {

				cacheResult(personal);
			}
		}
	}

	/**
	 * Clears the cache for all personals.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PersonalImpl.class);

		finderCache.clearCache(PersonalImpl.class);
	}

	/**
	 * Clears the cache for the personal.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Personal personal) {
		entityCache.removeResult(PersonalImpl.class, personal);
	}

	@Override
	public void clearCache(List<Personal> personals) {
		for (Personal personal : personals) {
			entityCache.removeResult(PersonalImpl.class, personal);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PersonalImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PersonalImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new personal with the primary key. Does not add the personal to the database.
	 *
	 * @param personId the primary key for the new personal
	 * @return the new personal
	 */
	@Override
	public Personal create(long personId) {
		Personal personal = new PersonalImpl();

		personal.setNew(true);
		personal.setPrimaryKey(personId);

		String uuid = _portalUUID.generate();

		personal.setUuid(uuid);

		return personal;
	}

	/**
	 * Removes the personal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param personId the primary key of the personal
	 * @return the personal that was removed
	 * @throws NoSuchPersonalException if a personal with the primary key could not be found
	 */
	@Override
	public Personal remove(long personId) throws NoSuchPersonalException {
		return remove((Serializable)personId);
	}

	/**
	 * Removes the personal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the personal
	 * @return the personal that was removed
	 * @throws NoSuchPersonalException if a personal with the primary key could not be found
	 */
	@Override
	public Personal remove(Serializable primaryKey)
		throws NoSuchPersonalException {

		Session session = null;

		try {
			session = openSession();

			Personal personal = (Personal)session.get(
				PersonalImpl.class, primaryKey);

			if (personal == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPersonalException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(personal);
		}
		catch (NoSuchPersonalException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Personal removeImpl(Personal personal) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(personal)) {
				personal = (Personal)session.get(
					PersonalImpl.class, personal.getPrimaryKeyObj());
			}

			if (personal != null) {
				session.delete(personal);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (personal != null) {
			clearCache(personal);
		}

		return personal;
	}

	@Override
	public Personal updateImpl(Personal personal) {
		boolean isNew = personal.isNew();

		if (!(personal instanceof PersonalModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(personal.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(personal);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in personal proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Personal implementation " +
					personal.getClass());
		}

		PersonalModelImpl personalModelImpl = (PersonalModelImpl)personal;

		if (Validator.isNull(personal.getUuid())) {
			String uuid = _portalUUID.generate();

			personal.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(personal);
			}
			else {
				personal = (Personal)session.merge(personal);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PersonalImpl.class, personalModelImpl, false, true);

		if (isNew) {
			personal.setNew(false);
		}

		personal.resetOriginalValues();

		return personal;
	}

	/**
	 * Returns the personal with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the personal
	 * @return the personal
	 * @throws NoSuchPersonalException if a personal with the primary key could not be found
	 */
	@Override
	public Personal findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPersonalException {

		Personal personal = fetchByPrimaryKey(primaryKey);

		if (personal == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPersonalException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return personal;
	}

	/**
	 * Returns the personal with the primary key or throws a <code>NoSuchPersonalException</code> if it could not be found.
	 *
	 * @param personId the primary key of the personal
	 * @return the personal
	 * @throws NoSuchPersonalException if a personal with the primary key could not be found
	 */
	@Override
	public Personal findByPrimaryKey(long personId)
		throws NoSuchPersonalException {

		return findByPrimaryKey((Serializable)personId);
	}

	/**
	 * Returns the personal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param personId the primary key of the personal
	 * @return the personal, or <code>null</code> if a personal with the primary key could not be found
	 */
	@Override
	public Personal fetchByPrimaryKey(long personId) {
		return fetchByPrimaryKey((Serializable)personId);
	}

	/**
	 * Returns all the personals.
	 *
	 * @return the personals
	 */
	@Override
	public List<Personal> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the personals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personals
	 * @param end the upper bound of the range of personals (not inclusive)
	 * @return the range of personals
	 */
	@Override
	public List<Personal> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the personals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personals
	 * @param end the upper bound of the range of personals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of personals
	 */
	@Override
	public List<Personal> findAll(
		int start, int end, OrderByComparator<Personal> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the personals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of personals
	 * @param end the upper bound of the range of personals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of personals
	 */
	@Override
	public List<Personal> findAll(
		int start, int end, OrderByComparator<Personal> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Personal> list = null;

		if (useFinderCache) {
			list = (List<Personal>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PERSONAL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PERSONAL;

				sql = sql.concat(PersonalModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Personal>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the personals from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Personal personal : findAll()) {
			remove(personal);
		}
	}

	/**
	 * Returns the number of personals.
	 *
	 * @return the number of personals
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PERSONAL);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "personId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PERSONAL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PersonalModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the personal persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_setPersonalUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setPersonalUtilPersistence(null);

		entityCache.removeCache(PersonalImpl.class.getName());
	}

	private void _setPersonalUtilPersistence(
		PersonalPersistence personalPersistence) {

		try {
			Field field = PersonalUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, personalPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = lrPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = lrPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = lrPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PERSONAL =
		"SELECT personal FROM Personal personal";

	private static final String _SQL_SELECT_PERSONAL_WHERE =
		"SELECT personal FROM Personal personal WHERE ";

	private static final String _SQL_COUNT_PERSONAL =
		"SELECT COUNT(personal) FROM Personal personal";

	private static final String _SQL_COUNT_PERSONAL_WHERE =
		"SELECT COUNT(personal) FROM Personal personal WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "personal.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Personal exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Personal exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PersonalPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

}