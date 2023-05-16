package Multithreading;

public class implementRunnable implements Runnable {
    // method to start Thread
    public void run()
    {
        System.out.println(
                "Thread is Running Successfully");
    }

    public static void main(String[] args)
    {
        implementRunnable g1 = new implementRunnable();
        // initializing Thread Object
        Thread t1 = new Thread(g1);
        t1.start();
    }
}