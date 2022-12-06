package class12;

public class StringDemo3 {
    public static void main(String[] args) {
        String str = " i love java ";
        System.out.println(str);

        // Remove the spaces before and after the String, but not spaces which are present in between
        System.out.println(str.trim());

        String str2 = "Java is Very easy";

        // StartsWith, endsWith, and contains are case sensitive.
        System.out.println(str2.startsWith("J")); // checks if a String starts with a specific letter or word
        System.out.println(str2.endsWith("y"));   // checks if a String Ends with a specific letter or word

        System.out.println(str2.toLowerCase().contains("very"));// checks if a String contains a specific letter or word

    }
}
