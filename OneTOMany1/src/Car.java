public class Car
{
	private long id;
	private String model;
	private long price;
	private Person owner;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public long getPrice()
	{
		return price;
	}

	public void setPrice(long price)
	{
		this.price = price;
	}

	public Person getOwner()
	{
		return owner;
	}

	public void setOwner(Person owner)
	{
		this.owner = owner;
	}
}