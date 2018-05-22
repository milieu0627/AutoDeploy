package com.autoDeploy.common;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常处理   处理所有控制层抛出的异常    使用@controllerAdvice   + @ExceptionHandler 处理
 * 
 * @author mills
 *
 */
@ControllerAdvice//声明这是一个统一处理异常的类
public class globalException {
	/**
	 * 定义一个统一处理Exception异常的方法，
	 * @param e
	 * @return 返回到 统一的异常页面
	 */
	@ExceptionHandler(RuntimeException.class) //声明统一处理Exception
	String handlerException(RuntimeException e,Model model) {
		model.addAttribute("errorInfo", "系统发生错误");
		return "error";
	}
}
