package JavaCodes.StringQ;
import java.util.Scanner;
public class checkAnagram {
    public static boolean checkStrAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] freq = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two strings: ");
        String str1=sc.next();
        String str2=sc.next();
        boolean ans=checkStrAnagram(str1,str2);
        if (ans) {
            System.out.println("strings are anagram");
        } else {
            System.out.println("strings are not anagram");
        }
    }
}
