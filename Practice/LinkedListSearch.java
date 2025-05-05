
import java.util.*;


public class LinkedListSearch{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();
        
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Number:");
            int no=sc.nextInt();
            list.add(no);
        }

        System.out.println("Enter Number To Search:");
        int no=sc.nextInt();
        if(list.contains(no))
        {
            System.out.println("Number is Present");
        }else{
            System.out.println("Number is Not Present");
        }
        sc.close();
    }
}