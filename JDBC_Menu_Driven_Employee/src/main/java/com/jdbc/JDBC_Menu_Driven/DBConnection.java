package com.jdbc.JDBC_Menu_Driven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	static Connection con;
	public static Connection createDBConnection() {
		try{
			// Load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Get Connection
			String url="jdbc:mysql://localhost:3306/employeeDB";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url, username, password);
				 
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
