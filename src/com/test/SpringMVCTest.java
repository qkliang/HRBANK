package com.test;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMVCTest {
	
	@RequestMapping(value="/testSimpleMappingException")
	public String testSimpleMappingException(@RequestParam("i") int i){
		String [] vals = new String[10];
		System.out.println(vals[i]);
		return "success";
	}
//	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="erersd")
	@RequestMapping("/testResponseException")
	public String testResponseStatusExceptionResolver(@RequestParam("i") int i){
		if(i == 13){
			throw new UserNameNotMatchPasswordException();
		}else{
			System.out.println("正常执行");
		}
		return "success";
	}
//	@ExceptionHandler({Exception.class})
//	public ModelAndView handleException(Exception ex){
//		System.out.println("出错了" + ex);
//		ModelAndView mv = new ModelAndView("error");
//		mv.addObject("exception", ex);
//		return mv;
//	}
	
	@RequestMapping(value="/testException")
	public String testException(@RequestParam("i") Integer i){
		
		System.out.println("result :" + (10/i));
		return "success";
	}
	@RequestMapping("/testFileUpload")
	public String testFileUpload(@RequestParam("desc") String desc,@RequestParam("file") MultipartFile file) throws IOException{
		System.out.println("desc " + desc);
		System.out.println("" + file.getOriginalFilename());
		System.out.println("" + file.getInputStream());
		
		return "success";
	}
}
