package GroupProject_1;

import java.util.Scanner;

public class Task_7 {

    // Write a java program to check whether a given number is prime or not?

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any integer number to check if it is prime or not:");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if (num > 1) {
            for (int i = 2; i < num/2; i++) {
                if (num%i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }

        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }
    }
}
