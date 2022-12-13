package class15;

public class Dog {
    String name;        // Instance variable, because it is inside of class, but within any block of code
    static int noOfLegs = 2; // Static variable, because has a static keyword.
    String color;

    void bark() {
        int i = 10;    // Local variable inside a block of code
        for (int j = 0; j < i; j++) {
            // j is also a local variable inside a block of code
            System.out.println("Barking.....");

        }
    }

    void printInfo() {
        System.out.println("name " + name + " color " + color);
    }

    void printName() {
        System.out.println("name " + name);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Tomy";
        dog1.printName();

        Dog dog2 = new Dog();
        dog2.name = "Jack";
        dog2.color = "Black";
        dog2.printInfo();
    }
}
