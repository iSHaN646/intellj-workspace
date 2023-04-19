package JavaCodes.StringQ;

import java.util.Arrays;
import java.util.Scanner;

public class sortCharAsc {

    public static String sortCharInAsc(String str) {
        char[] ans = str.toCharArray();
        Arrays.sort(ans);
        String s = new String(ans);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.next();
        String ans = sortCharInAsc(str);
        System.out.println(ans);
    }
}
