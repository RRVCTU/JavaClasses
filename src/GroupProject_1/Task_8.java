package GroupProject_1;

public class Task_8 {
    public static void main(String[] args) {
        // Write a Java Program to print the first 10 numbers of Fibonacci series (
        // 0 1 1 2 3 5 8 13 21 34 55

        int firstNumber = 0;
        int secondNumber = 1;
        int fibNumber = 0;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        for (int i = 0; i < 8; i++) {
            fibNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibNumber;
            System.out.println(fibNumber);
        }
    }
}
