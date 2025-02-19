package ClassFiles;

// Java Assignment-1 Q2

import java.util.Scanner;

public class SumProductMinMax3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Integer:");
        int first=sc.nextInt();
        System.out.println("Enter Second Integer:");
        int second=sc.nextInt();
        System.out.println("Enter Third Integer:");
        int third=sc.nextInt();

        int sum=first+second+third;
        int product=first*second*third;

        System.out.println("Sum of Three Integers:"+sum);
        System.out.println("Product of Three Integers:"+product);

        if(first>second && first>third)
        {
            System.out.println("First is Maximum");
            if(second>third)
            {
                System.out.println("Thrid is Minimum");
            }
            else{
                System.out.println("Second is Minimum");
            }
        }
        if(second>third && second>first)
        {
            System.out.println("Second is Maximum");
            if(first>third)
            {
                System.out.println("Thrid is Minimum");
            }else{
                System.out.println("First is Minimum");
            }
        }
        if(third>first && third>second)
        {
            System.out.println("Third is Maximum");
            if(first>second)
            {
                System.out.println("Second is Minimum");
            }else{
                System.out.println("First is Minimum");
            }
        }        
    }
}