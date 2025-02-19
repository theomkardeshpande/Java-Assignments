package ClassFiles;

import java.util.Scanner;

// if array contains any specific values
public class Q3 {

    static boolean searchSpecificValue(int arr[],int value)
    {
        boolean flag=false;
        for(int i:arr)
        {
            if(i==value)
            {
                flag=true;
            }
            
        }
        return flag;
    }

    public static void main(String[] args) {
        int arr[]={56,34,234,78,45};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Specific Value:");
        int value=sc.nextInt();
        System.out.println("Specific Values Present:"+searchSpecificValue(arr, value));
    }
}
