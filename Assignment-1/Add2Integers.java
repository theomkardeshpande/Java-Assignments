package ClassFiles;

// Java Assignment-1 Q1
import java.util.Scanner;

public class Add2Integers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First Integer:");
            int first=sc.nextInt();
            System.out.println("Enter Second Integer:");
            int second=sc.nextInt();
            int result=first+second;
            System.out.println("Sum of Two Integers:"+result);
        }
    }   
}
