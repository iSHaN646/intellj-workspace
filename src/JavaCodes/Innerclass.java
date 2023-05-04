package JavaCodes;

public class Innerclass {

    void show() {
        System.out.println("in show");
    }

    static class Inner {

        void config() {
            System.out.println("in config");
        }
    }

    public static void main(String[] args) {

        Innerclass t = new Innerclass();
        t.show();
        // Innerclass.Inner t1 = t.new Inner(); // without static
        Inner t1 = new Inner();
        t1.config();
    }

}
