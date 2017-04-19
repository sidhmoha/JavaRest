package com.sidhant.client.RestClient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
	
	public static Connection getConnection(){
		Connection conn = null;
		String url = "jdbc:oracle:thin:192.168.0.16:1521:orcl";
	    try {   // loads drivers
	      Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
	    }
	    catch (Exception e) {
	      System.out.println("MR.UnitSitQueries.constructor.Exception: " + e);
	    }
	    try {
			conn = DriverManager.getConnection(url,"SCOTT","scott$123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	      return conn;
	}



	public static ResultSet getKillerTomato(){
		ResultSet rs =null;
		Statement stmt = null;
	    Connection conn =getConnection();
	    System.out.println("Inside DB Helper after Connection***********");
		String query = "Select * from Persons";
		try {
		 stmt = conn.createStatement();
		 rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}
	     return rs;
	      
	}

}
