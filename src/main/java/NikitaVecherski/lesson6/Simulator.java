package NikitaVecherski.lesson6;

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

import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {

        CreditCard cardVisa = new CreditCard("Visa", "4243-7152-1318-9922", 1000);
        CreditCard cardMaestro = new CreditCard("Maestro", "4415-1322-1784-1582", 1000);
        CreditCard cardBelcard = new CreditCard("BelCard", "4215-1823-1904-1223", 1000);

        System.out.println("Все доступные к работе карты:");
        System.out.println(cardVisa);
        System.out.println(cardMaestro);
        System.out.println(cardBelcard);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму, которую надо положить на две первые карты: ");
        double moneyIn = scanner.nextDouble();
        cardVisa.addMoney(moneyIn);
        cardMaestro.addMoney(moneyIn);

        System.out.println("Введите число, которое надо снять с третьей карты");
        cardBelcard.getMoney(scanner.nextDouble());

        System.out.println("Карты после работы: ");
        System.out.println(cardVisa);
        System.out.println(cardMaestro);
        System.out.println(cardBelcard);


    }
}
