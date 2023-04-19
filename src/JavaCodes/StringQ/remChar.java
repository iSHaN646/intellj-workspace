package JavaCodes.StringQ;

import java.util.Scanner;

public class remChar {

    public static String remGivenChar(String str, char ch) {
        StringBuilder ans=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                continue;
            } else {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string and char to remove: ");
        String str=sc.next();
        char ch=sc.next().charAt(0);
        String ans = remGivenChar(str, ch);
        System.out.println(ans);
    }
}
