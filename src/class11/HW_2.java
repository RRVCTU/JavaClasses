package class11;

public class HW_2 {
    // Create a Cat Class and create 3 different objects of it: Husky, Bulldog, Labrador
    // with specific  attributes and behaviors.

    static class Dog {
        String breed;
        String name;

        void sleep() {
            System.out.println(name + " is sleeping");
        }

        void eat() {
            System.out.println(name + " is eating");
        }
    }

    public static void main(String[] args) {
        Dog husky = new Dog();
        husky.breed = "Husky";
        husky.name = "Echo";

        Dog bulldog = new Dog();
        bulldog.breed = "Bulldog";
        bulldog.name = "Baxter";

        Dog labrador = new Dog();
        labrador.breed = "labrador";
        labrador.name = "Henry";

        husky.sleep();
        bulldog.sleep();
        labrador.eat();
    }
}
