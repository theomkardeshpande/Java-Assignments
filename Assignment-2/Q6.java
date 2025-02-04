// 6. Write a recursive function to display first 10 terms of Fibonacci series 

package ClassFiles;

import java.util.Scanner;

public class Q6{

    static int fibonacci(int n)
    {
        if(n==1 || n==0)
        {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();
        System.out.println(":::Priting Fibonaccci Series:::");
        for(int i=0;i<n;i++)
        {
            System.out.print(fibonacci(i)+" ");
        }
        sc.close();
    }
}