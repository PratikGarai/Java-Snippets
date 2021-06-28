import Bank.Account;

public class Account_Main {
    public static void main(String[] args) {
        Account acc = new Account(128890, 5000, "Pratik Garai", "pratikgarai123@gmail.com", 7788778899L);
        acc.withdraw(10000.00F);
        acc.deposit(8000.00F);
        acc.withdraw(10000.00F);
    }
}