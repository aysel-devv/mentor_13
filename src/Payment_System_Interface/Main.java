package Payment_System_Interface;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment=new CreditCardPayment("123456757", "Aysel Husein");
        System.out.println(creditCardPayment.getPaymentDetails());
        creditCardPayment.processPayment(200.02);

        System.out.println("=========================================================================");

        MobileWalletPayment mobileWalletPayment=new MobileWalletPayment(23, "+90202099919");
        System.out.println(mobileWalletPayment.getPaymentDetails());
        mobileWalletPayment.processPayment(3003);

    }
}