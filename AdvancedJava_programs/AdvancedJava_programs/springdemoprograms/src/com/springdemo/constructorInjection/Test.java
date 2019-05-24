package com.springdemo.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx  = new ClassPathXmlApplicationContext("com/springdemo/constructorInjection/config_prog3.xml");
		
		Employee e = (Employee)ctx.getBean("Employee");
		System.out.println(e);
				

	}

}
