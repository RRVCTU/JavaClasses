package class14;

import java.util.Scanner;

public class HW_04 {
    // Create a method that will say Hello in Different language based on the country
    // that will be passed when method is executed.

    static void printHello() {
        System.out.println("Choose the country: 1 - Russia, 2 - USA, 3 - Mexico. Enter the number of country( 1, 2, or 3): ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch(number) {
            case 1:
                System.out.println("Здравствуйте");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Hola");
                break;
            default:

        }
    }

    public static void main(String[] args) {
        printHello();
    }
}
