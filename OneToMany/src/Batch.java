import java.util.HashSet;
import java.util.Set;

public class Batch
{
	private String batchid;
	private String duration;
	private int fees;
	private Set<Student> students = new HashSet<Student>();

	public String getBatchid()
	{
		return batchid;
	}

	public void setBatchid(String batchid)
	{
		this.batchid = batchid;
	}

	public String getDuration()
	{
		return duration;
	}

	public void setDuration(String duration)
	{
		this.duration = duration;
	}

	public int getFees()
	{
		return fees;
	}

	public void setFees(int fees)
	{
		this.fees = fees;
	}

	public Set<Student> getStudents()
	{
		return students;
	}

	public void setStudents(Set<Student> students)
	{
		this.students = students;
	}

}
