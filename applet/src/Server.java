import java.net.*;
import java.io.*;  
import java.sql.*;

class Server 
{
	public static void main(String args[]) throws IOException 
	{
		ServerSocket n1=null; 
		try 
		{
			n1=new ServerSocket(98);
		}
		catch(IOException e) 
		{
			System.err.println("Port 98 could not be found"); 
			System.exit(1); 
		}
		Socket c=null; 
		try 
		{
			c=n1.accept(); 
			System.out.println("Connection from "+c); 
		}
		catch(IOException e) 
		{
			System.out.println("Accept failed"); 
			System.exit(1); 
		}
		PrintWriter out=new PrintWriter(c.getOutputStream(),true); 
		BufferedReader in=new BufferedReader(new InputStreamReader(c.getInputStream())); 
		String n; 
		BufferedReader sin=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Ready to send data now");
	try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:acc");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp");
			System.out.println("The record from employee table is :");
			while(rs.next())
			{
				int no=rs.getInt(1);
				String name=rs.getString("ename");
				float sal=rs.getInt(3);
				out.println("Employee no :"+no);
				out.println("Employee name :"+name);
				out.println("Employee salary :"+sal);
				out.println("-------------------------------------------------");
			}
				stmt.close();
		con.close();		

		}
		catch(Exception e)
		{

		}
		out.close(); 
		c.close(); 
		n1.close(); 
	}
}