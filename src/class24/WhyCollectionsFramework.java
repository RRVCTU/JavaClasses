package class24;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionsFramework {
    public static void main(String[] args) {
        String name = "Josh";
        String name2 = "Joe";
        System.out.println(name);
        System.out.println(name2);

        String[] names = {"Reshad", "Adam", "Again Josh"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        // Below array is fixed in size.
        String[] breeds = new String[10];
        breeds[0] = "BullDogs";
        System.out.println(Arrays.toString(breeds));

        // Below array is not fixed in size.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        System.out.println(colors.contains("Green"));
        System.out.println(colors);
    }
}
