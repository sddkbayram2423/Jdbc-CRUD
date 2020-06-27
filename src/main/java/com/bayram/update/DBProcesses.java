package com.bayram.update;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBProcesses {

	private static Logger logger = LogManager.getLogger();

	public static void ogrenciGuncelle(Ogrenci ogrenci) {

		String sorgu = "update ogrenci set adi=?,soyadi=?,memleket=?,bolum=? where iD=?";
		Connection con = DBConnection.getConnec();

		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = con.prepareStatement(sorgu);

			preparedStatement.setInt(5, ogrenci.getId());
			preparedStatement.setString(1, ogrenci.getAd());
			preparedStatement.setString(2, ogrenci.getSoyad());
			preparedStatement.setString(3, ogrenci.getMemleket());
			preparedStatement.setString(4, ogrenci.getBolumu());

			preparedStatement.executeUpdate();

			logger.info("ogrenci basari ile guncellendi");
		} catch (SQLException e) {
			logger.info("ogrenci guncellenirken hata olustu... HATA: " + e);
		} finally {
			DBConnection.closeConnetion(con, preparedStatement);

		}

	}

}
