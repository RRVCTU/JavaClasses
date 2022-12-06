/*
Create a class named "Programming". While creating an object of the class, if nothing is passed to it, then
the message "I love programming languages" should be printed. If some String is passed to it, then in place of
"programming languages" the value variable should be printed. Example, if we pass "Java", then "I lova Java" should be
printed.
 */

package class20;

public class HW2_IloveProgramming {
}

class Programming {
    String message;

    Programming() {
        System.out.println("I lova programming languages");
    }

    Programming(String message) {
        this.message = message;
        System.out.println("I love " + message);
    }
}

class ProgrammingPrint {
    public static void main(String[] args) {
        Programming print = new Programming();
        Programming print1 = new Programming("Java");
    }
}
