package class16;

public class HW_02 {
    // Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
    public static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String newString = String.valueOf(stringBuilder.reverse());
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(HW_02.reverseString("Hello World!"));
    }
}
