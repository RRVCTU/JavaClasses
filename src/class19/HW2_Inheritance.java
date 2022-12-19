package class19;
// Write program to inherit class A that has method printF which is static
// and call or reuse that method into class B
public class HW2_Inheritance {
    public static void main(String[] args) {
        B1 myObj = new B1();
        myObj.printF();
    }
}
class A1 {
    static void printF() {
        System.out.println("This is an example of method inheritance");
        }
}
class B1 extends A1 { }


