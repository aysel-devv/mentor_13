package Payment_System_Interface;

public class CreditCardPayment implements PaymentProcessor{
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment: "+amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Card number: "+cardNumber+"\nCard holder name: "+cardHolderName;
    }
}
