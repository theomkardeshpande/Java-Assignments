
import java.util.Vector;

public class ExtensionJava {
    public static void main(String []args)
    {
        Vector<String>vector=new Vector<>();
        for(int i=0;i<args.length;i++)
        {
            vector.add(args[i]);
        }
        String str[]=new String[args.length];
        vector.copyInto(str);
        for(int i=0;i<str.length;i++)
        {
            if(str[i].endsWith(".java"))
            {
                System.out.println(str[i]);
            }
        }
    }
}
