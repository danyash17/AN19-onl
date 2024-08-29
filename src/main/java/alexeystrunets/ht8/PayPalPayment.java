package alexeystrunets.ht8;

public class PayPalPayment implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Обработка платежа через PayPal на сумму: " + amount + " рублей.");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Возврат платежа через PayPal на сумму: " + amount + " рублей.");
    }
}
