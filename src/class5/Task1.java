package class5;
import java.util.Scanner;
public class Task1 {
    /*
     * Prompt the user to enter person heights in inches. Person should be classified as one of the following:
     * • short (under 60 inch)
     * • medium(between 60 -72 inch)
     * • tall (over 72 inch)
     */

    public static void main(String[] args) {

        System.out.print("Please enter person heights in inches: ");
        Scanner userInput = new Scanner(System.in);
        int heights = userInput.nextInt();

        if (heights < 60 && heights > 0) {
            System.out.println("Person is short.");
        }
        else if (heights >= 60 && heights <= 72) {
            System.out.println("Person is medium.");
        } else if (heights > 72) {
            System.out.println("Person is tall.");
        }
        else {
            System.out.println("Enter the valid height number.");
        }
    }

}
