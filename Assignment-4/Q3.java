package ClassFiles;

abstract class Marks{
    abstract double getPercentage();
}

class A extends Marks{
    double m1,m2,m3;

    public A(double first,double second,double third)
    {
        this.m1=first;
        this.m2=second;
        this.m3=third;
    }

    public double getPercentage()
    {
        double percent=((this.m1+this.m2+this.m3)/300)*100;
        return percent;
    }
}

class B extends Marks{
    double m1,m2,m3,m4;

    public B(double first,double second,double third,double fourth)
    {
        this.m1=first;
        this.m2=second;
        this.m3=third;
        this.m4=fourth;
    }

    public double getPercentage()
    {
        double percent=((this.m1+this.m2+this.m3+this.m4)/400)*100;
        return percent;
    }
}

public class Q3{
    public static void main(String []args)
    {
        A first=new A(89,56,78);
        B second=new B(63,97,93,85);

        System.out.println("Percentage of A:"+first.getPercentage());
        System.out.println("Percentage of B:"+second.getPercentage());
    }
}