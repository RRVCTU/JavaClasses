package class10;

public class HW {
    public static void main(String[] args) {
        // Create an array of integers and calculate the sum of all elements in an array

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;
        System.out.println("Sum of numbers in this array is: ");
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
        System.out.println("-----------------------------");

        sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
