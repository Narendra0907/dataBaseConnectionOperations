package DataSourseCurdOperation;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("DataSourseCurdOperation")
public class ConfigurationClass {

	@Bean
	public DataSource dataSourseConnection() {
		
		BasicDataSource ds=new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/datasourse");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return ds;
	}
}
