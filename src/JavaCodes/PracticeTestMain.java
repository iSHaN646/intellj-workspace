package JavaCodes;

public class PracticeTestMain {

    public static void main(String[] args) {
        PracticeTest t=PracticeTest.getPracticeTestObject();
        PracticeTest.getPracticeTestObject().fun(); //Function chaining
        t.fun();
    }
}
