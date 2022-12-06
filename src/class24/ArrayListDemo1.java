package class24;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // Syntax to create an arrayList
        ArrayList<String> colors = new ArrayList<>();
        // use add method to insert elements in an ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        //prints all the elements
        System.out.println(colors);
        // get method prints individual elements from ArrayList
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));
        // return the size of the ArrayList
        System.out.println(colors.size());

        //getting all the elements through normal loop
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("---------------------");
        System.out.println("Enhanced Loop");
        System.out.println("---------------------");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
