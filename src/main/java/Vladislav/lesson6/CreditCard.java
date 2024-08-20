package Vladislav.lesson6;

//1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//        Добавьте метод, который позволяет начислять сумму на кредитную
//карточку.
//        Добавьте метод, который позволяет снимать с карточки некоторую
//сумму.
//        Добавьте метод, который выводит текущую информацию о карточке.
//        Напишите программу, которая создает три объекта класса CreditCard у
//которых заданы номер счета и начальная сумма
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей.
//Выведите на экран текущее состояние всех трех карточек


public class CreditCard {
    String accountNumber;
    long currentBalance;

    void creditingMoney(long sum) {
        currentBalance += sum;
    }

    void extractionMoney(long sum) {
        currentBalance -= sum;
    }

    CreditCard(String accountNumber, long currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return " information: " +
                "accountNumber = '" + accountNumber + '\'' +
                ", currentBalance = " + currentBalance;
    }
}

