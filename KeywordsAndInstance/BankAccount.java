
class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Bank: " + bankName);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("John", 1001);
        BankAccount acc2 = new BankAccount("Alice", 1002);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}
