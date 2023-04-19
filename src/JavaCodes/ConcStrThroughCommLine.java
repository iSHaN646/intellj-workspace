package JavaCodes;

import java.util.Scanner;

//wap to concatenate two strings string values will be given through command line
//        argument?
public class ConcStrThroughCommLine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two strings: ");
        String str1 = sc.next();
        String str2 = sc.next();
        String result= str1.concat(str2);
        System.out.println(result);
        System.out.println(str1);  // same result
        System.out.println(str2);  // same result
    }
}
