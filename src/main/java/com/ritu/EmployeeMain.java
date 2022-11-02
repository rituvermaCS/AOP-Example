package com.ritu;

import com.ritu.service.EmployeeService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee employee = (Employee) context.getBean("employee");

		service.getName();
		
	}

}
