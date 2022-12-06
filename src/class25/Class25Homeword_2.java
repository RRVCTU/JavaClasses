package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class Class25Homeword_2 {
    // Create an ArrayList of drinks. If any drink has letter "a" or "e" replace it with water.
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("water");
        drinks.add("milk");
        drinks.add("tea");
        drinks.add("coke");
        drinks.add("coffee");
        drinks.add("whisky");
        System.out.println(drinks);

        Iterator<String> iterator = drinks.iterator();
        while (iterator.hasNext()) {
            String drink = iterator.next();
            if(drink.contains("a")||drink.contains("e")){
                drinks.set(drinks.indexOf(drink), "water");
            }
        }
        System.out.println(drinks);
    }
}
