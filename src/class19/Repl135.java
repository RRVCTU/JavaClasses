package class19;

public class Repl135 {
    public static void main(String[] args) {
        System.out.println(surround("abcabcabc","c"));  //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technoloby","o"));  //"techn(o)l(o)gy"
    }

    static String surround(String s, String letter) {
        return s.replaceAll(letter,"("+letter+")");
    }
}
