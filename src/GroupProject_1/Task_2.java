package GroupProject_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        // Using Scanner create an array of countries and capitals. When an array is created for countries and capitals,
        // retrieve all values from it and while retrieving those values print capital for each country. (Use 2 different loops).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many countries you want to store:");
        int size = scanner.nextInt();
        String[] countires = new String[size];
        String[] capitals = new String[size];
        scanner.nextLine();

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the country name: ");
            countires[i] = scanner.nextLine();

            System.out.println("Please Enter the capital for " + countires[i]);
            capitals[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(countires));
        System.out.println(Arrays.toString(capitals));

        for(int i=0; i<size; i++) {
            System.out.println("The Country " + countires[i] + " has the capital " + capitals[i]);
        }
    }
}
