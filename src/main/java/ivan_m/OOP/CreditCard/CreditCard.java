package ivan_m.OOP.CreditCard;

import java.util.Scanner;

public class CreditCard {

    private final String accountNumber;
    private double money;


    public CreditCard(String accountNumber, int money) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public void chargeCard(double newMoney) {
        money += newMoney;
        System.out.println("Операция проведена успешно!");
    }

    public void withdrawTheAmount(double loseMoney) {
        if (money >= loseMoney) {
            money -= loseMoney;
            System.out.println("Операция проведена успешно!");
        } else {
            System.out.println("Операция отклонена! На карте недостаточно средств!");
        }
    }

    @Override
    public String toString() {
        return "Номер счёта - " + accountNumber +
                "\nCумма на счёте - " + money + "$";
    }

    public void toStringAll(CreditCard card1, CreditCard card2, CreditCard card3) {
        System.out.println("Баланс карты с номером " + card1.accountNumber + " - " + card1.money + "$\n" +
                "Баланс карты с номером " + card2.accountNumber + " - " + card2.money + "$\n" +
                "Баланс карты с номером " + card3.accountNumber + " - " + card3.money + "$\n");
    }
}
