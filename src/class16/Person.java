package class16;

public class Person {

    private String password = "pass123"; // private variable accessed only from the same class (highest level of privacy)
    public String name = "Roman"; // public variable, any class in whole project can access public variable
    int salary = 1000; // default variable, only classes in the same package (package class 16) can access this variable
    protected int bonus; // protected variable, accessible from this class (class Person) and can be accessed through inheritance

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.password);
        System.out.println(person1.salary);

        Bank bank = new Bank(); // we can create the object of the class Bank because it is the same package,
        // but if the Bank class will be public, we can create the object in any place of the project.
    }
}

class Bank {

}
