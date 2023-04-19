package JavaCodes;

//Static memory allocation is early time memory phase or early memory
//allocation whereas non-static var is late memory allocation, we can
//use static content inside non-static but non-static content does not
//permitted inside static content.

public class NstaticInSt {

    int a=10;
    static int b=20;

    static void fun() {
//        System.out.println(a);   //error
        System.out.println(b);
    }

    public static void main(String[] args) {

    }
}
