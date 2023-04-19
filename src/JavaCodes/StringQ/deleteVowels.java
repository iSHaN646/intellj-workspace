package JavaCodes.StringQ;
import java.util.Scanner;
public class deleteVowels {
    public static boolean checkVowCons(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
    public static String remVowels(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (checkVowCons(str.charAt(i))) {
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
        String str=sc.next();
        String ans = remVowels(str);
        System.out.println(ans);
    }
}
