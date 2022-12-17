package class18;
/*
Write Book class that will have instance variables and 2 Constructors.
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
 */
public class HW_02 {
    String bookName;
    int yearOfPublication;

    HW_02() {}
    HW_02(String bookName, int yearOfPublication) {
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
    }

    public static void main(String[] args) {
        HW_02 book1 = new HW_02();
        book1.bookName = "Java tutorial";
        System.out.println(book1.bookName);

        HW_02 book2 = new HW_02("Selenium tutorial", 2022);
        System.out.println(book2.bookName + " "+ book2.yearOfPublication);

    }

}
