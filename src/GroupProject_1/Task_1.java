package GroupProject_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        // Using Scanner ask the user about the size of the array, create an array of that size.
        // After the array is created, fill the array with numbers, ask the numbers from the user
        // through console.
        // Calculate the sum of all stored elements in that array.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Please enter the " + (i + 1) + " element of the array: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println();

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("The sum of all elements in array are: " + sum);
    }
}
