// 2. Reader-Writer Problem Using wait(),notify(),and notifyAll()
// Implement the Reader-Writer Problem in Java,where:
// Multiple Reader threads can read simultaneously,but only one Writer thread can write at a time.
// Use wait(),notify(),and notifyAll()for synchronization.
// Display appropriate messages when reading or writing is happening.

package Classfiles;

class ReaderWriterLock {
    private int readers = 0;
    private boolean isWriting = false;

    public synchronized void startRead() throws InterruptedException {
        while (isWriting) {
            wait(); // wait if writier is writing
        }
        readers++;
        System.out.println(Thread.currentThread().getName() + " is Reading");
        System.out.println("(Readers:" + readers+")");
    }

    public synchronized void finishRead() {
        readers--;
        System.out.println(Thread.currentThread().getName() + " finished Reading");
        System.out.println("(Readers Left:" + readers+")");
        if (readers == 0) {
            notifyAll();
        }
    }

    public synchronized void startWrite() throws InterruptedException {
        while (readers > 0 || isWriting) {
            wait(); // wait if readers is reading or other writer is writing
        }
        isWriting = true;
        System.out.println(Thread.currentThread().getName() + " is Writing");
    }

    public synchronized void finshWrite() {
        isWriting = false;
        System.out.println(Thread.currentThread().getName() + " finished Writing");
        notifyAll();
    }
}

class Reader implements Runnable {
    private ReaderWriterLock rwLock;

    public Reader(ReaderWriterLock rwLock) {
        this.rwLock = rwLock;
    }

    public void run() {
        try {
            rwLock.startRead();
            Thread.sleep(1000);
            rwLock.finishRead();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Writer implements Runnable {
    private ReaderWriterLock rwLock;

    public Writer(ReaderWriterLock lock) {
        this.rwLock = lock;
    }

    public void run() {
        try {
            rwLock.startWrite();
            Thread.sleep(2000);
            rwLock.finshWrite();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        ReaderWriterLock rwLock = new ReaderWriterLock();

        Thread r1 = new Thread(new Reader(rwLock), "Reader 1");
        Thread r2 = new Thread(new Reader(rwLock), "Reader 2");
        Thread r3 = new Thread(new Reader(rwLock), "Reader 3");
        Thread w1 = new Thread(new Writer(rwLock), "Writer 1");
        Thread w2 = new Thread(new Writer(rwLock), "Writer 2");

        w2.start();
        r1.start();
        r2.start();
        w1.start();
        r3.start();
    }
}
