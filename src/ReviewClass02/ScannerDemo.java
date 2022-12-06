package ReviewClass02;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        /*
         * nextLine is a special method that can capture spaces and enters as well
         * when we use any method like nextInt() or nextBoolean(), nextDouble() and after that if we use
         * nextLine() we need to discard that enter by using an extra nextLine() call
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Please Enter your name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println(name + " is " + age + " years old");
    }
}
