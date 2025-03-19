package GenericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DataBaseConnection extends BaseClass{
	
	@Test
	public void executeQuery(String url,String username, String password) {
		String query=null;
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement stat=connection.createStatement();
			ResultSet rs=stat.executeQuery(query);
			while(rs.next()) {
				rs.getInt(null);
				rs.getString(null);
				rs.getInt(null);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
