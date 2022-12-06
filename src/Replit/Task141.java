/*
Create the maxValue method that will accept int array and return return the maximum value in the array.
Method should visible every class in any package!

**Expected Output:**
22
 */

package Replit;

public class Task141 {
    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }
}
