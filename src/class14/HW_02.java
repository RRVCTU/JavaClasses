package class14;

public class HW_02 {

    // create a method that will take a number and prints whether the number is even or odd

    static void isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is Even");
        } else {
            System.out.println("The number " + number + " is Odd");
        }
    }

    public static void main(String[] args) {
        isEven(1);
        isEven(2);
        isEven(3);
        isEven(4);
        isEven(5);
        isEven(6);
    }
}
