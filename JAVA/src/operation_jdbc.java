import java.util.*;
import java.sql.*;

public class operation_jdbc extends jdbc {

    void insert() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student id:");
            int id = sc.nextInt();

            System.out.println("Enter student name:");
            String sname = sc.next();

            System.out.println("Enter student age:");
            int sage = sc.nextInt();


            String insertquery = "insert into Student values(?,?,?);";

            PreparedStatement pst = con.prepareStatement(insertquery);

            pst.setInt(1, id);
            pst.setString(2, sname);
            pst.setInt(3, sage);

            pst.executeUpdate();
            System.out.println("Values Inserteddd....");
        } catch (Exception e) {
            System.out.println("Values not inserted..");
        }
    }

    void delete() {
        try {
            int id = 9; // for integer values
            String delquery = "delete from Student where sid=" + id;

            //For String valuesuse this syntax(delete from table values where string= '"+string+"'";)
            //String cource="Bcom";
            //String delquery = "delete from student where cource='"+cource+"'";

            PreparedStatement pst1 = con.prepareStatement(delquery);

            pst1.executeUpdate();

            System.out.println("Data Deletedddd...");
        } catch (Exception e) {
            System.out.println("Data not deletedd.." + e);
        }
    }

    void view() {
        try {
            String viewquery = "select * from Student";

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(viewquery);

            while (rs.next()) {
                System.out.print(" " + rs.getInt(1));
                System.out.print(" " + rs.getString(2));
                System.out.print(" " + rs.getInt(3));
                System.out.println();

            }
            System.out.println("View function is working");
        } catch (Exception e) {
            System.out.println("");
        }
    }

    void update() {
        try {
            int id = 01; // for integer values
            String updquery = "update Student set cource='BBA' where sid=01";

            //For String values this syntax(delete from table values where string= '"+string+"'";)
            //String cource="BBA";
            //String updquery = "update from student set cource='Btech' where cource='"+cource+"'";

            PreparedStatement pst2 = con.prepareStatement(updquery);

            pst2.executeUpdate();

            System.out.println("Data Updateddd...");
        } catch (Exception e) {
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        operation_jdbc obj = new operation_jdbc();

        while (true) {
            System.out.println("\nPress 1 for Insert");
            System.out.println("Press 2 for Delete");
            System.out.println("Press 3 for View");
            System.out.println("Press 4 for Update");
            System.out.println("Press 5 for Exit");

            System.out.println("Enter your choice:");
            Scanner sc2 = new Scanner(System.in);
            int choice = sc2.nextInt();

            switch (choice) {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.view();
                    break;
                case 4:
                    obj.update();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }

        }
    }
}