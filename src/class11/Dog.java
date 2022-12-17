package class11;

public class Dog {

    // State
    // attributes/properties/fields
    String name;
    String color;

    String breed;
    double weight;
    int age;

    // These are the behaviors of a dog
    // Methods functions
    void bark() {
        System.out.println("Barking..............");
    }

    void sleeep() {
        System.out.println("Cat is sleeping...............");
    }

    public static void main(String[] args) {
        // creating objects from a class
        // new Cat(); => it creates an object of class Cat
        Dog dog1 = new Dog();
        // calling a behavior on an object
        dog1.bark();
        dog1.sleeep();
    }
}
