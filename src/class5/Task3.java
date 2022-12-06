/* Ask user to enter a number and then define if number is small, medium or large.
 * - Small number is value between 1 and 10
 * - Medium number is value between 11 and 100
 * - Large number is value between 101 and 1000
 */

package class5;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        System.out.print("Please enter the number in range 1-1000: ");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();

        if (number > 0 && number < 11) {
            System.out.println("Small number.");
        } else if (number > 10 && number < 101) {
            System.out.println("Medium number");
        } else if (number > 100 && number < 1001) {
            System.out.println("Large number");
        } else {
            System.out.println("Enter the number in the range 1-1000.");
        }
    }
}

