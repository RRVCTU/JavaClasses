package class12;

import java.util.Scanner;

public class Task2 {
    // Create a String and if the String is not empty perform the following:
    // if the String has an odd number of characters and has 3 or more charcters, print the character in the middle
    // of the String.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = scanner.nextLine();

        if (str.length() >= 3) {
            if (str.length() % 2 != 0) {
                int i = str.length() / 2;
                System.out.println(str.charAt(i));
            }
        }
    }
}
