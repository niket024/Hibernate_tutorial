//client program
import java.rmi.Naming;
import java.io.*;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
public class RMIclient
{
	public static void main(String[] args)throws IOException
	{
		try
		{
			RMI r = (RMI) Naming.lookup("rmi://localhost/RMIservice");
			Naming.lookup("rmi://localhost/RMIservice");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			double a,b,c,d,e;
			System.out.println("Enter the price of Ball:");
			a=Double.parseDouble(br.readLine());
			System.out.println("Enter the price of Cricket Bat:");
			b=Double.parseDouble(br.readLine());
			System.out.println("Enter the price of Hockey Stick:");
			c=Double.parseDouble(br.readLine());
			System.out.println("Enter the price of Racket:");
			d=Double.parseDouble(br.readLine());
			System.out.println("Enter the price of Shuttle Cock:");
			e=Double.parseDouble(br.readLine());
			System.out.println(r.amt(a,b,c,d,e));
		}
		catch(MalformedURLException mrule)
		{
			System.out.println();
			System.out.println("MalformedURLException");
			System.out.println(mrule);
		}
		catch(RemoteException re)
		{
			System.out.println();
			System.out.println("RemoteException");
			System.out.println(re);
		}
		catch(NotBoundException nbe)
		{
			System.out.println();
			System.out.println("NotBoundException");
			System.out.println(nbe);
		}
		catch(java.lang.ArithmeticException ae)
		{
			System.out.println();
			System.out.println("java.lang.ArithmeticException");
			System.out.println(ae);
		}
    	 }
}
