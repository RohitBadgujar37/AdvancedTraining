package com.mycompany.dbutil;
/*  dbUtil - Database connection classes, useful for jdbc connection*/
import java.sql.*;

public class DBUtil {

    static Connection conn=null;
	public static Connection getMyConnection() {
		try{  
			//step1 load the driver class  
			Class.forName("com.mysql.cj.jdbc.Driver");  //com.mysql.jdbc.driver //com.mysql.cj.jdbc.Driver  //oracle.jdbc.driver.OracleDriver
			 
			//step2 create  the connection object 
			 
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mphasis","root","Rohit@123");  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		return conn;
		
		}
	// step3 close the connection.
	public static void closeConnection(Connection conn)
	{
	try {
		conn.close();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}

}
