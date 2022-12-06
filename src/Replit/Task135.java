/*
                Write a method with the following specs:

    Returns: a String
    Name: surround
    Parameters: a String called s

    a String called search_term
    Then complete the method by programming the following behavior
    Return a new String built from s that has every instance of the search term surrounded by parentheses

    Examples:       surround("abcabcabc",'c') ==> "ab(c)ab(c)ab(c)"
                    surround("technology",'o') ==> "techn(o)l(o)gy"
 */

package Replit;

public class Task135 {

    static String surround(String s, String search_term) {
        /* This is the first solution.
        String original = String.valueOf(search_term.charAt(0));
        String replacement = "(" + search_term.charAt(0)+")";
        String newString = s.replace(original, replacement);
        return newString;
        */
        // Second solution, is more short and elegant.
        return s.replaceAll(search_term,"("+search_term+")");
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
    }
}
