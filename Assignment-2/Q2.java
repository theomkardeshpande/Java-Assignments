// 2. Write a recursive function to display  numbers  from 5 to 15

package ClassFiles;

public class Q2{

    public static void display(int n)
    {
        if(n>16)
        {
            return;
        }
        System.out.print(n+" ");
        display(n+1);
    }

    public static void main(String []args)
    {
        display(5);
    }
}