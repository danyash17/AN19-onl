package alexeystrunets.ht8;

public class MainPayment {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment paypalPayment = new PayPalPayment();

        creditCardPayment.processPayment(1500.0);
        creditCardPayment.refundPayment(500.0);

        paypalPayment.processPayment(2000.0);
        paypalPayment.refundPayment(300.0);
    }
}
