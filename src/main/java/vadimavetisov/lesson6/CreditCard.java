package vadimavetisov.lesson6;

import java.util.Scanner;

public class CreditCard {

    private static final String ANSI_RESET = "\u001B[0m";
    ;
    private static final String ANSI_CYAN = "\u001B[36m";
    ;
    private static final String ANSI_GREEN = "\u001B[32m";

    String account;
    Long balance;
    String name;

    public CreditCard(String account, String name, Long balance) {
        this.account = account;
        this.name = name;
        this.balance = balance;

    }

    Scanner scanner = new Scanner(System.in);

    public void moneyIn() {
        System.out.println(ANSI_CYAN + "Кредитная карта №: " + ANSI_RESET + ANSI_GREEN + account + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Владелец карты: " + ANSI_RESET + ANSI_GREEN + name + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Текущий баланс: " + ANSI_RESET + ANSI_GREEN + balance + " USD" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Пополнить USD: " + ANSI_RESET);

        int scanIntIn = scanner.nextInt();

        balance += scanIntIn;

        System.out.println();
    }

    public void moneyOut() {
        System.out.println(ANSI_CYAN + "Кредитная карта № " + ANSI_RESET + ANSI_GREEN + account + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Владелец карты: " + ANSI_RESET + ANSI_GREEN + name + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Текущий баланс: " + ANSI_RESET + ANSI_GREEN + balance + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Снять USD: " + ANSI_RESET);

        int scanIntOut = scanner.nextInt();

        balance -= scanIntOut;

        System.out.println();
    }

    public void info() {
        System.out.println(ANSI_CYAN + "Кредитная карта № " + ANSI_RESET + ANSI_GREEN + account + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Владелец карты: " + ANSI_RESET + ANSI_GREEN + name + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Текущий баланс: " + ANSI_RESET + ANSI_GREEN + balance + ANSI_RESET);

        System.out.println();
    }

}