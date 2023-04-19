package JavaCodes.StringQ;

import java.util.Scanner;

public class sumOfIntegers {

    public static int sumOfdigits(String str) {
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum+= (str.charAt(i) -'0');
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.next();
        int ans=sumOfdigits(str);
        System.out.println(ans);
    }
}
