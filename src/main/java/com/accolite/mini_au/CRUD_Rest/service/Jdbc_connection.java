package com.accolite.mini_au.CRUD_Rest.service;

import java.sql.Connection;
import java.sql.DriverManager;

//import com.mysql.jdbc.Statement;



public class Jdbc_connection {

	Connection con;
	java.sql.Statement stmt;
	private static Jdbc_connection conn;
	
	private Jdbc_connection(){
		
		
		
		try{  
			
		
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/employeedb","root","root"); 
			stmt=con.createStatement();  
			 
		}
		catch(Exception e) {
			System.out.println(""+ e);
		}
	}
		
		
		public static Jdbc_connection  getConnection()
		{
			if(conn == null)
			{
				conn =  new Jdbc_connection();
			}
			return conn;
		}
		
}
