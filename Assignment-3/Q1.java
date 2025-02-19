package ClassFiles;

// implement method overloading
public class Q1{

    static int addition(int a,int b)
    {
        return a+b;
    }

    static Double addition(Double a,Double b)
    {
        return a+b;
    }

    static int addition(int a,int b,int c)
    {
        return(a+b+c);
    }

    public static void main(String []args)
    {
        System.out.println("Addition of Integers:"+ addition(10,20));
        System.out.println("Addition of Double:"+ addition(4.54,5.66));
        System.out.println("Addition of Three Integers:"+addition(10,20,30));
    }
}