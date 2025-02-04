// 1. Write a recursive function to calculate factorial of given number.
package ClassFiles;

import java.util.Scanner;

public class Q1{

    public static int factorial(int number)
    {
        if(number==1 || number==0)
        {
            return 1;
        }
        return (number*factorial(number-1));
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number for Factorial:");
        int number=sc.nextInt();
        System.out.println("Factorial of "+number+" is "+factorial(number));
        sc.close();
    }
}