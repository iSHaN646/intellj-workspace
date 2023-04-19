package JavaCodes;

import java.util.Scanner;

public class ReverseString {

    public static String revString(String str){
        StringBuilder ans = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = sc.nextLine();
        System.out.println("Reversed string is: " + revString(str));

    }
}
