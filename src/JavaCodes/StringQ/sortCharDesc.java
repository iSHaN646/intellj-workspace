package JavaCodes.StringQ;

import java.util.Arrays;
import java.util.Scanner;

public class sortCharDesc {

    public static String sortCharInDesc(String str) {
        char[] ans = str.toCharArray();
        Arrays.sort(ans);
        String s = new String(ans);
        StringBuilder s1 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            s1.append(s.charAt(i));
        }
        return s1.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.next();
        String ans = sortCharInDesc(str);
        System.out.println(ans);
    }
}
