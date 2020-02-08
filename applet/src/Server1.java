import java.io.*;
import java.net.*;
class Server1
{
	public static void main(string args[])
	{
		ServerSocket ss = new ServerSocket(777);

		Socket s = ss.accept();
		
		System.out.println("Connection Established");


		Outputstream obj=s.getOutputStream();


		PrintStream ps = new Printfstream(obj);

		String str="hello client";

		ps.println(str);

		ps.println("Bye");

		ps.close();

		ss.close();

		s.close();
	
	}
}