package class19;
/*
Complete the reduce10 method by making it subtract 10 from element of the double array nums.
 */

public class Repl132 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},
                     {4,5,6,7},
                     {1,3,5,7}};
        reduce10(a);
        for (int[] arr: a) {
            for(int number:arr){
            System.out.print(number+" ");
            }
            System.out.println();
        }

    }

    static int[][] reduce10(int [] [] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i][j]-10;
            }
        }
        return a;
    }

}
