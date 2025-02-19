package ClassFiles;

// create abstract class pen with abstract methods

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class Trimax extends Pen{

    void write()
    {
        System.out.println("Writing From Trimax");
    }

    void refill()
    {
        System.out.println("Changing Refill of Trimax");
    }

    public void change_Nib()
    {
        System.out.println("Change Nib");
    }
}

public class Q6{
    public static void main(String []args)
    {
        Trimax obj=new Trimax();
        obj.write();
        obj.refill();
        obj.change_Nib();
    }
} 