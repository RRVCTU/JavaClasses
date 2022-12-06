package class06;
import java.util.Scanner;
public class EnhancedCodeTask2 {

    public static void main(String[] args) {

        double average = 0;


        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the quiz score: ");
        int quiz = sc.nextInt();
        System.out.print("Please enter the med term score: ");
        int medTerm = sc.nextInt();
        System.out.print("Please enter the final score: ");
        int finalScore = sc.nextInt();

        average = (quiz + medTerm + finalScore) / 3;

        String grade ="";
        if (average >= 90) { grade = "A";}
        else if (average >= 70) {grade = "B";}
        else if (average >= 50) {grade = "C";}
        else if (average < 50 && average >=0) {grade = "F";}
        else {
            System.out.println("Please enter valid score.");
        }
        
        System.out.println("Your grad is "+grade);
    }
}
