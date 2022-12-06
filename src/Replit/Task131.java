// Print every 3rd letter from string

package Replit;

public class Task131 {
    static String thirdLetter(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));
            i += 2;
        }
        return result.toString();
    }


    //test case below (don't change):
    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"

    }
}
