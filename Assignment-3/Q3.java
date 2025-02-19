package ClassFiles;

// implement this keyword

class Student{
    int student_roll;
    String student_name;
    String student_class;

    public Student(int roll,String name,String cls)
    {
        this.student_roll=roll;
        this.student_name=name;
        this.student_class=cls;
    }

    public void displayStudent()
    {
        System.out.println("Roll NO.:"+this.student_roll);
        System.out.println("Name:"+this.student_name);
        System.out.println("Class:"+this.student_class);
    }
}

public class Q3{
    public static void main(String[]args)
    {
        Student s1=new Student(101,"John Doe","FYMCA");
        s1.displayStudent();
    }
}