import java.util.*;

public class ReverseDisplay{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();

        List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Name:");
            String name=sc.next();
            list.add(name);
        }

        ListIterator<String> iterator=list.listIterator(n);
        System.out.println("Prititing in Reverse");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        sc.close();
    }
}