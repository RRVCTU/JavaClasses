package class21;

// Create 1 class with a static method that has 3 overload forms.
// Then call overloaded method with specific arguments and observe result.

public class Task3 {
    static void print() {
        System.out.println("I love Java");
    }

    static void print(String str) {
        System.out.println("I love " + str);
    }

    static void print(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("I love " + str);
        }
    }

    public static void main(String[] args) {
        print();
        print("JavaScript");
        print("Python", 3);
    }
}
