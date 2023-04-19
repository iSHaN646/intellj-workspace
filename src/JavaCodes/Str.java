// Diff bw string constant pool and heap area on 13 april
package JavaCodes;

class Str {
    public static void main(String[] args) {
        String k = "abc";
        String p = "abc";
        String l = new String("abc");
        String o = new String("abc");

        if (l.equals(o)) {
            System.out.println("hi");
        } else {
            System.out.println("bye");
        }

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