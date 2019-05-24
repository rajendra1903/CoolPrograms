package com.luv2code.hibernate.demo;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

import antlr.collections.List;



public class QueringStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory(); 
		
		Session session = factory.getCurrentSession();
		
		try{
			 
			 session.beginTransaction();
			 
			 List theStudents = (List) session.createQuery("from Student").list();
			 
			 Iterator<String> crunchifyIterator = ((java.util.List) theStudents).iterator();
			 
			 while (crunchifyIterator.hasNext()) {
					System.out.println(crunchifyIterator.next());
				}
			 
			 
			 
			 session.getTransaction().commit();
			 
			 System.out.println("Done");
		}
		finally{
			
			factory.close();
		}

	}

}
