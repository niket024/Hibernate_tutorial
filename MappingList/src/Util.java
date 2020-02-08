

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Util
{
private static SessionFactory sf;
static
{
	Configuration c1=new Configuration();
	c1.configure("hibernate.cfg.xml");
	ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
			c1.getProperties()).buildServiceRegistry();
	sf=c1.buildSessionFactory(sr);
	
}
public static Session getConnection()
{
	Session s1=sf.openSession();
	return s1;
}
}
