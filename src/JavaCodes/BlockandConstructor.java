/*
 When object is created, first blocks are called then constructors
are called. the blocks are called in up to down fashion.
 */
package JavaCodes;


public class BlockandConstructor {
    
    int a;
    BlockandConstructor(){
        a=10;
        System.out.println("constructor: " + a);
    }
    
    {
        System.out.println("in block3");
    }
    
        {
        System.out.println("in block2");
    }
        
    {
        System.out.println("in block1");
    }
    
    public static void main(String[] args) {
        
        BlockandConstructor t=new BlockandConstructor();
        
        
    }
}

/*
 Constructor in java:

Constructor in java is a terminology used to construct something in
our program. A constructor in java is a special method that is used
to initialize object.

BlockandConstructor(){
        a=10;
        System.out.println("constructor: " + a);
    }

The constructor is called when an object of class is created, it 
can be used to set initial values of object attributes(instance variables)


In java, a constructor is a block of codes similar to the method.
it is called when an object of the class is created, at the time
of calling the constructor memory for object is allocated in memory.
it is a special type of method which is used for initializing the
object variables, everytime an object is created using the new keyword
that time constructor calls.

Note: if we want to restrict any class from being creating objects
using new keyword, make the constructor of that class private.



 */
