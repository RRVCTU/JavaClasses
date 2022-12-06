package class11;

public class HW_1 {
    // Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
    static class Phone {
        String manufacturer;
        String model;
        int ram;
        int storage;

        void call() {
            System.out.println(manufacturer + " " + model + " is calling");
        }
    }

    public static void main(String[] args) {
        Phone iPhone = new Phone();
        iPhone.manufacturer = "Apple";
        iPhone.model = "14 Pro";
        iPhone.ram = 6;
        iPhone.storage = 128;

        Phone Pixel = new Phone();
        Pixel.manufacturer = "Google";
        Pixel.model = "Pixel 7 Pro";
        Pixel.ram = 12;
        Pixel.storage = 128;

        Phone Samsung = new Phone();
        Samsung.manufacturer = "Samsung";
        Samsung.model = "S22 Ultra";
        Samsung.ram = 8;
        Samsung.storage = 256;

        iPhone.call();
        Pixel.call();
        Samsung.call();
    }
}
