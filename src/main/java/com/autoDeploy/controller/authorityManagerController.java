package com.autoDeploy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

/**
 * 权限管理控制层
 * @author mills
 *
 */
@Controller
@RequestMapping("/authority")
@Slf4j
public class authorityManagerController {
	
	/**
	 * 请求权限管理页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/toAuthority",method=RequestMethod.GET)
	public String toAuthorityPage(HttpServletRequest request,HttpServletResponse response) {
		return "/authority/authorityList";
	}
	
	/**
	 * 添加权限页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value ="/toAddAuthority",method=RequestMethod.GET)
	public String toAddAuthority(HttpServletRequest request,HttpServletResponse response) {
		return "/authority/addAuthority";
	}
	
	@RequestMapping(value ="/editAddAuthorityPage" ,method=RequestMethod.GET)
	public String toEditAddAuthorityPage(HttpServletRequest request,HttpServletResponse response) {
		return "/authority/editAuthority";
	}
}
