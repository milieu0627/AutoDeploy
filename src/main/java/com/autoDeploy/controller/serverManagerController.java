package com.autoDeploy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * 服务器管理控制层
 * @author mills
 *
 */
@Controller
@RequestMapping("/server")
@Slf4j
public class serverManagerController {

	private static final String SER_PRIX="/server/";
	
	/**
	 * 请求服务器列表页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/toServerListPage")
	String toServerListPage(HttpServletRequest request ,HttpServletResponse response) {
		return SER_PRIX+"ServerManager";
	}
}
