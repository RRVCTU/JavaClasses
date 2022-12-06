package ReviewClass12;

import java.util.ArrayList;

public class ListDemoWithCustomClass {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Josh", "Platin", "123"));
        students.add(new Student("Adam", "Park", "123"));
        students.add(new Student("Yusuf", "Engin", "123"));
        students.add(new Student("Cam", "Jo", "123"));

/*        System.out.println(students); // prints all elements of the "students" list

        // Enhanced for loop, prints all elements of the list, one-by-one
        for (Student student : students) {
            student.printName();
        }*/

        Student joshAgain = new Student("John", "Plantin", "123");
        System.out.println(students.contains(joshAgain));
        System.out.println(joshAgain);
        System.out.println(students);
    }
}
