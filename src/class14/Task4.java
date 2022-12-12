package class14;

public class Task4 {
    public static void main(String[] args) {
        /*
        How would you reverse a string word by word? for example
        input => This is sentence i want to reverse
        output => sihT si ecnetnes i tnaw ot esrever
         */

        String str = "This is sentence i want to reverse";
        String[] arr = str.split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            StringBuilder stringBuilder = new StringBuilder(word);
            stringBuilder.reverse();
            arr[i] = stringBuilder.toString();
            output.append(arr[i]).append(" ");
        }
        System.out.println(output);
    }
}
