package class21;

public class Animal {
    String name;
    String color;
    String breed;
    void sleep() {
        System.out.println("Animals usually sleep for 6 hours");
    }
    void eat() {
        System.out.println("Grass and meat");
    }
}

class Cat extends Animal{
    @Override
    void sleep() {
        System.out.println("I like to sleep for 20 hours");
    }

    @Override
    void eat() {
        System.out.println("I only like fish");
    }
}

class Dog extends Animal{
    @Override
    void sleep() {
        System.out.println("I like to sleep for 10 hours");
    }

    @Override
    void eat() {
        System.out.println("Dogs like meat");
    }
}