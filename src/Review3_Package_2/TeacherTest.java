package Review3_Package_2;

import Review3.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        // Only public constructor from another packege review3 is visible
        Teacher t = new Teacher("John", "Smith");

        Teacher.work(); // public method is available
    }
}