package class15;

public class LocalVarDemo {

    String name = "Confused";     // This is a instance variable

    public static void main(String[] args) {
        int number = 0;    // This is a local variable
        /*
        local variables are defined inside blocks of code and can only be used inside those blocks
         */
        //System.out.println(name);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        {
            int i = 0;
        }
    }

    void printName() {
        int number = 4;
        System.out.println(name);     // Instance variable can be access from method.
        //System.out.println(number);
        String name = "Allan";
    }
}
