package JavaCodes.StringQ;

import java.util.Scanner;

public class countOccOfChar {

    public static int countOccChar(String str,char ch) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string and char to count: ");
        String str=sc.next();
        char ch=sc.next().charAt(0);
        int ans = countOccChar(str, ch);
        System.out.println(ans);
    }
}
