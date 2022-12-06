package class12;

public class StringDemo7 {
    public static void main(String[] args) {
        String str="I am always confused";

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf(" "));

        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 11));
    }
}
