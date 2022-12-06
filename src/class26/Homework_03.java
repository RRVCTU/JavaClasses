package class26;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Homework_03 {

    // How can you remove all duplicates from ArrayList?
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);
        // first variant
        System.out.println("************ HashSet **************");
        HashSet<String> hashSet = new HashSet<>(aList);
        System.out.println(hashSet);
        // second variant
        System.out.println("******** LinkedHashSet *************");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(aList);
        System.out.println(linkedHashSet);
    }

}
