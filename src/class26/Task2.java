package class26;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        // Create an arrayList of drinks. If any drink has letter "a" or "e" replace it with water.

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Tea");
        drinks.add("Fresh Juice");
        drinks.add("Iced Tea");
        drinks.add("Soda");
        drinks.add("canned juice");
        drinks.add("Milk");
        drinks.add("Chocolate Milk");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")) {
                drinks.set(i, "Water");
            }
        }
        System.out.println(drinks);
    }
}
