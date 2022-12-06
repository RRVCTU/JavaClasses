package class07;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        // 1. Print numbers from 1 to 100 in 1 line with space
        for (int i = 1; i <=100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Print numbers from 100 to 1
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3. Print even numbers between 20 to 1 (2 ways)
        // 1st way
        for (int i = 20; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // 2nd way
        for (int i = 20; i >= 1; i --) {
            System.out.print(i + " ");
            i -= 1;
        }
        System.out.println();

        // 4. Print odd numbers between 20 to 50 (2 ways)
        // 1st way
        for (int i = 20; i <= 50; i++) {
            if (i%2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // 2nd way
        for (int i = 21; i <= 50; i++) {
            System.out.print(i +" ");
            i+=1;
        }
        System.out.println();

        // 5. Prompt the user to ask the name 3 times and print "Good afternoon + name..."
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <3; i++) {
            System.out.print("Please enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Good afternoon " + name);
        }
        System.out.println();

        // 6. Declare a variable to store a price for a coffee. Ask the user to pay for a coffee. Keep asking to pay
        //    for coffee until the user enters the EXACT amount. If the user gives more than cofee price --> ask them
        //    to give less, if the user gives less money then ask to give more. Once user give the EXACT amount print
        //    "Please enjoy your coffee".

        double price = 3.50;
        double money = 0;

        while (money != price) {
            System.out.print("Please pay for your coffee (Price: 3.50): ");
            money = scanner.nextDouble();
            if (money > price) {
                System.out.println("Try again, and please pay less: ");
            } else {
                System.out.println("Try again, and please pay more: ");
            }
        }
        System.out.println("Please enjoy your coffee.");

    }
}
