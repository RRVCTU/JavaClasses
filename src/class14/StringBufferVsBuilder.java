package class14;

public class StringBufferVsBuilder {
    public static void main(String[] args) {
        // Mostly used class, it is newer, faster, and better than StringBuffer
        StringBuilder stringBuilder = new StringBuilder(" Today is java class");
        // StringBuffer is older and slow and not used mostly now.
        StringBuffer stringBuffer = new StringBuffer("Today is java class");

        String str = "Java is very easy";
        // If we want to convert from string to a stringbuilder, we can use the below syntax
        StringBuilder stringBuilder1 = new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);

        /*
        If we want to convert from a StringBuilder to a string we can use the below syntax
         */
        String newStr = stringBuilder1.toString();
    }
}
