package com.bharath.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bharath/spring/springjdbc/Config.xml");
		
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemp");
		
		String sql = "insert into employee values(?,?,?)";
		
		int result = jdbcTemplate.update(sql,new Integer(1),"Rajendra","prasad");
		
		System.out.println("no of employees:"+result);
		
	}

}
