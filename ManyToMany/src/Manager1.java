import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		Transaction tx = s1.beginTransaction();
		Batch b1 = new Batch();
		b1.setBatchid("b100");
		b1.setDuration("4 months");
		b1.setFees(10000);

		Batch b2 = new Batch();
		b2.setBatchid("b101");
		b2.setDuration("6 months");
		b2.setFees(15000);

		Student st1 = new Student();
		st1.setStudentid("s111");
		st1.setFname("abc");
		st1.setLname("cb");
		st1.setAge(23);

		Student st2 = new Student();
		st2.setStudentid("s112");
		st2.setFname("aaa");
		st2.setLname("ddd");
		st2.setAge(45);

		Student st3 = new Student();
		st3.setStudentid("s113");
		st3.setFname("kkk");
		st3.setLname("llll");
		st3.setAge(33);

		Student st4 = new Student();
		st4.setStudentid("s114");
		st4.setFname("sss");
		st4.setLname("rrrr");
		st4.setAge(44);

		b1.addStudent(st1);
		b1.addStudent(st2);
		b1.addStudent(st3);
		b1.addStudent(st4);
	
		b2.addStudent(st1);
		b2.addStudent(st2);
		b2.addStudent(st3);
		b2.addStudent(st4);
		s1.save(b1);
		s1.save(b2);
		s1.save(st1);
		s1.save(st2);
		s1.save(st3);
		s1.save(st4);
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
