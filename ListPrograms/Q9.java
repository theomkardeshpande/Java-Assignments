package Classfiles;
import java.util.Scanner;

// 9. Write a program to accept product details like ProductName, ProductID, 
// weight and Price. Design Exception InvalidWeight if the weight entered is less than 1000 Kg.

class InvalidWeight extends Exception{

    public InvalidWeight(String message)
    {
        super(message);
    }
}

class Product{
    private String productName;
    private int productId;
    private int weight;
    private double price;

    Scanner sc=new Scanner(System.in);
    public void acceptProduct()
    {
        System.out.println("Enter Product Name:");
        this.productName=sc.nextLine();
        System.out.println("Enter Product ID:");
        this.productId=sc.nextInt();
        try {
            System.out.println("Enter Product Weight:");
            this.weight=sc.nextInt();
            if(weight<1000)
            {
                throw new InvalidWeight("Weight is Less than 1000 Kgs");
            }
        } catch (InvalidWeight e) {
            System.out.println("Exception::"+e.getMessage());
            while (weight<1000) {
                System.out.println("Enter Weight Again:");
                this.weight=sc.nextInt();
            }
        }
        System.out.println("Enter Product Price");
        this.price=sc.nextDouble();
    }

    public void printProductDetails()
    {
        System.out.println("=======Printing Product Details========");
        System.out.println("Product Name"+this.productName);
        System.out.println("Product ID:"+this.productId);
        System.out.println("Product Weight:"+this.weight);
        System.out.println("Product Price:"+this.price);
    }
}

public class Q9 {
    public static void main(String[] args) {
        Product obj=new Product();
        obj.acceptProduct();
        obj.printProductDetails();

    }    
}
