package JavaCodes.StringQ;

import java.util.Scanner;

public class concatTwoStrings {

    public static String concatStrings(String s1, String s2) {
        return s1.concat(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two strings: ");
        String s1=sc.next();
        String s2=sc.next();
        String ans = concatStrings(s1,s2);
        System.out.println(ans);
    }
}
