package com.accolite.mini_au.CRUD_Rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.accolite.mini_au.CRUD_Rest.model.Employee;
import com.accolite.mini_au.CRUD_Rest.service.CRUD_def;




@Path("/Employee")
public class EmployeeAnno {

	CRUD_def cd = new CRUD_def();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{emp_id}")
	public Employee displayEmployee_(@PathParam("emp_id") int emp_id)
	{
		return cd.displayEmployee(emp_id);
	}
	
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertEmployee_(Employee e1)
	{
		cd.insertEmployee(e1);
		return "RECORD SUCCESFULLY INSERTED";
	}
	
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{emp_id}")
	public String updateEmployee_(@PathParam("emp_id") int emp_id, Employee e)
	{
		cd.updateEmployee(emp_id, e);
		return "RECORD SUCCESFULLY UPDATED";
	}
	
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{emp_id}")
	public String deleteEmployee_(@PathParam("emp_id") int emp_id)
	{
		cd.deleteEmployee(emp_id);
		return "RECORD SUCCESFULLY DELETED";
	}
	
}
