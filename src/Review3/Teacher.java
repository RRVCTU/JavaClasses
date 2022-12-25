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

    static void work() {
        System.out.println("All teachers work at "+school);
    }

    void print(){
        System.out.println("Teacher name is "+name+" "+lname);
    }

    void teach(){
        this.print(); // we can call another method from the current method
        print();      // same call method, but different syntax
        System.out.println(name+" teaches "+subject);
    }
}
