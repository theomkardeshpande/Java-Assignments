package ClassFiles;

import java.util.Stack;

class ThreadStack {
    private Stack<Integer> stack = new Stack<>();

    public synchronized void push(int data) {
        stack.push(data);
        System.out.println("Pushed:" + data);
        notify();
    }

    public synchronized void pop() throws InterruptedException {
        while (stack.isEmpty()) {
            wait();
        }
        int data = stack.pop();
        System.out.println("Poped:" + data);
    }
}

public class Q3 {
    public static void main(String[] args) {
        ThreadStack threadStack = new ThreadStack();
        Thread push = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    threadStack.push(i);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread pop = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    threadStack.pop();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        push.start();
        pop.start();
    }
}
