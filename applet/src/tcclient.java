import java.rmi.Naming;
import java.io.*;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
public class tcclient
{
	public static void main(String[] args)throws IOException
	{
	try
	{
		tc c = (tc) Naming.lookup("rmi://localhost/tcservice");
		Naming.lookup("rmi://localhost/tcservice");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double a,b;
System.out.println("Enter the fare");
a=Double.parseDouble(br.readLine());
System.out.println("Enter the no of seats");
b=Double.parseDouble(br.readLine());
		System.out.println(c.amt(a,b));
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

