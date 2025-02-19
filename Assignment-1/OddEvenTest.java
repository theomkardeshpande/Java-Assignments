package ClassFiles;

// Java Assignment-1 Q5

import java.util.Scanner;

public class OddEvenTest{

    public static boolean isOdd(int number)
    {
        if(number%2==0)
        {
            return false;
        }else{
            return true;
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int number=sc.nextInt();
        System.out.println(isOdd(number));
        sc.close();
    }
}