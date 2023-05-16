package Multithreading;

public class mainThread {

    public static void main(String[] args) {

        Thread t=Thread.currentThread();
        System.out.println(t.getName());
    }
}
