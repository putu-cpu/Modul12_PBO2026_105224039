public class TiketHabisException extends Exception {
    private String namakereta;
    private int sisakursi;

    public TiketHabisException(String namakereta, int sisakursi) {
        super("Tiket tidak mencukupi untuk kereta " + namakereta + ". Sisa kursi hanya " + sisakursi);
        this.namakereta = namakereta;
        this.sisakursi = sisakursi;
    }

    public String getNamaKereta() { return namakereta; }
    public int getSisakursi() { return sisakursi; }
}