package com.springdemo.programs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KatthiPodanu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		Kostha kat =(Kostha) ctx.getBean("kat");
		System.out.println("Katthi id is:"+kat.getId());
		System.out.println("Katthi name is:"+kat.getName());

	}

}
