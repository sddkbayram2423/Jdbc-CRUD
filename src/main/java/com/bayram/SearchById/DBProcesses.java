package com.bayram.SearchById;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBProcesses {

	private static Logger logger = LogManager.getLogger();

	public static void ogrenciBul(int ogrenciId) {

		String sorgu = "select * from ogrenci where ID=?";
		Connection con = DBConnection.getConnec();

		PreparedStatement preparedStatement = null;
		ResultSet result=null; 

		try {
			preparedStatement = con.prepareStatement(sorgu);
			preparedStatement.setInt(1, ogrenciId);
			
			result=preparedStatement.executeQuery();
			
			while(result.next()) {
				
				System.out.println("\n\n"+result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4)+"\t"+result.getString(5)+"\n\n");
				
				
			}
			
	

			logger.info(ogrenciId+"' ogrenci baþarý ile gorüntülendi");
		} catch (SQLException e) {
			logger.info(ogrenciId+"'li ogrenci bulunamadý. HATA: " + e);
		} finally {
			DBConnection.closeConnetion(con, preparedStatement,result);

		}

	}


}
