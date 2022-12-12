package class14;

public class HW_05 {

    // Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete email Address.
    // Example: createEmail(John, Snow, gmail) => johnsnow@gmail.com

    static void createEmail(String firstName, String lastName, String email) {
        String fullemail = "";
        fullemail = fullemail + firstName.toLowerCase();
        fullemail = fullemail + lastName.toLowerCase();
        fullemail += "@";
        fullemail += email.toLowerCase();
        System.out.println(fullemail);
    }

    public static void main(String[] args) {
        createEmail("John", "Snow", "gmail");
    }
}
