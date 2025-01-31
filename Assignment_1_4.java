package ClassFiles;

//Java Assignment-1 Q4 

import java.util.Scanner;

public class Assignment_1_4{

    public static int exponent(int base,int exp)
    {
        if(exp==0)
        {
            return 1;
        }else{
            return(base*(exponent(base,exp-1)));
        }
    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base:");
        int base=sc.nextInt();
        System.out.println("Enter Exponent:");
        int exp=sc.nextInt();
        System.out.println("Result:"+exponent(base,exp));
        sc.close();
    }
}