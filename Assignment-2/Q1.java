// write java program to sort numeric array and string array
package ClassFiles;

public class Q1 {

    static void sort_numberic(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        System.out.println("Priting Sorted Array::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    static void sort_array(String []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    String swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
            }
        }

        System.out.println("Priting Sorted String Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String []args)
    {
        int numeric[]={87,34,123,56,23};
        String arr[]={"Python","Java","DSA","Statistic","Software Engineering"};
        sort_array(arr);
        System.out.println();
        sort_numberic(numeric);

    }
}