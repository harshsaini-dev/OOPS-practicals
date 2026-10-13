package lab05.q08;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab05.q08.BankAccountMain

class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;
    BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        if (!Double.isFinite(balance) || balance < 0)
            throw new IllegalArgumentException("Invalid opening balance");
        this.balance = balance;
    }
    void deposit(double amount) {
        if (Double.isFinite(amount) && amount > 0) {
            balance += amount;
            System.out.printf("Deposited: %.2f%n", amount);
        } else System.out.println("Deposit rejected");
    }
    boolean withdraw(double amount) {
        boolean success;  // Local status, not an instance field.
        if (!Double.isFinite(amount) || amount <= 0 || amount > balance) {
            success = false;
            System.out.println("Withdrawal rejected");
        } else {
            balance -= amount;
            success = true;
            System.out.printf("Withdrawn: %.2f%n", amount);
        }
        return success;
    }
    double getBalance() { return balance; }
    void displayAccount() {
        System.out.println(accountNo + " - " + accountHolderName);
        System.out.printf("Balance: %.2f%n", getBalance());
    }
}
public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC101", "Aman", 1000);
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000);
        account.displayAccount();
    }
}
