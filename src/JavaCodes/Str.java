// Diff bw string constant pool and heap area on 13 april
package JavaCodes;

import java.util.Scanner;

class Str {
    
    public static void main(String[] args) {
        
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        System.out.println("the no is: " + n);

    }
}

/*
String is a sequence of characters.
A string constant pool is a separate place in heap area where
all values of all strings which are defined in the program when we 
declare a string an object of string is created inside string 
constant pool, if we are creating object with new keyword it will
create object inside heap area, the main diff bw string constant 
pool and heap area is, heap area holds duplicate objects but
string constant pool does not allow duplicate.




*/