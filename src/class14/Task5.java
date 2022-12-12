package class14;

public class Task5 {
    public static void main(String[] args) {
        String str = "dad";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(str)) {
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("The string is not Palindrome");
        }

        System.out.println(str);
        System.out.println(stringBuilder);

    }
}
