package ReviewClass12;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");  // when we use the simple add method that takes one parameter element are added
        animals.add("Cat");  // at the end of the List.
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Horse");

        System.out.println(animals);
        // how to print the size of each word from the list?
        for (String animal : animals) {
            System.out.print(animal.length() + " ");
        }
        System.out.println();

        // how can we remove words which have more than 4 letters?
//        animals.removeIf(x -> x.length()>4);
//        System.out.println(animals);

        // if element is more than 4 letters we want to replace that with animal "Camel"
        // we should not use iterator because we are not performing any operation that can change the size of the List.
        // we should not use enhanced for loop here as we are not printing the data, we are updating the data
        // as we need the index to update the data we should use simple for loop
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).length()>4) {
                animals.set(i, "Camel"); // set method replaces the element with the new one
            }
        }
        System.out.println(animals);

        System.out.println(animals.subList(0,3)); // Prints only part of the list, specified by the starting and ending index.

        ListIterator<String> stringListIterator = animals.listIterator();
        while(stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());
        }
    }
}
