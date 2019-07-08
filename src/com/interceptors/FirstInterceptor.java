package com.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class FirstInterceptor implements HandlerInterceptor{

	/**
	 * ����Ⱦ��ͼ֮�󱻵���
	 * 
	 * �ͷ���Դ
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("afterCompletion");
		
	}

	/**
	 * ��Ŀ�귽��֮����Ⱦ��ͼ֮ǰ�����õ�
	 * 
	 * ���Զ����������ͼ���޸�
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("postHandle");
		
	}
	/**
	 * �÷�����Ŀ�귽��֮ǰ������
	 * ������ֵΪtrue���������ú���������������Ŀ�귽��
	 * ������ֵΪfalse��������������������ᱻִ�У�Ŀ�귽��Ҳ���ᱻִ��
	 * 
	 * ���Կ�����Ȩ�޿��ƣ���־������
	 */
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("preHandle");
		return true;
	}

}
