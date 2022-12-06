package class09;

public class HW_03 {
    // 3. Create an array of integers and calculate the sum of all elements in an array
    public static void main(String[] args) {

        int[] numbers = {1, 45, 765, 2, 54, 67};
        int sum = 0;

        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
