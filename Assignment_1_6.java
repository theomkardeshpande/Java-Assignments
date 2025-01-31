package ClassFiles;

// Java Assignment-1 Q6

import java.util.Scanner;

public class Assignment_1_6{

    public static int search(int arr[],int element)
    {
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                index=i;
            }
        }
        return index;
    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N integers:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Elements of Array["+(i+1)+"]:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Element To Search:");
        int element=sc.nextInt();
        System.out.println("Index of Element:"+search(arr,element));
        sc.close();
    }
}