package JavaCodes.StringQ;
import java.util.Scanner;
public class printNRepChar {
    public static void printNrepCh(String s) {
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            int count=1;
            for (int j = i + 1; j < str.length; j++) {
                if ((str[i] == str[j]) && str[i]!='0') {
                    count++;
                    str[j]='0';
                }
            }
            if ((count == 1) && str[i]!='0' ) {
                System.out.print(str[i]+ " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.next();
        printNrepCh(str);

    }
}
