package class25;

import java.util.ArrayList;

public class Class25Homework_3 {
    // Create an ArrayList of even numbers from 1 to 500. Remove any number that divisible by 5 from that ArrayList.
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 500; i+=2) {
            numbers.add(i);
        }
        System.out.println(numbers);

        for (int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i)%5 == 0) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
    }
}
