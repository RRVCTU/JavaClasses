package class12;

public class StringDemo2 {
    public static void main(String[] args) {

        String firstName = "Olena";
        String lastName = "Dudka";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(" ").concat(lastName));

        String str = " ";
        System.out.println(str.isEmpty()); // check if the string is empty or not. space is still an element and string is not empty.
        System.out.println(str.isBlank()); // check and return true or false if the string is blank
    }
}
