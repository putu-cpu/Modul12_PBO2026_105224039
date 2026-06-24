import java.util.InputMismatchException;
import java.util.Scanner;

class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SistemReservasi reservasi = new SistemReservasi();
        boolean jalan = true;

        while (jalan) {
            try {
                System.out.println("\n===== JAVA EXPRESS =====");
                System.out.println("1. Lihat Jadwal");
                System.out.println("2. Pesan Tiket");
                System.out.println("3. Keluar");
                System.out.print("Menu: ");
                int pilihan = input.nextInt();
                input.nextLine(); 

                switch (pilihan) {
                    case 1:
                        reservasi.tampilkanJadwal();
                        break;
                    case 2:
                        System.out.print("Kode Kereta: ");
                        String kode = input.nextLine();
                        System.out.print("NIK: ");
                        String nik = input.nextLine();
                        System.out.print("Nama Penumpang: ");
                        String nama = input.nextLine();
                        System.out.print("Jumlah Tiket: ");
                        int jumlah = input.nextInt();
                        input.nextLine();

                        reservasi.pesanTiket(kode, nik, nama, jumlah);
                        break;
                    case 3:
                        jalan = false;
                        System.out.println("Terima kasih telah menggunakan JAVA EXPRESS.");
                        break;
                    default:
                        System.out.println("Menu tidak tersedia.");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Input harus berupa angka!");
                input.nextLine(); 
            } catch (DataPenumpangTidakValidException | RuteTidakDitemukanException | TiketHabisException e) {
                System.out.println("ERROR: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }

        try {
            System.out.println("Menutup sistem...");
        } finally {
            input.close();
            System.out.println("Program selesai.");
        }
    }
}