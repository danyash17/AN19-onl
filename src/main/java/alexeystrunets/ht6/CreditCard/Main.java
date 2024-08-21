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
//Выведите на экран текущее состояние всех трех карточек

package alexeystrunets.ht6.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("1234567890", 1000.0);
        CreditCard card2 = new CreditCard("0987654321", 500.0);
        CreditCard card3 = new CreditCard("5678901234", 200.0);

        card1.depositAdd(500.0);
        card2.depositAdd(300.0);
        card3.depositTakeOff(150.0);

        System.out.println("Состояние карточек:");
        card1.printCardInfo();
        card2.printCardInfo();
        card3.printCardInfo();
    }
}
