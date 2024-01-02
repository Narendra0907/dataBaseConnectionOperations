package DataSourseCurdOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataSourseCurdOperations {

	@Autowired
	private DataSource ds;

	public void getcon() throws SQLException {
		Connection connection = ds.getConnection();
		System.out.println(connection);
	}

	public void saveData() throws Exception {
		Connection connection = ds.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement(
				"INSERT INTO `datasourse`.`table1` (`tableid`, `tableName`) VALUES ('2', 'writeing');\r\n" + "");
		int executeUpdate = prepareStatement.executeUpdate();
		System.out.println(executeUpdate);
	}

	public void getById() throws SQLException {
		Connection connection = ds.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement("select * from table1 where tableid=1");
		ResultSet rs = prepareStatement.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "--" + rs.getString(2));
		}
		System.out.println(rs);
	}

	public void getAll() throws SQLException {
		Connection connection = ds.getConnection();
		PreparedStatement ps = connection.prepareStatement("select * from table1");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "==" + rs.getString(2));

		}
	}
}
