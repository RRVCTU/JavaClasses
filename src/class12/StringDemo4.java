package class12;

public class StringDemo4 {
    public static void main(String[] args) {
        String str = "Shah";
        String str2 = "Shah";
        String str3 = new String("Shah");

        if (str.equals(str3)) {
            System.out.println("I found it");
        }

        if (str.equalsIgnoreCase("shah")) {
            System.out.println("I found it with equalsIgnoreCase");
        }
    }
}
