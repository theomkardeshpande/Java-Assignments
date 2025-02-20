package ClassFiles;

interface Half{
    public void calculateHalf(double number);
}

class CalHalf implements Half{
    public void calculateHalf(double number)
    {
        System.out.println("HALF Of "+((int)number)+" is "+(number/2));
    }
}

public class Q5{
    public static void main(String []args)
    {
        CalHalf obj=new CalHalf();
        obj.calculateHalf(315);
    }
} 