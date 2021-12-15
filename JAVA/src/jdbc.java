import java.sql.*;
public class jdbc
{
    Connection con;
    jdbc()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            String connectionURL="jdbc:mysql://localhost:3306/Jdbc";
            con=DriverManager.getConnection(connectionURL,"root","root");
            System.out.println("hogya connection ");
//            Statement stmt=con.createStatement();
//            ResultSet rs=stmt.executeQuery("select * from ak");
//            while(rs.next()) {
//                System.out.println("rollno : "+rs.getInt(1)+ " "+"Name :"+rs.getString(2)+" "+"ddd :"+rs.getInt(3));
//            }
//        con.close();
       }
        catch(Exception e)
        {
            System.out.println("Connection failed .."+e);
        }
    }
    public static void main(String args[])
    {
        jdbc obj = new jdbc();
    }
}
