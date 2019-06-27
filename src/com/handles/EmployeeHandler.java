package com.handles;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.DepartmentDao;
import com.dao.EmployeeDao;
import com.entities.Employee;

@Controller
public class EmployeeHandler {
	@Autowired
	private EmployeeDao employeeDao;
//	EmployeeDao ed = new EmployeeDao();
	
	@RequestMapping(value="/emp/{id}",method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id){
		employeeDao.delete(id);
		return "redirect:/emps";
	}
	@RequestMapping("/emp")
	public String save(Employee employee){
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	
	@RequestMapping("/emps")
	public String list(Map<String, Object> map){
		map.put("employees",employeeDao.getAll());
		return "list";
	}
	@Autowired
	private DepartmentDao dd;
//	DepartmentDao dd = new DepartmentDao();
	@RequestMapping(value="/inputEmployee",method=RequestMethod.GET)
	public String inputEmployee(Map<String,Object> map){
		map.put("employee",new Employee());
		map.put("department",dd.getDepartments());
		return "input";
	}
}
