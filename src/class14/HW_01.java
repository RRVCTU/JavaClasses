package class14;

public class HW_01 {
    // Create a method that will take 2 parameters as a numbers and prints which number is larger

    int isLarger(int num1, int num2) {
        if (num1>num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        HW_01 obj = new HW_01();
        System.out.println("The largest number is: " + obj.isLarger(5, 3));
    }
}
