// 4. Write a recursive function to display sum of all numbers between 5 - 10.

package ClassFiles;

public class Q4{

    public static int display(int n)
    {
        if(n>=10 || n<=5)
        {
            return 0;
        }
        return (n+display(n+1));
    }

    public static void main(String []args)
    {
        System.out.print("::Sum of All Numbers Between 5-10::");
        System.out.print(display(6));
    }
}