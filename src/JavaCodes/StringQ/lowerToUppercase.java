package JavaCodes.StringQ;

import java.util.Scanner;

public class lowerToUppercase {

    public static String lowerToUpper(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                ans.append((char)(str.charAt(i) -'a'+'A'));
            } else {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.next();
        String ans = lowerToUpper(str);
        System.out.println(ans);
    }
}
