package com.bayram.connection;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DbConnection {
	
	private static Logger logger=LogManager.getLogger();
	
	public static Connection getConnec() {
		
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			logger.warn("Driver bulunamadi");
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deneme?serverTimezone=Turkey", "root", "1234");
			logger.info("Mysql basarili bir sekilde acildi");
		} catch (SQLException e) {
			logger.error("Mysql baglanma hatasi");
		}

		return con;
	}
	
	
	
	
	public static void closeConnetion(Connection con) {
	
		if(con!=null) {
			try {
				con.close();
				logger.info("Mysql connection basarilya kapatildi");
			} catch (SQLException e) {
				logger.error("Mysql connection kapanma hatasi");
			}
		}
		
	} 

}
