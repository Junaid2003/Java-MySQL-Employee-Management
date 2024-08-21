package com.jdbc.JDBC_Menu_Driven;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	String name;
    	int id;
    	EmployeeDaoIntrf dao=new EmployeeDaoImpl();
    	
        System.out.println( "Welcome to employee management application" );
        Scanner sc=new Scanner(System.in);
        
        do {
        	System.out.println("1. Add Employee\n"+
        						"2. Show All Employee\n"+
        						"3. Show Employee based on id\n"+
        						"4. Update the employee\n"+
        						"5. Delete the employee\n ");
        	
        	System.out.println("Enter the choice : ");
        	int choice=sc.nextInt();
        	
        	switch(choice){
        		case 1: 
        			Employee emp=new Employee();
        			
        			System.out.println("Enter ID: ");
        			id=sc.nextInt();
        			
        			System.out.println("Enter Name: ");
        			name=sc.next();
        			
        			System.out.println("Enter Salary: ");
        			double salary=sc.nextDouble();
        			
        			System.out.println("Enter Age: ");
        			int age=sc.nextInt();
        			
        			emp.setId(id);
        			emp.setName(name);
        			emp.setSalary(salary);
        			emp.setAge(age);
        			
        			dao.createEmployee(emp);
        			break;
        		case 2:
        			dao.showAllEmployee();
        			break;
        		case 3:
        			System.out.println("Enter id to show the details");
        			int empid=sc.nextInt();
        			dao.showEmployeeBasedOnId(empid);
        			break;
        		case 4:
        			System.out.println("Enter id to update the details");
        			int emp_id_1=sc.nextInt();
        			System.out.print("Enter the new name");
        			name=sc.next();
        			dao.updateEmployee(emp_id_1, name);
        			break;
        		case 5:
        			System.out.println("Enter the id to delete. ");
        			id=sc.nextInt();
        			dao.deleteEmployee(id);
        			break;
        		default:
        			System.out.println("Invalid Choice");
        	}
        }while(true); 
        
        
    }
}
