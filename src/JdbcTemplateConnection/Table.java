package JdbcTemplateConnection;

public class Table {

	private Integer tableId;
	private String tableName;
	@Override
	public String toString() {
		return "Table [tableId=" + tableId + ", tableName=" + tableName + "]";
	}
	public Integer getTableId() {
		return tableId;
	}
	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
}
