package Review2;

public class Dog {
    String name; // instance variable
    int weight; // instance variable
    static String breed;

    void printInfo() {
        System.out.println("Cat features: " + name + ", " + weight + ", " + breed);
    }

    void love(String thing) {
        System.out.println(name + " loves " + thing);
    }

    // Create a method to return price
    // if weight is more than 5 -> price is 100
    // if weight is more than 10 -> price is 300
    // if weight is more than 20 -> price is 1000
    float getPrice() {
        if (weight < 5) {
            return 100;
        } else if (weight < 10) {
            return 300;
        } else {
            return 1000;
        }
    }

    // create a method that will return bark type
    // if weight is less than 5 => load
    // if weight is less than 20 => wooh
    // if weight is less than 500 => noise is Gav Gav
    String bark() {
        String noise;
        if (weight < 5) {
            noise = "load";
        } else if (weight < 20) {
            noise = "woof woof";
        } else {
            noise = "GAV GAV";
        }
        return noise;
    }


    /* variables syntax
     *
     * dataType name
     *   String breed;
     *
     *
     * method syntax
     *
     * returnType
     *   void     printInfo
     */
}
