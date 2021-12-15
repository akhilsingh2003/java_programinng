/*2.	Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes
have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number,
address and salary to an employee and a manager by making an object of both of these classes and print the same.
*/

class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary " + salary);
    }
}

class Employee extends Member {
    private String specialization;

    public Employee(String name, int age, String phoneNumber,
                    String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom", 25, "555-555-55", "Home", 25631.5, "IT");
        Manager manager = new Manager("Ron", 30, "555-617-55", "Earth", 69586.5, "IT");
        employee.printSalary();
        manager.printSalary();
    }
}