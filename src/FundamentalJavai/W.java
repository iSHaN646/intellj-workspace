package FundamentalJavai;


public class W {
    static int c=0;

    private W() {
        System.out.println("c= "+ c);
    }

    static W c() {
        return c++ <= 0 ? new W() : null;
    }

    public static void main(String[] args) {
        W w1 = c();
        System.out.println(w1);
    }

}
