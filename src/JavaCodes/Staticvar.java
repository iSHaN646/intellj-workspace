package JavaCodes;

//Static variables ,methods and blocks does not require any object,
//Static memory will be allocated at compile time, but in case of
//runtime memory allocation object concept will be applied object creation
//and non-static variables,methods and blocks will be the concept of
//runtime memory allocation, whenever my jvm will be activated non-static
//var,methods and blocks will be take part in runtime memory allocation.


public class Staticvar {
    static int b=20;

    public static void main(String[] args) {
        Staticvar t=new Staticvar();
        System.out.println(Staticvar.b);

    }
}
