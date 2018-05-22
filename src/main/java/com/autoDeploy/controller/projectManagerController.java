package com.autoDeploy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * 项目管理控制层
 * @author mills
 *
 */
@Controller
@RequestMapping("/projectManager")
@Slf4j
public class projectManagerController {
	/**
	 * 请求页面前缀
	 */
	private static final String PRJ_PRIX="/project/";
	
	/**
	 * 请求项目管理页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/toProjectListPage")
	public String toProjectListPage(HttpServletRequest request,HttpServletResponse response) {
		return PRJ_PRIX+"ProjectManager";
	}
}
