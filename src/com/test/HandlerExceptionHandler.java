package com.test;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class HandlerExceptionHandler {

	@ExceptionHandler({Exception.class})
	public ModelAndView handleException(Exception ex){
		System.out.println("--->ณ๖ดํมห" + ex);
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", ex);
		return mv;
	}
}
