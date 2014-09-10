package com.dong.test;

import java.sql.Connection;
import com.dong.util.DBConnection;

public class MyTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		conn=  DBConnection.getConnection();
		
		if (conn != null ) {
			System.out.println("Yessssss");
			System.out.println(conn.toString());			
		} 
		else
			System.out.println("NOooooooo");

	}

}
