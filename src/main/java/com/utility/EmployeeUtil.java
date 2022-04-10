package com.utility;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.entity.Employee;

public class EmployeeUtil {

	public static Employee rsToEmployee(ResultSet rs) throws SQLException
	{
		Employee employee=null;
		while(rs.next())
		{
			employee=new Employee();
			
			// employee object build from result set data
			employee.setEmployeeId(rs.getInt("employee_id"));
			employee.setEmployeeName(rs.getString("employee_name"));
			employee.setEmployeeEmail(rs.getString("employee_email"));
			employee.setEmployeePassword(rs.getString("employee_password"));
			employee.setEmployeeDesignation(rs.getString("employee_designation"));
			employee.setEmployeeType(rs.getInt("employee_type"));
			employee.setEmployeeGender(rs.getInt("employee_gender"));
			employee.setEmployeeStatus(rs.getInt("employee_status"));
		}
		return employee;
	}
}
