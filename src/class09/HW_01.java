package class09;

public class HW_01 {
    // 1. Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
    public static void main(String[] args) {
        String[] cars = {"Toyota", "Honda", "BMW", "Tesla", "Audi", "Ford"};

        // 1st way to print using for loop.
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println(" ----------------------");
        // 2nd way to print using for-each (enhanced) loop
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
