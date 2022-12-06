package ReviewClass03;

public class LogicalOperator {

    public static void main(String[] args) {

        boolean programmer = true;
        boolean manualTester = false;
        boolean knowFramework = true;

        if (programmer && manualTester && knowFramework) {
            System.out.println("You can be an automation engineer");
        } else {
            System.out.println(("You must know a programming language, manual testing and some framework"
            ) + " to be an automation engineer");
        }
    }
}
