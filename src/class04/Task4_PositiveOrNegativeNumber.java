package class04;

public class Task4_PositiveOrNegativeNumber {

    /*
    Write a program to check whether number is positive or negative
     */

    public static void main(String[] args) {
        int num = -1;

        if (num < 0) {
            System.out.println("The number is negative");
        } else if (num > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is zero");
        }
    }
}
