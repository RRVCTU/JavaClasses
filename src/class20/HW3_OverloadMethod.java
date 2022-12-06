/*
Create 1 class with a static method that has 3 overload forms. Then call overloaded method with specific arguments and
observe result.
 */

package class20;

public class HW3_OverloadMethod {

    String firstName;
    String middleName;
    String lastName;

    static void print(String firstName) {
        System.out.println(firstName);
    }
    static void print(String firstName, String middleName) {
        System.out.println(firstName+" "+middleName);
    }
    static void print(String firstName, String middleName, String lastName) {
        System.out.println(firstName + " " + middleName + " " + lastName);
    }
}
class HwPrint extends HW3_OverloadMethod{
    public static void main(String[] args) {
        print("Kenny");
        print("Kenny", "Duc");
        print("Kenny", "Duc", "Ong");
    }
}
