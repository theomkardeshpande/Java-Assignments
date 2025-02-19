package ClassFiles;

import java.util.Date;

// Implement constructor, parameterized constructor and constructor overloading

class Employee {
    int empId;
    String empName;
    String empDepartment;

    public Employee()
    {
        this.empId=0;
        this.empName="";
        this.empDepartment="";
    }

    public Employee(int id, String name, String department) {
        this.empId=id;
        this.empName=name;
        this.empDepartment=department;
    }

    public Employee(String name, String department)
    {
        this.empName=name;
        this.empDepartment=department;
        this.empId=0;
    }

    public void displayEmployeeDetails()
    {
        System.out.println("Employee ID:"+this.empId);
        System.out.println("Employee NAME:"+this.empName);
        System.out.println("Employee DEPARTMENT:"+empDepartment);
    }
}

public class Q5 {

    public static void main(String[] args) {
        Employee e1=new Employee(101, "John Doe", "Devlopment");
        e1.displayEmployeeDetails();
    }
}
