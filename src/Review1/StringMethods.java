package Review1;

public class StringMethods {
    public static void main(String[] args) {
        String str = "hello";

        // String conversion toUpperCase or toLowerCase
        str.toUpperCase();        // It converts to Upper Case but do not save it
        System.out.println(str);

        str = str.toUpperCase();  // It assing new Upper Case value to the string
        System.out.println(str);

        // length() method gives us the size of the string.
        int size = str.length();
        System.out.println(size);

        // charAt() => return the character at specific index of the string.
        char character = str.charAt(3);
        System.out.println(character);

        char lastCharacter = str.charAt(str.length() - 1);
        System.out.println(lastCharacter);

        // indexOf = returns the index within this string of the first occupance of the character
        int index = str.indexOf(lastCharacter);
        System.out.println(index);

        System.out.println(str.indexOf('e')); // -1
        System.out.println(str);

        // isEmpty() - returns true if length is more than 0
        boolean empty = str.isEmpty();
        System.out.println(empty);
    }
}
