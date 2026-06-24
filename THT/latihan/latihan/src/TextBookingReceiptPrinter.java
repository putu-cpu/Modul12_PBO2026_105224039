public class TextBookingReceiptPrinter implements BookingReceiptPrinter {
    @Override
    public void printReceipt(String nik, String nama, KeretaApi kereta, int jumlahTiket) {
        System.out.println("\n===== PEMESANAN BERHASIL =====");
        System.out.println("Nama        : " + nama);
        System.out.println("NIK         : " + nik);
        System.out.println("Kereta      : " + kereta.getNama());
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Sisa Kursi  : " + kereta.getSisakursi());
    }
}