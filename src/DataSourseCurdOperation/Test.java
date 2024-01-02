package DataSourseCurdOperation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		DataSourseCurdOperations bean = context.getBean(DataSourseCurdOperations.class);
		bean. getcon() ;
	}
}
