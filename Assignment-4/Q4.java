package ClassFiles;

abstract class Shape{
    abstract void RectangleArea(double length,double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape{
    public void RectangleArea(double length,double breadth)
    {
        System.out.println("AREA OF RECTANGLE:"+(length*breadth));
    }

    public void SquareArea(double side)
    {
        System.out.println("AREA OF SQUARE:"+(side*side));
    }

    public void CircleArea(double radius)
    {
        System.out.println("AREA OF CIRCLE:"+(Math.PI*radius*radius));
    }
}

public class Q4{
    public static void main(String []args)
    {
        Area obj=new Area();
        obj.RectangleArea(8,10);
        obj.SquareArea(12);
        obj.CircleArea(14);
    }
}