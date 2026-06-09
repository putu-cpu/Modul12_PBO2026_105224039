public class SistemReservasi {
    private final KeretaRepository repository;
    private final SchedulePrinter schedulePrinter;
    private final BookingService bookingService;

    public SistemReservasi() {
        this.repository = new KeretaRepository();
        this.schedulePrinter = new SchedulePrinter();
        
        PassengerValidator validator = new NikValidator();
        BookingReceiptPrinter receiptPrinter = new TextBookingReceiptPrinter();
        
        this.bookingService = new BookingService(repository, validator, receiptPrinter);
    }

    public void tampilkanJadwal() {
        schedulePrinter.printJadwal(repository.getAllKereta());
    }

    public void pesanTiket(String kodekereta, String nik, String namaPenumpang, int jumlahTiket) 
            throws RuteTidakDitemukanException, TiketHabisException {
        bookingService.pesanTiket(kodekereta, nik, namaPenumpang, jumlahTiket);
    }
}