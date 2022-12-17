package Review2;

public class Teacher {
    String name, lastName;  // instance variable
    int weight; // instance variable
    String subject;
    double salary;

    static String school;

    /* This code to create a constructor
     * 1. The name of constructor = classname
     * 2. no return type needed, not even void
     */

    //using belowe constructor we initialize instance variables
    Teacher(String fname, String lName) {
        name = fname;
        lastName = lName;
    }

    /*
     * when you create a constructor
     * compiler is not going to create a default constructor for you
     */

    void print() {
        System.out.println(name +" " +lastName);
    }

}
