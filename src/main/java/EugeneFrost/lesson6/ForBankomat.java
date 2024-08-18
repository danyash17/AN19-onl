package EugeneFrost.lesson6;

//**task**
//Создать класс, описывающий банкомат.
//Набор купюр, находящихся в банкомате, должен задаваться тремя
//свойствами:
//количеством купюр номиналом 20, 50 и 100.
//Сделать метод для добавления денег в банкомат.
//Сделать функцию, снимающую деньги, которая принимает сумму денег,
//а возвращает булевое значение - успешность выполнения операции.
//При снятии денег функция должна распечатывать каким количеством
//купюр какого номинала выдаётся сумма.
//Создать конструктор с тремя параметрами - количеством купюр каждого
//номинала.

import java.util.Scanner;

public class ForBankomat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму для снятия: ");
        int n = sc.nextInt();
        Banknotes bankomat = new Banknotes(10, 5, 3);
        bankomat.AddToBankomat(5, 2, 1);
        boolean result = bankomat.WithdrawMoney(n);
        if (result) {
            System.out.println("Успешно!");
        } else {
            System.out.println("Ошибка!");
        }
    }
}


