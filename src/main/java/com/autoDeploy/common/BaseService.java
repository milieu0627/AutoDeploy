package com.autoDeploy.common;

import java.util.List;
import java.util.Map;

/**
 * 基础公共服务接口
 * @author mills
 *
 */
public interface BaseService<T> {
	/**
	 * 获取单个对象
	 */
	T findOne();
	/**
	 * 根据单个条件获取对象
	 */
	T findOne(Object object);
	/**
	 * 根据多个条件查询单个对象
	 * 
	 */
	T findOne(Map<String, Object> params);
	/**
	 * 获取对象集合
	 */
	List<T> findAll();
	/**
	 * 根据单个条件获取集合
	 */
	List<T> findAll(Object object);
	/**
	 * 根据多个条件查询集合
	 * @param params
	 * @return
	 */
	List<T> findAll(Map<String, Object> params);
	/**
	 * 插入数据
	 */
	int insert(T t);
	/**
	 * 插入集合数据
	 */
	int insertList(List<T> t);
	/**
	 * 根据条件删除数据
	 */
	int delete(T t);
	/**
	 * 根据多个条件删除数据
	 */
	int delete(Map<String, Object> params);
	/**
	 * 删除全部数据
	 */
	int deleteAll();
	/**
	 * 根据条件更新集合
	 */
	int update(Object object);
	/**
	 * 根据多个条件更新数据
	 */
	int update(Map<String, Object> params);
}
