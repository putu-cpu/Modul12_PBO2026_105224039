package receipt;

public class TableFineReceiptFormatter implements FineReceiptFormatter {
    @Override
    public void formatReceipt(double fineAmount) {
        System.out.println("+--------------------+");
        System.out.println("| Total Denda        |");
        System.out.println("+--------------------+");
        System.out.println("| Rp " + fineAmount + " |");
        System.out.println("+--------------------+");
    }
}
