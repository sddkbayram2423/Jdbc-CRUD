package com.bayram.delete;

import java.sql.Connection;


import java.sql.PreparedStatement;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBProcesses {

	private static Logger logger = LogManager.getLogger();
	
	
	public static void ogrenciSil(int id) {

		String sorgu = "delete from ogrenci where ID=?";
		Connection con = DBConnection.getConnec();

		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = con.prepareStatement(sorgu);

			preparedStatement.setInt(1, id);
			

			preparedStatement.executeUpdate();

			logger.info("ogrenci basarý ile silindi");
		} catch (SQLException e) {
			logger.info("ogrenci silinirken hata olustu... HATA: " + e);
		} finally {
			DBConnection.closeConnetion(con, preparedStatement);

		}

	}

	
}
