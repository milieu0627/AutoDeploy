package com.autoDeploy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.autoDeploy.entity.adminUserModel;

/**
 * 基础页面请求
 * @author mills
 *
 */
@Controller
@RequestMapping("/base")
public class basePageController {
	/**
	 * 请求登陆页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/tologin")
	public String toLoginPage(HttpServletRequest request,HttpServletResponse response) {
		return "login";
	}
	/**
	 * 请求用户列表页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/toUserList" ,method =RequestMethod.GET)
	public String toUserList(HttpServletRequest request,HttpServletResponse response) {
		return "/adminUser/userList";
	}
	/**
	 * 请求主页
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value ="/toIndex" ,method=RequestMethod.GET)
	public String toIndex(HttpServletRequest request,HttpServletResponse response) {
		return "bathcIndex";
	}
	/**
	 * 请求控制面板
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value ="/main",method=RequestMethod.GET)
	public String toMain(HttpServletRequest request,HttpServletResponse response) {
		return "main";
	}
}
