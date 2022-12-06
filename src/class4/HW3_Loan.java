package class4;

import java.util.Scanner;

public class HW3_Loan {
    /*
    You are a loan specialist and you need to ask user what is the amount of loan is needed.
    If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What amount do you need: ");
        double loan = scan.nextDouble();

        if (loan <= 200000) {
            System.out.println("Loan is approved.");
        } else {
            System.out.println("Loan is rejected");
        }
    }
}
