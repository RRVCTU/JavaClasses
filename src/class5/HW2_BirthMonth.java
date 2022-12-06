/* Write a program for user to enter his/hers birth month. Based on the month define the season.
 * Example:
 * - if user is born in March, April, May  -> season = "Spring".
 * - if user is born in June, July, August -> season = "Summer". etc...
 * At the end of the program we should see output as "You were born in season ______".
 */

package class5;

import java.util.Scanner;

public class HW2_BirthMonth {

    public static void main(String[] args) {
        System.out.println("Please enter the month of your birth (1,2,3, etc): ");
        Scanner userInput = new Scanner(System.in);
        int month = userInput.nextInt();

        if (month >= 3 && month <= 5) {
            System.out.println("Your were born in season Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Your were born in season Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Your were born in season Fall");
        } else if (month >= 0 && month <= 2 || month == 12) {
            System.out.println("Your were born in season Winter");
        } else {
            System.out.println("Enter the correct number for the month (in range 1-12).");
        }
    }
}
