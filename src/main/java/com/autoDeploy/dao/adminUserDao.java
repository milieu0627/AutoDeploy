package com.autoDeploy.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.autoDeploy.entity.adminUserModel;
import com.baomidou.mybatisplus.mapper.BaseMapper;
/**
 * 用户数据层
 * @author mills
 *
 */
@Repository
public interface adminUserDao extends BaseMapper<adminUserModel>{
	List<adminUserModel> selectUserListByMap(Map<String, Object> params);
}
