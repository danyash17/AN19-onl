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

public class Task1 {
    public static void main(String[] args) {
        CreditCard firstCard = new CreditCard(1234, 35);
        CreditCard secondCard = new CreditCard(2344, 3445);
        CreditCard thirdCard = new CreditCard(6787, 343);

        addMoney(firstCard, 123);
        addMoney(secondCard, 75);
        withdrawMoney(thirdCard, 32);

        firstCard.showAccountInfo();
        secondCard.showAccountInfo();
        thirdCard.showAccountInfo();

    }

    private static void addMoney(CreditCard card, double amount) {
        if (card.addMoney(amount)) {
            System.out.println("Balance increased on: " + amount);
        } else {
            System.out.println("Operation Failed");
        }
    }

    private static void withdrawMoney(CreditCard card, double amount) {
        if (card.withdrawMoney(amount)) {
            System.out.println("Balance decreased on: " + amount);
        } else {
            System.out.println("Operation Failed");
        }
    }
}
