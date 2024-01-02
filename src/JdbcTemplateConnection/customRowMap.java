package JdbcTemplateConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class customRowMap implements RowMapper<Table> {

	@Override
	public Table mapRow(ResultSet var1, int var2) throws SQLException {
		Table table=new Table();
		table.setTableId(var1.getInt(1));
		table.setTableName(var1.getString(2));
		return table;
	}

	

}
