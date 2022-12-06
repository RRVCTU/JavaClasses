package class04;

import java.util.Scanner;

public class HW7_workExperience {

    /*
    Write a program to ask user to enter numbers of worked years and annual salary. If user worked for more or equals
    to 5 years than user is eligible for the bonus, otherwise he is not. Once user is eligible and salary is larger than
    50,000 than bonus = 5000, otherwise bonus = 3000.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of worked years: ");
        int years = scan.nextInt();
        System.out.print("Enter the annual salary: ");
        double salary = scan.nextDouble();

        if (years >= 5) {
            if (salary > 50000) {
                System.out.println("Bonus: $5,000.");
            } else {
                System.out.println("Bonus: $3,000.");
            }
        } else {
            System.out.println("Not eligible for bonus");
        }
    }

}
