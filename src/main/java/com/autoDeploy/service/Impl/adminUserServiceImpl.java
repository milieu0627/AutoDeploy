package com.autoDeploy.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.autoDeploy.dao.adminUserDao;
import com.autoDeploy.entity.adminUserModel;
import com.autoDeploy.service.adminUserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * 用户服务实现层
 * @author mills
 *
 */
@Service
@Transactional(propagation=Propagation.REQUIRED,rollbackFor=RuntimeException.class)
public class adminUserServiceImpl implements adminUserService {
	/**
	 * 注入用户dao接口
	 */
	@Autowired
	private adminUserDao adminUserDao;
	@Override
	public adminUserModel findOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public adminUserModel findOne(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<adminUserModel> findAll() {
		return null;
	}

	@Override
	public List<adminUserModel> findAll(Object object) {
		return null;
	}

	@Override
	public int insert(adminUserModel entity) {
		return adminUserDao.insert(entity);
	}

	@Override
	public int insertList(List<adminUserModel> t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(adminUserModel adminUserModel) {
		 EntityWrapper<adminUserModel> ew = new EntityWrapper<adminUserModel>();
		 ew.where("id="+adminUserModel.getId());
		return adminUserDao.delete(ew);
	}

	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public adminUserModel findOne(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<adminUserModel> findAll(Map<String, Object> params) {
		return adminUserDao.selectUserListByMap(params);
	}

	@Override
	public int delete(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Object object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return 0;
	}

}
