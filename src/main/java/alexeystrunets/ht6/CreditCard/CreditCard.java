
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

public class CreditCard {
    public String accountNumber;
    public double currentBalance;

    public CreditCard(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = initialBalance;
    }

    public void depositAdd(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("Сумма " + amount + " успешно начислена на счет " + accountNumber + ". Текущий баланс: " + currentBalance);
        } else {
            System.out.println("Ошибка: Сумма для зачисления должна быть больше 0.");
        }
    }

    public boolean depositTakeOff(double takeOf) {
        if (takeOf > 0 && takeOf <= currentBalance) {
            currentBalance -= takeOf;
            System.out.println("Сумма " + takeOf + " успешно снята со счета " + accountNumber + ". Текущий баланс: " + currentBalance);
            return true;
        } else {
            System.out.println("Ошибка: Недостаточно средств на счете " + accountNumber + " или указана неверная сумма.");
            return false;
        }
    }

    public void printCardInfo() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Текущий баланс: " + currentBalance);
    }
}

