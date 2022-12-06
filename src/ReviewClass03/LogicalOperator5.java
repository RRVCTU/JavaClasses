package ReviewClass03;

public class LogicalOperator5 {

    public static void main(String[] args) {
        String country = "Spain";

        if (country.equals("Turkey") || country.equals("Japan") || country.equals("Spain")) {
            System.out.println("Welcome to USA");
        }

        if (!country.equals("Korea")) {
            System.out.println("Welcome to USA");
        }
    }
}
