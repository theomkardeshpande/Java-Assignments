// 5. Write a recursive function to sort list of 10 numbers in ascending order.

package ClassFiles;

public class Q5{

    public static void sortingList(int arr[],int n)
    {
        if(n==1)
        {
            return;
        }

        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        sortingList(arr,n-1);
    }

    public static void main(String []args)
    {
        int arr[]={45,12,86,88,13,17,90,24,77,44};
        System.out.println("Sorted Array:");
        sortingList(arr,arr.length);
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}