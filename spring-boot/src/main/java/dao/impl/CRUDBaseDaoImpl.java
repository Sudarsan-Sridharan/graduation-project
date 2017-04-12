/**
 * Project Name:spring-boot
 * File Name:CRUDBaseDaoImpl.java
 * Package Name:dao.impl
 * Date:2017年4月12日上午10:46:04
 * Copyright (c) 2017, All Rights Reserved.
 *
*/

package dao.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.TreeMap;

import dao.CRUDBaseDao;
import dao.DetachedCriteria;
import dao.HibernateTemplate;
import dao.JdbcTemplate;
import dao.Session;

/**
 * ClassName:CRUDBaseDaoImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年4月12日 上午10:46:04 <br/>
 * @author   Lenovo
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class CRUDBaseDaoImpl<T> implements CRUDBaseDao<T>{

    @Override
    public void save(T entity) throws Exception {
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public void saveOrUpdate(T entity) throws Exception {
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(T entity) throws Exception {
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateByQuery(String queryString, Object[] parameters) throws Exception {
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(T entity) throws Exception {
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(Class clazz, Serializable id) throws Exception {
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public Integer deleteAll(Class clazz) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer deleteByQuery(String queryString, Object[] parameters) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List findAll(Class clazz) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List findAllOfOrder(Class clazz, String orderStr) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object load(Class clazz, Serializable id) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object get(Class clazz, Serializable id) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List findByNamedQuery(String namedQuery) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List findByNamedQuery(String query, Object parameter) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List findByNamedQuery(String query, Object[] parameters) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List find(String query) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List query(String querysql, int start, int pageSize) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List find(String query, Object parameter) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List find(String query, Object... obj) {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List findPageByQuery(String queryString, Object[] parameters, int start, int end) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List findPageByQuerySQL(String queryString, Object[] parameters, int start, int end) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List findByQuery(String queryString, Object[] parameters) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getCountFindPageByQuery(String queryString, Object[] parameters) throws Exception {
        
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long getCountFindPageByQuerySQL(String queryString, Object[] parameters) throws Exception {
        
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long getCountByCriteria(DetachedCriteria detachedCriteria) throws Exception {
        
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public TreeMap findTreeMap(String query) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List findList(String query) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List getResultSetByJdbc(String sql, JdbcTemplate jt, int start, int end) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getCountByJdbc(String sql, JdbcTemplate jt) throws Exception {
        
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void getExecuteByJdbc(String sql, JdbcTemplate jt) throws Exception {
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public List findXMLSql(String name) throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Session getCurrentSession() {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List executeNativeSql(String sql) {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List executeNativeSql(String sql, Object... values) {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void executeNativeUpdate(String sql, Object... values) throws Exception {
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public void executeNativeUpdate2(String sql, Object... values) throws Exception {
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public void executeNativeUpdate(String sql) throws Exception {
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public void executeNativeProcedure(String procedureName, Object... values) throws SQLException {
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public HibernateTemplate getHibernateTemplate() {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Connection getConnection() throws Exception {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List executeSQL(String sql, Object... values) {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(Object obj) throws Exception {
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public Session getCurrentSession() {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HibernateTemplate getHibernateTemplate() {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Session getCurrentSession() {
        
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HibernateTemplate getHibernateTemplate() {
        
        // TODO Auto-generated method stub
        return null;
    }

}

