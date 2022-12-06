package class25;

import java.util.ArrayList;

public class RemoveAllDemo {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem = new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("concealer");
        makeUpItem.add("Maskara");
        makeUpItem.add("eyeLinear");
        makeUpItem.add("lipstick");

        makeUpItem.remove("Blush");
        makeUpItem.remove("Base");
        makeUpItem.remove("concealer");
        System.out.println(makeUpItem);
    }
}
