package com.bayram.connection;

import java.sql.Connection;



public class AppConnectionTest {

	public static void main(String[] args) {
		Connection connection=DbConnection.getConnec();
		
		
		DbConnection.closeConnetion(connection);
	}

}
