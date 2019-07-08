package com.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SecondInterceptor implements HandlerInterceptor{

	/**
	 * 在渲染视图之后被调用
	 * 
	 * 释放资源
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("SecondInterceptor afterCompletion");
		
	}

	/**
	 * 在目标方法之后，渲染视图之前被调用的
	 * 
	 * 可以对请求域或视图做修改
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("SecondInterceptor postHandle");
		
	}
	/**
	 * 该方法在目标方法之前被调用
	 * 若返回值为true，继续调用后续拦截器方法和目标方法
	 * 若返回值为false，则后续拦截器方法不会被执行，目标方法也不会被执行
	 * 
	 * 可以考虑做权限控制，日志，事务
	 */
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("SecondInterceptor preHandle");
		return false;
	}

}
