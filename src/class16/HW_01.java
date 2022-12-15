package class16;

public class HW_01 {
    // Create a method that will accept an array as parameters and will return a sum of all elements from
    // that array. Method should be visible only within same package and accessible by the creating
    // an instance of the class.

    int sumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        HW_01 obj = new HW_01();
        System.out.println(obj.sumOfElements(new int[]{5, 2, 3}));
    }
}
