package Classfiles;

public class Q2 {

    public static void average(int []arr)
    {
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        System.out.println("Average of Integer Array:"+(sum/(arr.length)));

    }

    public static void average(float []arr)
    {
        float sum=0;
        for(float i:arr)
        {
            sum+=i;
        }
        System.out.println("Average of Floating Array:"+(sum/(arr.length)));
    }

    public static void main(String[] args) {
        int integers[]={8,9,3};
        float floatting[]={8,8,9,10};
        int arr[]={3,5,6,9,8,3,6,2,5,4,8,9,6,54};

        average(integers);
        average(arr);
        average(floatting);

    }
}
