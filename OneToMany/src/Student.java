public class Student
{
	private String studentid;
	private String fname;
	private String lname;
	private int age;
	private Batch batches;

	public String getStudentid()
	{
		return studentid;
	}

	public void setStudentid(String studentid)
	{
		this.studentid = studentid;
	}

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		this.lname = lname;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public Batch getBatches()
	{
		return batches;
	}

	public void setBatches(Batch batches)
	{
		this.batches = batches;
	}

}
