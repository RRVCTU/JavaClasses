package class12;

import java.util.Arrays;

public class Task3 {
    // Create a String and print it in reverse order (Sunday -> yadnuS)
    public static void main(String[] args) {
        String str = "Sunday";

        // first way, using for loop
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();
        // second way using StringBuffer
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println(reverse);


    }
}
