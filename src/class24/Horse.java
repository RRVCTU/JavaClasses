package class24;

public class Horse {
    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    public Horse(String name, String breed, String color, int age, double weight) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()) {
            System.out.println("Name can't be empty");
        } else {
            this.name = name;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed.isEmpty()) {
            System.out.println("Breed can't be empty");
        } else {
            this.breed = breed;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()) {
            System.out.println("Color cannot be empty.");
        } else {
            this.color = color;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 ) {
            System.out.println("Age cannot be negative");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

   void display() {
        System.out.println("Name: "+name);
        System.out.println("Breed: "+breed);
        System.out.println("Color: "+color);
        System.out.println("Age: "+age);
        System.out.println("Weight: "+weight);
    }

}

class HorseTest {
    public static void main(String[] args) {
        Horse horse = new Horse("Pegasus", "Flying horse", "Black", 500, 1000);
        horse.display();
    }
}
