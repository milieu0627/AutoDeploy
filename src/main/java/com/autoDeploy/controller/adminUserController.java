package com.autoDeploy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.autoDeploy.entity.adminUserModel;
import com.autoDeploy.service.adminUserService;
import com.autoDeploy.util.BaseResultUtil;
import com.autoDeploy.util.EnhanceBaseResultUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * 用户控制层
 * @author mills
 *
 */
@Controller
@RequestMapping("/autoDeploy")
@Slf4j
public class adminUserController {
	/**
	 * 注入用户管理数据层
	 */
	@Autowired
	private adminUserService adminUserService;
	/**
	 * 查询所用用户或根据条件查询用户
	 * @param userName  用户名
	 * @param account   登录名
	 * @param userType  用户类型
	 * @param userState  用户状态
	 * @param request 
	 * @param response
	 * @return
	 */
	@RequestMapping(value ="/user",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<BaseResultUtil> getUserListByParams(String userName,String account,Integer userType,
			Integer userState,HttpServletRequest request,HttpServletResponse response){
		//查询条件map
		Map<String, Object> params=new HashMap<String, Object>();
		//用户名
		params.put("user_name", userName);
		//登陆账号
		params.put("login_account", account);
		//用户类型
		params.put("user_type", userType);
		//用户状态
		params.put("user_state", userState);
		List<adminUserModel> userList=adminUserService.findAll(params);
		return ResponseEntity.ok(EnhanceBaseResultUtil.SucceeResult("查询全部用户成功", userList, userList.size()));
	}
	/**
	 * 根据条件删除用户--可扩展，根据需要添加对象
	 * @param id
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/user" ,method=RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<BaseResultUtil> deleteAdminUserByParams(Integer id,HttpServletRequest request,HttpServletResponse response) {
		//参数对象
		adminUserModel adminUserModel=new adminUserModel();
		//设置参数
		adminUserModel.setId(id);
		//调用后台删除方法
		int result=adminUserService.delete(adminUserModel);
		//判断是否删除成功
		if (result<1) {
			return ResponseEntity.ok(EnhanceBaseResultUtil.FailedResult("未删除数据"));
		}
		return ResponseEntity.ok(EnhanceBaseResultUtil.SucceeResult("删除成功"));
	}
	/**
	 * 获取添加页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/user/add" ,method=RequestMethod.GET)
	public String toAddUserListPage(HttpServletRequest request,HttpServletResponse response) {
		return "/adminUser/adduser";
	}
	/**
	 * 添加用户
	 * @param adminUserModel   序列化用户 json格式
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value ="/user",method=RequestMethod.POST)
	@ResponseBody
	public  ResponseEntity<BaseResultUtil> addAdminUserModel(String userData,HttpServletRequest request,HttpServletResponse response) {
		adminUserModel adminUserModel=JSONObject.parseObject(userData, adminUserModel.class);
		//调用数据层添加用户
		int result=adminUserService.insert(adminUserModel);
		//校验返回值，是否添加成功
		if (result<1) {
			return ResponseEntity.ok(EnhanceBaseResultUtil.FailedResult("添加失败", "/autoDeploy/user"));
		}
		return ResponseEntity.ok(EnhanceBaseResultUtil.SucceeResult("添加成功", "/autoDeploy/user"));
	}
	/**
	 * 请求修改页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value ="/user/edit/page", method=RequestMethod.GET)
	public String toEditUserPage(HttpServletRequest request,HttpServletResponse response) {
		return "/adminUser/editUser";
	}
	
	@RequestMapping(value ="/user/restPWD/page", method=RequestMethod.GET)
	public String toRestPassWordPage(HttpServletRequest request,HttpServletResponse response) {
		return "/adminUser/restPassword";
	}
}
