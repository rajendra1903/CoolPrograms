package com.luv2code.jdbc;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcurl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user="hbstudent";
		String pass="hbstudent";
		
		try{
			System.out.println("Connecting to the db"+jdbcurl);
			Connection conn = (Connection) DriverManager.getConnection(jdbcurl,user,pass);
			System.out.println("Connection Successfull");
		}
		catch(Exception exc){
			
			exc.printStackTrace();
			
		}

	}

}
