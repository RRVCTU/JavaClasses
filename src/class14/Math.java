package class14;

public class Math {
    void add(int num1, int num2) {
        System.out.println(num1+num2);
    }
    void printFiboSeries(int size) {
        int firstNumber = 0;
        int secondNumber = 1;
        int fibNumber = 0;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        for (int i = 0; i < size; i++) {
            fibNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibNumber;
            System.out.println(fibNumber);
        }
    }

    public static void main(String[] args) {
        Math obj = new Math();
        obj.printFiboSeries(5);
        System.out.println("**********");
        obj.printFiboSeries(10);

        System.out.println("**********");
        obj.add(1, 2);

    }
}
