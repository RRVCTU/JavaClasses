package class16;

public class HW_02 {
    // Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
    public String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String reverseString = String.valueOf(stringBuilder.reverse());
        return reverseString;
    }

    public static void main(String[] args) {
        HW_02 obj = new HW_02();
        System.out.println(obj.reverseString("Hello World!"));
    }
}
