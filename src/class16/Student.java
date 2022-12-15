package class16;

public class Student {
    /*
    Create a Class called Students. Create three variables studentName, studentID, and numberOfStudents.
    Create three objects of the Students Class.
    Set the value for studentName, studentId and increment the numberOfStudents for each object.
    Print out total number of students
     */
    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Student roman = new Student();
        roman.id = "1";
        roman.name = "Ivan";
        Student.numberOfStudents ++;

        Student sonamKapor = new Student();
        sonamKapor.id = "2";
        sonamKapor.name = "Sonam";
        Student.numberOfStudents ++;

        System.out.println(Student.numberOfStudents);
        System.out.println(Student.numberOfStudents);
    }
}
