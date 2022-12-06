package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class Class25Homework_1 {
    // Create an arrayList of words. Remove every word that ends with "e".
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("syntax");
        words.add("technology");
        words.add("is");
        words.add("the");
        words.add("number");
        words.add("one");
        System.out.println(words);

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.endsWith("e")) {
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}
