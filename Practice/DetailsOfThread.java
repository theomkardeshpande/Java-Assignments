
import java.io.*;

// class MyThread implements Runnable{

//     Thread t1;
//     public MyThread(String name)
//     {
//         t1=new Thread(this,name);
//         t1.start();
//     }
//     public void run()
//     {
//         System.out.println(t1);
//     }
// }

public class DetailsOfThread{
    public static void main(String []args) throws Exception
    {
        Thread obj=new Thread(()->{
            System.out.println(Thread.currentThread());
        });
        obj.start();
    }
}