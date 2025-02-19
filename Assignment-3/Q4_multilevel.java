package ClassFiles;

// implement single,multilevel and hierarchical inheritance
// multilevel implementation of inheritance

class Animal{
    void eat()
    {
        System.out.println("Animal is Eating..!");
    }
}

class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog is Barking");
    }
}

class Pitbull extends Dog{
    void display()
    {
        System.out.println("This is Pitbull..!");
    }
}


public class Q4_multilevel{
    public static void main(String []args)
    {
        Pitbull google=new Pitbull();
        google.eat();
        google.bark();
        google.display();
    }   
}