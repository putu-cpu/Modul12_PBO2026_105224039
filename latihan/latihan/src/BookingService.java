public class BookingService {
    //S
    private final KeretaRepository repository;
    private final PassengerValidator validator;
    private final BookingReceiptPrinter receiptPrinter;

    public BookingService(KeretaRepository repository, 
                          PassengerValidator validator, 
                          BookingReceiptPrinter receiptPrinter) {
        this.repository = repository;
        this.validator = validator;
        this.receiptPrinter = receiptPrinter;
    }

    public void pesanTiket(String kodeKereta, String nik, String namaPenumpang, int jumlahTiket) 
            throws RuteTidakDitemukanException, TiketHabisException {
        
        validator.validate(nik);

        KeretaApi kereta = repository.findByKode(kodeKereta);
        if (kereta == null) {
            throw new RuteTidakDitemukanException("Kode kereta tidak ditemukan!");
        }

        if (jumlahTiket > kereta.getSisakursi()) {
            throw new TiketHabisException(kereta.getNama(), kereta.getSisakursi());
        }

        kereta.kurangiKursi(jumlahTiket);
        receiptPrinter.printReceipt(nik, namaPenumpang, kereta, jumlahTiket);
    }
}