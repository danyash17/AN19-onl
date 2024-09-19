package NikitaZhelezko.homework9;

//Описание: Создайте иерархию исключений для обработки различных типов ошибок, связанных с банковскими операциями. Реализуйте следующие классы исключений:
//
//BankException (базовый класс)
//InsufficientFundsException (для случаев, когда на счету недостаточно средств)
//AccountNotFoundException (для случаев, когда аккаунт не найден)
//Задание: Напишите метод, который будет выполнять перевод средств между двумя аккаунтами. Если возникает ошибка, выбрасывайте соответствующее исключение. Обработайте исключения в методе main.
// Базовое исключение для банковских операций

class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends BankException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


class AccountNotFoundException extends BankException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}


class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств на счете " + accountNumber);
        }
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}


class Bank {
    public static void transfer(Account fromAccount, Account toAccount, double amount) throws BankException {
        if (fromAccount == null) {
            throw new AccountNotFoundException("Аккаунт отправителя не найден.");
        }
        if (toAccount == null) {
            throw new AccountNotFoundException("Аккаунт получателя не найден.");
        }
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
        System.out.println("Перевод выполнен успешно. Переведено: " + amount);
    }
}


public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("12345", 500);
        Account account2 = new Account("67890", 1000);

        try {
            Bank.transfer(account1, account2, 300);
            Bank.transfer(account1, account2, 300);
        } catch (BankException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

