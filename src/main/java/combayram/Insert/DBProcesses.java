package combayram.Insert;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBProcesses {

	private static Logger logger = LogManager.getLogger();

	public static void ogrenciEkle(Ogrenci ogrenci) {

		String sorgu = "insert into ogrenci values(?,?,?,?,?)";

		Connection con = DBConnection.getConnec();

		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = con.prepareStatement(sorgu);
			preparedStatement.setInt(1, ogrenci.getId());
			preparedStatement.setString(2, ogrenci.getAd());
			preparedStatement.setString(3, ogrenci.getSoyad());
			preparedStatement.setString(4, ogrenci.getMemleket());
			preparedStatement.setString(5, ogrenci.getBolümü());

			preparedStatement.executeUpdate();
			logger.info("ogrenci baþarý ile eklendi");
		} catch (SQLException e) {
			logger.info("ogrenci ekleme hatasý: " + e);
		} finally {
			DBConnection.closeConnetion(con, preparedStatement);

		}

	}
}
