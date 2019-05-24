package com.springdemo.programs_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/springdemo/programs_1/prog1-config.xml");
		
		Hospital hstl = (Hospital) ctx.getBean("hospital");
		
	System.out.println("htsl name:"+hstl.getName());
	System.out.println("hstal patients:"+hstl.getDepartments());
	}

}
