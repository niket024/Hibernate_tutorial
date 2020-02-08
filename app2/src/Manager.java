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
		config.configure("config.cfg.xml");
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Employee e1 = new Employee();
		e1.setId(325);
		e1.setFname("jkkkk");
		e1.setLname("ljjkjkl");
		e1.setAge(89);
		e1.setSalary(7896);
		session.save(e1);
		Person p1 = new Person();
		p1.setId(509);
		p1.setName("hkjfhd");
		session.save(p1);
		tx.commit();
		session.flush();
		session.clear();
		System.out.println("done");

	}
}
