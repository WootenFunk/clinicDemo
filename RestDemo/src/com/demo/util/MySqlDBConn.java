package com.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDBConn {

	private MySqlDBConn() {
		
	}
		
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	//
	public static Connection obtenerConexion(){	
		Connection cn=null;
		
		try {
			cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:8889/db_demo", 
					"root","root");

		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return cn;	
	}

}