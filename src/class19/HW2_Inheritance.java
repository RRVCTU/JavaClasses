package class19;

// Write program to inherit class A that has method printF which is static and call or reuse that method into class B.
public class HW2_Inheritance {

    static class A {
        public void printF() {
            System.out.println("This is an example of method inheritance");
        }
    }

    static class B extends A {
    }

    public void main(String[] args) {
        B myObj = new B();
        myObj.printF();
    }
}
