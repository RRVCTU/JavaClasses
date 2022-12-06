package class4;

import java.util.Scanner;

public class InputFromKeyboard3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter your name: ");
        // takes a String type input from the keyboard and stores it in name variable
        String name = scanner.nextLine();
        System.out.print("Please Enter your age: ");
        // takes an int from the keyboard and stores it in age variable
        int age = scanner.nextInt();
        System.out.println("Hi " + name + ", you are " + age + " years old.");
    }
}