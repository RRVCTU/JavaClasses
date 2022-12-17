package class18;

// base class => derived classes
// parent class => child classes
// super class => subclasses

public class Car {
    // Common class has many names like parent class, super class, base class.
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;

    // if a field or method has private access modifier in parent class child classes can't use it.
    private String engineType;

    void printCarDetails() {
        System.out.println("Model " + model + " Make " + make + " Color " + color);
    }
}

// Below are child classes or derived classes.
class BMW extends Car {
    double engineCC;

}

class Tesla extends Car {

}

class Toyota extends Car {
    double engineCC;
}

class CarTester {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.make = "BMW";
        bmw.model = "x8";
        bmw.color = "Black";
        bmw.engineCC = 4400;
        bmw.printCarDetails();
    }
}


