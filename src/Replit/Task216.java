package Replit;

import java.util.Arrays;

public class Task216 {
    public static int[] arraySumToZero(int N) {

        int[] arr = new int[N];
        for (int i = 0; i < N/2; i++) {
                arr[i] = i;
                arr[i+1] = -i;
        }
        System.out.println(N);
        return arr;
    }
}

class Test{
    public static void main(String[] args) {
        int[] result = Task216.arraySumToZero(3);
        System.out.println(Arrays.toString(result));
    }
}
