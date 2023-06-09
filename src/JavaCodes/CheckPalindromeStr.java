package JavaCodes;
import java.util.Scanner;
public class CheckPalindromeStr {
    public static boolean isPalindrome(String str) {
        int i=0,j=str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome String");
        } else {
            System.out.println(str + " is not a Palindrome String");
        }
    }
}
