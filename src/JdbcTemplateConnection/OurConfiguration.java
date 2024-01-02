package JdbcTemplateConnection;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan("JdbcTemplateConnection")
public class OurConfiguration {
	
	@Bean
	public DataSource getConnection() {
		
		BasicDataSource ds=new  BasicDataSource();
//		ds.setUrl("jdbc:mysql://localhost:/3306/");
//		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		ds.setUsername("root");
//		ds.setPassword("root");
		ds.setUrl("jdbc:mysql://localhost:3306/datasourse");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return ds;
	}
	@Bean
	public JdbcTemplate template() {
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(getConnection());
		return jt;
	}

}
