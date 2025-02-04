// 3. Write a recursive function to display  numbers  from 15 to 5

package ClassFiles;

public class Q3{

    public static void display(int n)
    {
        if(n<5)
        {
            return;
        }
        System.out.print(n+" ");
        display(n-1);
    }

    public static void main(String[]args)
    {
        display(15);
    }
}