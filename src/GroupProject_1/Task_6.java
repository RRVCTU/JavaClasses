package GroupProject_1;

public class Task_6 {
    public static void main(String[] args) {
        // Write a program to swap 2 numbers without a temporary variable?
        int a = 12;
        int b = 24;
        System.out.println("Var 'a' before: " + a);
        System.out.println("Var 'b' before: " + b);

        a = (a + b);  // a = 12 + 24 = 36
        b = a - b;    // b = 36 - 24 = 12 - 1st swap
        a = a - b;    // a = 36 - 12 = 24 - 2st swap

        System.out.println("Var 'a' after swapping: " + a);
        System.out.println("Var 'b' after swapping: " + b);
    }
}
