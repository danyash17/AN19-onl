package EugeneFrost.lesson6;
//**task**
//Создать класс CreditCard c полями номер счета, текущая сумма на счету.

//Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке.

import java.util.Scanner;

public class CreditCard {
    Scanner scan = new Scanner(System.in);
    public int accountID;
    public double balance;

    public void addMoney() {
        System.out.print("Введите сумму для пополнения: ");
        int n = scan.nextInt();
        balance += n;
    };

    public void takeOffMoney() {
        System.out.print("Введите сумму которую необходимо снять: ");
        int n = scan.nextInt();
        balance -= n;
    };

    public void infoCreditCard() {
        System.out.println("Информация о счёте " + accountID+":\t"+balance);
    };

    public void doOperation(){
        System.out.print("Введите необходимое дейстие:" + "\n" +
                " 1 - Пополнить счёт" + "\n" +
                " 2 - Вывод средств" + "\n" +
                " 3 - Информация о счёте" + "\n");
        int choiceFunc = scan.nextInt();

        switch (choiceFunc) {
            case 1: {
                addMoney();
                break;
            }
            case 2: {
                takeOffMoney();
                break;
            }
            case 3: {
                infoCreditCard();
                break;
            }
            default:{
                System.out.println("Неверная команда!");
                break;
            }
        }
    }
}
