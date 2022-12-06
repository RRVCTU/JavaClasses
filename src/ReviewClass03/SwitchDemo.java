package ReviewClass03;

public class SwitchDemo {
    public static void main(String[] args) {
        char opr = '-';
        double result = 0;
        double num1 = 10;
        double num2 = 10;

        if (opr == '+') {
            result = num1 + num2;
        } else if (opr == '-') {
            result = num1 - num2;
        } else if (opr == '*') {
            result = num1 * num2;
        } else if (opr == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Wrong operator entered.");
        }
        if (result != 0) {
            System.out.println(result);
        }
    }
}
