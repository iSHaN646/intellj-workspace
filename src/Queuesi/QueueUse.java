package Queuesi;

import java.sql.SQLOutput;

public class QueueUse {
    public static void main(String[] args) {

        QueueUsingTwoStacks q= new QueueUsingTwoStacks();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
        System.out.println(q.isEmpty());
//        System.out.println(q.);
//        while (!q.isEmpty()){
//            System.out.println(q.front());
//            q.dequeue();
//        }
    }
}
