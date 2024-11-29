package Payment_System_Interface;

public interface PaymentProcessor {
    void processPayment(double amount);
    String getPaymentDetails();
}
