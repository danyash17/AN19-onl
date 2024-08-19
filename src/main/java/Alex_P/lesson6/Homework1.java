package Alex_P.lesson6;

//Основное задание
//
//Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//        Добавьте метод, который позволяет начислять сумму на кредитную
//карточку.
//        Добавьте метод, который позволяет снимать с карточки некоторую
//сумму.
//        Добавьте метод, который выводит текущую информацию о карточке.
//        Напишите программу, которая создает три объекта класса CreditCard у
//которых заданы номер счета и начальная сумма
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей.
//Выведите на экран текущее состояние всех трех карточек.

public class Homework1 {
    public static void main(String[] args) {
        CreditCard cardOne = new CreditCard(123, 1000);
        CreditCard cardTwo = new CreditCard(2345, 1000);
        CreditCard cardThree = new CreditCard(5657, 1000);

        cardOne.increaseBalance(222);
        cardTwo.increaseBalance(333);
        cardThree.decreaseBalance(111);

        cardOne.printCreditCard();
        cardTwo.printCreditCard();
        cardThree.printCreditCard();
    }
}
