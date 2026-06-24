package service;

public class KrsValidator {

    public boolean validasiPrasyarat(
            String mahasiswa,
            String mataKuliah) {

        System.out.println(
                "Validasi prasyarat "
                        + mataKuliah
                        + " milik "
                        + mahasiswa);

        return true;
    }
}
