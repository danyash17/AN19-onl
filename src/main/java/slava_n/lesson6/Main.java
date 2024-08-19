package slava_n.lesson6;

public class Main {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(256673232, 0);
        CreditCard card2 = new CreditCard(356673234, 0);
        CreditCard card3 = new CreditCard(156673232, 100000);

        card1.addDebit(10000);
        card2.addDebit(20000);
        card3.addCredit(5000);

        card1.showInfo();
        card2.showInfo();
        card3.showInfo();

        Book book1 = new Book("Dream", "Nefodiy Garman", 123.22, 2013);
        book1.getInfo();

        Counter count1 = new Counter(10);
        count1.increase(10);
        count1.decrease(2);
        count1.resetCount();
        count1.getCountInfo();

    }
}
