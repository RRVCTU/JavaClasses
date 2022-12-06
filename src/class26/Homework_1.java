package class26;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework_1 {
    /* Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
       as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute
       as carModel and Class Pet has petType attribute. Create 3 objects of the sub-classes and store them in ArrayList.
       Using for loop/advanced for loop/ iterator access all methods of the class. */
    public static void main(String[] args) {
        Insurance carObj = new Car("Geico - Car Insurance", "Toyota Camry");
        Insurance petObj = new Pet("Progressive - Pet Insurance", "Rex");
        Insurance healthObj = new Health("United Healthcare Insurance");

        ArrayList<Insurance> objects = new ArrayList<>();
        objects.add(carObj);
        objects.add(petObj);
        objects.add(healthObj);

        // Using for loop
        System.out.println("************ For loop **********");
        for (int i = 0; i < objects.size(); i++) {
            objects.get(i).getQuote();
            objects.get(i).cancelInsurance();
        }
        // Using advanced for loop
        System.out.println("************ Advanced for loop **********");
        for (Insurance object : objects) {
            object.getQuote();
            object.cancelInsurance();
        }
        // Using iterator access
        System.out.println("************ Iterator access **********");
        Iterator<Insurance> iterator = objects.iterator();
        while(iterator.hasNext()) {
            Insurance obj = iterator.next();
            obj.getQuote();
            obj.cancelInsurance();
        }
    }
}
class Insurance {
    String insuranceName;

    void getQuote() {
        System.out.println(insuranceName +": get quote");
    }

    void cancelInsurance() {
        System.out.println(insuranceName+ ": cancel");
    }
}

class Car extends Insurance{
    String carModel;
    Car(String insuranceName, String carModel) {
        this.insuranceName = insuranceName;
        this.carModel = carModel;
    }
}
class Pet extends Insurance{
    String petType;
    Pet(String insuranceName, String petType) {
        this.insuranceName = insuranceName;
        this.petType = petType;
    }
}
class Health extends Insurance{
    Health(String insuranceName) {
        this.insuranceName = insuranceName;
    }
}
