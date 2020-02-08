// DataClient.java

import java.rmi.*;

public class DataClient
{
	public static void main(String args[])
	{
		try
		{
			String url="rmi://"+args[0]+"DataServer";
			DataServerIntf client = (DataServerIntf)Naming.lookup(url);
			String state=args[1];
			if(client.getArea(state)!=-1)
			{
				System.out.println("State:"+state);
				System.out.println("Capital:"+client.getCapital(state));
				System.out.println("Area:"+client.getArea(state)+"square km");
				System.out.println("Population:"+client.getPopulation(state));
			}
			else
			{
				System.out.println("The "+state+" is invalid state.");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e);
		}
	}
}