package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoClass {

	static PreparedStatement ps = null;
	static Connection con = null;

	public static void getConnection() throws Exception {
		try {
			Class.forName("");
			Connection con = DriverManager.getConnection("", "", "");
			PreparedStatement ps = con.prepareStatement("");
			int executeUpdate = ps.executeUpdate();
			System.out.println("One Row Inserted " + executeUpdate);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			ps.close();
			con.close();
		}

	}

	public static void main(String[] args) throws Exception {
		getConnection();
	}
}
