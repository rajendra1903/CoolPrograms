package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory(); 
		
		Session session = factory.getCurrentSession();
		
		try{
			
			int studentId = 2;
			session = factory.getCurrentSession();
			 session.beginTransaction();
			 
			 System.out.println("Getting student with id"+studentId);

			 Student myStudent = session.get(Student.class, studentId);
			 
			 System.out.println("Updating Student");
			 
			 myStudent.setEmail("raj@world.com");
			 
			 
			 
			 session.getTransaction().commit();
			 
			 System.out.println("Done");
		}
		finally{
			
			factory.close();
		}

	}

}
