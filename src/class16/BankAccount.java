package class16;

public class BankAccount {
    private String username; // we don't want to share the username with other people
    private String password; // especially we don't want to share our password;
    int accountNumber; // but we need to share out accountNumber sometimes, so default access is good here.
    public String bankName; // bank name is openly available information, so we can use public access modifier

    public void printBankName() {
        System.out.println(bankName);
    }

    private void printUserName() {
        System.out.println(username);
    }

    void printAccountNumber() {
        System.out.println(accountNumber);
    }
}
