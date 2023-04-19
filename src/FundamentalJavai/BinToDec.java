package FundamentalJavai;

public class BinToDec {

    public static void main(String[] args) {
        String str="101";
        int ans=0,pv=1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                ans += pv;
            }
            pv*=2;
        }
        System.out.println(ans);
    }
}
