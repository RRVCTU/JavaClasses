/*
        Create a method that will be available to all classes in your project with following specifications:
Returns: a String
Name: alphabetical
Parameters: a String called str
Purpose: Return a string that is composed of each letter as long as the letter is later on in the
         alphabet than its previous one.  You can assume actual parameters are lowercase.
SeeAdditional Info: You can use < and > to compare characters (not Strings), where characters later on
                    in the alphabet are "greater".
Examples:
'a' < 'b' ==> True
'a' < 'a' ==> False
'a' > 'b' ==> False

Examples:
alphabetical("hello") ==> "hlo"
alphabetical("software") ==> "stwr"
alphabetical("language") ==> "lnug"

**Expected Output:**
hlo
stwr
lnug
 */

package Replit;

public class Task139 {

    public String alphabetical(String str) {
        StringBuilder newString = new StringBuilder();
        newString.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > str.charAt(i-1)) {
                    newString.append(str.charAt(i));
                }
            }
        return newString.toString();
    }

    public static void main(String[] args) {
       Task139 myObj = new Task139();
        System.out.println(myObj.alphabetical("hello"));
        System.out.println(myObj.alphabetical("software"));
        System.out.println(myObj.alphabetical("language"));
    }
}
