package ClassFiles;

// implement method overriding

class Shape{

    double length,breadth;

    public Shape()
    {
        this.length=0;
        this.breadth=0;
    }

    public void area()
    {
        System.out.println("Shape Area Called..!");
    }
}

class Rectangle extends Shape{

    public Rectangle(double l,double b)
    {
        this.length=l;
        this.breadth=b;
    }

    public void area()
    {
        System.out.println("AREA OF RECTANGLE:"+(this.length*this.breadth));
    }
}


public class Q5{
    public static void main(String []args)
    {
        Rectangle obj=new Rectangle(5.6,10);
        obj.area();
    }
}