public class Main {
    public static void main(String[] args) {
        
        PaymentMethod cc = new CreditCard();
        EmailNotifier email = new EmailSystem();
        
        OrderService order1 = new OrderService(cc, email);
        System.out.println("--- TRANSAKSI 1 ---");
        order1.processOrder(150000);

        System.out.println();

        
        PaymentMethod voucher = new GiftVoucher();
        
        OrderService order2 = new OrderService(voucher, email);
        System.out.println("--- TRANSAKSI 2 ---");
        order2.processOrder(50000);
    }
}