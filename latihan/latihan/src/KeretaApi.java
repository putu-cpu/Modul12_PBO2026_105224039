public class KeretaApi {
    private String kode;
    private String nama;
    private String rute;
    private int sisakursi;

    public KeretaApi(String kode, String nama, String rute, int sisakursi) {
        this.kode = kode;
        this.nama = nama;
        this.rute = rute;
        this.sisakursi = sisakursi;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public String getRute() { return rute; }
    public int getSisakursi() { return sisakursi; }

    public void kurangiKursi(int jumlah) {
        this.sisakursi -= jumlah;
    }

    @Override
    public String toString() {
        return kode + " - " + nama + " (" + rute + ") | Sisa Kursi: " + sisakursi;
    }
}