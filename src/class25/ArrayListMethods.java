package class25;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem = new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealser");
        makeUpItem.add("Maskara");
        makeUpItem.add("eyeLinear");
        makeUpItem.add("lipstick");

        ArrayList<String> cosmetics = new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("shampoo");
        cosmetics.add("lotion");

        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.addAll(makeUpItem);
        beautyProducts.addAll(cosmetics);
        System.out.println(beautyProducts);
        beautyProducts.remove("lotion");  // remove by value
        System.out.println(beautyProducts);
        beautyProducts.remove(1);      // remove by index
        System.out.println(beautyProducts);
        beautyProducts.removeAll(cosmetics);  // remove all collection
        System.out.println(beautyProducts);
        beautyProducts.clear();               // remove everything from Array List
        System.out.println(beautyProducts);
    }
}
