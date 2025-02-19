package ClassFiles;

// implement single,multilevel and hierarchical inheritance
// Hierarchical implementation of inheritance

class Shape{
    String color;

    public Shape(String color)
    {
        this.color=color;
    }

    public String getColor()
    {
        return color;
    }

    public Double getArea()
    {
        return 0.0;
    }
}

class Circle extends Shape{
    double radius;

    public Circle(String color,Double r)
    {
        super(color);
        this.radius=r;
    }

    public Double getArea()
    {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;

    public Rectangle(String color,double l,double b)
    {
        super(color);
        this.length=l;
        this.breadth=b;
    }

    public Double getArea()
    {
        return length*breadth;
    }
}

public class Q4_hierarchical{
    public static void main(String []args)
    {
        Circle circle=new Circle("Red",7.5);
        Rectangle rectangle=new Rectangle("Blue",10,8);

        System.out.println("Circle Area:"+circle.getArea());
        System.out.println("Rectangle Area:"+rectangle.getArea());
    }
}