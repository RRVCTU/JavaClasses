package class09;

public class HW_04 {
    // 4. From an array of integer elements find the largest number
    public static void main(String[] args) {
        int[] numbers = {1, 45, 765, 2, 54, 67};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i] ;
            }
        }
        System.out.println(largest);
    }
}
