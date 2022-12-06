package class4;

import java.util.Scanner;

public class HW4_DMWage {

    /*
    You are DMV representative and you need to ask customer their age. If they are 18 and older you will
    issue a driver licence to them, otherwise you will offer them to get a learners permit.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How old are you: ");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Driver licence will be issued.");
        } else {
            System.out.println("Learning permit will be issued.");
        }
    }
}
