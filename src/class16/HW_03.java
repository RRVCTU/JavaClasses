package class16;

public class HW_03 {
    // Create a method that will accept a String as a parameter and return a new String that consist only
    // of vowels. Method should be available inside the class only where it was declared and executed by
    // calling it is name.

    private static String onlyVowelsString(String str) {
        String vowelString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u') {
                vowelString += str.charAt(i);
            }
        }
        return vowelString;
    }

    public static void main(String[] args) {
        System.out.println(onlyVowelsString("Hello"));
    }
}
