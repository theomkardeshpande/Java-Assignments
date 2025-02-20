package ClassFiles;

class Monkey{
    public void jump()
    {
        System.out.println("Jumping");
    }
    public void bite()
    {
        System.out.println("Biting");
    }
}

interface Basic_animal{
    public void eat();
    public void sleep();
}

class Human extends Monkey implements Basic_animal
{
    public void eat()
    {
        System.out.println("Eating..!");
    }

    public void sleep()
    {
        System.out.println("Sleeping..!");
    }
}

public class Q2{
    public static void main(String []args)
    {
        Human john= new Human();
        john.jump();
        john.bite();
        john.eat();
        john.sleep();
    }
}