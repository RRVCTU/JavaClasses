package class12;

public class StringDemo {
    public static void main(String[] args) {
        String str = new String("Java");
        String name = "Asma Alfadhli The Great";

        // Counts the number of characters in a string including the space

        System.out.println(str.length());
        System.out.println(name.length());
        if(name.length()>15) {
            System.out.println("Name can't be more than 15 characters");
        }
    }
}
