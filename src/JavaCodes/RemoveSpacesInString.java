package JavaCodes;

import java.util.Scanner;

public class RemoveSpacesInString {
    public static String remSpacesInStr(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            } else {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = sc.nextLine();
        System.out.println(remSpacesInStr(str));

    }
}
