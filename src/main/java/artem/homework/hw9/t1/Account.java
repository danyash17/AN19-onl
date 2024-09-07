package artem.homework.hw9.t1;

public class Account {
    private String accountNumber;
    private double accountBalance;

    public Account(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public void withdraw(double amount) throws BankException {
        if (this.accountBalance < amount) {
            throw new InsufficientFundsException("Не хватает средств на аккаунте: " + this.accountNumber);
        }
        this.accountBalance -= amount;
    }
}
