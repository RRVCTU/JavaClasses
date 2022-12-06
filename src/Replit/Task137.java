/*
    In Main class please declared the variables using different access modifiers that will hold value for:

    name
    city
    name of the school
    batch number

    Create a method to display details in following format:

    My name is ___ and I live in ___. I study at ___ in batch ___

    Assign values to the variables and execute method display

    Expected Output:

    My name is John and I live in Miami. I study at Syntax in batch 9
 */
package Replit;

public class Task137 {

    public String name;
    private String city;
    String schoolName;
    protected int batch;

    void display() {
        System.out.println("My name is "+name+" and I live in "+city
                +". I study at "+schoolName+" in batch "+batch);
    }

    public static void main(String[] args) {
        Task137 myObj = new Task137();
        myObj.name = "John";
        myObj.city = "Miami";
        myObj.schoolName = "Syntax";
        myObj.batch = 9;
        myObj.display();
    }
}