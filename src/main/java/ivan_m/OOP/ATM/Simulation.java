package ivan_m.OOP.ATM;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(10, 5, 2);

        System.out.println("Введите через пробел количество 20ток, 50ток и 100ок, которые хотите добавить :");
        atm.AddMoney(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(atm.toString());

        System.out.println("Введите сумму, которую хотите снять:");
        int moneyOut = scanner.nextInt();
        if (atm.MoneyOutput(moneyOut)){
            System.out.println("Операция проведена успешно!");
            System.out.println(atm.toString());
        }
        else {
            System.out.println("Операция отклонена!");
            System.out.println(atm.toString());
        }
    }
}
