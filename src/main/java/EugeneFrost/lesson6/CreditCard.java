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
}
