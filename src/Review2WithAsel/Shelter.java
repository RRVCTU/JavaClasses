package Review2WithAsel;

public class Shelter {
    public static void main(String[] args) {

        Dog.breed = "Husky";

        Dog dog1 = new Dog();
        dog1.name = "Bobby";
        dog1.weight = 5;
        dog1.printInfo();

        Dog dog2 = new Dog();
        dog2.name = "Tommy";
        dog2.weight = 10;
        dog2.printInfo();

        System.out.println("------- Making changes -------");

        dog1.name = "Bobik";
        dog1.breed = "German"; // because breed is static variable, it will be changed for all objects.

        dog1.printInfo();
        dog2.printInfo();

        double price = dog1.getPrice();
        System.out.println(price);

        float price2 = dog2.getPrice();
        System.out.println(price2);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());

        String str = "hello";
        str.length();
        str.substring(3);

        dog1.love("to jump");
        dog2.love("to play");
    }
}
