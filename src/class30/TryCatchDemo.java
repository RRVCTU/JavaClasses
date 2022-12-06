package class30;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (NullPointerException npe) {
            System.out.println("Got null pointer exception");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Got Index out of bound this time");
        }
    }

    public static void doSomething() {
        String name = null;
        System.out.println(name.length());
    }
}
