package Replit;

public class Task215 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
        System.out.println(isBalanced("()))"));
    }

    public static boolean isBalanced(String s) {

        boolean balanced = false;
        String firstPart = s.substring(0, s.length() / 2);
        String secondPart = s.substring(s.length() / 2);

        int rightBracket = 0;
        int leftBracket = 0;

        for (int i = 0; i < firstPart.length(); i++) {
            if (firstPart.charAt(i) == '('){
                leftBracket = leftBracket + 1;
            } else if (firstPart.charAt(i) == ')'){
                rightBracket = rightBracket + 1;
            }
        }

        for (int i = 0; i < secondPart.length(); i++) {
            if (secondPart.charAt(i) == ')'){
                leftBracket = leftBracket - 1;
            } else if (secondPart.charAt(i) == '('){
                rightBracket = rightBracket - 1;
            }
        }

        if (leftBracket == 0 && rightBracket == 0) {
            balanced = true;
        }
        return balanced;
    }
}