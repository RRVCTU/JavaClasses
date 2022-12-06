/* Write a program that will ask user to input the current ime (use 24 hours format).
 * Based on the given time define:
 * - if hour is between  1-11 --> Morning
 * - if hour is between 12-15 --> Afternoon
 * - if hour is between 16-20 --> Evening
 * - if hour is between 21-24 --> Night
 */

package class5;

import java.util.Scanner;

public class HW1_24hours {

    public static void main(String[] args) {
        System.out.print("Please enter the current hour in 24 hours range without minutes): ");
        Scanner userInput = new Scanner(System.in);
        int hour = userInput.nextInt();

        if (hour > 0 && hour < 12) {
            System.out.println("Morning.");
        } else if (hour > 11 && hour < 16) {
            System.out.println("Afternoon");
        } else if (hour > 15 && hour < 21) {
            System.out.println("Evening");
        } else if (hour > 20 && hour < 25) {
            System.out.println("Night");
        } else {
            System.out.println("Enter the hour in range 1-24.");
        }
    }
}
