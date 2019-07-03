package com.handles;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.DepartmentDao;
import com.dao.EmployeeDao;
import com.entities.Employee;

@Controller
public class EmployeeHandler {
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private DepartmentDao departmentDao;
	
	@ModelAttribute
	public void getEmployee(@RequestParam(value="id",required=false) Integer id,Map<String,Object> map){
		if(id != null){
			map.put("employee", employeeDao.get(id));
		}
	}
	@RequestMapping(value="/emp",method=RequestMethod.PUT)
	public String update(Employee employee){
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	@RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
	public String input(@PathVariable("id") Integer id,Map<String, Object> map){
		map.put("employee", employeeDao.get(id));
		map.put("department",departmentDao.getDepartments());
		return "input";
		
	}
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

	@RequestMapping(value="/inputEmployee",method=RequestMethod.GET)
	public String inputEmployee(Map<String,Object> map){
		map.put("employee",new Employee());
		map.put("department",departmentDao.getDepartments());
		return "input";
	}
}
