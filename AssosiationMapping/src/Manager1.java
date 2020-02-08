import org.hibernate.Session;

public class Manager1
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		Person p1 = new Person();
		s1.beginTransaction();
		p1.setId(67);
		p1.setFname("kilo");
		p1.setLname("meter");
		p1.setAge(77);
		
		Address a1 = new Address();
		a1.setHouseno(24);
		a1.setStreetname("pop");
		a1.setCity("kerala");
		a1.setPerson(p1);
		p1.setAddress(a1);
		
		s1.save(p1);
		
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
