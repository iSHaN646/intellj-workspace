package Queuesi;

import java.util.Stack;

public class QueueUsingTwoStacks {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public QueueUsingTwoStacks(){
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public int size(){
        return s1.size();
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }

    public int front(){
        if(s1.isEmpty()){
            return -1;
        }
        while(s1.size()!=1){
            s2.push(s1.pop());
        }
        int temp=s1.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return temp;
    }

    public void enqueue(int elem){
        s1.push(elem);
    }

    public int dequeue(){
        if(s1.isEmpty()){
            return -1;
        }
        while(s1.size()!=1){
            s2.push(s1.pop());
        }
        int temp=s1.peek();
        s1.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return temp;
    }

}
