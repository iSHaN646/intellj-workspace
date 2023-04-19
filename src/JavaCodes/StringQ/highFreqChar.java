package JavaCodes.StringQ;
import java.util.Scanner;
public class highFreqChar {
    public static char highestFreqCh(String str) {
        int[] freq =new int[str.length()];
        char[] ans = str.toCharArray();
        for (int i = 0; i < ans.length; i++) {
            freq[i]=1;
            for (int j = i + 1; j < ans.length; j++) {
                if ((ans[i] == ans[j]) && ans[i]!='0') {
                    freq[i]++;
                    ans[j] = '0';
                }
            }
        }
        int max=Integer.MIN_VALUE;
        int index=-1,i;
        for ( i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                index=i;
                max = freq[i];
            }
        }
        return str.charAt(index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.next();
        char ch = highestFreqCh(str);
        System.out.println(ch);
    }
}
