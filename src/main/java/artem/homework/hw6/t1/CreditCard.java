package artem.homework.hw6.t1;

    /*Создать класс CreditCard c полями номер счета, текущая сумма на счету.
      Добавьте метод, который позволяет начислять сумму на кредитную карточку.

      Добавьте метод, который позволяет снимать с карточки некоторую
      сумму.

      Добавьте метод, который выводит текущую информацию о карточке.

      Напишите программу, которая создает три объекта класса CreditCard у
      которых заданы номер счета и начальная сумма. Тестовый сценарий для проверки:
      Положите деньги на первые две карточки и снимите с третьей.
      Выведите на экран текущее состояние всех трех карточек*/

public class CreditCard {
    private int accountNumber;
    private double balance;

    private static int totalCardNumber = 0;

    public CreditCard(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalCardNumber ++;
    }

    public boolean addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdrawMoney(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void showAccountInfo() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Current Balance: " + this.balance);
        System.out.println("Total Cards: " + totalCardNumber);
    }
}
