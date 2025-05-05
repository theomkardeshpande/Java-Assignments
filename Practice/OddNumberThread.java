
import java.io.*;

class MyThread implements Runnable{

    private int n;
    Thread t1;
    public MyThread(int n,String name)
    {
        this.n=n;
        t1=new Thread(this,name);
        t1.start();
    }
    public void run()
    {
        try{
            for(int i=1;i<=n;i++)
            {
                if(i%2!=0)
                {
                    System.out.print(i+" ");
                    Thread.sleep(1000);
                }
            }
        }catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

    }
}

public class OddNumberThread{
    public static void main(String []args)
    {
        MyThread obj=new MyThread(10,"New Thread");
        // Thread t1=new Thread(obj);
        // t1.start();
    }
}