package Alex_P.lesson6;

public class CreditCard {
    int accountNumber;
    int currentBalance;
    int increaseSum;
    int decreaseSum;

    public CreditCard(int accountNumber, int currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public void increaseBalance(int increaseSum) {
        this.increaseSum = increaseSum;
        currentBalance += increaseSum;
    }

    public void decreaseBalance(int decreaseSum) {
        this.decreaseSum = decreaseSum;
        currentBalance -= decreaseSum;
    }

    public void printCreditCard() {
        System.out.println("Account number №" + accountNumber + " have " + currentBalance + "$");
    }
}
