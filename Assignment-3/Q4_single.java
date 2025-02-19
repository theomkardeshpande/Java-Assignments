package ClassFiles;

// implement single,multilevel and hierarchical inheritance
// single implementation of inheritance

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


public class Q4_single{
    public static void main(String []args)
    {
        Dog dog=new Dog();
        dog.eat();
        dog.bark();
    }
}