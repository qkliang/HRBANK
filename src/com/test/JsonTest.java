package com.test;

import java.util.Date;

import org.json.JSONObject;

import com.entities.Employee;

public class JsonTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setLastName("lqk");
		e.setBirth(new Date());
		System.out.println(new JSONObject(e));
	}
}
