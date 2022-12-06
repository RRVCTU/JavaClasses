package class9;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] drinks = {"fanta", "milk", "juice", "lemonade", "water", "dr pepper"};
        System.out.println(drinks[2]);  // prints juice

        // how many elements inside my array?
        int size = drinks.length;
        System.out.println("Size of array = " + size);
    }
}
