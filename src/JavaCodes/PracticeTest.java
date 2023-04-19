package JavaCodes;

public class PracticeTest {

    private PracticeTest(){

    }

    void fun(){
        System.out.println("hello java");
    }

    public static PracticeTest getPracticeTestObject(){
        return new PracticeTest();
    }

//    public static void getfun(){     //getter function
//        PracticeTest t=new PracticeTest();
//        t.fun();
//    }
}
