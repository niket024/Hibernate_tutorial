
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person
{
	private long id;
	private String name;
	private Set<Car> carList = new HashSet();


	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	
	public Set<Car> getCarList()
	{
		return carList;
	}

	public void setCarList(Set<Car> carList)
	{
		this.carList = carList;
	}

}