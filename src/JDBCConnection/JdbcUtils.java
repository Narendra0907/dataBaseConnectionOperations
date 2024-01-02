package JDBCConnection;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class JdbcUtils {

	public  static void DataSourse() throws SQLException {
		BasicDataSource ds=new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/alldirections");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = ds.getConnection();
		System.out.println(connection);
		connection.close();
	}
	public static void main(String[] args) throws SQLException {
		DataSourse();
	}
}
