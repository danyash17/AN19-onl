package vadimavetisov.lesson6;

import java.util.Arrays;

public class lesson6_homework1 {
    //1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
    //Добавьте метод, который позволяет начислять сумму на кредитную
    //карточку.
    //Добавьте метод, который позволяет снимать с карточки некоторую
    //сумму.
    //Добавьте метод, который выводит текущую информацию о карточке.
    //Напишите программу, которая создает три объекта класса CreditCard у
    //которых заданы номер счета и начальная сумма
    //Тестовый сценарий для проверки:
    //Положите деньги на первые две карточки и снимите с третьей.
    //Выведите на экран текущее состояние всех трех карточек.

    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("6321 8756 3257 6553", "Charlize Theron", 5000L);
        CreditCard card2 = new CreditCard("9525 3255 4684 1653", "Mel Gibson", 3000L);
        CreditCard card3 = new CreditCard("1654 4896 3168 8465", "Michael Jackson", 1000L);

        card1.moneyIn();
        card2.moneyIn();
        card3.moneyOut();

        card1.info();
        card2.info();
        card3.info();

    }
}