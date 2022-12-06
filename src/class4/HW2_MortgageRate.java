package class4;

import java.util.Scanner;

public class HW2_MortgageRate {

    /*
    Create a Java program and store values of mortgage rate and mortgage price.
    First, program should check if rate is higher than 4.5. User will not buy a house, otherwise user will consider buying.
    Once user decides to buy a house, if price of the house is larger than 200,000 than user will take a loan,
    otherwise user will pay cash.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the mortgage rate: ");
        double rate = scan.nextDouble();

        if (rate < 4.5) {
            System.out.print("Please enter the mortgage price: ");
            int price = scan.nextInt();
            if (price > 200000) {
                System.out.println("Take a loan.");
            } else {
                System.out.println("Pay cash.");
            }

        } else {
            System.out.println("Do not buy a house.");
        }
    }
}
