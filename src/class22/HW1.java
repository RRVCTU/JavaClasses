/* Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
 * Define common behavior within parent class and override some methods in child classes.
 * Define some methods specific to child classes.
 * Write example of achieving run time polymorphism.
 */

package class22;
public class HW1 {
    public static void main(String[] args) {
        Student[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student individuals : students) {
            individuals.display();
            individuals.study();
            individuals.rest();
            System.out.println("=====================================");
        }
    }
}
    class Student {
        void display() {
            System.out.println("I am a student");
        }
        void study() {
            System.out.println("Time to study");
        }
        void rest() {
            System.out.println("Time to rest");
        }
    }
    class SyntaxStudent extends Student {
        @Override
        void display() {
            System.out.println("I am a SyntaxStudent");
        }
        @Override
        void rest() {
            System.out.println("Syntax Student do not have time for rest");
        }
        void code() {
            System.out.println("Do Repls and write some code");
        }
    }
    class CollegeStudent extends Student {
        @Override
        void display() {
            System.out.println("I am a College Student");
        }
        @Override
        void rest() {
            System.out.println("Rest time is a party time");
        }
    }

    class SchoolStudent extends Student {
        @Override
        void display() {
            System.out.println("I am a School Student");
        }
        @Override
        void rest() {
            System.out.println("Rest time is a game time");
        }
    }

