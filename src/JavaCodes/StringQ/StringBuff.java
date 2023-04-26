package JavaCodes.StringQ;

/* 
There are several adv of using StringBuffer over String class:
1. StringBuffers objects are mutable which means that you can modify
the content of object if it was created. String objects are 
immutable which means that you cannot change the content of string
once it was created.
2. Efficiency: StringBuffer objects are mutable  
because we can change or modify the content of object in same 
object.
 */

public class StringBuff {

    public static void main(String[] args) {
        String k="hello";
        // String j=k.concat(" World");
        // System.out.println(k);      // hello
        // System.out.println(j);      // hello world
        StringBuffer sb=new StringBuffer(k);
        sb.append(" hello");
        // sb.append(" world");
        String h=sb.toString();
        System.out.println(h);   // hello hello
        System.out.println(sb);  // hello hello
    }
    
}
