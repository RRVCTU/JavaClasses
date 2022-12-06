/* Create an ArrayList that will store 5 names into it
 * Find out whether the given ArrayList is empty or not?
 * Check whether the specific name is present in an ArrayList or not?
 * Find the size of your arrayList and print all values from that.
 */
package class24;

import java.util.ArrayList;

public class Class24Homework {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Zeus");
        names.add("Appolo");
        names.add("Ares");
        names.add("Poseidon");
        names.add("Andromeda");

        if (names.isEmpty()) {
            System.out.println("Array list is empty");
        } else {
            System.out.println("Array List is not empty");
            System.out.println(names.contains("Poseidon"));
            System.out.println(names.size());
            System.out.println(names);
        }
    }
}
