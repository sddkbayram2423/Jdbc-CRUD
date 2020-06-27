package com.bayram.BatchInsert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class DBProcesses {
	
	private static Logger logger=LogManager.getLogger();
	
	public static void ogrenciListEkle(List<Ogrenci> ogrenciler) {
		
		
		String sorgu="insert into ogrenci values(?,?,?,?,?)";
	
		Connection con=DBConnection.getConnec();
		
		PreparedStatement preparedStatement=null;
		
		try {
			preparedStatement=con.prepareStatement(sorgu);
			
			
			for(Ogrenci ogrenci:ogrenciler) {
			preparedStatement.setInt(1, ogrenci.getId());
			preparedStatement.setString(2, ogrenci.getAd());
			preparedStatement.setString(3, ogrenci.getSoyad());
			preparedStatement.setString(4, ogrenci.getMemleket());
			preparedStatement.setString(5, ogrenci.getBolumu());
			
			preparedStatement.addBatch();
			}
			preparedStatement.executeBatch(); 
			
			/*
			for(Ogrenci ogrenci:ogrenciler)  {
			preparedStatement=con.prepareStatement(sorgu);
			preparedStatement.setInt(1, ogrenci.getId());
			preparedStatement.setString(2, ogrenci.getAd());
			preparedStatement.setString(3, ogrenci.getSoyad());
			preparedStatement.setString(4, ogrenci.getMemleket());
			preparedStatement.setString(5, ogrenci.getBolumu());
			
			preparedStatement.executeUpdate();
			}
			*/
		
			logger.info("ogrenciler baþarý ile eklendi");
		} catch (SQLException e) {
			logger.info("ogrenciler eklenirken hata oluþtu... HATA: "+e);
		}
		finally {
			DBConnection.closeConnetion(con, preparedStatement);
			
		}
		
	
	}
		
}
	
	
	
	
	
	


