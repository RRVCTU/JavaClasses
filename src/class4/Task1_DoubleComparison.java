package class4;

public class Task1_DoubleComparison {

    public static void main(String[] args) {
        /*
        Create a Java program and name it Double Comparison.
        Declare 2 double variables and if value of first variable is higher than the
        second, print "Double value is larger than ." Otherwise print
         */
        double value1 = 9.3;
        double value2 = 8.3;

        if (value1 > value2) {
            System.out.println("Double value1 " + value1 + " is larger than value2 " + value2);
        } else if (value1 < value2) {
            System.out.println("Double value2 is larger than value1");
        } else {
            System.out.println("Values are equal");
        }
    }
}
