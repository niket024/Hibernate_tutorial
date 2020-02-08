public class Address
{
	private int id;
	private int houseno;
	private String streetname;
	private String city;
	private Person person;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getHouseno()
	{
		return houseno;
	}

	public void setHouseno(int houseno)
	{
		this.houseno = houseno;
	}

	public String getStreetname()
	{
		return streetname;
	}

	public void setStreetname(String streetname)
	{
		this.streetname = streetname;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public Person getPerson()
	{
		return person;
	}

	public void setPerson(Person person)
	{
		this.person = person;
	}

}
