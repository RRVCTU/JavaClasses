package Review3;

public class Teacher {
    String name, lname;
    String subject;
    int experience;
    double salary;

    static String school;

    // this. - used to refer to the current object : instance variables
    //                                             : instance methods

    Teacher(String name, String lname) {
        this.name = name;
        this.lname = lname;
    }

    // this() = refers to the current object : current class constructor
    Teacher(String name, String lname, String subject) {
        this(name, lname);
        this.subject = subject;
    }

    Teacher(String name, String lname, int experience) {
        this(name, lname);
        this.experience = experience;
    }

    // static method can work with only other static variables, not instance variables.
    static void work() {
        System.out.println("All teachers work at "+school);
    }

    void print(){
        work();
        System.out.println("Teacher name is "+name+" "+lname);
    }

    void teach(){
        this.print(); // we can call another method from the current method
        System.out.println(name+" teaches "+subject);
    }

    //method that will calculate bonus based on years of experience and returns it
    double getBonus() {
        if(experience<5) {
            return 3;
        } else {
            return 3.5;
        }
    }
}
