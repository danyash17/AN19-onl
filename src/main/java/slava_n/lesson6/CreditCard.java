package slava_n.lesson6;

public class CreditCard {

    //Создать класс CreditCard c полями номер счета, текущая сумма на счету.
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

    int creditNumber;
    long currentBalance;

    CreditCard(int creditNumber, long currentBalance) {
        this.creditNumber = creditNumber;
        this.currentBalance = currentBalance;
    }


    void addDebit(long sum) {
        currentBalance += sum;
    }

    void addCredit(long sum) {
        currentBalance -= sum;
    }

    void showInfo() {
        System.out.println("Информация о вашей карте: ");
        System.out.print("  Номер карточки: " + creditNumber + ";");
        System.out.print("  Текущий баланс: " + currentBalance + ".");
        System.out.println();
    }

}
