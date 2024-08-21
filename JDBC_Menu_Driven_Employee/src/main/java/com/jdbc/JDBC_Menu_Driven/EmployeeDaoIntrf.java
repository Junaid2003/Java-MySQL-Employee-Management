package com.jdbc.JDBC_Menu_Driven;

public interface EmployeeDaoIntrf {

	// Create employee
	public void createEmployee(Employee emp);
	
	// Show all employee
	public void showAllEmployee();
	
	// Show employee based on id
	public void showEmployeeBasedOnId(int emp_id);
	
	// Update employee
	public void updateEmployee(int id, String name);
	
	//delete employee
	public void deleteEmployee(int id);

}
