package ClassFiles;

// Java Assignment-1 Q3

import java.util.Scanner;

public class Assignment_1_3{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Positive Integer:");
        int number=sc.nextInt();

        int no=number;
        int reverse=0;
        while(no>0)
        {
            reverse=reverse*10+no%10;
            no=no/10;
        }
        System.out.println("Reversed Number:"+reverse);
    }
}