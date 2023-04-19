package JavaCodes.StringQ;

import java.util.Scanner;

public class checkPalindrome {

    public static boolean checkPal(String str) {
        int i=0,j=str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.next();
        boolean ans = checkPal(str);
        System.out.println(ans);
    }
}
