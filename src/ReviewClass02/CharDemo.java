package ReviewClass02;

import java.util.Scanner;

public class CharDemo {

    public static void main(String[] args) {

        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        System.out.println(c);
    }
}