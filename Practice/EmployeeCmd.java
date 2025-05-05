
import java.util.ArrayList;

public class EmployeeCmd{
    public static void main(String []args)
    {
        ArrayList<String>list=new ArrayList<>();

        for(int i=0;i<args.length;i++)
        {
            String str=args[i];
            list.add(str);
        }
        System.out.println(list);
    }
}