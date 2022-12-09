package InterviewQuestions;

public class BalancedParenthesis_215 {

    public static String s = "(())";
    public static String s1 = "(";
    public static String s2 = ")";
    public static String s3 = "(())))";
    public static String s4 = "(())";
    public static String s5 = "()";
    public static String s6 = ")()(";

    public static String firstPart = s.substring(0, s.length()/2);
    public static String secondPart = s.substring(s.length()/2);

    public static void main(String[] args) {
        System.out.println("s: " + isBalanced(s));
        System.out.println("s1: " + isBalanced(s1));
        System.out.println("s2: " + isBalanced(s2));
        System.out.println("s3: " + isBalanced(s3));
        System.out.println("s4: " + isBalanced(s4));
        System.out.println("s5: " + isBalanced(s5));
        System.out.println("s6: " + isBalanced(s6));

        System.out.println(s.length());
        System.out.println(firstPart);
        System.out.println(secondPart);
    }

    public static boolean isBalanced(String s){
        if(s.length()>=2 && s.length()%2==0) {
            return firstPart.equals(secondPart);
        } else {
            return false;
        }
    }
}
