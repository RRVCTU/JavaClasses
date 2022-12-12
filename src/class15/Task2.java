package class15;

import java.util.Scanner;

public class Task2 {
    // Create a method that will take a number and prints whether the number is even or odd.

    void printEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();

        Task2 task = new Task2();
        task.printEvenOdd(number);
    }
}
