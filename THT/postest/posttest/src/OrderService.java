public class OrderService {
    private PaymentMethod paymentMethod;
    private EmailNotifier emailNotifier; 

    
    public OrderService(PaymentMethod paymentMethod, EmailNotifier emailNotifier) {
        this.paymentMethod = paymentMethod;
        this.emailNotifier = emailNotifier;
    }

    public void processOrder(double amount) {
        System.out.println("Menyimpan data pesanan pelanggan...");
        
        // Eksekusi tanpa if-else, polymorphism bekerja di sini
        paymentMethod.pay(amount);
        
        emailNotifier.sendEmail();
    }
}
