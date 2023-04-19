package JavaCodes.StringQ;
import java.util.Scanner;
public class remRepChar {
    public static String remRepeatedChar(String s) {
        StringBuilder ans = new StringBuilder();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            int count=1;
            for (int j = i + 1; j < str.length; j++) {
                if ((str[i] == str[j]) && str[i]!='0') {
                    count++;
                    str[j]='0';
                }
            }
            if ((count == 1) && str[i] != '0') {
                ans.append(str[i]);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.next();
        String ans=remRepeatedChar(str);
        System.out.println(ans);
    }
}
