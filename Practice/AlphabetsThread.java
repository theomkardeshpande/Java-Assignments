
import java.io.*;

public class AlphabetsThread{
    public static void main(String []args)
    {
        Thread t1=new Thread(()->{
            
            try{

                for(char ch='A';ch<='Z';ch++)
                {
                    System.out.print(ch+" ");
                    Thread.sleep(2000);
                }
            }catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        });
        t1.start();
    }
}