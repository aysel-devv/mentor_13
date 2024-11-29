package Payment_System_Interface;

public class MobileWalletPayment implements PaymentProcessor{
    int walletId;
    String userPhoneNumber;

    public MobileWalletPayment(int walletId, String userPhoneNumber) {
        this.walletId = walletId;
        this.userPhoneNumber = userPhoneNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment: "+amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Wallet ID: "+walletId+"\nUser phone number: "+userPhoneNumber;
    }
}
