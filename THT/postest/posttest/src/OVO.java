public class OVO implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Memanggil API OVO untuk pembayaran sebesar: " + amount);
    }
}