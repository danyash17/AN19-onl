package lialiuika;


public class CreditCard {
    public int accountNumber;//переменные
    public double actualBalance;

    public CreditCard(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber; //вызов из переменной из класса
        this.actualBalance = initialBalance;
    }

    public void amountAdded(double amount) {
        if (amount > 0) { //проверка на положительность зачисления
            actualBalance += amount;
            System.out.println("Your balance is" + actualBalance);
        } else {
            System.out.println("Error!");
        }
    }

    public boolean cardCharging(double charge) {
        if (charge > 0 ) { // проверка что списание больше нуля можно добавить в теории чтобы не больше суммы если карта дебетовая через &&
            actualBalance -= charge;
            System.out.println("You were charged for" + charge);
            return true;
        } else {
            System.out.println("Error!");
            return false;
        }
    }

    public void showData() {
        System.out.println("Personal number " + accountNumber);  //вывод в консоль
        System.out.println("Current balance: " + actualBalance);
    }
}