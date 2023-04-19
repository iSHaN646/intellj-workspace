package Queuesi;

import LinkedList.Node;

public class QueueUsingLL {

    Node front;
    Node rear;
    int size;

    public QueueUsingLL(){
        front=null;
        rear=null;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int front(){
        if(front==null){
            return -1;
        }
        return front.data;
    }

    public void enqueue(int elem){
        Node newnode=new Node(elem);
        if(front==null){
            front=newnode;
            rear=newnode;
        }else {
            rear.next=newnode;
            rear=newnode;
        }
        size++;
    }

    public int dequeue(){
        if(front==null){
            return -1;
        }
        int ans= front.data;
        front=front.next;
        size--;
        return ans;
    }
}
