package JavaCodes.StringQ;
import java.util.Scanner;
public class countOccOfVowACons {
    public static boolean checkVowCons(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
    public static void countVowelsACons(String str,int v,int c) {
        for (int i = 0; i < str.length(); i++) {
            if (checkVowCons(str.charAt(i))) {
                v++;
            } else {
                c++;
            }
        }
        System.out.println("Vowels: " + v + " and Consonants: " + c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.next();
        countVowelsACons(str,0,0);
    }
}
