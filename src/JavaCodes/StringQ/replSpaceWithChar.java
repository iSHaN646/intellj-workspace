package JavaCodes.StringQ;

import java.util.Scanner;

public class replSpaceWithChar {

    public static String replSpToChar(String str, char ch) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                ans.append(ch);
            } else {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
//        return str.replace(' ',ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string and char to replace: ");
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        String ans = replSpToChar(str, ch);
        System.out.println(ans);
    }
}
