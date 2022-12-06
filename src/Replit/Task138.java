/*
    In AnotherClass declare a private, default, protected, public methods
    and have them each return the name of the what access modifier they are using.

    All methods should be accessible by class name

    Call methods of Another class inside Main class
**Expected Output:**
default
protected
public
 */

package Replit;

class AnotherClass{
    private void privateMethod(){
        System.out.println("private");
    }
   static void defaultMethod(){
       System.out.println("default");
    }
    protected void protectedMethod() {
        System.out.println("protected");
    }
    public void publicMethod() {
        System.out.println("public");
    }
}
public class Task138 {

    public static void main(String[] args) {
        // Need the object to be able access methods in another class.
        // Objects should be created using keyword of another class name.
        AnotherClass myObject = new AnotherClass();
        AnotherClass.defaultMethod(); // static/default method could be access directly
        myObject.protectedMethod();  // protected method access using inheritance, can be accesss
                                        // by any class but only in the same package.
        myObject.publicMethod();     // public method can be access from anywhere.

    }
}
