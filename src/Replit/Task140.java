/*
                For you to do:
Create the maxLength method that will accept String array of words and return the word with the largest length.
Method should visible only within same package!

                **Expected Output:**
this is long
 */

package Replit;

public class Task140 {

    static String maxLength(String[] arr) {
        String newStr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > newStr.length()) {
                newStr = arr[i];
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}
