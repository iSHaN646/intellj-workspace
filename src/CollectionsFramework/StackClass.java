package CollectionsFramework;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();

        // Same as Vector

        // boolean empty() 
        // and isEmpty() does not work with stack
        System.out.println(s.empty());

        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s.pop());

        // int search(Object) returns the distance of the element from the top
        System.out.println(s.search(4));  //3

    
       
        
    }
    
}
