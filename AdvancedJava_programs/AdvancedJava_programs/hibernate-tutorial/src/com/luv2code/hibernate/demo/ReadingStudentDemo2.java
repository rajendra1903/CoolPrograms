package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadingStudentDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory(); 
		
		Session session = factory.getCurrentSession();
		
		try{
			 System.out.println("Creating new student object");
			 Student tempStudent = new Student("Matt","Hulk","matthulk@plane.com");
			 
			 session.beginTransaction();
			 
			 System.out.println("Saving the student");
			 System.out.println(tempStudent);
			 session.save(tempStudent);
			 
			 session.getTransaction().commit();
			 
			 //finding out students id
			 System.out.println("Saved the particular student generated id is:"+tempStudent.getId());
			 System.out.println("Done"); 
			 
			 session = factory.getCurrentSession();
			 
			 session.beginTransaction();
			 
			 System.out.println("Getting student with id "+tempStudent.getId());
			 
			 Student myStudent = session.get(Student.class,tempStudent.getId());
			
			 
			 System.out.println("Get has been completed"+ myStudent);
			
			 session.getTransaction().commit();
			 
			 System.out.println("Done");
		}
		finally{
			
			factory.close();
		}

	}

}
