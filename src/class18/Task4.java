package class18;

public class Task4 {
    // Write program that have static constructor and observe result

/*    static Task4() {

    }*/
    // Code below create a mistake, because it is imposible to create a static constructor.
    // Every code with static keyword become static and it creates a problem when we start to create
    // new objects with this constructor.

    void print() {
        System.out.println("print method");
    }

    void print2() {
        System.out.println("print 2 method");
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.print();
        task4.print2();
    }
}
