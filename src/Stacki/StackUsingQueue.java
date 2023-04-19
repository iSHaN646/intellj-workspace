package Stacki;

import java.util.LinkedList;
import java.util.Queue;


public class StackUsingQueue {

    private Queue<Integer> q;

    public StackUsingQueue(){
        q=new LinkedList<>();
    }

    public void push(int elem){
        q.add(elem);
        int size=q.size()-1;
        while(size!=0) {
            q.add(q.peek());
            q.poll();
            size--;
        }
    }

    public int top(){
        if(q.isEmpty()){
            return -1;
        }
        return q.peek();
    }

    public int size(){
        return q.size();
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }

    public int pop(){
        if(q.isEmpty()){
            return -1;
        }
        int ans=q.peek();
        q.poll();
        return ans;
    }

}
