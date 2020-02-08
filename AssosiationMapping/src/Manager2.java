import org.hibernate.Session;

public class Manager2
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		Person p1 = (Person) s1.load(Person.class, 12);
		System.out.println(p1.getId());
		System.out.println(p1.getFname());
		System.out.println(p1.getLname());
		System.out.println(p1.getAge());
		System.out.println(p1.getAddress().getHouseno());
		System.out.println(p1.getAddress().getStreetname());
		System.out.println(p1.getAddress().getCity());
	}
}
