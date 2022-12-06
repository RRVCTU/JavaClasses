/*
            Write a method with the following specs:

    Returns: an integer
    Name: countVowels
    Parameters: a String called s

    Purpose: count the number of vowels in the string s.  Assume s is all lowercase.
    Examples:       countVowels("obama") ==> 3
                    countVowels("happy friday! i love weekends") ==> 9
 */

package Replit;
public class Task134 {

    static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i ++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}
