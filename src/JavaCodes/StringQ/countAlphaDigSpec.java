package JavaCodes.StringQ;
import java.util.Scanner;

public class countAlphaDigSpec {
    public static void countAlphaDigSp(String str, int alpha, int dig, int spec) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                alpha++;
            } else if (ch >= '0' && ch <= '9') {
                dig++;
            } else {
                spec++;
            }
        }
        System.out.println("alphabets: " + alpha);
        System.out.println("digits: " + dig);
        System.out.println("special characters: " + spec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.next();
        countAlphaDigSp(str,0,0,0);
    }
}
