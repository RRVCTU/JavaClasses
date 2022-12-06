/*
Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */

package class20;

public class HW4_OverloadMethod {
    private int addressNum;
    private String streetName;
    private String city;

    HW4_OverloadMethod() {}
    HW4_OverloadMethod( int addressNum, String streetName, String city) {
        this.addressNum = addressNum;
        this.streetName = streetName;
        this.city = city;
    }
    private void add(int addressNum) {
        System.out.println(addressNum);
    }
    private void add(int addressNum, String streetName) {
        System.out.println(addressNum+" "+streetName);
    }
    private void add(int addressNum, String streetName, String city) {
        System.out.println(addressNum+" "+streetName+" "+city);
    }

    public static void main(String[] args) {
        HW4_OverloadMethod print = new HW4_OverloadMethod();
        print.add(123);
        print.add(123, "Somewhere");
        print.add(123, "Somewhere", "Kansas");
    }

}
