package Vladislav.lesson6;

import java.util.Scanner;

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

public class CardOperations {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("16748295739", 10);

        CreditCard creditCard2 = new CreditCard("43773238967", 25);

        CreditCard creditCard3 = new CreditCard("07632436634", 172);

        System.out.println("card1" + creditCard1 + "\n" +
                "card2" + creditCard2 + "\n" +
                "card3" + creditCard3);

        Scanner s = new Scanner(System.in);
        System.out.println("1.Вы хотите положить деньги на карту 1 \n" +
                "2.Вы хотите положить деньги на карту 2 \n" +
                "3.Вы хотите снять деньги с карты 3 \n" +
                "Введите номер операции:");
        long inputInt = s.nextInt();
        if (inputInt == 1) {
            System.out.println("Сколько закидываем?");
            long inputInt1 = s.nextInt();
            creditCard1.creditingMoney(inputInt1);
        }

        if (inputInt == 2) {
            System.out.println("Сколько закидываем?");
            long inputInt2 = s.nextInt();
            creditCard2.creditingMoney(inputInt2);
        }


        if (inputInt == 3) {
            System.out.println("Сколько снимаем?");
            long inputInt3 = s.nextInt();
            creditCard3.extractionMoney(inputInt3);
        }

        System.out.println("card1" + creditCard1 + "\n" +
                "card2" + creditCard2 + "\n" +
                "card3" + creditCard3);

    }
}
