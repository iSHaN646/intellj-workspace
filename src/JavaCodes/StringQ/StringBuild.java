package JavaCodes.StringQ;

public class StringBuild {

    public static void main(String[] argv) throws Exception
    {
        // Create a StringBuilder object
        // using StringBuilder() constructor
        StringBuilder str = new StringBuilder();

        str.append("GFG");

        // print string
        System.out.println("String = " + str);

        // create a StringBuilder object
        // using StringBuilder(CharSequence) constructor
        StringBuilder str1
                = new StringBuilder("AAAABBBCCCC");

        // print string
        System.out.println("String1 = " + str1);

        // create a StringBuilder object
        // using StringBuilder(capacity) constructor
        StringBuilder str2 = new StringBuilder(10);

        // print string
        System.out.println("String2 capacity = "
                + str2.capacity());

        str2.append("123456789011232");

        System.out.println("str2: " + str2);

        // create a StringBuilder object
        // using StringBuilder(String) constructor
        StringBuilder str3
                = new StringBuilder(str1.toString());

        // print string
        System.out.println("String3 = " + str3);
    }
}
