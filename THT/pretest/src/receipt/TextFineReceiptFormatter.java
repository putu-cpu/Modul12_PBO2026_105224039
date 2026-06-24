package receipt;

public class TextFineReceiptFormatter implements FineReceiptFormatter {
    @Override
    public void formatReceipt(double fineAmount) {
        System.out.println("Total denda: " + fineAmount);
    }
}
