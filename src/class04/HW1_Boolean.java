package class04;

import java.util.Scanner;

public class HW1_Boolean {

    /*
    Write a program to store a boolean value of whether user has a diploma or not.
    If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree.
    Then if user has a degree, the program should check a gpa score. If GPA is higher or equals to 3.5
    output should say "You are eligible for scholarship", otherwise -> "You should have studied harder".
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Do you have a diploma (true or false): ");
        boolean diploma = scan.nextBoolean();

        if (diploma) {
            System.out.print("What is your GPA?: ");
            double gpa = scan.nextDouble();
            System.out.println("Congratulation.");
            if (gpa >= 3.5) {
                System.out.println("You are eligible for scholarship.");
            } else {
                System.out.println("You should have studied harder.");
            }
        } else {
            System.out.println("You should get a degree.");
        }
    }
}
