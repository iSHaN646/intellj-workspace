package JavaCodes;

//if you are not creating any object of our class that time memory allocation
// will be done only for the static,so only static block or static var will
// be activated.
// but if you are creating object of class that time memory allocation
// will be done for non-static block,but first static then non static block will
//activate.




public class StaticBlock {

    {
        System.out.println("hello non static block");
    }
    static{
        System.out.println("hello static block");
    }

    public static void main(String[] args) {

    StaticBlock t=new StaticBlock();

    }
}
