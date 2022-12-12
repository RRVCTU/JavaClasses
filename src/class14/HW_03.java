package class14;

public class HW_03 {
    // Create a method taht will print whether given String is palindrome or not.

    static boolean isPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(word)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("word"));
        System.out.println(isPalindrome("Dad"));
        System.out.println(isPalindrome("dad"));
        System.out.println(isPalindrome("Asghar"));
    }
}
