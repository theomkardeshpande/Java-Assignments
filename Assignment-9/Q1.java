// 1. Create a Java program where: 
// Thread A sends messages to Thread B. 
// Implement a Message class containing a sendMessage() and receiveMessage() method. 
// Use wait() and notify() for synchronization. 
// Display the message exchange with suitable messages for each step. 

package Classfiles;

class Message {
    private String messageString;
    private boolean emptyFull = true;

    public synchronized void sendMessage(String str) {
        while (!emptyFull) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        emptyFull = false;
        this.messageString = str;
        System.out.println("Message Sending..!");
        notifyAll();
    }

    public synchronized String receiveMessage() {
        while (emptyFull) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        emptyFull = true;
        System.out.println("Message Received:" + this.messageString);
        notifyAll();
        return messageString;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Message obj = new Message();
        Thread A = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                obj.sendMessage("Hello World...!");
            }
        });
        Thread B = new Thread(() -> {
            for (int i = 0; i < 10; i++) {

                obj.receiveMessage();
            }
        });
        B.setPriority(8);
        A.setPriority(10);
        B.start();
        A.start();
    }
}