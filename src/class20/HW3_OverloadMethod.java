/*
Create 1 class with a static method that has 3 overload forms. Then call overloaded method with specific arguments and
observe result.
 */

package class20;

public class HW3_OverloadMethod {

    String firstName;
    String middleName;
    String lastName;

    static void print(String lastName, String firstName) {
        System.out.println(lastName + " " + firstName);
    }
    static void print(int number) {
        System.out.println(number);
    }
    static void print(String firstName, String lastName, int age) {
        System.out.println(firstName + " " + lastName +" "+age);
    }
}
class HwPrint extends HW3_OverloadMethod{
    public static void main(String[] args) {
        print("Smith", "John");
        print(10);
        print("John", "Smith", 35);
    }
}
