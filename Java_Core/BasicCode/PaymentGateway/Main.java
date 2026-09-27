package Java_Core.BasicCode.PaymentGateway;

public class Main {
    public static void main(String[] a){
        CheckoutService checkoutService = new CheckoutService();
        PaymentMethod card = new CreditCardPayment("TXN_CC_01", "Alice", "4111-2222-3333-4444", 500.0);
        checkoutService.checkout(card, 200.0);

        PaymentMethod upi = new UpiPayment("TXN_UPI_02", "Bob", "bob@okhdfcbank", 150.0);
        checkoutService.checkout(upi, 300.0);
    }
}
