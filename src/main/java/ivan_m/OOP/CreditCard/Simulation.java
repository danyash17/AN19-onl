package ivan_m.OOP.CreditCard;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberOfAcc;
        int money;
        int numberOfCard, numberOfAction;
        System.out.println("Добрый день, уважаемый пользователь!");

        System.out.println("Введите номер счёта первой карты: ");
        numberOfAcc = String.valueOf(scanner.nextLine());
        System.out.println("Введите начальную сумму на счёте первой карты: ");
        money = Integer.parseInt(scanner.nextLine());
        CreditCard card1 = new CreditCard(numberOfAcc, money);

        System.out.println("Введите номер счёта второй карты: ");
        numberOfAcc = String.valueOf(scanner.nextLine());
        System.out.println("Начальную сумму на счёте второй карты: ");
        money = Integer.parseInt(scanner.nextLine());
        CreditCard card2 = new CreditCard(numberOfAcc, money);

        System.out.println("Введите номер счёта третьей карты: ");
        numberOfAcc = String.valueOf(scanner.nextLine());
        System.out.println("Начальную сумму на счёте третьей карты: ");
        money = Integer.parseInt(scanner.nextLine());
        CreditCard card3 = new CreditCard(numberOfAcc, money);

        CreditCard activeCard = null;
        do {
            System.out.println("Выберите номер карты, операцию над которой Вы хотите провести :");
            numberOfCard = scanner.nextInt();
            switch (numberOfCard) {
                case 1:
                    activeCard = card1;
                    break;
                case 2:
                    activeCard = card2;
                    break;
                case 3:
                    activeCard = card3;
                    break;
            }

            System.out.println("Выберите операцию, которую хотите провести :\n" +
                    "1 - Пополнить счёт\n" +
                    "2 - Снять наличные со счёта\n" +
                    "3 - Вывести информацию о всех картах\n" +
                    "4 - Выйти");
            numberOfAction = scanner.nextInt();
            switch (numberOfAction) {
                case 1:
                    System.out.println("Введите сумму пополнения:");
                    activeCard.chargeCard(scanner.nextDouble());
                    System.out.println(activeCard.toString());
                    break;
                case 2:
                    System.out.println("Введите сумму которую хотите снять:");
                    activeCard.withdrawTheAmount(scanner.nextDouble());
                    System.out.println(activeCard.toString());
                    break;
                case 3:
                    activeCard.toStringAll(card1, card2, card3);
                    break;
                case 4:
                    System.out.println("Cпасибо за то, что пользовались услугами нашего банка!");
                    break;
            }
        } while (numberOfAction != 4);

    }
}
