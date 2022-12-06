package class26;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypesOfSets {
    public static void main(String[] args) {
        // There are three types of sets:
        // -HashSet:
        // Downsides of HashSet: it does not care about the insetion order
        // Upsides of HashSet: it is the fastest type of set.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Mango");
        hashSet.add("Appel");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Orange");
        hashSet.add("Banana");
        System.out.println("HashSet");
        System.out.println(hashSet);

        // Whenever you need insertion order
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Mango");
        linkedHashSet.add("Appel");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        System.out.println("LinkedHashSet");
        System.out.println(linkedHashSet);

        // Whenever you need sorted data use TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mango");
        treeSet.add("Appel");
        treeSet.add("Mango");
        treeSet.add("Kiwi");
        treeSet.add("Orange");
        treeSet.add("Banana");
        System.out.println("TreeSet");
        System.out.println(treeSet);
    }
}
