package class28;

import java.util.LinkedHashMap;

public class HM_01 {
    /*
Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..).
Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
     */
    public static void main(String[] args) {
        // Create a map of a building.
        LinkedHashMap<Integer, String> building = new LinkedHashMap<>();
        // Storing 7 entries.
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(2, "Syntax");
        building.put(4, "Windows");
        building.put(4, "Windows");
        building.put(6, "Oracle");
        building.put(7, "Apple");
        // Print the original map
        System.out.println(building);
        // Check how many entries?
        System.out.println(building.size());
        // Updating company on the 4th floor
        building.replace(4, "New Company");
        System.out.println(building);
        // remove the company on the 7th floor
        building.remove(7);
        System.out.println(building);
    }
}
