package com.bayram.statement;

import java.sql.Connection;


import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class DBProcesses {
	
	private static Logger logger;
	
	
	public static void createTable() {
		
		logger=LogManager.getLogger();
		Connection connection=DbConnection.getConnec();
		Statement statement=null;
		
		
		try {
			statement=connection.createStatement();
			logger.info("Satement baþarýlý bir þekilde gerçekleþtirildi");
			
			String sorgu="Create table Öðrenci1(ID int primary key,Ad varchar(30),Soyad varchar(30),Memleket varchar(30),Bölümü varChar(20))";
			statement.execute(sorgu);
			logger.info("Tablo oluþturme baþarýlý");
	
		} catch (SQLException e) {
			logger.error("Tablo oluþturma hayasý"+e);
		}
		
		
		DbConnection.closeConnetion(connection,statement);


	}


}
