package JavaCodes.StringQ;
import java.util.Scanner;
public class replFirstOccVowel {
    public static int getFirstOccOfVowel(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return i;
            }
        }
        return -1;
    }
    public static String replFirstVowel(String str) {
        int index = getFirstOccOfVowel(str);
        str = str.replaceFirst(str.charAt(index) + "", "-");
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.next();
        String ans = replFirstVowel(str);
        System.out.println(ans);
    }
}
