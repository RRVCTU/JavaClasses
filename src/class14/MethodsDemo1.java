package class14;

public class MethodsDemo1 {
    void printHello() {
        System.out.println("Hello World!");
        System.out.println("Hello Java");
        System.out.println("Hello Aladin");
    }

    void printWord(String word) {
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethodsDemo1 obj = new MethodsDemo1();
        obj.printHello();
        obj.printWord("Taivion Don't worry its Java");
        obj.printWord("No Athira it doesn not make sense i am confused can you please repeat it");
    }
}
