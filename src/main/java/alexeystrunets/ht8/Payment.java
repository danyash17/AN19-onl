package alexeystrunets.ht8;

public interface Payment {
    void processPayment(double amount);
    void refundPayment(double amount);
}
