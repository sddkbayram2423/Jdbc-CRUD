package com.bayram.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DBProcesses {

	private static Logger logger;

	public static void createTable() {

		logger = LogManager.getLogger();
		Connection connection = DBConnection.getConnec();
		PreparedStatement preparedStatement = null;

		try {

			String sorgu = "Create table Ogrenci(ID int primary key,Ad varchar(30),Soyad varchar(30),Memleket varchar(30),Bolumu varChar(20))";
			preparedStatement = connection.prepareStatement(sorgu);

			preparedStatement.execute();
			logger.info("Ogrenci tablosu olusturma basarili");

		} catch (SQLException e) {
			logger.error("Ogrenci tablosu olusturma hayasi" + e);
		}

		DBConnection.closeConnetion(connection, preparedStatement);

	}

}
