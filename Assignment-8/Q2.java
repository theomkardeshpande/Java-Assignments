package ClassFiles;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q2 {
    public static void main(String[] args) {

        Runnable a = () -> printEvenNumbers();
        Runnable b = () -> addition(10, 20);
        Runnable c = () -> reverseString("JavaProgramming");
        Runnable d = () -> displayCurrentDate();

        Thread first = new Thread(a);
        Thread second = new Thread(b);
        Thread third = new Thread(c);
        Thread fourth = new Thread(d);

        first.start();
        second.start();
        third.start();
        fourth.start();
    }

    private static void printEvenNumbers() {
        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void addition(int a, int b) {
        System.out.println("Addition Of Two Integers:" + (a + b));
    }

    private static void reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed String:" + sb.toString());
    }

    private static void displayCurrentDate() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formated = dateTime.format(formatter);
        System.out.println("\n Current Date And Time:" + formated);
    }

}
