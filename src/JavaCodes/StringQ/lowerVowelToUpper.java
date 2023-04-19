package JavaCodes.StringQ;
import java.util.Scanner;
public class lowerVowelToUpper {
    public static boolean checkLowerVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
    public static String lowerVowelCharToUpper(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (checkLowerVowel(str.charAt(i))) {
                ans.append((char) (str.charAt(i) - 'a' + 'A'));
            } else {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = sc.next();
        String ans = lowerVowelCharToUpper(str);
        System.out.println(ans);
    }
}
