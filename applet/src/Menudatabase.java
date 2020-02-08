import java.sql.*;
import java.io.*;
import javax.sql.*;

class MenuDatabase
{
    public static void main(String args[])
    {
        Connection con;
        Statement state;
        ResultSet rs;
        int ch;
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Driver Loaded");
            con=DriverManager.getConnection("jdbc:odbc:train");
            System.out.println("Statement object created");

            do
            {
                System.out.println("\n");
                System.out.println("Menu:");
                System.out.println("1.Insert Record into the Table");
                System.out.println("2.Update The Existing Record.");
                System.out.println("3.Display all the Records from the Table");
                System.out.println("4.Exit");
                System.out.println("Enter your choice: ");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                ch=Integer.parseInt(br.readLine());

                switch(ch)
                {
                    case 1:
                    System.out.println("Enter train Number: ");
                    int no=Integer.parseInt(br.readLine());
                    System.out.println("Enter train Name: ");
                    String name=br.readLine();
                    System.out.println("Enter seats: ");
                    int seats=Integer.parseInt(br.readLine());
                    String sql="insert into train values(?,?,?)";
                    PreparedStatement p=con.prepareStatement(sql);
                    p.setInt(1,no);
                    p.setString(2,name);
                    p.setInt(3,seats);
                    p.executeUpdate();
                    System.out.println("Record Added");
                    //p.close();
                    //con.close();
                    break;

                    case 2:
                    System.out.println("Enter train Number for the record you wish to Update: ");
                    no=Integer.parseInt(br.readLine());
                    System.out.println("Enter new Name: ");
                    name=br.readLine();
                    System.out.println("Enter new seats: ");
                    seats=Integer.parseInt(br.readLine());
                    sql="update train set Name=?, Seats=? where no=?";
                    p=con.prepareStatement(sql);
                    p.setInt(1,no);
                    p.setString(2,name);
                    p.setInt(3,seats);
                    p.executeUpdate();
                    System.out.println("Record Updated");
                    //p.close();
                    //con.close();
                    break;

                    case 3:
                    state=con.createStatement();
                    sql="select * from train";
                    rs=state.executeQuery(sql);
                    while(rs.next())
                    {
                        System.out.println("\n");
                        System.out.print("\t" +rs.getInt(1));
                        System.out.print("\t" +rs.getString(2));
                        System.out.print("\t" +rs.getInt(3));
                    }
                    break;

                    case 4:
                    System.exit(0);

                    default:
                    System.out.println("Invalid Choice");
                    break;
                }
            }while(ch!=4);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}



