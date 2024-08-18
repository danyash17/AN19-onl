package EugeneFrost.lesson6;

//**task**
//Создать класс CreditCard c полями номер счета, текущая сумма на счету.

//Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке.

//Напишите программу, которая создает три объекта класса CreditCard у
//которых заданы номер счета и начальная сумма

//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей.
//Выведите на экран текущее состояние всех трех карточек.


import java.util.Scanner;

public class ForCreditCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CreditCard first = new CreditCard();
        first.accountID=1;
        first.balance=100.00;
        CreditCard second = new CreditCard();
        second.accountID=2;
        second.balance=200.00;
        CreditCard third = new CreditCard();
        third.accountID=3;
        third.balance=300.00;

//        first.addMoney();
//        second.addMoney();
//        third.takeOffMoney();
//        first.infoCreditCard();
//        second.infoCreditCard();
//        third.infoCreditCard();

        while (true) {
            System.out.print("Введите номер счёта 1-3: ");
            int choiceID = sc.nextInt();

            switch (choiceID) {
                case 1: {
                    first.doOperation();
                    break;
                }
                case 2: {
                    second.doOperation();
                    break;
                }
                case 3: {
                    third.doOperation();
                    break;
                }
                default: {
                    System.out.println("Неверный номер счёта.");
                    break;
                }
            }
            System.out.println("Желаете ли вы продолжить?"+"\n"+
                    " 0 - Нет"+"\n"+
                    " 1 - Да");
            int choice = sc.nextInt();
            if (choice == 0) {
                return;
            }
        }
    }
}


