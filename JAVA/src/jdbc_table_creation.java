import java.sql.*;
public class jdbc_table_creation {
        Connection con;
        String connectionURL="jdbc:mysql://localhost:3306/Jdbc";
        jdbc_table_creation()
        {

            try(Connection conn = DriverManager.getConnection(connectionURL, "root", "root");
                Statement s = conn.createStatement();)
            {
                String createTable = "CREATE TABLE college " +
                        "(RollNo INTEGER not NULL, " +
                        " Name VARCHAR(255), " +
                        " Age INTEGER, " +
                        " PRIMARY KEY ( RollNo ))";

                s.executeUpdate(createTable);
                System.out.println("Created table in given database...");
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        public static void main(String args[])
        {
            jdbc_table_creation obj = new jdbc_table_creation();
        }
    }

