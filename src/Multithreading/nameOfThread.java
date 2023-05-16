package Multithreading;

public class nameOfThread {
    public static void main(String args[])
    {
        // Thread object created
        // and initiated with data
        Thread t = new Thread("Hello");

        // Thread gets started
        t.start();

        // getting data of
        // Thread through String
        String s = t.getName();
        System.out.println(s);
    }
}
