package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	static String url = "jdbc:oracle:thin:@localhost:1521";
	static String user = "proj";
	static String pass = "proj";
	static Connection conn;
	
	public static Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
		} catch(Exception e ) {
			e.printStackTrace();
		}
		return conn;
	}
}
