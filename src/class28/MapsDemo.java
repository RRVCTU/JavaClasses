package class28;

import java.util.HashMap;
import java.util.Iterator;

public class MapsDemo {
    public static void main(String[] args) {

        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);

        // Remove all items, if the price is more than 10.0

        // 1) First, we are getting a collection of values than an Iterator
/*        Iterator<Double> iterator = items.values().iterator();
        while (iterator.hasNext()) {
            Double price = iterator.next();
            if (price > 10.0) {
                iterator.remove();
            }
        }*/

        // 2) Removing items using lambda expression
        items.values().removeIf(price -> price>10.0);


        // Print the final result for code 1) or 2)
        System.out.println(items);
    }
    /*public boolean check(Double price){
        if (price > 10) {
            return true;
        } else {
            return false;
        }
    }*/
}
