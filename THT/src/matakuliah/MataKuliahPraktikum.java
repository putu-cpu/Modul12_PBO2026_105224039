package matakuliah;

public class MataKuliahPraktikum
        implements MataKuliah, Praktikum {

    @Override
    public void tampilkanInfo() {
        System.out.println("Mata Kuliah Praktikum");
    }

    @Override
    public void alokasiAsistenLab() {
        System.out.println("Asisten Lab dialokasikan");
    }

    @Override
    public void cekPeralatanPraktikum() {
        System.out.println("Peralatan dicek");
    }
}