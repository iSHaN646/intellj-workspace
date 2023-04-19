package JavaCodes.StringQ;

import java.util.Scanner;

public class remBlankSpace {

    public static String remBlankSpaces(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.nextLine();
        String ans = remBlankSpaces(str);
        System.out.println(ans);
    }
}
