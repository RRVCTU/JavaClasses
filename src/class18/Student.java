package class18;

public class Student {
    /*
    Write a java Class Student that have a constructor which takes students name and
    3 subject grades. Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables.
     */
    String name;
    double subj1;
    double subj2;
    double subj3;

    Student(String studentName, double sub1, double sub2, double sub3) {
        name = studentName;
        subj1 = sub1;
        subj2 = sub2;
        subj3 = sub3;
    }

    void calculatePrintAvgGrade() {
        System.out.println(name + " " + (subj1 + subj2 + subj3) / 3);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Sabah", 99, 98, 97.5);
        student1.calculatePrintAvgGrade();

        Student student2 = new Student("Josh", 100, 88, 96);
        student2.calculatePrintAvgGrade();

        Student student3 = new Student("Alex", 90, 92, 96);
        student3.calculatePrintAvgGrade();
    }
}
