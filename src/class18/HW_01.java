package class18;
/*
Write a Student class that have instance variables name and address.
Create a constructor that will initialize those variables.
Print name & address of given  student using displayInfo method.
 */
public class HW_01 {
    String name;
    String address;

    HW_01(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayInfo() {
        System.out.println(name+" is living "+address);
    }

    public static void main(String[] args) {
        new HW_01("John", "123 avenue, New York").displayInfo();
    }
}
