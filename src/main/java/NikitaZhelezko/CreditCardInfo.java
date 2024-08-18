package NikitaZhelezko;

public class CreditCardInfo {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("1111 2222 3333 4444", 5000);
        CreditCard card2 = new CreditCard("5555 6666 7777 8888", 10000);
        CreditCard card3 = new CreditCard("9999 0000 1111 2222", 11111);
        card1.deposit(2000);
        card2.deposit(200);
        card3.withdraw(4234.6);
        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}
