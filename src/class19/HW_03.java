package class19;
/*
Write a Java program called Teacher.
Identify features and behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their
own features and behaviour. Test all 4 classes
 */
public class HW_03 {
    public static void main(String[] args) {
        Teacher teacherObj = new Teacher();
        teacherObj.displayInfo();
        System.out.println("---------------------------------------");

        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name = "Josh";
        mathTeacher.subject = "Math";
        mathTeacher.displayInfo();
        mathTeacher.teach();
        System.out.println("---------------------------------------");

        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
        chemistryTeacher.name = "Samantha";
        chemistryTeacher.subject = "Chemistry";
        chemistryTeacher.displayInfo();
        chemistryTeacher.teach();
        System.out.println("---------------------------------------");

        PianoTeacher pianoTeacher = new PianoTeacher();
        pianoTeacher.name = "Anna";
        pianoTeacher.subject = "Music";
        pianoTeacher.displayInfo();
        pianoTeacher.teach();
    }
}

class Teacher{
    String name;
    String subject;

    void displayInfo(){
        System.out.println(name+" teaches "+subject);
    }
}
class MathTeacher extends Teacher{
    void teach() {
        System.out.println(name + " teaches algorithms");
    }
}
class ChemistryTeacher extends Teacher{
    void teach() {
        System.out.println(name + " teaches chemical reactions");
    }
}
class PianoTeacher extends Teacher {
    void teach() {
        System.out.println(name + " teaches how to play a piano");
    }
}

