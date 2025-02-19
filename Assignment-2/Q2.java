package ClassFiles;

// sum of Array

public class Q2 {

    static void sumOfArray(int arr[])
    {
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        System.out.print("Sum Of Array:"+sum);
    }

    public static void main(String[] args) {
        int arr[]={56,34,234,78,45};
        sumOfArray(arr);
    }
}
