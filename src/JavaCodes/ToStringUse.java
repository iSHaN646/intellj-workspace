package JavaCodes;


public class ToStringUse {

    public static void main(String[] args) {
        ToString e1 = new ToString(10, "ishan", "ambala");
        ToString e2 = new ToString(11, "vasu", "chandigarh");
        ToString[] e3 = new ToString[2];
        e3[0]=e1;
        e3[1]=e2;
        System.out.println(e3);
        System.out.println(e3[0]);
        System.out.println(e3[1]);
    }
}
