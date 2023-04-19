package JavaCodes.StringQ;

import java.util.Scanner;

public class checkVowelConso {

    public static boolean checkVowCons(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter char to check: ");
        char ch=sc.next().charAt(0);
        boolean ans = checkVowCons(ch);
        if (ans) {
            System.out.println(ch + "  is a vowel");
        } else {
            System.out.println(ch + " is consonant");
        }
    }
}
