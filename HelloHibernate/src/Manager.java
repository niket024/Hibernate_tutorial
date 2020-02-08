import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class Manager
{
public static void main(String[] args)
{
	Configuration config = new Configuration();
	config.configure("hibernate.cfg.xml");
	ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
			config.getProperties()).buildServiceRegistry();
	SessionFactory sf = config.buildSessionFactory(sr);
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	Person p1=new Person();
	p1.setId(12);
	p1.setAge(23);
	p1.setName("abc");
	session.save(p1);
	tx.commit();
	session.flush();
	session.close();
	System.out.println("done");
}
}
