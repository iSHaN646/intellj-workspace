package Queuesi;

public class QueueUsingArr {

    private int arr[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArr(){
        arr=new int[10];
        front=-1;
        rear=-1;
        size=0;
    }
    public QueueUsingArr(int capacity){
        arr=new int[capacity];
        front=-1;
        rear=-1;
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public int front(){
        if(front==-1){
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int elem){
        if(size==arr.length){
            return;
        }
        if(front==-1){
            front++;
        }
        rear++;
        if(rear==arr.length){
            rear=0;
        }
        arr[rear]=elem;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int ans=arr[front];
        front++;
        if(front==arr.length){
            front=0;
        }
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return ans;
    }
}
