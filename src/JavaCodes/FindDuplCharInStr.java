package JavaCodes;
import java.util.Scanner;
public class FindDuplCharInStr {
    public static void findDuplChar(String str) {
        System.out.print("Duplicate char are: ");
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.print(str.charAt(i)+" ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.nextLine();
        findDuplChar(str);
    }
}
