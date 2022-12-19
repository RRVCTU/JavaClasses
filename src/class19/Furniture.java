package class19;

public class Furniture {
    String color = "Green";
}

class Chair extends Furniture {
    String color = "Red";

    void printColor() {
        String color = "Black";
        System.out.println(color);        // the local variable of the method will be accessed
        System.out.println(this.color);   // the instance variable in the same class will be accessed
        System.out.println(super.color);  // the instance variable of superclass will be accessed
    }
}

class TestChair {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.printColor();
    }
}
