package lab04.q07;

// Compile from this lab folder: javac -d build *.java
// Run: java -cp build lab04.q07.BankAccountMain

class BankAccount {
    private double balance;
    BankAccount(double balance) {
        if (!Double.isFinite(balance) || balance < 0)
            throw new IllegalArgumentException("Invalid opening balance");
        this.balance = balance;
    }
    void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0)
            System.out.println("Deposit rejected");
        else { balance += amount; System.out.println("Deposit accepted"); }
    }
    void displayBalance() { System.out.printf("Balance: %.2f%n", balance); }
}
public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.deposit(-100);
        account.displayBalance();
    }
}
