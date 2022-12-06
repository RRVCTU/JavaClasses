package class04;

import java.util.Scanner;

public class HW5_CityTemperature {

    /*
    Create a Java program that will ask user to input city and temperature. Your program should convert Fahrenheit
    into celsious and print "The temperature in the city is"
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input city: ");
        String city = scan.nextLine();
        System.out.print("Input temperature (in Fahrenheit): ");
        int fahrenheit = scan.nextInt();

        int celciousConvert = ((fahrenheit - 32)*5)/9;
        System.out.println("The temperature in the "+city+" is "+celciousConvert+".");
    }
}
