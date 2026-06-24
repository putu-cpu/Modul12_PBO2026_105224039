public class CreditCard implements PaymentMethod, Refundable {
    @Override
    public void pay(double amount) {
        System.out.println("Mengeksekusi API Bank untuk pembayaran Credit Card sebesar: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Melakukan refund ke Credit Card sebesar: " + amount);
    }
}