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
		st1.setBatches(b1);

		Student st2 = new Student();
		st2.setStudentid("s112");
		st2.setFname("aaa");
		st2.setLname("ddd");
		st2.setAge(45);
		st2.setBatches(b1);

		Student st3 = new Student();
		st3.setStudentid("s113");
		st3.setFname("kkk");
		st3.setLname("llll");
		st3.setAge(33);
		st3.setBatches(b2);

		Student st4 = new Student();
		st4.setStudentid("s114");
		st4.setFname("sss");
		st4.setLname("rrrr");
		st4.setAge(44);
		st4.setBatches(b2);

		Set<Student> set1 = new HashSet<Student>();
		set1.add(st1);
		set1.add(st2);
		b1.setStudents(set1);
		Set<Student> set2 = new HashSet<Student>();
		set2.add(st3);
		set2.add(st4);
		b2.setStudents(set2);
		s1.save(b1);
		s1.save(b2);
		
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
