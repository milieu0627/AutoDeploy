package com.autoDeploy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 日志管理控制层
 * @author mills
 *
 */
@Controller
@RequestMapping("/logger")
public class loggerController {
	//请求页面前缀
	private static final String PAGE_PRI="/logger/";
	
	/**
	 * 请求日志page
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value ="/logger" ,method=RequestMethod.GET)
	public String toLoggerListPage(HttpServletRequest request,HttpServletResponse response) {
		return PAGE_PRI+"loggerList";
	}
	
	/**
	 * 请求日志统计页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/logger/acount",method=RequestMethod.GET)
	public String toLoggerAcountPage(HttpServletRequest request,HttpServletResponse response) {
		return PAGE_PRI+"loggerCount";
	}
}
