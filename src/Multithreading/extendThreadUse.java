package Multithreading;

public class extendThreadUse extends Thread {
    // initiated run method for Thread
    public void run()
    {
        System.out.println("Thread Started Running...");
    }
    public static void main(String[] args)
    {
        extendThreadUse g1 = new extendThreadUse();

        // Invoking Thread using start() method
        g1.start();
    }
}
