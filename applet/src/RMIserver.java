//server program
import java.rmi.Naming;
import java.io.*;
public class RMIserver
{
	public RMIserver()
	{
		try
		{
			RMI r=new RMIimpl();
			Naming.rebind("rmi://localhost:1099/RMIservice",r);
			System.out.println("Ready");
		}
		catch(Exception e)
		{
			System.out.println("Trouble:"+e);
		}
	}
	public static void main(String args[])throws IOException
	{
		new RMIserver();
	}
}