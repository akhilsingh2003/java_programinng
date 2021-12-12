import java.sql.*;
public class jdbcdemo
{
    Connection con;
    jdbcdemo()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            String connectionURL="jdbc:mysql://localhost:3306/aaaa";
            con=DriverManager.getConnection(connectionURL,"root","");
            System.out.println("Connection Successs ");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from bbbb");
            while(rs.next())
                System.out.println(rs.getInt(1));
        con.close();
        }
        catch(Exception e)
        {
            System.out.println("Connection failed .."+e);
        }
    }
    public static void main(String args[])
    {
        jdbcdemo obj = new jdbcdemo();
    }
}
