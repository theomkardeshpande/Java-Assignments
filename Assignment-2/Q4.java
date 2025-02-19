package ClassFiles;

import java.util.Date;

// Implement Class Employee

class Employee {
    int empId;
    String empName;
    String empDepartment;

    public Employee(int id, String name, String department) {
        this.empId=id;
        this.empName=name;
        this.empDepartment=department;
    }

    public void displayEmployeeDetails()
    {
        System.out.println("Employee ID:"+this.empId);
        System.out.println("Employee NAME:"+this.empName);
        System.out.println("Employee DEPARTMENT:"+empDepartment);
    }
}

public class Q4 {

    public static void main(String[] args) {
        Employee e1=new Employee(101, "John Doe", "Devlopment");
        e1.displayEmployeeDetails();
    }
}
