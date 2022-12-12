package class14;

public class HW_07 {
    /*
    Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
     */

    static void getGrade(int score) {
        if (score > 90) {
            System.out.println("Your grade is A");
        } else if (score > 80) {
            System.out.println("Your grade is B");
        } else if (score > 70) {
            System.out.println("Your grade is C");
        } else if (score > 50) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }
    }

    public static void main(String[] args) {
        getGrade(100);
        getGrade(82);
        getGrade(71);
        getGrade(55);
        getGrade(30);
    }
}
