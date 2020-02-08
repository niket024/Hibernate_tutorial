import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class Manager2
{
	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		Session session = sf.openSession();
		Person p1=(Person)session.load(Person.class, 12);
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println("done");
}
}