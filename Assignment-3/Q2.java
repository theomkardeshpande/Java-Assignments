package ClassFiles;

// implement static variable and static method

public class Q2{

    static int count=0;
    static void methodCalled()
    {
        System.out.println("Method Called:"+count);
        count++;
    }

    public static void main(String[] args)
    {
        for(int i=0;i<5;i++)
        {
            methodCalled();
        }
    }
}