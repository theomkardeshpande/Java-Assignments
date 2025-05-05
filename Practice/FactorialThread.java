
import java.util.*;
import java.io.*;

public class FactorialThread{
    public static void main(String []args)
    {
        int no=5;
        Thread t1=new Thread(()->{
            try{
                int fact=1;
                for(int i=1;i<=no;i++)
                {
                    fact=fact*i;
                    Thread.sleep(1000);
                }
                System.out.println("Factorial of "+no+" is "+fact);
            }catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        });
        t1.start();
    }
}