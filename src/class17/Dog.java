package class17;

public class Dog {
    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight) {
        name = dogName;
        breed = dogBreed;
        color = dogColor;
        age = dogAge;
        weight = dogWeight;
    }

    void printInfo() {
        System.out.println("name " + name+" "+ "breed "+breed
        + " "+"color "+color+" "+"age "+age+" "+"weight "+weight);
    }

    public static void main(String[] args) {
/*        Cat dog = new Cat();
        dog.name = "Tomy";
        dog.breed = "Huskey";
        dog.color = "Pink";
        dog.age = 10;
        dog.weight = 30;*/
        Dog dog = new Dog("Tomy","Huskey","Pink", 10,30);
        dog.printInfo();
    }

}
