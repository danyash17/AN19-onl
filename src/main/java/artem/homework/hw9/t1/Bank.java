package artem.homework.hw9.t1;

    //Описание: Создайте иерархию исключений для обработки различных типов ошибок,
    //связанных с банковскими операциями. Реализуйте следующие классы исключений:
    //
    //BankException (базовый класс)
    //InsufficientFundsException (для случаев, когда на счету недостаточно средств)
    //AccountNotFoundException (для случаев, когда аккаунт не найден)
    //Задание: Напишите метод, который будет выполнять перевод средств между двумя аккаунтами.
    //Если возникает ошибка, выбрасывайте соответствующее исключение. Обработайте исключения в
    //методе main.

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accountsByAccountNumbers = new HashMap<>();

    public void addAccount(Account account) {
        this.accountsByAccountNumbers.put(account.getAccountNumber(), account);
    }

    public void transfer(double amount, String fromAccountNumber, String toAccountNumber) throws BankException {
        Account fromAccount = this.accountsByAccountNumbers.get(fromAccountNumber);
        Account toAccount = this.accountsByAccountNumbers.get(toAccountNumber);

        if (fromAccount == null) {
            throw new AccountNotFoundException("Аккаунт: " + fromAccountNumber + " не существует");
        }
        if (toAccount == null) {
            throw new AccountNotFoundException("Аккаунт: " + toAccountNumber + " не существует");
        }
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account firstAccount = new Account("1111", 120);
        Account secondAccount = new Account("2222");

        bank.addAccount(firstAccount);
        bank.addAccount(secondAccount);

        try {
            System.out.println("\nПопытка 1");
            System.out.println("Баланс первого аккаунта: " + firstAccount.getAccountBalance());
            System.out.println("Баланс второго аккаунта: " + secondAccount.getAccountBalance());

            bank.transfer(100, firstAccount.getAccountNumber(), secondAccount.getAccountNumber());

            System.out.println("Баланс первого аккаунта: " + firstAccount.getAccountBalance());
            System.out.println("Баланс второго аккаунта: " + secondAccount.getAccountBalance());

        } catch (BankException e) {
            System.out.println("Ошибка перевода: " + e.getMessage());;
        }

        try {
            System.out.println("\nПопытка 2");
            System.out.println("Баланс первого аккаунта: " + firstAccount.getAccountBalance());
            System.out.println("Баланс второго аккаунта: " + secondAccount.getAccountBalance());

            bank.transfer(100, firstAccount.getAccountNumber(), secondAccount.getAccountNumber());

            System.out.println("Баланс первого аккаунта: " + firstAccount.getAccountBalance());
            System.out.println("Баланс второго аккаунта: " + secondAccount.getAccountBalance());

        } catch (BankException e) {
            System.out.println("Ошибка перевода: " + e.getMessage());;
        }

        try {
            System.out.println("\nПопытка 3");
            System.out.println("Баланс первого аккаунта: " + firstAccount.getAccountBalance());
            System.out.println("Баланс второго аккаунта: " + secondAccount.getAccountBalance());

            bank.transfer(10, firstAccount.getAccountNumber(), "4444");

            System.out.println("Баланс первого аккаунта: " + firstAccount.getAccountBalance());
            System.out.println("Баланс второго аккаунта: " + secondAccount.getAccountBalance());

        } catch (BankException e) {
            System.out.println("Ошибка перевода: " + e.getMessage());;
        }
    }
}




