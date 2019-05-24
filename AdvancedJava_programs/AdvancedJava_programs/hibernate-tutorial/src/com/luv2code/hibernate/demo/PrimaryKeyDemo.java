package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory(); 

Session session = factory.getCurrentSession();

try{
System.out.println("Creating new students object");
Student tempStudent = new Student("John","prasad","prasad@yahoo.com");
Student tempStudent2 = new Student("dwayne","johnson","aladdin@gmail.com");
Student tempStudent3 = new Student("jaden","smith","iamcool@redmail.com");

session.beginTransaction();

System.out.println("Saving the students");
session.save(tempStudent);
session.save(tempStudent2);
session.save(tempStudent3);

session.getTransaction().commit();

System.out.println("Done");
}
finally{

factory.close();
}

	}

}
