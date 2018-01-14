package com.accolite.mini_au.CRUD_Rest.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.ws.rs.PathParam;

import com.accolite.mini_au.CRUD_Rest.model.Employee;



public class CRUD_def {

	public CRUD_def() {
		// TODO Auto-generated constructor stub
	}
	
	public void insertEmployee(Employee e) {
		
		Jdbc_connection con = Jdbc_connection.getConnection();
		
		try {
			
			con.stmt.execute("insert into employeedb.employee values("+e.getEmp_id()+",'"+e.getName()+"','"+e.getContact()+"','"+e.getEmail()+"',"+e.getAge()+",'"+e.getGender()+"');");
			
		} 
		catch (Exception ex) {
			
			System.out.println("ERROR:"+ex);	
		}
	}
	
	public void deleteEmployee(@PathParam("emp_id") int emp_id) {
		
		Jdbc_connection con = Jdbc_connection.getConnection();
		
		try {
			con.stmt.execute("delete from employeedb.employee where emp_id = "+ emp_id+";");
		}
		
		catch(Exception ex) {
			System.out.println("ERROR:"+ex);
		}
	}
	
	public void updateEmployee(@PathParam("emp_id") int emp_id, Employee e) {
		
		Jdbc_connection con = Jdbc_connection.getConnection();
		System.out.println(" "+emp_id+" "+e.getContact()+e.getEmail());
		String cont = e.getContact();
		String em = e.getEmail();
		
		try {
			boolean rows = con.stmt.execute("update employeedb.employee set contact = '"+ cont +"' , email = '"+em+"' where emp_id ="+emp_id+";");
			System.out.println(" "+rows);
		}
		
		catch(Exception ex) {
			System.out.println("ERROR:"+ex);
		}
	}
	
	public Employee displayEmployee(@PathParam("emp_id") int emp_id) {
		
		Connection con = Jdbc_connection.getConnection().con;
		Employee e1 = null;
		
		System.out.println(emp_id);
		try {
			PreparedStatement ps=con.prepareStatement("select * from employeedb.employee where emp_id = ?");
			ps.setInt(1,emp_id);
			ResultSet rs = ps.executeQuery();
			//System.out.println( rs.getString(2)+ rs.getString(3)+rs.getString(4)+ rs.getInt(5)+rs.getString(6));
			e1 = new Employee();
			while(rs.next()) {
			e1.setEmp_id(emp_id);
			e1.setName(rs.getString(2));
			e1.setContact(rs.getString(3));
			e1.setEmail(rs.getString(4));
			e1.setAge(rs.getInt(5));
			e1.setGender(rs.getString(6));
			}
		}
		
		
		catch(Exception ex) {
			System.out.println("ERROR:"+ex);
		}
		
		return e1;
	}
	
}
