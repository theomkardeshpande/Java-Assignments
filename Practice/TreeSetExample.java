
import java.util.*;

public class TreeSetExample {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();
        LinkedList<Integer>list=new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Data:");
            int data=sc.nextInt();
            list.add(data);
        }
        Set set=new TreeSet(list);
        System.out.println("After Sorting:"+set);
        sc.close();
    }
}
