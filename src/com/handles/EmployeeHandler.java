package com.handles;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.EmployeeDao;

@Controller
public class EmployeeHandler {
	EmployeeDao ed = new EmployeeDao();
	@RequestMapping("/emps")
	public String list(Map<String, Object> map){
		map.put("employees",ed.getAll());
		return "list";
	}
}
