package class28;

import java.util.*;

public class HW_02 {
    /*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        TreeMap<String, String> countryCapital = new TreeMap<>();
        countryCapital.put("United Arab Emirates", "Abu Dhabi");
        countryCapital.put("Thailand", "Bangkok");
        countryCapital.put("Kyrgystan", "Bishkek");
        countryCapital.put("USA", "Washington D.C.");
        countryCapital.put("Russia", "Moscow");
        countryCapital.put("England", "Londan");
        countryCapital.put("Germany", "Berlin");
        countryCapital.put("Portugal", "Lisbon");
        countryCapital.put("Hungary", "Budapest");
        countryCapital.put("Pakistan", "Islamabad");
        countryCapital.put("Kazakhstan", "Astana");

        System.out.println("Printing all keys and values using for each loop");
        for(Map.Entry<String, String> entry : countryCapital.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("-------------------------------------------");
        System.out.println("Printing all keys and values using iterator");
        Set set = countryCapital.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry)iterator.next();
            System.out.println(mapEntry.getKey() + " - " + mapEntry.getValue());
        }

        System.out.println("---------------------------------------");
        System.out.println("Printing all values using for each loop");
        for (String value : countryCapital.values()) {
            System.out.println(value);
        }

        System.out.println("----------------------------------");
        System.out.println("Printing all values using iterator");
        Collection values = countryCapital.values();
        Iterator iterator1 = values.iterator();
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
