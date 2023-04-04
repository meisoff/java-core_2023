package lr2.Example7;

public class BankApp {
    public static void main(String[] args) {
        BankOperations account1 = new BankAccount("123456789", 1000.0);
        System.out.println("Номер счета: " + account1.getAccountNumber());
        System.out.println("Баланс: " + account1.getBalance());

        account1.deposit(500.0);
        System.out.println("Баланс после пополнения: " + account1.getBalance());

        account1.withdraw(200.0);
        System.out.println("Баланс после списания: " + account1.getBalance());
    }
}






