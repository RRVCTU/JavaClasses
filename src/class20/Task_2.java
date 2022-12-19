package class20;

// Write program to inherit class Z that has method printF which is static
// and call or reuse that method into class W
public class Task_2 {
    public static void main(String[] args) {
        Z.printF();  // Call by class name, not an object creation
        W.printF();
    }
}

class Z {
    static void printF() {
        System.out.println("F");
    }
}

class W extends Z {
}