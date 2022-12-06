package class04;

import java.util.Scanner;

public class HW6_CreditCardOffer {

    /*
    Create a Java program that will ask if user has a credit card or not. If you user does not have a credit
    card then offer them. If they do have one ask what is balance on the card? If balance of the card is
    larger than 1000, tell them to pay immediately, otherwise you can tell them that they can spend more.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you have credit card (true or false): ");
        boolean creditCard = scan.nextBoolean();

        if (creditCard) {
            System.out.print("What is your balance on the card?: ");
            double balance = scan.nextDouble();
            if (balance > 1000) {
                System.out.println("Pay your balance immediately.");
            } else {
                System.out.println("You can spend more.");
            }

        } else {
            System.out.println("Credit card offer.");
        }
    }
}
