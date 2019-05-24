package com.springdemo.program_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/springdemo/program_2/prog2-config.xml");
		
		LifeCycle pat = (LifeCycle) ctx.getBean("patient");
		System.out.println(pat);

	}

}
