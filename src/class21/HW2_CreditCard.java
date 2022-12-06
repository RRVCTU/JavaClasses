package class21;

public class HW2_CreditCard {

    public static void main(String[] args) {
        CreditCard call1 = new CreditCard();
        Visa call2 = new Visa();
        AX call3 = new AX();
        call1.interestAmount(10000, 2.5);
        call2.interestAmount(20000, 3.5);
        call3.interestAmount(30000, 4.5);
    }
}

class CreditCard {
    public static double balance;
    public static double interest;

    void interestAmount(double balance, double interest) {
        System.out.println("This is the Visa and other CC interest: "+(balance*interest));
        }
    }

class Visa extends CreditCard{ }
class AX extends CreditCard{
    void interestAmount(double balance, double interest) {
        System.out.println("This is the AX interest: " + (balance * interest + .5));
    }
}
