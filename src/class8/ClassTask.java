package class8;

import java.util.Scanner;

public class ClassTask {

    public static void main(String[] args) {

        // 1. from the range of 1 to 50 please find the sum of all even and all odd numbers
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= 50; i++) {
            if ( i%2 == 0) {
                evenSum +=i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("The even numbers sum: "+evenSum);
        System.out.println("The odd numbers sum: "+oddSum);

        // 2. Create a secret number and let user guess the secret number once user guessed your secret number
        //    --> program says you won!
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;
        int number;

        do {
            System.out.print("Please enter the secret number: ");
            number = scanner.nextInt();
        } while (number != secretNumber);
        System.out.println("You entered the correct secret number, you won!");
    }
}