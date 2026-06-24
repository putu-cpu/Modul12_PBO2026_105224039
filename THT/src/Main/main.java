package Main;

import database.*;
import service.*;
import ukt.*;
import matakuliah.*;

class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEM KRS BARU ===");

        // Validasi KRS
        KrsValidator validator = new KrsValidator();
        validator.validasiPrasyarat(
                "Haruka",
                "Pemrograman Berorientasi Objek");

        System.out.println();

        // Perhitungan UKT
        UKTStrategy ukt = new UKTMBKM();

        System.out.println(
                "UKT Mahasiswa MBKM : Rp "
                        + ukt.hitungUKT());

        System.out.println();

        // Cetak PDF
        PDFGenerator pdf = new PDFGenerator();
        pdf.generatePDF(
                "KRS Semester Ganjil 2026");

        System.out.println();

        // Simpan ke Database
        Database db = new NosqlDatabase();

        KRSService service =
                new KRSService(db);

        service.simpanKRS(
                "KRS Haruka Semester Ganjil");

        System.out.println();

        // Mata Kuliah Teori
        MataKuliah teori =
                new MataKuliahTeori();

        teori.tampilkanInfo();

        System.out.println();

        // Mata Kuliah Praktikum
        MataKuliahPraktikum praktikum =
                new MataKuliahPraktikum();

        praktikum.tampilkanInfo();
        praktikum.alokasiAsistenLab();
        praktikum.cekPeralatanPraktikum();

        System.out.println();

        // Mata Kuliah KKN
        MataKuliah kkn =
                new MataKuliahKKN();

        kkn.tampilkanInfo();
    }
}