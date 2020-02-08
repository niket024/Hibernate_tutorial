import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager
{

	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		Transaction tx = s1.beginTransaction();
		Car car1 = new Car();
		Car car2 = new Car();
		Person person = new Person();
		person.setName("Mishra");

		car1.setModel("Maruti");
		car1.setPrice(30000);
		car1.setOwner(person);
		car2.setModel("Hyundai");
		car2.setPrice(30000);
		car2.setOwner(person);
		Set<Car> list = new HashSet();
		list.add(car1);
		list.add(car2);
		person.setCarList(list);
		s1.save(person);
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("done");

	}

}