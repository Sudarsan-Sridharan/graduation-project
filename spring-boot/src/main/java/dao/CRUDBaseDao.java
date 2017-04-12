/**
 * Project Name:spring-boot
 * File Name:BaseDao.java
 * Package Name:dao
 * Date:2017年4月12日上午9:47:13
 * Copyright (c) 2017, All Rights Reserved.
 *
*/

package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rest.UserRest;

/**
 * ClassName:BaseDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年4月12日 上午9:47:13 <br/>
 * @author   Lenovo
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface CRUDBaseDao<T> {
    public static Logger log = LoggerFactory.getLogger(UserRest.class);  
    /**
     * 保存（持久化）一个对象
     * 
     * @param object
     *            要保存的对象
     */
    public void save(T entity) throws Exception;

    /**
     * 保存或修改持久化对象
     * 
     * @param object
     */
    public void saveOrUpdate(T entity) throws Exception;

    /**
     * 更新一个对象
     * 
     * @param object
     *            要修改的对象
     */

    public void update(T entity) throws Exception;

    /**
     * 用语句更新记录
     * 
     * @param queryString
     * @param parameters
     */
    public void updateByQuery(final String queryString,
            final Object[] parameters) throws Exception;

    /**
     * 删除一个对象
     * 
     * @param object
     *            要删除的对象
     */
    public void delete(T entity) throws Exception;

    /**
     * 根据类型和对象id删除一个对象
     * 
     * @param clazz
     *            类型
     * @param id
     *            对象id
     */
    public void delete(Class clazz, Serializable id) throws Exception;

    /**
     * 根据类型删除全部对象
     * 
     * @param clazz
     *            类型
     * @return
     */
    public Integer deleteAll(final Class clazz) throws Exception;

    /**
     * 根据查询和参数删除全部对象
     * 
     * @param clazz
     *            类型
     * @return
     */
    public Integer deleteByQuery(final String queryString,
            final Object[] parameters) throws Exception;

    /**
     * 获得某个类型的全部对象列表
     * 
     * @param clazz
     *            类型
     * @return 对象集合
     */
    public List findAll(Class clazz) throws Exception;
    public List findAllOfOrder(Class clazz,String orderStr) throws Exception; 
    /**
     * 根据类型和对象id载入一个对象
     * 
     * @param clazz
     *            类型
     * @param id
     *            对象id
     * @return 目标对象
     */
    public Object load(Class clazz, Serializable id) throws Exception;

    /**
     * 根据类型和对象id从数据库取得一个对象
     * 
     * @param clazz
     *            类
     * 
     * 
     * @param id
     *            对象id
     * @return 目标对象
     */
    public Object get(Class clazz, Serializable id) throws Exception;

    /**
     * 命名查询
     * 
     * @param namedQuery
     *            命名查询语句
     * @return 对象列表
     */
    public List findByNamedQuery(final String namedQuery) throws Exception;

    /**
     * 依据单个参数做命名查询
     * 
     * @param query
     *            命名查询语句
     * @param parameter
     *            单个查询参数
     * @return 对象列表
     */
    public List findByNamedQuery(final String query, final Object parameter)
            throws Exception;

    /**
     * 依据参数数组做命名查询
     * 
     * @param query
     *            命名查询语句
     * @param parameters
     *            查询参数数组
     * @return 对象列表
     */
    public List findByNamedQuery(final String query, final Object[] parameters)
            throws Exception;

    /**
     * 普通hsql查询
     * 
     * @param query
     *            hsql语句
     * @return 对象列表
     */
    public List find(final String query) throws Exception;

    /**
     * 普通hsql查询
     * 
     * @param query
     *            hsql语句
     * @return 对象列表
     */
    public List query(final String querysql, int start, int pageSize)
            throws Exception;

    /**
     * 普通hsql 带参数查询
     * 
     * @param query
     *            hsql语句
     * @param parameter
     *            单个查询参数
     * @return 对象列表
     */
    public List find(final String query, final Object parameter)
            throws Exception;
    
    /**
     * 普通hsql 带参数多参数查询
     * @param query
     * @param obj
     * @return
     */
    public List find(final String query, Object... obj);
    /**
     * hsql分页查询
     * 
     * @param queryString
     * @param parameters
     * @param pageIndex
     * @param pageSize
     * @param pageInfo
     * @return
     */
    public List findPageByQuery(final String queryString,
            final Object[] parameters, final int start, final int end)
            throws Exception;
    public List findPageByQuerySQL(final String queryString,
            final Object[] parameters, final int start, final int end)
                    throws Exception;
    public List findByQuery(final String queryString, final Object[] parameters) throws Exception;

    /**
     * 返回记录总条数
     * 
     * @param queryString
     * @param parameters
     * @param pageIndex
     * @param pageSize
     * @param pageInfo
     * @return
     */
    public long getCountFindPageByQuery(final String queryString,
            final Object[] parameters) throws Exception;

    public long getCountFindPageByQuerySQL(final String queryString,
            final Object[] parameters) throws Exception;
    /**
     * 返回记录总条数
     * 
     * @param detachedCriteria
     * @return
     */
    public long getCountByCriteria(final DetachedCriteria detachedCriteria)
            throws Exception;

    /**
     * 返回TreeMap键值对
     * 
     * @param detachedCriteria
     * @return
     */
    public TreeMap findTreeMap(final String query) throws Exception;

    public List findList(final String query) throws Exception;

    /**
     * jdbc操作 返回ResultSet对象 进行jdbc操作
     * 
     * @param sql
     * @param parameters
     * @param start
     * @param end
     * @return
     */

    public List getResultSetByJdbc(String sql, JdbcTemplate jt, int start,
            int end) throws Exception;

    /**
     * jdbc操作 取记录总数 执行的sql，在继承的客户端程序拼写
     * 
     * @param sql
     * @param jt
     * @return
     */
    public long getCountByJdbc(String sql, JdbcTemplate jt) throws Exception;

    /**
     * jdbc操作 对数据库进行添加和修改的工作
     * 
     * @param sql
     * @param jt
     */
    public void getExecuteByJdbc(String sql, JdbcTemplate jt) throws Exception;

    /**
     * jdbc操作 读取配置文件中得SQL语句
     * 
     * @param name
     * @return
     */
    public List findXMLSql(final String name) throws Exception;

    /**
     * 获取当前Session
     * @return
     */
    public Session getCurrentSession();
       
    /**
     * 执行本地SQL 
     * @param sql
     * @return
     */
    public List executeNativeSql(final String sql); 
    
    /**
     * 执行本地SQL 
     * @param sql
     * @return
     */
    @SuppressWarnings("unchecked") 
    public List executeNativeSql(String sql,Object... values); 
    
    /**
     * 执行增、删、改SQL语句
     * @param sql
     * @param values
     * @throws Exception 
     */
    public void executeNativeUpdate(String sql,Object... values) throws Exception;
    /**
     * 执行增、删、改SQL语句,改进版本，可支持in 需要的参数集合
     * 
     * @param sql
     * @param values
     */
    public void executeNativeUpdate2(String sql,Object... values) throws Exception;
    
    /**
     * 执行增、删、改SQL语句
     * @param sql
     * @throws Exception 
     */
    public void executeNativeUpdate(String sql) throws Exception;
    /**
     * 执行本地存储过程
     * @param procedureName
     * @param values
     * @throws SQLException
     */
    public void executeNativeProcedure(String procedureName,Object... values) throws SQLException;
    
    /**
     * 获取Hibernate模板
     * @return
     */
    public HibernateTemplate getHibernateTemplate(); 
    
    /**
     * 获取数据链接
     */
    public Connection getConnection() throws Exception;
    
    /**
     * 支持sql查询
     * 
     * @param sql
     * @param values
     * @return
     */
    @SuppressWarnings("unchecked")
    public List executeSQL(final String sql, final Object... values);
    
    public void add(Object obj) throws Exception;
    
}

