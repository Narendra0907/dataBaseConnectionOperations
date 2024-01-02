package JdbcTemplateConnection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;



@Component
public class DAOClass {

	@Autowired
	private JdbcTemplate jt1q;
	
	public void saveData() {
		int update = jt1q.update("INSERT INTO `datasourse`.`table1` (`tableid`, `tableName`) VALUES ('3', 'writeing')");
	System.out.println(update);
	}
	public void getName() {
		String queryForObject = jt1q.queryForObject("SELECT tablename  FROM table1 where tableid=1;",String.class);
	System.out.println(queryForObject);
	}
	public void updateData() {
		int update = jt1q.update("update table1 set tablename='meeting' where tableid>1");
		System.out.println(update);
	}
	public void getRow() {
		Table t=jt1q.queryForObject("select * from table1 where tableid=1", new BeanPropertyRowMapper<Table>(Table.class));
	System.out.println(t);
	}
	public void getAllRows() {
		List<Table> q=jt1q.query("select * from table1 where tableid>1", new BeanPropertyRowMapper<Table>(Table.class));
	
		System.out.println(q);}
	public void getAllRows1() {
		
		List<Map<String, Object>> queryForList = jt1q.queryForList("select * from table1 where tableid>1");
	
		System.out.println(queryForList);
	}
	public void getAllDetails() {
		List<Map<String, Object>> list = jt1q.queryForList("select * from table1");
		ListIterator<Map<String, Object>> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			Map<String, Object> next = listIterator.next();
			Collection<Object> values = next.values();
			Set<String> keySet = next.keySet();
			System.out.println(keySet);
			// System.out.println(values);
		}

		// System.out.println(list);

	}
	public void getSingleRow() {
		Table queryForObject = jt1q.queryForObject("select * from table1 where tableid=1",new customRowMap());
		System.out.println(queryForObject);
	}
	public void getAllRow() {
		 List<Table> query = jt1q.query("select * from table1",new customRowMap());
		System.out.println(query);
	}
	public void batchUpdate() {
		String sqlQuery="insert into table1 values(?,?)";
		List<Object[]> list=new ArrayList<>(); 
		Object[] o1= {22,"kalyan"};
		Object[] o2= {23,"ramana"};
		Object[] o3= {24,"switch"};
		list.add(o1);
		list.add(o2);
		list.add(o3);
		int[] batchUpdate = jt1q.batchUpdate(sqlQuery, list);
		System.out.println(batchUpdate);
	}
}
