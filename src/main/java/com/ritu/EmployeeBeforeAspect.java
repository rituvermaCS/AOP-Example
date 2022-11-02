package com.ritu;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect

public class EmployeeBeforeAspect {
	
	@Before("execution(* com.ritu.Employee.getName())")
	public void getNameBeforeAdvice() {
		System.out.println("Executing before advice for getName method.");
	}
	
	@Before("execution(* com.ritu.Employee.get*())")
	public void getAllMethodBeforeAdvice() {
		System.out.println("Executing all methods advice.");
	}

}
