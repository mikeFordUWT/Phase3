package data;

import java.sql.*;

public class DBConnection {
	private Connection connect;
	private String serverURL = "";
	
	
	DBConnection(String dbURL){
		try{
			Class.forName(serverURL);
			connect = DriverManager.getConnection(dbURL);
			System.out.println("Connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}