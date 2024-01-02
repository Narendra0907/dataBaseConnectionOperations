package HibernateConnection;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetSessionObject {

	public  static Session getConnection() {
		AnnotationConfiguration config=new AnnotationConfiguration();
		config.configure();
		SessionFactory buildSessionFactory = config.buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		return openSession;
	}
	public static void main(String[] args) {
		Session connection = getConnection();
		Transaction beginTransaction = connection.beginTransaction();
		SQLQuery query=connection.createSQLQuery("INSERT INTO `datasourse`.`table1` (`tableid`, `tableName`) VALUES ('5', 'writeing')");
		int executeUpdate = query.executeUpdate();
		System.out.println(executeUpdate);
		beginTransaction.commit();
		connection.close();
		
	}
	
	
	
	
}
