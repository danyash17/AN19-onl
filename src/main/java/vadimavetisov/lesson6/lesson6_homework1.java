package vadimavetisov.lesson6;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);

        CreditCard card1 = new CreditCard("1", 5000L);
        CreditCard card2 = new CreditCard("2", 3000L);
        CreditCard card3 = new CreditCard("3", 1000L);

        System.out.println("Пополнить USD: ");
        card1.moneyIn(scanner.nextLong());

        System.out.println("\nПополнить USD: ");
        card2.moneyIn(scanner.nextLong());

        System.out.println("\nСнять USD: ");
        card3.moneyOut(scanner.nextLong());

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

    }
}