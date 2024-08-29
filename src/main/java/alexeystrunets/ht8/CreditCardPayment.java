package alexeystrunets.ht8;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Обработка платежа на сумму: " + amount + " рублей.");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Возврат платежа на сумму: " + amount + " рублей.");
    }
        }

