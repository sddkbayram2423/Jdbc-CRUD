package com.bayram.searchList;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBProcesses {

	private static Logger logger = LogManager.getLogger();
	
	
	
	public static List<Ogrenci> ogrenciListele(int ogrenciid){
		
		String sorgu = "select* from ogrenci where iD>?";
		Connection con = DBConnection.getConnec();

		PreparedStatement preparedStatement = null;
		List<Ogrenci> ogrenciler=new ArrayList<Ogrenci>();
		ResultSet result=null;
		try {
			preparedStatement = con.prepareStatement(sorgu);
			preparedStatement.setInt(1, ogrenciid);
			
			result=preparedStatement.executeQuery();
			
			while(result.next()) {
		
				ogrenciler.add(new Ogrenci(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5)));
				
			}
			

			logger.info(ogrenciid+"' ogrenci de sonraki ogrenciler baþari ile listeye eklendi");
		} catch (SQLException e) {
			logger.info("' ogrenci listeleme hatasi. HATA: " + e);
		} finally {
			DBConnection.closeConnetion(con, preparedStatement, result);
		

		}
	return ogrenciler;
	}
	
	
	
	
	

}
