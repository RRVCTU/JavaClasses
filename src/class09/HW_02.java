package class09;

public class HW_02 {
    // 2. Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Tiger", "Bear", "Lion", "Deer"};

        // 1st way to print using for loop.
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        System.out.println("-----------------------");
        // 2nd way to print using for-each (enhanced) loop
        for (String car : animals) {
            System.out.println(car);
        }
    }
}
