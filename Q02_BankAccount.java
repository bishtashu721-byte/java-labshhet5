class BankAccount {
    private String accountNumber, accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = Math.max(0, balance);
    }
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }
    public void setAccountHolder(String name) { accountHolder = name; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else System.out.println("Invalid deposit amount.");
    }
    public void withdraw(double amount) {
        if (amount <= 0) System.out.println("Invalid withdrawal amount.");
        else if (amount > balance) System.out.println("Insufficient balance.");
        else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
}
public class Q02_BankAccount {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("AC101", "Aman", 5000);
        a.deposit(1000);
        a.withdraw(1500);
        a.withdraw(9000);
        System.out.println("Account Holder: " + a.getAccountHolder());
        System.out.println("Balance: " + a.getBalance());
    }
}
