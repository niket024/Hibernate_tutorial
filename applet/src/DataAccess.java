import java.sql.*;
class DataAccess
{
	Connection con;
	Statement st;
	ResultSet rs;
	
	public DataAccess()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:data");
			st=con.createStatement();
			rs=st.executeQuery("select id,name,city from cust");
		}
		catch(Exception e)
		{
		}
	}
	void displayData()
	{
		try
		{
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}
		catch(Exception e)
		{
		}
	}
	public static void main(String args[])
	{
		DataAccess data=new DataAccess();
		data.displayData();
	}
}
