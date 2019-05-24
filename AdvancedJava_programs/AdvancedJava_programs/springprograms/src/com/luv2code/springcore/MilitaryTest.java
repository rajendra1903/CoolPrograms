package com.luv2code.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MilitaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		Military mil =(Military) ctx.getBean("mil");
		System.out.println("Military id is:"+mil.getId());
		System.out.println("Military name is:"+mil.getName());
		
	
}

}