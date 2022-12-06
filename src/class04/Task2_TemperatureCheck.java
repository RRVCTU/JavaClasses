package class04;

public class Task2_TemperatureCheck {

    /*
    Create a Java program and name it Temperature Check.
    Create variable to store temperature. Your program should check if
    temperature is below 32 then it should print "Water will freeze with temperature",
    otherwise "Water will NOT freeze with temperature"
     */
    public static void main(String[] args) {

        int temperature = 19;

        if (temperature < 32) {
            System.out.println("Water will freeze with temperature " + temperature + ".");
        } else {
            System.out.println("Water will NOT freeze with temperature " + temperature + ".");
        }
    }
}
