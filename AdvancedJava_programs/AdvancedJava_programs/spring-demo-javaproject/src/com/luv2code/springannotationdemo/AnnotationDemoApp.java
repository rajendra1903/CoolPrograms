package com.luv2code.springannotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//if we dont specify a name for bean id the default bean id is class name with first letter 
// of the class will be small
Coach myCoach = context.getBean("tennisCoach",Coach.class);

System.out.println(myCoach.getDailyWorkout());

context.close();
	}

}
