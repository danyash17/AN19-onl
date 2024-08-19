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
        creditCard visa = new creditCard();
        visa.checkNum = ("4246 4100 7415 8417");
        visa.money = 1000;

        creditCard masterCard = new creditCard();
        masterCard.checkNum = ("4100 4137 4118 2703");
        masterCard.money = 1000;

        creditCard belCard = new creditCard();
        belCard.checkNum = ("4224 1717 1898 2203");
        belCard.money = 1000;

        System.out.println("Все доступные к работе карты:\n     1)Visa:");
        visa.seeMoney();
        visa.seeCheckNum();
        System.out.println("    2) MasterCard");
        masterCard.seeMoney();
        masterCard.seeCheckNum();
        System.out.println("    3) БелКарт");
        belCard.seeMoney();
        belCard.seeCheckNum();

        System.out.println("Введите сумму, которую вы хотите положить на счет первых двух карт");
        Scanner scanner = new Scanner(System.in);
        double add = scanner.nextDouble();

        visa.addMoney(add);
        masterCard.addMoney(add);

        System.out.println("Введите сумму, которую вы хотите снять с третьей карты: ");
        double get = scanner.nextDouble();
        if (get > belCard.money){
            System.out.println("Недостаточно денег на третьей карте");
            System.out.println("Конечный результат работы:\n 1)Visa ");
            visa.seeMoney();
            System.out.println("2)MasterCard");
            masterCard.seeMoney();
            System.out.println("3)БелКарт");
            belCard.seeMoney();
        }
        else {
            belCard.getMoney(get);
            System.out.println("Конечный результат работы:\n 1)Visa ");
            visa.seeMoney();
            System.out.println("2)MasterCard");
            masterCard.seeMoney();
            System.out.println("3)БелКарт");
            belCard.seeMoney();
        }


    }
}
