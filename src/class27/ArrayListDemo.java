package class27;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Tomy", "Black", "German");
        Dog dog2 = new Dog("Jony", "White", "BullDog");
        Dog dog3 = new Dog("Kimi", "Brown", "German");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        /*dogs.add(new Cat("Tomy", "Black", "German"));
        dogs.add(new Cat("Jony", "White", "BullDog"));
        dogs.add(new Cat("Kimi", "Brown", "German"));*/

        // System.out.print(dogs);
        System.out.print(dog1);
        System.out.print(dog2);
        System.out.print(dog3);
    }
}
