package ReviewClass12;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        /*
        HashMap: Does not retain the order, but it is faster.
        LinkedHashMap: it retains the order, but it is a little slower than HashMap.
         */
        Map<String, Double> vegeList = new LinkedHashMap<>();
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add(null);
        System.out.println(hashSet);
    }
}
