package ClassFiles;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q1 {
    public static void main(String[] args) {
        Thread A = new Thread(() -> {
            for (int i = 10; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        });

        Thread B = new Thread(() -> addition(10, 20));
        Thread C = new Thread(() -> reverseString("JavaProgramming"));
        Thread D = new Thread(() -> displayCurrentDate());

        A.start();
        B.start();
        C.start();
        D.start();
    }

    private static void displayCurrentDate() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formated = dateTime.format(formatter);
        System.out.println("\n Current Date And Time:" + formated);
    }

    private static void reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed String:" + sb.toString());
    }

    private static void addition(int a, int b) {
        System.out.println("Addition Of Two Integers:" + (a + b));
    }
}