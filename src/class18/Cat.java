package class18;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private double weight;

    public Cat(String catName, String carBreed) {
        name = catName;
        breed = carBreed;
    }

    public Cat(String catName, String carBreed, int catAge, double catWeight) {
        name = catName;
        breed = carBreed;
        age = catAge;
        weight = catWeight;
    }

    public void printInfo() {
        System.out.println("Name "+name+" Breed "+breed+" Age "+age+" Weight "+weight);

    }
}
