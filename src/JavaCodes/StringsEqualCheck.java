package JavaCodes;

import java.util.Scanner;

public class StringsEqualCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter two strings: ");
        String str1 = sc.next();
        String str2 = sc.next();
        if (str1.equals(str2)) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }
    }
}
