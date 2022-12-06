package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo3 {

    public static void main(String[] args) {
        // delete all the products which star with letter B or ends with letter a
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Maskara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");

        /*var iterator<String>= beautyProducts.iterator();

        while (iterator.hasNext()) {
            var item :String = iterator.next();
            if(item.startsWith("B")||item.endsWith("a")) {
                iterator.remove();
            }
        }*/
        System.out.println(beautyProducts);
    }
}
