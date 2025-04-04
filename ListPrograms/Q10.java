package Classfiles;
// 10. Write a Java program to find the maximum and minimum value of an array.

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        int []arr={90,34,112,24,90,45};
        // Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Minimum:"+arr[0]);
        System.out.println("Maximum:"+arr[arr.length-1]);
    }    
}
