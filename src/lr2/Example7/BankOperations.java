package lr2.Example7;

public interface BankOperations {
    String getAccountNumber();
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}
