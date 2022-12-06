package class6;
import java.util.Scanner;
public class EnhancedCodeTask1 {

    public static void main(String[] args) {

        String season;

        System.out.print("Enter, the month of your birth (january, february, etc): ");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

        if (month.equals("december") || month.equals("january") || month.equals("february")) {
            season = "Winter";
        } else if (month.equals("march") || month.equals("april") || month.equals("may")) {
            season = "Spring";
        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            season = "Summer";
        } else if (month.equals("september") || month.equals("october") || month.equals("november")) {
            season = "Fall";
        } else {
            season = "Enter the proper month name.";
        }

        System.out.println("You were born in season "+season);
    }
}
